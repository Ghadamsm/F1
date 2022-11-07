package com.example.flowerise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class P5Activity  extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p5);

        Spinner spinner = findViewById(R.id.spinnar);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.numbers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);





        Button Cart= findViewById(R.id.button);
        Cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(P5Activity.this, "Added to cart" , Toast.LENGTH_LONG).show();

            }
        });

    }




    public void back(View view){

        Intent intent= new Intent(this,fragm.class);
        startActivity(intent);
    }



    @Override
    public void onItemSelected(@NonNull AdapterView<?> adapterView, View view, int i, long l) {

        String text = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), text , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}