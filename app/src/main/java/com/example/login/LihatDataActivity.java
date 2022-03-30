package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LihatDataActivity extends AppCompatActivity {
    TextView tvnama, tvnomor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);
        tvnama = findViewById(R.id.tvnamakontak);
        tvnomor = findViewById(R.id.tvnomortelepon);
        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");
        switch (nama){
            case "adel":
                tvnama.setText("adel a");
                tvnomor.setText("081111111111");
                break;
            case "erik":
                tvnama.setText("erik a");
                tvnomor.setText("082222222222");
                break;
            case "indra":
                tvnama.setText("indra a");
                tvnomor.setText("083333333333");
                break;
            case "jordy":
                tvnama.setText("jordy a");
                tvnomor.setText("0844444444444");
                break;
            case "toni":
                tvnama.setText("toni a");
                tvnomor.setText("085555555555");
                break;
            case "rezha":
                tvnama.setText("rezha a");
                tvnomor.setText("086666666666");
                break;
            case "rafi":
                tvnama.setText("rafi a");
                tvnomor.setText("087777777777");
                break;
            case "axel":
                tvnama.setText("axel a");
                tvnomor.setText("088888888888");
                break;
            case "dedy":
                tvnama.setText("dedy a");
                tvnomor.setText("089999999999");
                break;
            case "asra":
                tvnama.setText("asra a");
                tvnomor.setText("081212121212");
                break;
        }
    }
}