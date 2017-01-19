package com.survy.androidsandbox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.survy.androidsandbox.sharedElementTransition.FromActivity;

public class CatalogActivity extends AppCompatActivity {

    private Button sharedElementTransitionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        /*
         * Launch shared element transition demo
         */
        sharedElementTransitionButton = (Button) findViewById(R.id.shared_element_transition_button);
        sharedElementTransitionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatalogActivity.this, FromActivity.class);
                startActivity(intent);
            }
        });
    }
}
