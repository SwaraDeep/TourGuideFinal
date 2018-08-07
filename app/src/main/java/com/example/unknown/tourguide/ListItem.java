package com.example.unknown.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListItem extends ArrayAdapter<List>{

    public ListItem(Activity context, ArrayList<List> pItems) {
        super(context, 0, pItems);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,
                    false);
        }

        List currentList = getItem(position);

        TextView entryNameTextView = listItemView.findViewById(R.id.list_text);
        entryNameTextView.setText(currentList.getmTitle());

        ImageView entryImageView = listItemView.findViewById(R.id.list_image);
        entryImageView.setImageResource(currentList.getmSmallImage());

        return listItemView;
    }

}
