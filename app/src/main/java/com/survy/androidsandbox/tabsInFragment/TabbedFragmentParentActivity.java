package com.survy.androidsandbox.tabsInFragment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.survy.androidsandbox.R;

public class TabbedFragmentParentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed_fragment_parent);

        // Set the fragment
        TabsContainerFragment fragment = new TabsContainerFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.intermediate_fragment, fragment)
                .commit();
    }
}
