package tp.edu.musicstream;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.os.Handler;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import tp.edu.musicstream.util.AppUtil;

public class PlaySongActivity extends AppCompatActivity {
    private static final String BASE_URL = "http://p.scdn.co/mp3-preview/";

    private String songId = "";
    private String title = "";
    private String artist = "";
    private String fileLink = "";
    private String coverArt = "";
    private String url = "";

    private MediaPlayer player = null;

    private int musicPosition = 0;

    private Button btnPlayPause = null;

    private SongCollection songCollection = new SongCollection();

    List<Song> shuffleList = Arrays.asList(songCollection.songs);

    private Button repeatBtn;
    private Boolean repeatflag = false;
    private Button shuffleBtn;
    private Boolean shuffleflag = false;

    private Context mContext;
    private Activity mActivity;

    private SeekBar mSeekBar;
    private Handler mHandler;
    private Runnable mRunnable;

    static ArrayList<Song>favList = new ArrayList<Song>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song2);
        btnPlayPause = findViewById(R.id.btnPlayPause);
        repeatBtn = findViewById(R.id.btnRepeat);
        shuffleBtn = findViewById(R.id.btnshuffle);

        retriveData();
        displaySong(title, artist, coverArt);
        preparePlayer();


        mActivity = PlaySongActivity.this;
        mContext = getApplicationContext();

        //get widget ref from xml layout
        mSeekBar = findViewById(R.id.musicSeekBar);

        //initialise handler
        mHandler = new Handler();

    }

    private void retriveData() {
        Bundle songData = this.getIntent().getExtras();
        //key-id, get value of key id eg. s1001
        songId = songData.getString("id");
        title = songData.getString("title");
        artist = songData.getString("artist");
        fileLink = songData.getString("fileLink");
        coverArt = songData.getString("coverArt");

        url = BASE_URL + fileLink;
    }

//method - control various UI to make coverArt, song title, to match the correct songs
    private void displaySong(String title, String artist, String coverArt) {
        TextView txtTitle = findViewById(R.id.txtSongTitle);
        txtTitle.setText(title);
        TextView txtArtist = findViewById(R.id.txtArtist);
        txtArtist.setText(artist);
        int imageId = AppUtil.getImageIdFromDrawable(this, coverArt);
        ImageView ivCoverArt = findViewById(R.id.imgCoverArt);
        //when id is set, it can show the image correctly
        ivCoverArt.setImageResource(imageId);
    }

    private void preparePlayer() {
        //getting mediaplayer to work
        player = new MediaPlayer();
        try {
            player.setAudioStreamType(AudioManager.STREAM_MUSIC);
            player.setDataSource(url);
            player.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void playOrPauseMusic(View view) {
        if (player == null)
            preparePlayer();

        if (!player.isPlaying()) {

            player.start();
            //when song is playing
            btnPlayPause.setBackgroundResource(R.drawable.playbtn_on);


            if (musicPosition > 0) {
                //current music position

                player.seekTo(musicPosition);
            }

            setTitle("Now Playing: " + title + " - " + artist);

            gracefullyStopWhenMusicEnds();

            initializeSeekBar();
        } else {
            pauseMusic();
            btnPlayPause.setBackgroundResource(R.drawable.playbtn);
        }


        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (player != null && b) {
                    player.seekTo(i * 1000);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }


    private void pauseMusic() {
        player.pause();
        musicPosition = player.getCurrentPosition();
        btnPlayPause.setBackgroundResource(R.drawable.playbtn);
    }

    private void gracefullyStopWhenMusicEnds() {
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {
                stopActivities();

                if (repeatflag) {
                    playOrPauseMusic(null);

                } else {
                    stopActivities();
                }

            }
        });
    }

    private void stopActivities() {
        if (player != null)
            preparePlayer();
        {
            btnPlayPause.setBackgroundResource(R.drawable.playbtn);

            musicPosition = 0;

            setTitle(" ");
            if (player.isPlaying()) {
                player.stop();
            }

            player.release();
            player = null;


        }
    }

    public void playNext(View view) {
        Song nextSong = songCollection.getNextSong(songId);
        if (nextSong != null) {

            songId = nextSong.getId();
            title = nextSong.getTitle();
            artist = nextSong.getArtist();
            fileLink = nextSong.getFileLink();
            coverArt = nextSong.getCoverArt();

            url = BASE_URL + fileLink;

            displaySong(title, artist, coverArt);

            stopActivities();

            playOrPauseMusic(view);
        }
    }


    public void playPrevious(View view) {
        Song prevSong = songCollection.getPrevSong(songId);
        if (prevSong != null) {

            songId = prevSong.getId();
            title = prevSong.getTitle();
            artist = prevSong.getArtist();
            fileLink = prevSong.getFileLink();
            coverArt = prevSong.getCoverArt();

            url = BASE_URL + fileLink;

            displaySong(title, artist, coverArt);

            stopActivities();

            playOrPauseMusic(view);
        }
    }

    protected void initializeSeekBar() {
        mSeekBar.setMax(player.getDuration() / 1000);

        mRunnable = new Runnable() {
            public void run() {
                if (player != null) {
                    int mCurrentPosition = player.getCurrentPosition() / 1000;
                    mSeekBar.setProgress(mCurrentPosition);
                }
                mHandler.postDelayed(mRunnable, 1000);
            }
        };
        mHandler.postDelayed(mRunnable, 1000);
    }


    public void repeatsong(View view) {
        if (repeatflag) {
            repeatBtn.setBackgroundResource(R.drawable.repeatbtn);

        } else {
            repeatBtn.setBackgroundResource(R.drawable.repeatbtn_on);
        }
        repeatflag = !repeatflag;

    }

    public void shufflesong(View view) {
        if (shuffleflag) {
            shuffleBtn.setBackgroundResource(R.drawable.shufflebtn);
            songCollection = new SongCollection();

        } else {
            shuffleBtn.setBackgroundResource(R.drawable.shufflebtn_on);
            Collections.shuffle(shuffleList);
            shuffleList.toArray(songCollection.songs);
        }
        shuffleflag = !shuffleflag;

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        player.release();
        mHandler.removeCallbacks(mRunnable);

    }
}


