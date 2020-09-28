package com.example.ms.finalprojectmca;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        FloatingActionButton fab1 = (FloatingActionButton) findViewById(R.id.fab_phone1);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:8762801257"));
                try {
                    startActivity(callIntent);
                } catch (SecurityException e) {
                    e.printStackTrace();
                }
            }
        });

        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab_message1);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "suvodeep4119@gmail.com" });
                //intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
                //intent.putExtra(Intent.EXTRA_TEXT, "mail body");
                startActivity(Intent.createChooser(intent, ""));

            }
        });

        FloatingActionButton fab3 = (FloatingActionButton) findViewById(R.id.fab_phone2);
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:8469991664"));
                try {
                    startActivity(callIntent);
                } catch (SecurityException e) {
                    e.printStackTrace();
                }
            }
        });

        FloatingActionButton fab4 = (FloatingActionButton) findViewById(R.id.fab_message2);
        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "monalisorathiya8@gmail.com" });
                //intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
                //intent.putExtra(Intent.EXTRA_TEXT, "mail body");
                startActivity(Intent.createChooser(intent, ""));
            }
        });


    }
}
