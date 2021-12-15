package tp.edu.musicstream;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;

public class DatabaseLogin1 extends AppCompatActivity {
    EditText e1, e2;
    Button b1, b2;
    DatabaseHelper db;
    private VideoView videoBG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.databaselogin);

        db = new DatabaseHelper(this);
        e1 = (EditText) findViewById(R.id.et_emaillog);
        e2 = (EditText) findViewById(R.id.et_passwordlog);
        b2 = (Button) findViewById(R.id.btn_register);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DatabaseLogin1.this, DataBaseLogin.class);
                startActivity(i);
            }
        });

        b1 = (Button) findViewById(R.id.btn_login);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = e1.getText().toString();
                String password = e2.getText().toString();
                Boolean Chkemailpass = db.emailpassword(email, password);
                if (Chkemailpass == true) {
                    //if both email and password is correct
                    Toast.makeText(getApplicationContext(), "Successfully Login", Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(DatabaseLogin1.this, LaunchScreen.class);
                    startActivity(intent2);
                }


                else {
                    //if email or password is wrong
                    Toast.makeText(getApplicationContext(), "Wrong email or password", Toast.LENGTH_SHORT).show();
                }

            }
        });
        videoBG=(VideoView)findViewById(R.id.videoView);

        // Uniform resource identifier is used to identify resource
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

