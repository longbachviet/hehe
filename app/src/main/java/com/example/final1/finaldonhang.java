package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class finaldonhang extends AppCompatActivity {
    Button btnBack,btnQL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_finaldonhang);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnQL = (Button) findViewById(R.id.btnQLTD);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(finaldonhang.this,ThirdActivity.class);
                startActivity(intent);
            }
        });

        btnQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
}