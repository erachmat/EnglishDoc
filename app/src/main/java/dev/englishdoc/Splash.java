package dev.englishdoc;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    TextView englishSplash;
    TextView docSplash;
    ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //menghilangkan ActionBar
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        englishSplash = (TextView) findViewById(R.id.english);
        docSplash = (TextView) findViewById(R.id.doc);
        progress = findViewById(R.id.progressBar);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), Intro.class));
                finish();
            }
        }, 4000L); //3000 L = 3 detik

    }
}
