package com.example.boss.lesson1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnDelete;
    ViewGroup vg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vg = (ViewGroup) findViewById(R.id.linerLayout);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        if (btnDelete != null) {
            btnDelete.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btnDelete:
                vg.removeView(btnDelete);
                Toast.makeText(MainActivity.this, "Button deleted", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
