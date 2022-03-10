package com.example.login;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activityketiga extends AppCompatActivity {
    TextView usertext,pwdtext;
    String namausr,datapwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityketiga);

        usertext = (TextView) findViewById(R.id.textusr);
        pwdtext = (TextView) findViewById(R.id.textpwd);

        Bundle b =  getIntent().getExtras();

        namausr = b.getString("a");
        datapwd = b.getString("b");
        usertext.setText(": "+namausr);
        pwdtext.setText(": "+datapwd);


    }
}
