package com.survy.androidsandbox.sharedElementTransition;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.survy.androidsandbox.R;

public class FromActivity extends AppCompatActivity {

    private ImageView profileImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_element_transform_from);

        profileImage = (ImageView) findViewById(R.id.profile_image_from);
        profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create an intent to start the "to" activity
                Intent intent = new Intent(FromActivity.this, ToActivity.class);

                // Check SDK version because shared element transition is only supported on >= 21
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    // Create an options object that will link the elements from the two views
                    // using the shared "transitionName" defined in the layout files.
                    ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                            FromActivity.this, profileImage, profileImage.getTransitionName()
                    );

                    // Start the activity
                    startActivity(intent, options.toBundle());
                } else {
                    Toast.makeText(getApplicationContext(), "Not supported on SDK versions < 21", Toast.LENGTH_LONG).show();
                    return;
                }
            }
        });
    }
}
