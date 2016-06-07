package com.pucsd.prakash.linear;

import android.app.Activity;
import android.os.Bundle;

/*
Activity used to display all the information of the courses held in our department
*/
public class Courses extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courses);
    }
}
