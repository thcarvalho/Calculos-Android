package com.calculos.terasgahd.calculos;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ImcActivity extends AppCompatActivity {

    private TextView txtResult;
    private Button btnResult;
    private EditText txtPeso;
    private EditText txtAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        txtResult = (TextView) findViewById(R.id.txtResultId1);
        btnResult = (Button) findViewById(R.id.btnCalc1id);
        txtPeso = (EditText) findViewById(R.id.txtPesoId);
        txtAltura = (EditText) findViewById(R.id.txtAlturaId);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vPeso = txtPeso.getText().toString();
                String vAltura = txtAltura.getText().toString();

                if(vPeso.isEmpty()||vAltura.isEmpty()){
                    //Mensagem de Erro
                    Toast.makeText(getApplicationContext(),"Nenhum valor inserido",Toast.LENGTH_SHORT).show();

                }else{

                    Double peso = Double.parseDouble(vPeso);
                    Double altura = Double.parseDouble(vAltura);
                    DecimalFormat df = new DecimalFormat("0.00");

                    double imc = (peso)/Math.pow(altura,2);

                    if(imc <= 16.9) {
                        txtResult.setText(df.format(imc) + " - Muito abaixo do Peso");
                    }else if(imc <= 18.4){
                        txtResult.setText(df.format(imc) + " - Abaixo do Peso");
                    }else if(imc <= 24.9){
                        txtResult.setText(df.format(imc) + " - Peso Normal");
                    }else if(imc <= 29.9){
                        txtResult.setText(df.format(imc) + " - Acima do Peso");
                    }else if(imc <= 34.9){
                        txtResult.setText(df.format(imc) + " - Obesidade Grau I");
                    }else if(imc <= 40){
                        txtResult.setText(df.format(imc) + " - Obesidade Grau II");
                    }else{
                        txtResult.setText(df.format(imc) + " - Obesidade Grau III");
                    }
                }

            }
        });

    }
}
