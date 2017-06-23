package com.app.androidkt.constraintlayoutb;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.design.widget.FloatingActionButton;
import android.support.transition.TransitionManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ConSetActivity extends AppCompatActivity {

    ConstraintSet firstSet = new ConstraintSet();
    ConstraintSet second = new ConstraintSet();
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_con_set);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        second.clone(this, R.layout.second_view);
        firstSet.clone(this, R.layout.content_main);
        constraintLayout = (ConstraintLayout) findViewById(R.id.first_view);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // TransitionManager.beginDelayedTransition(constraintLayout);
                second.applyTo(constraintLayout);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
