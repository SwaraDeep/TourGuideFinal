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

public class RestaurantsFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<List> list = new ArrayList<List>();

        list.add(new List(R.string.res_avakai, R.drawable.res_avakai, R.drawable.res_avakai, R.string.res_info_avakai));
        list.add(new List(R.string.res_dfc, R.drawable.res_dfc, R.drawable.res_dfc, R.string.res_info_dfc));
        list.add(new List(R.string.res_shelton, R.drawable.res_shelton, R.drawable.res_shelton, R.string.res_info_shelton));
        list.add(new List(R.string.res_sri_kanya, R.drawable.res_sri_kanya, R.drawable.res_sri_kanya, R.string.res_info_shelton));
        list.add(new List(R.string.res_venky, R.drawable.res_venky, R.drawable.res_venky, R.string.res_info_venky));

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
