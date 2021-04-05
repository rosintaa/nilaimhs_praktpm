package com.example.nilaimahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView bNama, bNIM, bNilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        bNama = findViewById(R.id.tv_nama);
        bNIM = findViewById(R.id.tv_nim);
        bNilai = findViewById(R.id.tv_nilai);

        String nama, nim, huruf;
        double nilaihuruf;

        nama = getIntent().getStringExtra("nama");
        bNama.setText(nama);

        nim = getIntent().getStringExtra("nim");
        bNIM.setText(nim);

        huruf = getIntent().getStringExtra("nilai");
        nilaihuruf = Double.parseDouble(huruf);
        if (nilaihuruf > 3.66 && nilaihuruf <= 4) {
            bNilai.setText("A");
        } else if (nilaihuruf > 3.33 && nilaihuruf <= 3.66) {
            bNilai.setText("A-");
        } else if (nilaihuruf > 3 && nilaihuruf <= 3.33) {
            bNilai.setText("B+");
        } else if (nilaihuruf > 2.66 && nilaihuruf <= 3) {
            bNilai.setText("B");
        } else if (nilaihuruf > 2.33 && nilaihuruf <= 2.66) {
            bNilai.setText("B-");
        } else if (nilaihuruf > 2 && nilaihuruf <= 2.33) {
            bNilai.setText("C+");
        } else if (nilaihuruf > 1.66 && nilaihuruf <= 2) {
            bNilai.setText("C");
        } else if (nilaihuruf > 1.33 && nilaihuruf <= 1.66) {
            bNilai.setText("C-");
        } else if (nilaihuruf > 1 && nilaihuruf <= 1.33) {
            bNilai.setText("D+");
        } else if (nilaihuruf == 1) {
            bNilai.setText("D");
        }
    }
}
