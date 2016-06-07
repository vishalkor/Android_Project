package com.pucsd.prakash.linear;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.Buffer;

/*
All background task we will handle to in this file
*/
public class Backend extends AsyncTask<String,Void,String>{
    AlertDialog alertDialog;
    Context ctx;
    Backend(Context ctx) {
        this.ctx=ctx;

    }


    @Override
    protected void onPreExecute() {
        alertDialog = new AlertDialog.Builder(ctx).create();
        alertDialog.setTitle("Login Information....");
    }

    @Override
    protected String doInBackground(String... params) {
        // following links are used to store and fetch the students details in/from the database. 
        String reg_url = "http://10.0.2.2/project/register.php";
        String log_url = "http://10.0.2.2/project/login.php";
        String fpass_url = "http://10.0.2.2/project/forgotPass.php";

        String method = params[0];
        // here we store all the details of students into the database
        if(method.equals("register"))
        {
            String uname = params[1];
            String passwd = params[2];
            String fname = params[3];
            String lname = params[4];
            String dob = params[5];
            String email = params[6];
            String mob = params[7];
            String gender = params[8];
            String hq = params[9];

            try {
                URL url = new URL(reg_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream os = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));
                String data = URLEncoder.encode("uname","UTF-8") + "=" + URLEncoder.encode(uname,"UTF-8") + "&" +
                        URLEncoder.encode("passwd","UTF-8") + "=" + URLEncoder.encode(passwd,"UTF-8") + "&" +
                        URLEncoder.encode("fname","UTF-8") + "=" + URLEncoder.encode(fname,"UTF-8") + "&" +
                        URLEncoder.encode("lname","UTF-8") + "=" + URLEncoder.encode(lname,"UTF-8") + "&" +
                        URLEncoder.encode("dob","UTF-8") + "=" + URLEncoder.encode(dob,"UTF-8") + "&" +
                        URLEncoder.encode("email","UTF-8") + "=" + URLEncoder.encode(email,"UTF-8") + "&" +
                        URLEncoder.encode("mob","UTF-8") + "=" + URLEncoder.encode(mob,"UTF-8") + "&" +
                        URLEncoder.encode("gender","UTF-8") + "=" + URLEncoder.encode(gender,"UTF-8") + "&" +
                        URLEncoder.encode("hq","UTF-8") + "=" + URLEncoder.encode(hq,"UTF-8");
                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                os.close();

                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                String response = "";
                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    response += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                //System.out.println(response);
                return response;

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        // Here we are passing the login details to database then it will return whether our login details are correct or not.
        else if(method.equals("login")) {
            String loginname=params[1];
            String loginpass=params[2];

            try {
                URL url = new URL(log_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
                String data = URLEncoder.encode("login_name","UTF-8")+"="+URLEncoder.encode(loginname,"UTF-8") +"&"+
                        URLEncoder.encode("login_pass","UTF-8")+"="+URLEncoder.encode(loginpass,"UTF-8");
                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                String response = "";
                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    response += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return response;

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        // At the time of forgot password we pass the username of student and it will return or mail the password of student.
        else {
            if (method.equals("returnpass")) {
                String unamepasswd = params[1];

                try {
                    URL url = new URL(fpass_url);
                    HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
                    String data = URLEncoder.encode("ret_pass","UTF-8")+"="+URLEncoder.encode(unamepasswd, "UTF-8");
                    bufferedWriter.write(data);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    outputStream.close();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                    String response = "";
                    String line = "";
                    while ((line = bufferedReader.readLine()) != null) {
                        response += line;
                    }
                    bufferedReader.close();
                    inputStream.close();
                    httpURLConnection.disconnect();
                    return response;

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    // Use of Toast and Alert boxes
    @Override
    protected void onPostExecute(String result) {
        if (result.equals("Registration success....")) {
            Toast.makeText(ctx,result, Toast.LENGTH_LONG).show();
        }
        else if (result.equals("Username Already Exists...")) {
            Toast.makeText(ctx,result, Toast.LENGTH_LONG).show();
        }
        else if (result.equals("Password Sent On Your E-Mail")) {
            Toast.makeText(ctx, result, Toast.LENGTH_LONG).show();
        } else {
            //System.out.print("in post execute");
            // if login details are right then start new activity .i.e start student profile 
            if(result.equals("Login Success")) {
                super.onPostExecute(result);
                Intent intent = new Intent(ctx, Student.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                ctx.startActivity(intent);
            }
	    // Display errors in alert dialog box
            else {
                alertDialog.setMessage(result);
                alertDialog.show();
            }
        }
    }
}
