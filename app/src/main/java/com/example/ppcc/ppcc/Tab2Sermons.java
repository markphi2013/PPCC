package com.example.ppcc.ppcc;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Markphilip on 20/06/2017.
 */

public class Tab2Sermons extends Fragment {
    private MediaPlayer mp = new MediaPlayer();
    private final String URL = "http://154.0.129.6/database/spot/spot.xml";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2_sermons, container, false);
        return rootView;
    }
}
