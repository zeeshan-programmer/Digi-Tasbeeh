package com.example.digitaltasbeeh;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splash extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        img = findViewById(R.id.img);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.splash);
        img.setAnimation(animation);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                Intent i = new Intent(splash.this,MainActivity.class);
                startActivity(i);
                finish();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}
