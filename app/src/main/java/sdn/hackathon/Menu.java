package sdn.hackathon;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by SDN on 11/7/15.
 */
public class Menu extends Fragment {

    View rootview;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.menu_layout,container,false);


        //return super.onCreateView(inflater, container, savedInstanceState);

        return rootview;
    }
}
