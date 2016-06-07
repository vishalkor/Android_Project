package com.pucsd.prakash.linear;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

/*
This is our main activity, here we use gridview to display the images and handles onclick events on images
*/

public class MainActivity extends Activity{

    GridView grid_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid_view=(GridView)findViewById(R.id.gridView);
        grid_view.setAdapter(new ImageAdapter(this));
        grid_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getBaseContext(), "you clicked on image" + i, Toast.LENGTH_LONG).show();
                if(i==0){
                    Intent intent = new Intent(view.getContext(),LoginActivity.class);
                    startActivity(intent);
                }
                if(i==1){
                    Intent intent = new Intent(view.getContext(),Cells.class);
                    startActivity(intent);
                }
                if(i==4){
                    Intent intent = new Intent(view.getContext(),Gallery.class);
                    startActivity(intent);
                }
                if(i==2){
                    Intent intent=new Intent(view.getContext(),Courses.class);
                    startActivity(intent);
                }
                if(i==3){
                    Intent intent=new Intent(view.getContext(),Events.class);
                    startActivity(intent);
                }
                if(i==6){
                    Intent intent=new Intent(view.getContext(),Library.class);
                    startActivity(intent);
                }
                if(i==7){
                    Intent intent=new Intent(view.getContext(),News.class);
                    startActivity(intent);
                }

                if(i==9){
                    Intent intent=new Intent(view.getContext(),About.class);
                    startActivity(intent);
                }
                if(i==10){
                    Intent intent=new Intent(view.getContext(),Links.class);
                    startActivity(intent);
                }
            }
        });

    }

}
