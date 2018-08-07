package com.example.unknown.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.unknown.tourguide.R.id.tab_bar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = (ViewPager) findViewById(R.id.viewpager);
        ItemAdapter adapter = new ItemAdapter(getSupportFragmentManager(), this);
        vp.setAdapter(adapter);
        TabLayout tl = (TabLayout) findViewById(R.id.tab_bar);
        tl.setupWithViewPager(vp);

    }
}
