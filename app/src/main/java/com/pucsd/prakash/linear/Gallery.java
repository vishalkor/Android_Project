package com.pucsd.prakash.linear;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

/*
Activity used for the gallary which contains the photos of our department,various events.
*/

public class Gallery extends Activity {
    ViewPager viewPager;
    GalleryAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);
        viewPager=(ViewPager)findViewById(R.id.view_pager);
        adapter=new GalleryAdapter(this);
        viewPager.setAdapter(adapter);
    }
}
