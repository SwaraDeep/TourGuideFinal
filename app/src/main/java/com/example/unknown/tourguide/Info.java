package com.example.unknown.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_fragment);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Get the information of the clicked on entry from the fragment.

        Intent details = getIntent();
        List ls = details.getParcelableExtra(getResources().getString(R.string.list));

        int img = ls.getmEntryPicutreId();
        int name = ls.getmEntryNameId();
        int info = ls.getmEntryInfoId();

        //Set the image and strings from the array in the views of the layout.
        ImageView fullImgId = findViewById(R.id.about_image);
        fullImgId.setImageResource(img);

        TextView imgName = findViewById(R.id.about_text);
        imgName.setText(name);

        TextView fullInfo = findViewById(R.id.full_info);
        fullInfo.setText(info);
    }

    // Modify the Up-Button so that it behaves like the Back-Button includes code from:
    //https://stackoverflow.com/questions/22947713/make-the-up-button-behave-like-the-back-button-on-android
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();
        if (i == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return (super.onOptionsItemSelected(item));
    }
}
