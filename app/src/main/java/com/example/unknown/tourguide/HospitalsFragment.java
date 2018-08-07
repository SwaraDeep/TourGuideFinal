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

public class HospitalsFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<List> list = new ArrayList<List>();

        list.add(new List(R.string.hos_apex, R.drawable.hos_apex, R.drawable.hos_apex, R.string.hos_info_apex));
        list.add(new List(R.string.hos_chakra, R.drawable.hos_chakra, R.drawable.hos_chakra, R.string.hos_info_chakra));
        list.add(new List(R.string.hos_kims, R.drawable.hos_kims, R.drawable.hos_kims, R.string.hos_info_kims));
        list.add(new List(R.string.hos_raju_neuro, R.drawable.hos_raju_neuro, R.drawable.hos_raju_neuro, R.string.hos_info_apex));

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
