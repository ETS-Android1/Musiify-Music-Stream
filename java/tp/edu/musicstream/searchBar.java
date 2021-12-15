package tp.edu.musicstream;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import tp.edu.musicstream.util.AppUtil;

public class searchBar extends AppCompatActivity {
    private SongCollection songCollection = new SongCollection();

    private ListView listView;
    private int textlength = 0;
    private ArrayList<String> stringArrayList = new ArrayList<>();
    private EditText search;
    private String songs[] = {"Naked", "July", "death bed (coffee for your head) (feat. beabadoobee)", "It's You", "If The World was Ending - feat. Julia Michaels", "Location", "Better", "DDU-DU-DDU-DU", " Are You Bored Yet?(feat. Clairo)", "you broke me first", "Happiest Year", "Selfish", "i wanna be your girlfriend", "Play Date", "Get You The Moon(feat Snøw)", "Say So", "Boy with Luv (feat. Halsey)", "Jocelyn Flores", "Dusk Till Dawn - Radio Edit", "Let's Fall in Love for the Night",
            "What Makes You Beautiful", "Watermelon Sugar", "Break My Heart", "Savage Remix (feat. Beyoncé)", "Lose Somebody", "Falling", "ROXANNE", "I.F.L.Y.", "SUGAR", "Eleven", "Who Hurt You?", "FOMO", "I Cry", "WHAT'S POPPIN", "Good Time", "Tequila", "Boot Scootin' Boogie", "Honey Bee", "Take A Back Road", "My Girl", "Before He Cheats", "Good Vibes", "Beer Can", "Summertime", "I Thought I Had You", "Social Distancing", "Bewildered", "Careless", "Coral Reef", "april showers",
            "distance", "roses", "i brought her flowers", "this feeling's too good", "I'll Wait", "Lift Your Energy", "Lucky", "Follow", "Lose It All", "Stupid Things", "Fade Away", "Monsters", "Drifting", "Take Me Away", "The Box", "24", "DND", "OMG", "Suicidal", "Cardigan", "FREAK", "Immortal", "This City", "Painkiller", "Feelings", "i don't miss u", "Sleep", "Love Don't Lie", "Everglow", "All I Want", "I Found", "Youuu", "Bang!"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_bar);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById((R.id.bottom_navigation));

    listView=findViewById(R.id.listview);
        search=findViewById(R.id.searchtxt);
        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,songs));

        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textlength=search.getText().length();
                stringArrayList.clear();
                //listing songs based on their id
                for(int i=0; i<songs.length; i++)
                {
                    if (textlength==0)

                {
                    listView.setVisibility(View.INVISIBLE);
                }
                else
                {
                    if (textlength <= songs[i].length())
                    {
                        if(search.getText().toString().equalsIgnoreCase((String)songs[i].subSequence(0,textlength)))
                        {
                            stringArrayList.add(songs[i]);
                        }
                    }
                }
                listView.setAdapter(new ArrayAdapter<String>(searchBar.this, android.R.layout.simple_list_item_1,stringArrayList));

                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (listView.getVisibility() !=View.VISIBLE)
                    listView.setVisibility(View.VISIBLE);

            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //listview item clicked
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = listView.getItemAtPosition(position).toString();
                Song selectedSong = songCollection.searchByName(value);
                AppUtil.popMessage(view.getContext(),"Streaming song"+ selectedSong.getTitle());
                sendDataToActivity(selectedSong);
            }
        });


        //bottom navigation bar clicker to another activity using intent
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                //when id is set on the icon
                switch (menuItem.getItemId()) {
                    case R.id.action_home:
                        Toast.makeText(searchBar.this, "Home", Toast.LENGTH_SHORT).show();
                        //Toast has a simple popup and automatically disappear after a timeout,length_long is the duration of the popup
                        Intent intent1 = new Intent(searchBar.this, LaunchScreen.class);
                        startActivity(intent1);
                        break;
                    case R.id.action_search:
                        Toast.makeText(searchBar.this, "Search", Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(searchBar.this, searchBar.class);
                        startActivity(intent2);
                        break;

                    case R.id.action_profile:
                        Toast.makeText(searchBar.this, "Profile", Toast.LENGTH_SHORT).show();
                        Intent intent3=new Intent(searchBar.this,ProfileActivity.class);
                        startActivity(intent3);
                        break;
                }
                return true;
                // show the message dialog, wont fire the intent
            }
        });
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
}







