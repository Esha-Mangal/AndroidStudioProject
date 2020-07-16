package com.example.loginactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class second extends AppCompatActivity {
private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        bt = (Button)findViewById(R.id.button3);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(second.this, "Successfully Registered Please Login", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(second.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
