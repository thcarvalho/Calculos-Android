package com.calculos.terasgahd.calculos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtImc;
    private TextView txtBhask;
    private TextView txtMed;
    private TextView txtTab;
    private TextView txtPorc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtImc = (TextView) findViewById(R.id.txtImcId);
        txtBhask = (TextView) findViewById(R.id.txtBhaskId);
        txtMed = (TextView) findViewById(R.id.txtMedId);
        txtPorc = (TextView) findViewById(R.id.txtPorcId);
        txtTab = (TextView) findViewById(R.id.txtTabId);

        txtImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ImcActivity.class));
            }
        });

        txtMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MediaActivity.class));
            }
        });

        txtBhask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),BhaskaraActivity.class));
            }
        });

        txtPorc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),PorcentagemActivity.class));
            }
        });

        txtTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TabuadaActivity.class));
            }
        });
    }
}
