package com.codetechnician.animatedlogindesign;

import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // grab the layout by id
        layout = findViewById(R.id.layout);

        // set background to animation
        AnimationDrawable animationDrawable = (AnimationDrawable) layout.getBackground();

        // set enter/exit fade duration
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(3000);

        // start animation
        animationDrawable.start();
    }
}
