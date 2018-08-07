package com.example.unknown.tourguide;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //Create an array of entries to display the village entries.
        final ArrayList<List> list = new ArrayList<>();

        //Add the different entries to the ArrayList

        list.add(new List(R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.string.list));
        list.add(new List(R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.string.list));
        list.add(new List(R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.string.list));
        list.add(new List(R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.string.list));
        list.add(new List(R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.string.list));
        list.add(new List(R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.string.list));

        //Create a new Entryadapter
        ListItem adapter = new ListItem(getActivity(), list);

        //Display the objects of the array in the ListView
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        //Set an on ItemClickListener on the views which display the entries.
       /* listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // The code in this method will be executed when an entry is clicked on.
                Intent details = new Intent(getActivity(), AboutFragment.class);
                // This line will send information from the entry to the Details.Activity
                details.putExtra(getResources().getString(R.string.app_name), list.get(position));
                startActivity(details);
            }
        });*/

        return rootView;
    }
}
