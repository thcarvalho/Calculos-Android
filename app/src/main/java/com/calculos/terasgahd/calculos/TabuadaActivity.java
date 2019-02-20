package com.calculos.terasgahd.calculos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TabuadaActivity extends AppCompatActivity {

    private EditText txtNumero;
    private Button btnCalc;
    private TextView txtResultTabuada;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabuada);

        txtNumero = (EditText) findViewById(R.id.txtNumeroId);
        btnCalc = (Button) findViewById(R.id.btnCalc4id);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = txtNumero.getText().toString();

                if(num.isEmpty()){
                   //Mensagem de Erro
                    Toast.makeText(getApplicationContext(),"Por favor, Digite um número",Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(getApplicationContext(),ResultadoTabuada.class);
                    Bundle bndl = new Bundle();
                    bndl.putString("chave",num);
                    intent.putExtras(bndl);
                    startActivity(intent);

                }

            }
        });


    }
}
