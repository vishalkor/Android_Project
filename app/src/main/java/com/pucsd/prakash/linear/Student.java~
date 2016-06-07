package com.pucsd.prakash.linear;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.net.URI;

/*
Activity used to display the student profile
In this activity we are uploading the image from mobile gallary and display it on student profile.
Now working on take a live image from mobile camera and then display that image on student profile.
*/
public class Student extends Activity {
    Button image_to_upload;
    ImageView img;
    private static final int Result_load_image=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student);

        image_to_upload = (Button) findViewById(R.id.upload);
        img = (ImageView)findViewById(R.id.imgupload);
    }

    // This method will invoke when user clicks on upload button
    public void uploadImage(View v) {
        if(v.getId() == (R.id.upload)) {
            Intent gallary = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(gallary,Result_load_image);

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Result_load_image && resultCode == RESULT_OK && data != null) {
            Uri selectedImage = data.getData();
            img.setImageURI(selectedImage);
        }
    }
}
