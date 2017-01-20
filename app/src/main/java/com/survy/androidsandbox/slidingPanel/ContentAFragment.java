package com.survy.androidsandbox.slidingPanel;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

import com.survy.androidsandbox.R;
import com.survy.androidsandbox.sharedElementTransition.FromActivity;
import com.survy.androidsandbox.sharedElementTransition.ToActivity;

public class ContentAFragment extends Fragment {

    ImageView profileImage;

    public ContentAFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_content_a, container, false);

        profileImage = (ImageView) rootView.findViewById(R.id.profile_image_large);
        profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkBox = (CheckBox) rootView.findViewById(R.id.use_transition_checkbox);
                if (checkBox.isChecked()) {
                    /*
                     * Use shared element transition to start the new activity
                     */

                    // Create an intent to start the activity
                    Intent intent = new Intent(getActivity(), ContentBActivity.class);

                    // Check SDK version because shared element transition is only supported on >= 21
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        // Create an options object that will link the elements from the two views
                        // using the shared "transitionName" defined in the layout files.
                        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                                getActivity(), profileImage, profileImage.getTransitionName()
                        );

                        // Start the activity
                        getActivity().startActivity(intent, options.toBundle());
                    }
                    else {
                        Toast.makeText(getActivity(), "Not supported on SDK versions < 21", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    /*
                     * Start the new activity in a traditional fashion
                     */

                    Intent intent = new Intent(getContext(), ContentBActivity.class);
                    getActivity().startActivity(intent);
                }

            }
        });

        return rootView;
    }

}
