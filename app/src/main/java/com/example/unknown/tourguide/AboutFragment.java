package com.example.unknown.tourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.about, container, false);

        ImageView iv = rootView.findViewById(R.id.about_image);
        TextView tv = rootView.findViewById(R.id.about_text);

        iv.setImageResource(R.drawable.ic_main_drawer);
        tv.setText(R.string.name);
        return rootView;
    }
}
