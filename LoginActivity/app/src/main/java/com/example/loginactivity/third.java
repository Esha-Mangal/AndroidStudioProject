package com.example.loginactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class third extends AppCompatActivity {
private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        bt = (Button)findViewById(R.id.button4);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(third.this, "Password changed successfully Please Login again", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(third.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
