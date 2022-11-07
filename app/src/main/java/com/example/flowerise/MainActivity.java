package com.example.flowerise;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Wh= findViewById(R.id.button3);
        Wh.setOnLongClickListener(new View.OnLongClickListener() {
            @Override

            public boolean onLongClick(View view) {

                Toast.makeText(MainActivity.this, "Welcome to the FLOWERISE application\n" +
                        "We are happy to serve you at the following times:\n" +
                        " Sunday to Thursday from 9:00 am to 10:00 pm\n" +
                        "Friday from 4:00 pm to 8:00 pm\n" +
                        "Saturday from 4:00 pm to 10:00 pm", Toast.LENGTH_LONG).show();
                return false;
            }
        });


        Button Cl= findViewById(R.id.button3);
        Cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Long Click" , Toast.LENGTH_LONG).show();

            }
        });

        Button Call = findViewById(R.id.button2);
        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:966549262774"));
                startActivity(i);
            }
        });


    }

    public void go1(View view){

        Intent intent= new Intent(this,About.class);
        startActivity(intent);
    }



    public void goSec(View view){

        Intent intent= new Intent(this,fragm.class);
        startActivity(intent);
    }
}