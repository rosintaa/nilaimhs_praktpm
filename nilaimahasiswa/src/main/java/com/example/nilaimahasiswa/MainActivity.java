package com.example.nilaimahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button submit;
    private EditText eNama, eNIM, eNilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.btn_submit);
        eNama = findViewById(R.id.et_nama);
        eNIM = findViewById(R.id.et_nim);
        eNilai = findViewById(R.id.et_nilai);
    }

    public void setSubmit(View view) {
        try {
            String aNama = eNama.getText().toString();
            String aNIM = eNIM.getText().toString();
            String aNilai = eNilai.getText().toString();
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            intent.putExtra("nama", aNama);
            intent.putExtra("nim", aNIM);
            intent.putExtra("nilai", aNilai);
            startActivity(intent);
        } catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(), "Field kosong", Toast.LENGTH_SHORT).show();
        }
    }

}
