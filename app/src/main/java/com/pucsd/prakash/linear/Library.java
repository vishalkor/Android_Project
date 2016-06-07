package com.pucsd.prakash.linear;

import android.app.Activity;
import android.os.Bundle;

/*
Activity used to display all the information and images of our department library.
*/
public class Library extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library);
    }
}
