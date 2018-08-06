package com.lith.hp.laosunseen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lith.hp.laosunseen.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 // add fragment
        if (savedInstanceState==null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.contentMainfragment, new MainFragment())
                    .commit();
        }

    }// main method
}//main class
