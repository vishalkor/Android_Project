package com.pucsd.prakash.linear;

import android.app.Activity;
import android.os.Bundle;

/*
This activity is used to display the cells information of our department
We have placement cell, system admin cell, CSFG cell, Alumni cell
*/
public class Cells extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cells);
    }
}
