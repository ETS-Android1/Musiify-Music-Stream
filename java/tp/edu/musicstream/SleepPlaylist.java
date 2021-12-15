package tp.edu.musicstream;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import tp.edu.musicstream.util.AppUtil;

public class SleepPlaylist extends AppCompatActivity {
    private SongCollection songCollection = new SongCollection();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById((R.id.bottom_navigation));
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_home:
                        Toast.makeText(SleepPlaylist.this, "Home", Toast.LENGTH_SHORT).show();
                        Intent intent1=new Intent(SleepPlaylist.this,LaunchScreen.class);
                        startActivity(intent1);
                        break;
                    case R.id.action_search:
                        Toast.makeText(SleepPlaylist.this, "Search", Toast.LENGTH_SHORT).show();
                        Intent intent2=new Intent(SleepPlaylist.this,searchBar.class);
                        startActivity(intent2);
                        break;

                    case R.id.action_profile:
                        Toast.makeText(SleepPlaylist.this, "Profile", Toast.LENGTH_SHORT).show();
                        Intent intent3=new Intent(SleepPlaylist.this,ProfileActivity.class);
                        startActivity(intent3);
                        break;
                }
                return true;
            }
        });

    }

    public void handleSelection(View view) {
        String resourceId = AppUtil.getResourceId(this, view);
        Song selectedSong = songCollection.searchById(resourceId);
        // pop up of streaming music name
        AppUtil.popMessage(this, "Streaming song: " + selectedSong.getTitle());
        sendDataToActivity(selectedSong);

    }

    public void sendDataToActivity(Song song) {
        //bring you to the next page - PlaySongActivity
        Intent intent = new Intent(this, PlaySongActivity.class);

        intent.putExtra("id", song.getId());
        intent.putExtra("title", song.getTitle());
        intent.putExtra("artist", song.getArtist());
        intent.putExtra("fileLink", song.getFileLink());
        intent.putExtra("coverArt", song.getCoverArt());

        startActivity(intent);
    }
}



