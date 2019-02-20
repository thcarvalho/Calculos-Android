package com.calculos.terasgahd.calculos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoTabuada extends AppCompatActivity {

    private TextView txtResultTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_tabuada);

        txtResultTab = (TextView) findViewById(R.id.txtResultTabuadaId);

        //Valor vindo da Activity
        Bundle extras = getIntent().getExtras();
        String valor = extras.getString("chave");

        //Numero Convertido para int
        int numeroCalc = Integer.parseInt(valor);

        for (int i = 0;i <= 10;i++){

            txtResultTab.setText("\n"+numeroCalc+"x"+i+"=");
        }

    }
}
