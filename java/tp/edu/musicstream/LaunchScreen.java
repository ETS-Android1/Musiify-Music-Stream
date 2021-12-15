package tp.edu.musicstream;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import tp.edu.musicstream.util.AppUtil;

public class LaunchScreen extends AppCompatActivity implements View.OnClickListener {
 private Button b1, b2,b3, b4;
    private SongCollection songCollection = new SongCollection();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);

        b1=(Button) findViewById(R.id.singerbtn) ;
        b2 = (Button) findViewById(R.id.songlistbtn);
        b3 = (Button) findViewById(R.id.playlistbtn);
        b4=(Button)findViewById(R.id.genrebtn) ;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LaunchScreen.this, SingersList.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LaunchScreen.this, MainActivity.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LaunchScreen.this, PlaylistActivity.class);
                startActivity(i);
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LaunchScreen.this, GenresActivity.class);
                startActivity(i);
            }
        });

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById((R.id.bottom_navigation));

        //bottom navigation bar clicker to another activity using intent
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                //when id is set on the icon
                switch (menuItem.getItemId()) {
                    case R.id.action_home:
                        Toast.makeText(LaunchScreen.this, "Home", Toast.LENGTH_SHORT).show();
                        //Toast has a simple popup and automatically disappear after a timeout,length_long is the duration of the popup
                        Intent intent1=new Intent(LaunchScreen.this,LaunchScreen.class);
                        startActivity(intent1);
                        break;
                    case R.id.action_search:
                        Toast.makeText(LaunchScreen.this, "Search", Toast.LENGTH_SHORT).show();
                        Intent intent2=new Intent(LaunchScreen.this,searchBar.class);
                        startActivity(intent2);
                        break;

                    case R.id.action_profile:
                        Toast.makeText(LaunchScreen.this, "Profile", Toast.LENGTH_SHORT).show();
                        Intent intent3=new Intent(LaunchScreen.this,ProfileActivity.class);
                        startActivity(intent3);
                        break;
                }
                return true;
                // show the message dialog, wont fire the intent
            }
        });
        ImageButton button1 = findViewById(R.id.ruel);
        ImageButton button2 = findViewById(R.id.tatemcrae);;
        ImageButton button3 = findViewById(R.id.khalid);
        ImageButton button4= findViewById(R.id.doja);
        ImageButton button5 = findViewById(R.id.aligatie);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //when the menu button of the device is pressed

        getMenuInflater().inflate(R.menu.toolbar,menu);
        //create menu from xml
        MenuItem menuItem = menu.findItem(R.id.searchbtn);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id==R.id.searchbtn)
            Toast.makeText(this,"Search",Toast.LENGTH_SHORT).show();
        Intent intent4=new Intent(LaunchScreen.this,searchBar.class);
        startActivity(intent4);
        return super.onOptionsItemSelected(item);
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

        intent.putExtra("id", song.getId());//key-id, value of key id eg. s1001
        intent.putExtra("title", song.getTitle());
        intent.putExtra("artist", song.getArtist());
        intent.putExtra("fileLink", song.getFileLink());
        intent.putExtra("coverArt", song.getCoverArt());

        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.ruel:
                Toast.makeText(LaunchScreen.this, "Ruel", Toast.LENGTH_LONG).show();
                Intent intent2 = new Intent(LaunchScreen.this, RuelArtist.class);
                startActivity(intent2);
                break;
            case R.id.tatemcrae:
                Toast.makeText(LaunchScreen.this, "Tate McRae", Toast.LENGTH_LONG).show();
                Intent intent4 = new Intent(LaunchScreen.this, TateArtist.class);
                startActivity(intent4);
                break;
            case R.id.khalid:
                Toast.makeText(LaunchScreen.this, "Khalid", Toast.LENGTH_LONG).show();
                Intent intent5 = new Intent(LaunchScreen.this, KhalidArtist.class);
                startActivity(intent5);
                break;
            case R.id.doja:
                Toast.makeText(LaunchScreen.this, "Doja Cat", Toast.LENGTH_LONG).show();
                Intent intent6 = new Intent(LaunchScreen.this, DojaCatArtist.class);
                startActivity(intent6);
                break;
            case R.id.aligatie:
                Toast.makeText(LaunchScreen.this, "Ali Gatie", Toast.LENGTH_LONG).show();
                Intent intent7 = new Intent(LaunchScreen.this, AliGatieArtist.class);
                startActivity(intent7);
                break;

        }
    }

    }



