package com.example.toastinglibaray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toastingButton = findViewById(R.id.button);
        toastingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RandomToasterMessage.s(view.getContext(), "try this");
            }
        });
    }
}