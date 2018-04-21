package com.example.asus.remotekyc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.asus.remotekyc.FirstStep.KYCMain;

public class MainActivity extends AppCompatActivity {
    private Button kyc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kyc = (Button) findViewById(R.id.kyc_signin);

        kyc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, KYCMain.class);
                startActivity(i);
            }
        });
    }
}