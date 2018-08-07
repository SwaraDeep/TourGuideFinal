package com.example.unknown.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<List> list = new ArrayList<List>();

        list.add(new List(R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.string.list));
        list.add(new List(R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.string.list));
        list.add(new List(R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.string.list));
        list.add(new List(R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.string.list));
        list.add(new List(R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.string.list));
        list.add(new List(R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.drawable.ic_main_drawer, R.string.list));

        ListItem adapter = new ListItem(getActivity(), list);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), Info.class);
                intent.putExtra(getResources().getString(R.string.list), list.get(i));
                startActivity(intent);
            }
        });
        return rootView;
    }
}