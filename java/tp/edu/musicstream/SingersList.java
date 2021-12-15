package tp.edu.musicstream;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SingersList extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singers);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById((R.id.bottom_navigation));

        //bottom navigation bar clicker to another activity using intent
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                //when id is set on the icon
                switch (menuItem.getItemId()) {
                    case R.id.action_home:
                        Toast.makeText(SingersList.this, "Home", Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(SingersList.this, LaunchScreen.class);
                        startActivity(intent1);
                        break;
                    case R.id.action_search:
                        Toast.makeText(SingersList.this, "Search", Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(SingersList.this, searchBar.class);
                        startActivity(intent2);
                        break;

                    case R.id.action_profile:
                        Toast.makeText(SingersList.this, "Profile", Toast.LENGTH_SHORT).show();
                        Intent intent3=new Intent(SingersList.this,ProfileActivity.class);
                        startActivity(intent3);
                        break;
                }
                return true;
            }

        });

        ImageButton button1 = findViewById(R.id.melaniem);
        ImageButton button2 = findViewById(R.id.ruel);
        ImageButton button3 = findViewById(R.id.tatemcrae);
        ImageButton button4 = findViewById(R.id.blackpink);
        ImageButton button5 = findViewById(R.id.khalid);
        ImageButton button6 = findViewById(R.id.doja);
        ImageButton button7 = findViewById(R.id.aligatie);

        //onClickListener for imageButton
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        // view is supplied as an argument when method is for a listener and view is to distinguish which view in the layout has been clicked
        switch (view.getId()) {
            case R.id.melaniem:
                Toast.makeText(SingersList.this, "Melanie Martinez", Toast.LENGTH_LONG).show();
                //Toast has a simple popup and automatically disappear after a timeout, length_long is the duration of the popup
                Intent intent1 = new Intent(SingersList.this, MelanieArtist.class);
                startActivity(intent1);
                break;
            case R.id.ruel:
                Toast.makeText(SingersList.this, "Ruel", Toast.LENGTH_LONG).show();
                Intent intent2 = new Intent(SingersList.this, RuelArtist.class);
                startActivity(intent2);
                break;
            case R.id.tatemcrae:
                Toast.makeText(SingersList.this, "Tate McRae", Toast.LENGTH_LONG).show();
                Intent intent4 = new Intent(SingersList.this, TateArtist.class);
                startActivity(intent4);
                break;
            case R.id.blackpink:
                Toast.makeText(SingersList.this, "BLACKPINK", Toast.LENGTH_LONG).show();
                Intent intent3 = new Intent(SingersList.this, BlackPinkArtist.class);
                startActivity(intent3);
                break;
            case R.id.khalid:
                Toast.makeText(SingersList.this, "Khalid", Toast.LENGTH_LONG).show();
                Intent intent5 = new Intent(SingersList.this, KhalidArtist.class);
                startActivity(intent5);
                break;
            case R.id.doja:
                Toast.makeText(SingersList.this, "Doja Cat", Toast.LENGTH_LONG).show();
                Intent intent6 = new Intent(SingersList.this, DojaCatArtist.class);
                startActivity(intent6);
                break;
            case R.id.aligatie:
                Toast.makeText(SingersList.this, "Ali Gatie", Toast.LENGTH_LONG).show();
                Intent intent7 = new Intent(SingersList.this, AliGatieArtist.class);
                startActivity(intent7);
                break;

        }
    }
}
