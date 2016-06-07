package com.pucsd.prakash.linear;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

/*
Activity used to fill the registration form of student.
In this form we make a use of RadioButton, Spinner, RadioGroup
Also we used other small apps "DatePickerDialog","Dialog" to accept the birthdate of student.
*/
public class Registration extends Activity{
    EditText username,password,confirmpw,firstname,lastname,dob,email_id,mobile;
    String d_username,d_password,d_confirmpw,d_firstname,d_lastname,d_dob,d_email_id,d_mobile;
    RadioGroup rgroup;
    String high_quali,gender;
    RadioButton radiobutton;
    TextView tv;
    int year_x,month_x,day_x;
    static final int Dialog_id=0;
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        final Calendar calendar=Calendar.getInstance();
        year_x=calendar.get(Calendar.YEAR);
        month_x=calendar.get(Calendar.MONTH);
        day_x=calendar.get(Calendar.DAY_OF_MONTH);
        showDialogOnClick();
        spinner=(Spinner)findViewById(R.id.spinner);
        adapter=ArrayAdapter.createFromResource(this,R.array.course_names,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        //Read data from register window
        username = (EditText)findViewById(R.id.uname);
        password = (EditText)findViewById(R.id.passwd);
        firstname = (EditText)findViewById(R.id.fname);
        lastname = (EditText)findViewById(R.id.lname);
        dob = (EditText)findViewById(R.id.dob);
        email_id = (EditText)findViewById(R.id.email);
        mobile = (EditText)findViewById(R.id.mobile);
        confirmpw=(EditText)findViewById(R.id.cpasswd);
        // fetch data from radio button
        rgroup = (RadioGroup)findViewById(R.id.rg1);


    }
    public void showDialogOnClick(){
        tv=(TextView)findViewById(R.id.dob);
        tv.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showDialog(Dialog_id);
                    }
                }
        );
    }

    @Override
    protected Dialog onCreateDialog(int id){
        if(id==Dialog_id)
            return new DatePickerDialog(this,dpickerListener,year_x,month_x,day_x);
        return null;
    }
    // Accept date by using DatePickerDailog app
    private DatePickerDialog.OnDateSetListener dpickerListener =
            new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                    year_x=i;
                    month_x=i1+1;
                    day_x=i2;
                    tv.setText(year_x+"/"+month_x+"/"+day_x);
                }
            };

    public void register(View view)
    {
        //System.out.println("hi there");
        d_username = username.getText().toString();
        d_password = password.getText().toString();
        d_confirmpw = confirmpw.getText().toString();
        d_firstname = firstname.getText().toString();
        d_lastname = lastname.getText().toString();
        d_dob = dob.getText().toString();
        d_email_id = email_id.getText().toString();
        d_mobile = mobile.getText().toString();
        int rid = rgroup.getCheckedRadioButtonId();
        radiobutton = (RadioButton)Registration.this.findViewById(rid);
        gender=radiobutton.getText().toString();

        //System.out.print(gender);
        high_quali = spinner.getSelectedItem().toString();
        //System.out.println("sup??");
        String method = "register";
        // Call backend to store all the student information into the database
        Backend backend = new Backend(this);
        backend.execute(method,d_username,d_password,d_firstname,d_lastname,d_dob,d_email_id,d_mobile,gender,high_quali);

        finish();
    }
}
