package tp.edu.musicstream;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;
//https://www.youtube.com/watch?v=1WPAXHhG6u0

public class DataBaseLogin extends AppCompatActivity {
    DatabaseHelper db;
    EditText e1, e2, e3;
    Button b1, b2;
    private VideoView videoBG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.databaseregister);
        db = new DatabaseHelper(this);
        e1 = (EditText) findViewById(R.id.et_emailreg);
        e2 = (EditText) findViewById(R.id.et_passwordreg);
        e3 = (EditText) findViewById(R.id.et_repasswordreg);
        b2 = (Button) findViewById(R.id.btn_login2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DataBaseLogin.this, DatabaseLogin1.class);
                startActivity(i);
            }
        });

        b1 = (Button) findViewById(R.id.btn_register2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                if (s1.equals("") || s2.equals("") || s3.equals("")) {
                    Toast.makeText(getApplicationContext(), "Fields are empty", Toast.LENGTH_SHORT).show();
                } else {
                    if (s2.equals(s3)) {
                        //if password and confirm password is same
                        Boolean chkemail = db.chkemail(s1);
                        //using database to input email
                        if (chkemail == true) {
                            //if email is inserted
                            Boolean insert = db.insert(s1, s2);
                            //database insert email and pw
                            if (insert == true) {
                                //if all field are filled in and correct, can log in and data saved
                                Toast.makeText(getApplicationContext(), "Registered Successfully", Toast.LENGTH_SHORT).show();
                                Intent intent2 = new Intent(DataBaseLogin.this, LaunchScreen.class);
                                startActivity(intent2);
                            }
                        } else {
                            //email existing
                            Toast.makeText(getApplicationContext(), "Email Already exists", Toast.LENGTH_SHORT).show();

                        }
                    }
                    //passwords are diff
                    Toast.makeText(getApplicationContext(), "Password do not match", Toast.LENGTH_SHORT).show();
                }

            }
        });
        videoBG=(VideoView)findViewById(R.id.videoView);

        //Uniform resource identifier) as its name suggests is used to identify resource
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.music);

        //set new uri to videoview
        videoBG.setVideoURI(uri);
        //start videoview
        videoBG.start();

        //set on preparedlisterner for our videoview
        videoBG.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

    }
}

