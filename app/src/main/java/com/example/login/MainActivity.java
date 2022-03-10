package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edemail, edpassword;
    Button btnsignin;
    String nama, password;
    String etemail = "abid";
    String etpass = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edemail=findViewById(R.id.pEmail);
        edpassword=findViewById(R.id.pPassword);
        btnsignin=findViewById(R.id.pbutton);

        btnsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            validasi();
            }
        });
    }
    public void validasi(){
        nama = edemail.getText().toString();
        password = edpassword.getText().toString();

        if (nama.equals(etemail) && password.equals(etpass)){
            Toast.makeText(MainActivity.this,"Login sukses",Toast.LENGTH_SHORT).show();
            Bundle b = new Bundle();
            b.putString("a", nama);
            b.putString("b", password);
            Intent i = new Intent(MainActivity.this, Activityketiga.class);
            i.putExtras(b);
            startActivity(i);
        }

        else{
            if (nama.equals(etemail)){
            Toast.makeText(MainActivity.this,"Password anda salah",Toast.LENGTH_SHORT).show();

            }
            else{
                if (password.equals(etpass)){
                    Toast.makeText(MainActivity.this,"Email anda salah",Toast.LENGTH_SHORT).show();
                }

                else {
                    Toast.makeText(MainActivity.this, "Email dan Password anda salah", Toast.LENGTH_SHORT).show();
                }
            }

        }



    }
}