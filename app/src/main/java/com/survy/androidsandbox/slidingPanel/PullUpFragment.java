package com.survy.androidsandbox.slidingPanel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.survy.androidsandbox.R;

public class PullUpFragment extends Fragment {

    final static private String TAG = "PullUpFragment";

    public PullUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pull_up, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() " + this.toString());
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() " + this.toString());
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() " + this.toString());
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() " + this.toString());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() " + this.toString());
    }

}
