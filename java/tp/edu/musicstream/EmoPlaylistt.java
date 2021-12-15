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

public class EmoPlaylistt extends AppCompatActivity {
    private SongCollection songCollection = new SongCollection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emo);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById((R.id.bottom_navigation));

        //bottom navigation bar clicker to another activity using intent
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                //when id is set on the icon
                switch (menuItem.getItemId()) {
                    case R.id.action_home:
                        Toast.makeText(EmoPlaylistt.this, "Home", Toast.LENGTH_SHORT).show();
                        //Toast has a simple popup and automatically disappear after a timeout,length_long is the duration of the popup
                        Intent intent1=new Intent(EmoPlaylistt.this,LaunchScreen.class);
                        startActivity(intent1);
                        break;
                    case R.id.action_search:
                        Toast.makeText(EmoPlaylistt.this, "Search", Toast.LENGTH_SHORT).show();
                        Intent intent2=new Intent(EmoPlaylistt.this,searchBar.class);
                        startActivity(intent2);
                        break;

                    case R.id.action_profile:
                        Toast.makeText(EmoPlaylistt.this, "Profile", Toast.LENGTH_SHORT).show();
                        Intent intent3=new Intent(EmoPlaylistt.this,ProfileActivity.class);
                        startActivity(intent3);
                        break;
                }
                return true;
                // show the message dialog, wont fire the intent
            }
        });

    }


    public void handleSelection(View view)
    // view is supplied as an argument when method is for a listener and view is to distinguish which view in the layout has been clicked
    {
        //when id is set, it can show the image correctly
        String resourceId = AppUtil.getResourceId(this, view);
        Song selectedSong= songCollection.searchById(resourceId);
        // pop up of streaming music name
        AppUtil.popMessage(this, "Streaming song: " + selectedSong.getTitle());
        sendDataToActivity(selectedSong);

    }
    public void sendDataToActivity(Song song)
    {
        //bring you to the next page - PlaySongActivity
        Intent intent = new Intent(this, PlaySongActivity.class);

        intent.putExtra("id", song.getId()); //key-id, value of key id eg. s1001
        intent.putExtra("title", song.getTitle());
        intent.putExtra("artist", song.getArtist());
        intent.putExtra("fileLink", song.getFileLink());
        intent.putExtra("coverArt", song.getCoverArt());

        startActivity(intent);
    }

}
