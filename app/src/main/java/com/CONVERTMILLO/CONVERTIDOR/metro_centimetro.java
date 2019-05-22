package com.CONVERTMILLO.CONVERTIDOR;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class metro_centimetro extends AppCompatActivity {

    Button calcular;
    TextView resultado;
    EditText dato;
    Double dato1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle(R.string.PANTALLA7);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metro_centimetro);

        calcular = findViewById(R.id.botonCalcular);
        dato = findViewById(R.id.dato);
        resultado = findViewById(R.id.resultado);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                    dato1 = Double.parseDouble(dato.getText().toString())*100;

                    resultado.setText("cm = "+dato1);

                } catch (Exception e){
                    Toast.makeText(getApplicationContext(), "error del dato",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
