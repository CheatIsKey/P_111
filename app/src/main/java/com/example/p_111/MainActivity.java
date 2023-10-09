package com.example.p_111;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    EditText input;
    Button Btn1, Btn2;
    RadioButton radio1, radio2;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("좀 그럴듯한 앱");

        input = (EditText) findViewById(R.id.input);
        Btn1 = (Button) findViewById(R.id.Btn1);
        Btn2 = (Button) findViewById(R.id.Btn2);
        radio1 = (RadioButton) findViewById(R.id.radio1);
        radio2 = (RadioButton) findViewById(R.id.radio2);
        img = (ImageView) findViewById(R.id.img);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), input.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(input.getText().toString()));
                startActivity(mIntent);
            }
        });

        radio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.daramg);
            }
        });

        radio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.cat);
            }
        });

    }
}