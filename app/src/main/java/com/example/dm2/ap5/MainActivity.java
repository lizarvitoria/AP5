package com.example.dm2.ap5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button boton1, boton2, boton3;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 = (Button) findViewById(R.id.btn1);
        boton2 = (Button) findViewById(R.id.btn2);
        boton3 = (Button) findViewById(R.id.btn3);
        img = (ImageView) findViewById(R.id.img1);


        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                img.setImageResource(R.drawable.images);

            }
        });

        boton3.setOnClickListener(this);


    }
    public void bing(View v) {
        img.setImageResource(R.drawable.bing);
    }


    @Override
    public void onClick(View v) {
        img.setImageResource(R.drawable.google);
    }
}

