package tp.edu.musicstream;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PlaylistActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById((R.id.bottom_navigation));

        //bottom navigation bar clicker to another activity using intent
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                //when id is set on the icon
                switch (menuItem.getItemId()) {
                    case R.id.action_home:
                        Toast.makeText(PlaylistActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(PlaylistActivity.this, LaunchScreen.class);
                        startActivity(intent1);
                        break;
                    case R.id.action_search:
                        Toast.makeText(PlaylistActivity.this, "Search", Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(PlaylistActivity.this, searchBar.class);
                        startActivity(intent2);
                        break;

                    case R.id.action_profile:
                        Toast.makeText(PlaylistActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                        Intent intent3=new Intent(PlaylistActivity.this,ProfileActivity.class);
                        startActivity(intent3);
                        break;
                }
                return true;
            }
        });

        ImageButton button1 = findViewById(R.id.repeatsong);
        ImageButton button2 = findViewById(R.id.partysong);
        ImageButton button3 = findViewById(R.id.sleepsong);
        ImageButton button4 = findViewById(R.id.emosong);
        ImageButton button5 = findViewById(R.id.studysong);
        ImageButton button6 = findViewById(R.id.popsong);

        //onClickListener for imageButton
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

    }
        @Override
        public void onClick (View view){
            // view is supplied as an argument when method is for a listener and view is to distinguish which view in the layout has been clicked
            switch(view.getId()){
                case R.id.repeatsong:
                    Toast.makeText(PlaylistActivity.this, "My Repeats", Toast.LENGTH_LONG).show();
                    //Toast has a simple popup and automatically disappear after a timeout, length_long is the duration of the popup
                    Intent intent1 = new Intent(PlaylistActivity.this, RepeatsPlaylist.class);
                    startActivity(intent1);
                    break;
                case R.id.partysong:
                    Toast.makeText(PlaylistActivity.this, "Mood To Party", Toast.LENGTH_LONG).show();
                    Intent intent2 = new Intent(PlaylistActivity.this, PartyPlaylist.class);
                    startActivity(intent2);
                    break;
                case R.id.sleepsong:
                    Toast.makeText(PlaylistActivity.this, "Sleep", Toast.LENGTH_LONG).show();
                    Intent intent4 = new Intent(PlaylistActivity.this, SleepPlaylist.class);
                    startActivity(intent4);
                    break;
                case R.id.emosong:
                    Toast.makeText(PlaylistActivity.this, "Emotional", Toast.LENGTH_LONG).show();
                    Intent intent3 = new Intent(PlaylistActivity.this, EmoPlaylistt.class);
                    startActivity(intent3);
                    break;
                case R.id.studysong:
                    Toast.makeText(PlaylistActivity.this, "Study", Toast.LENGTH_LONG).show();
                    Intent intent5 = new Intent(PlaylistActivity.this, StudyPlaylist.class);
                    startActivity(intent5);
                    break;
                case R.id.popsong:
                    Toast.makeText(PlaylistActivity.this, "Pop", Toast.LENGTH_LONG).show();
                    Intent intent6 = new Intent(PlaylistActivity.this, PopPlaylist.class);
                    startActivity(intent6);
                    break;
            }
        }
    }
