package com.pucsd.prakash.linear;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/*
Activity used to display all the link which are useful for students to know more about our department.
*/
public class Links extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.links);
        TextView textView=(TextView)findViewById(R.id.placement);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://cs.unipune.ac.in/pucsd.php?path=http://cs.unipune.ac.in/admin/obx/cell/place'>Placements</a>";
        textView.setText(Html.fromHtml(text));

        TextView textView1=(TextView)findViewById(R.id.alumni);
        textView1.setMovementMethod(LinkMovementMethod.getInstance());
        String text1="<a href='http://cs.unipune.ac.in/pucsd.php?path=http://cs.unipune.ac.in/admin/obx/cell/alumni'>Alumni</a>";
        textView1.setText(Html.fromHtml(text1));

        TextView textView2=(TextView)findViewById(R.id.dp);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        String text2="<a href='http://cs.unipune.ac.in'>Department</a>";
        textView2.setText(Html.fromHtml(text2));

    }
}
