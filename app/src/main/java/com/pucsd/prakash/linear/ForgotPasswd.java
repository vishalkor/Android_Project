package com.pucsd.prakash.linear;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/*
Activity used to handle forgot password activity
*/
public class ForgotPasswd extends Activity {
    EditText uname;
    String uname_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpasswd);

        uname = (EditText)findViewById(R.id.rpasswd);

    }
    // This method will accept username of student for returning the password from the database.
    public void returnPass(View view) {
        uname_pass = uname.getText().toString();
        String method="returnpass";
        Backend backend=new Backend(this);
        backend.execute(method,uname_pass);
    }

}
