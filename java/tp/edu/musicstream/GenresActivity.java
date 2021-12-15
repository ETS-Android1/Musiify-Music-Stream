package tp.edu.musicstream;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class GenresActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById((R.id.bottom_navigation));
        //bottom navigation bar clicker to another activity using intent
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                //when id is set on the icon
                switch (menuItem.getItemId()) {
                    case R.id.action_home:
                        Toast.makeText(GenresActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(GenresActivity.this, LaunchScreen.class);
                        startActivity(intent1);
                        break;
                    case R.id.action_search:
                        Toast.makeText(GenresActivity.this, "Search", Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(GenresActivity.this, searchBar.class);
                        startActivity(intent2);
                        break;

                    case R.id.action_profile:
                        Toast.makeText(GenresActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                        Intent intent3=new Intent(GenresActivity.this,ProfileActivity.class);
                        startActivity(intent3);
                        break;
                }
                return true;
            }
        });

        ImageButton button1 = findViewById(R.id.popgenre);
        ImageButton button2 = findViewById(R.id.rbgenre);
        ImageButton button3 = findViewById(R.id.lofigenre);
        ImageButton button4 = findViewById(R.id.countrygenre);
        ImageButton button5 = findViewById(R.id.edmgenre);
        ImageButton button6 = findViewById(R.id.rapgenre);
        ImageButton button7 = findViewById(R.id.chillgenre);
        ImageButton button8 = findViewById(R.id.rockgenre);

        //onClickListener for imageButton
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);

    }
        @Override
        public void onClick (View view){
            // view is supplied as an argument when method is for a listener and view is to distinguish which view in the layout has been clicked
            switch(view.getId()){
                case R.id.popgenre:
                    Toast.makeText(GenresActivity.this, "POP!", Toast.LENGTH_LONG).show();
                    //Toast has a simple popup and automatically disappear after a timeout, length_long is the duration of the popup
                    Intent intent1 = new Intent(GenresActivity.this, PopGenre.class);
                    startActivity(intent1);
                    break;
                case R.id.rbgenre:
                    Toast.makeText(GenresActivity.this, "R&B!", Toast.LENGTH_LONG).show();
                    Intent intent2 = new Intent(GenresActivity.this, rbGenre.class);
                    startActivity(intent2);
                    break;
                case R.id.lofigenre:
                    Toast.makeText(GenresActivity.this, "LO-FI!", Toast.LENGTH_LONG).show();
                    Intent intent4 = new Intent(GenresActivity.this, LoFiGenre.class);
                    startActivity(intent4);
                    break;
                case R.id.countrygenre:
                    Toast.makeText(GenresActivity.this, "COUNTRY!", Toast.LENGTH_LONG).show();
                    Intent intent3 = new Intent(GenresActivity.this, CountryGenre.class);
                    startActivity(intent3);
                    break;
                case R.id.edmgenre:
                    Toast.makeText(GenresActivity.this, "EDM!", Toast.LENGTH_LONG).show();
                    Intent intent5 = new Intent(GenresActivity.this, edmGenre.class);
                    startActivity(intent5);
                    break;
                case R.id.rapgenre:
                    Toast.makeText(GenresActivity.this, "RAP!", Toast.LENGTH_LONG).show();
                    Intent intent6 = new Intent(GenresActivity.this, rapGenre.class);
                    startActivity(intent6);
                    break;
                case R.id.chillgenre:
                    Toast.makeText(GenresActivity.this, "BLUES!", Toast.LENGTH_LONG).show();
                    Intent intent7 = new Intent(GenresActivity.this, chillGenre.class);
                    startActivity(intent7);
                    break;
                case R.id.rockgenre:
                    Toast.makeText(GenresActivity.this, "ROCK!", Toast.LENGTH_LONG).show();
                    Intent intent8 = new Intent(GenresActivity.this, rockGenre.class);
                    startActivity(intent8);
                    break;


            }
        }
    }
