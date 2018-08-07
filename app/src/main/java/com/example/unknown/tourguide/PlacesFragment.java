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

public class PlacesFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<List> list = new ArrayList<List>();

        list.add(new List(R.string.pla_godavari, R.drawable.godavari, R.drawable.godavari, R.string.pla_info_godavari));
        list.add(new List(R.string.pla_bridge, R.drawable.bridge, R.drawable.bridge, R.string.pla_info_bridge));
        list.add(new List(R.string.pla_gowthami, R.drawable.gowthami_ghat, R.drawable.gowthami_ghat, R.string.pla_info_gowthami));
        list.add(new List(R.string.pla_iskon, R.drawable.iskon, R.drawable.iskon, R.string.pla_info_iskon));
        list.add(new List(R.string.pla_pushkar, R.drawable.pushkar_ghat, R.drawable.pushkar_ghat, R.string.pla_info_pushkar));
        list.add(new List(R.string.pla_twin, R.drawable.two_bridges, R.drawable.two_bridges, R.string.pla_info_twin));

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
