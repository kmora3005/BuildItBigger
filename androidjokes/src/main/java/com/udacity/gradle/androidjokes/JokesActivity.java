package com.udacity.gradle.androidjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        Intent intent = getIntent();
        if (intent.hasExtra(Intent.EXTRA_TEXT)){
            String joke = getIntent().getStringExtra(Intent.EXTRA_TEXT);
            TextView tvJoke = (TextView)findViewById(R.id.tv_joke);
            tvJoke.setText(joke);
        }


    }
}
