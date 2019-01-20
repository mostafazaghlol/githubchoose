package com.desginapps.githubchoose;

import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    Button BtShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = findViewById(R.id.coordinatorLayout);
        BtShow = findViewById(R.id.showSnakbar);
        BtShow.setOnClickListener(v->{
            Snackbar snackbar = Snackbar
                    .make(constraintLayout, "www.journaldev.com", Snackbar.LENGTH_SHORT);
            snackbar.show();
        });
    }
}
