package com.calculos.terasgahd.calculos;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BhaskaraActivity extends AppCompatActivity {

    private Button btnResult;
    private TextView txtRsult;
    private EditText txtA;
    private EditText txtB;
    private EditText txtC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhaskara);

        btnResult = (Button) findViewById(R.id.btnCalc2id);
        txtRsult = (TextView) findViewById(R.id.txtResultId2);
        txtA = (EditText) findViewById(R.id.txtAid);
        txtB = (EditText) findViewById(R.id.txtBid);
        txtC = (EditText) findViewById(R.id.txtCid);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String A = txtA.getText().toString();
                String B = txtB.getText().toString();
                String C = txtC.getText().toString();

                if(A.isEmpty()||B.isEmpty()||C.isEmpty()){
                    //Mensagem de Erro
                    Toast.makeText(getApplicationContext(),"Por favor, Digite um valor",Toast.LENGTH_SHORT).show();
                }else{
                    int vA = Integer.parseInt(A);
                    int vB = Integer.parseInt(B);
                    int vC = Integer.parseInt(C);

                    double delta = (Math.pow(vB,2))-4*vA*vC;

                    if(delta <= 0){
                        //Raizes Invalidas
                        txtRsult.setText("RAIZES INVALIDAS");
                    }else{
                        DecimalFormat df = new DecimalFormat("0.0");

                        double r1 = (-vB+(Math.sqrt(delta)))/2*vA;
                        double r2 = (-vB-(Math.sqrt(delta)))/2*vA;

                        txtRsult.setText("O valor das Raizes é (" + df.format(r1) + " e " + df.format(r2) + ")");

                    }


                }


            }
        });


    }
}
