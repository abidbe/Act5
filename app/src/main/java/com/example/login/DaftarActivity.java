package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DaftarActivity extends AppCompatActivity {
    EditText edtNama, edtAlamat, edtEmail, edtPass, edtrepass;
    FloatingActionButton fab;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftaractivity);

        edtNama = findViewById(R.id.ednama);
        edtAlamat = findViewById(R.id.edalamat);
        edtEmail = findViewById(R.id.edemail);
        edtPass = findViewById(R.id.edpass);
        edtrepass = findViewById(R.id.edrepass);

        fab = findViewById(R.id.fabsimpan);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtNama.getText().toString().isEmpty() ||
                        edtAlamat.getText().toString().isEmpty() ||
                        edtEmail.getText().toString().isEmpty() ||
                        edtPass.getText().toString().isEmpty() ||
                        edtrepass.getText().toString().isEmpty() )
                {
                    Snackbar.make(v, "Wajib isi seluruh data !!!", Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    if (edtPass.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        Toast.makeText((getApplicationContext()), "Pendaftaran berhasil...",
                                Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                    else {
                        Snackbar.make(v, "Password dan Repassword harus sama!!!",
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }

}







