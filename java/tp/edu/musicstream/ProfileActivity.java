package tp.edu.musicstream;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener{
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        b2 = (Button) findViewById(R.id.logoutbtn);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProfileActivity.this, DatabaseLogin1.class);
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
                        Toast.makeText(ProfileActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        //Toast has a simple popup and automatically disappear after a timeout,length_long is the duration of the popup
                        Intent intent1 = new Intent(ProfileActivity.this, LaunchScreen.class);
                        startActivity(intent1);
                        break;
                    case R.id.action_search:
                        Toast.makeText(ProfileActivity.this, "Search", Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(ProfileActivity.this, searchBar.class);
                        startActivity(intent2);
                        break;

                    case R.id.action_profile:
                        Toast.makeText(ProfileActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                        Intent intent3=new Intent(ProfileActivity.this,ProfileActivity.class);
                        startActivity(intent3);
                        break;
                }
                return true;
                // show the message dialog, wont fire the intent
            }
        });

        ImageButton button1 = findViewById(R.id.repeatsong);

        ImageButton button2 = findViewById(R.id.emosong);

        ImageButton button3 = findViewById(R.id.studysong);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);


    }
    @Override
    public void onClick (View view){
        switch(view.getId()){
            case R.id.repeatsong:
                Toast.makeText(ProfileActivity.this, "My Repeats", Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(ProfileActivity.this, RepeatsPlaylist.class);
                startActivity(intent1);
                break;
            case R.id.emosong:
                Toast.makeText(ProfileActivity.this, "Emotional", Toast.LENGTH_LONG).show();
                Intent intent3 = new Intent(ProfileActivity.this, EmoPlaylistt.class);
                startActivity(intent3);
                break;
            case R.id.studysong:
                Toast.makeText(ProfileActivity.this, "Study", Toast.LENGTH_LONG).show();
                Intent intent5 = new Intent(ProfileActivity.this, StudyPlaylist.class);
                startActivity(intent5);
                break;
        }
    }
    }
