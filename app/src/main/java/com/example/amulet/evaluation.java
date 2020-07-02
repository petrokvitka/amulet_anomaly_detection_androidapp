package com.example.amulet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class evaluation extends AppCompatActivity {

    private Button back, showResult;
    private static ImageView imgview;

    private int current_image;
    int[] images = {R.drawable.anomalies, R.drawable.no_anomalies};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation);
        showResult();

        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBack();
            }
        });
    }

    public void showResult() {
        imgview = (ImageView) findViewById(R.id.robot);
        showResult = (Button) findViewById(R.id.result);
        showResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current_image++;
                current_image = current_image % images.length;
                imgview.setImageResource(images[current_image]);
            }
        });
    }

    public void goBack() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}