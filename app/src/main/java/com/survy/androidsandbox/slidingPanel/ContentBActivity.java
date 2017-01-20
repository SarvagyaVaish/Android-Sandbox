package com.survy.androidsandbox.slidingPanel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.survy.androidsandbox.R;

public class ContentBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generic_sliding_panel);

        /*
         * Main content
         */
        ContentBFragment contentBFragment = new ContentBFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.main_content, contentBFragment)
                .commit();

        /*
         * Pull up content
         */
        PullUpFragment pullUpFragment = new PullUpFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.pull_up_content, pullUpFragment)
                .commit();
    }
}
