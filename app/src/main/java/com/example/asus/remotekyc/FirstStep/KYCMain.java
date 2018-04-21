package com.example.asus.remotekyc.FirstStep;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.asus.remotekyc.R;
import com.example.asus.remotekyc.RegisterKYC;

public class KYCMain extends AppCompatActivity {
    private Button emailpw,nric,key;
    private TextView registerlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kyc_main);

        emailpw = (Button) findViewById(R.id.email);
        nric = (Button) findViewById(R.id.nric_barcode);
        key = (Button) findViewById(R.id.key);
        registerlink = (TextView) findViewById(R.id.registerhere);

        emailpw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KYCMain.this, EmailPasswordAuthentication.class);
                startActivity(i);
            }
        });

        nric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KYCMain.this, BarcodeAuthentication.class);
                startActivity(i);
            }
        });

        key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KYCMain.this, SecurityVerification.class);
                startActivity(i);
            }
        });

        //Go to RegisterKYC activity
        registerlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register = new Intent(KYCMain.this, RegisterKYC.class);
                startActivity(register);
            }
        });
    }
}