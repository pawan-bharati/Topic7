package com.example.topic7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {
Button btnAdd,btnDis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnAdd=findViewById(R.id.btnAdd);
        btnDis=findViewById(R.id.btnDis);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Dashboard.this,MainActivity.class);
                startActivity(intent);
            }
        });
btnDis.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent= new Intent(Dashboard.this,Display.class);
        startActivity(intent);
    }
});
    }
}
