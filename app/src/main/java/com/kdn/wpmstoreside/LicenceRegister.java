package com.kdn.wpmstoreside;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LicenceRegister extends AppCompatActivity {
    ImageView image_back;
    TextView licence_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licence_register);
        image_back=(image_back).findViewById(R.id.image_back);
        licence_register=(licence_register).findViewById(R.id.licence_register);

        image_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        licence_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}