package com.prueba.programacionmovil_clase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView nombreUsuario;
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreUsuario=(TextView) findViewById(R.id.usuario);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);


        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                nombreUsuario.setText("Presioné boton Uno");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                nombreUsuario.setText("Presioné boton Dos");
            }
        });
    }

    public double calcularArea(int l1, int l2){
        return l1*l2;
    }
}