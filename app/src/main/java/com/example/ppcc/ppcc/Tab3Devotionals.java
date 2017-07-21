package com.example.ppcc.ppcc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Markphilip on 20/06/2017.
 */

public class Tab3Devotionals extends Fragment {
    private final String URL = "http://154.0.129.6/database/spot/spot.xml";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3_devotionals, container, false);
        return rootView;
    }
}