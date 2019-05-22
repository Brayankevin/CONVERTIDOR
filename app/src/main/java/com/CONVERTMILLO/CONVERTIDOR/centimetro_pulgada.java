package com.CONVERTMILLO.CONVERTIDOR;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class centimetro_pulgada extends AppCompatActivity {

    Button calcular;
    TextView resultado;
    EditText dato;
    Double dato1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle(R.string.PANTALLA8);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centimetro_pulgada);

        calcular = findViewById(R.id.botonCalcular);
        dato = findViewById(R.id.dato);
        resultado = findViewById(R.id.resultado);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                    dato1 = Double.parseDouble(dato.getText().toString())/2.54;

                    resultado.setText("in = "+dato1);

                } catch (Exception e){
                    Toast.makeText(getApplicationContext(), "error del dato",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
