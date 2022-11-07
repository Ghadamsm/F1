package com.example.flowerise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;


public class fragm extends Activity {

    protected void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag);

    }

    public void go1(View view){

        Intent intent= new Intent(this,P1Activity.class);
        startActivity(intent);
    }



    public void go2(View view){

        Intent intent= new Intent(this,P2Activity.class);
        startActivity(intent);
    }



    public void go3(View view){

        Intent intent= new Intent(this,P3Activity.class);
        startActivity(intent);
    }


    public void go4(View view){

        Intent intent= new Intent(this,P4Activity.class);
        startActivity(intent);
    }


    public void go5(View view){

        Intent intent= new Intent(this,P5Activity.class);
        startActivity(intent);
    }

    public void go6(View view){

        Intent intent= new Intent(this,P6Activity.class);
        startActivity(intent);
    }

    public void go7(View view){

        Intent intent= new Intent(this,P7Activity.class);
        startActivity(intent);
    }


    public void go8(View view){

        Intent intent= new Intent(this,P8Activity.class);
        startActivity(intent);
    }

    public void go9(View view){

        Intent intent= new Intent(this,P9Activity.class);
        startActivity(intent);
    }


    public void go10(View view){

        Intent intent= new Intent(this,P10Activity.class);
        startActivity(intent);
    }


    public void go11(View view){

        Intent intent= new Intent(this,P11Activity.class);
        startActivity(intent);
    }

    public void go12(View view){

        Intent intent= new Intent(this,P12Activity.class);
        startActivity(intent);
    }

}
