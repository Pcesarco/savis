package io.github.cesarco.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText numero_uno;
    private EditText numero_Dos;
    private TextView Respuesta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero_uno = findViewById(R.id.numero_uno);
        numero_Dos = findViewById(R.id.numero_2);

        Respuesta = findViewById(R.id.Respuesta);


    }

    public void sumar(View view) {

        try {
            int RespuestaNumero = Integer.parseInt(numero_uno.getText().toString()) +
                    Integer.parseInt(numero_Dos.getText().toString());
            Respuesta.setText(RespuestaNumero + "");
        } catch (Exception e) {
            Toast.makeText(this, "Numeros no Ingresados. Escribe 2 numeros para  hacer la operación", Toast.LENGTH_SHORT).show();
        }


    }

    public void restar(View view) {

        if (numero_uno.getText().length() < 1 && numero_Dos.getText().length() < 1) {
            Toast.makeText(this, "Numeros no Ingresados. Escribe 2 numeros para  hacer la operación", Toast.LENGTH_SHORT).show();
        } else {
            int RespuestaNumero = Integer.parseInt(numero_uno.getText().toString()) -
                    Integer.parseInt(numero_Dos.getText().toString());
            Respuesta.setText(RespuestaNumero + "");
        }


    }

    public void multiplicar(View view) {

        try {
            int RespuestaNumero = Integer.parseInt(numero_uno.getText().toString()) *
                    Integer.parseInt(numero_Dos.getText().toString());
            Respuesta.setText(RespuestaNumero + "");

        } catch (Exception e) {
            Toast.makeText(this, "Numeros no Ingresados. Escribe 2 numeros para  hacer la operación", Toast.LENGTH_SHORT).show();
        }


    }

    public void division(View view) {

        try {
            int RespuestaNumero = Integer.parseInt(numero_uno.getText().toString()) /
                    Integer.parseInt(numero_Dos.getText().toString());
            Respuesta.setText(RespuestaNumero + "");
        } catch (
                Exception e) {
            Toast.makeText(this, "Numeros no Ingresados. Escribe 2 numeros para  hacer la operación", Toast.LENGTH_SHORT).show();
        }


    }

    public void irAPoliticasPrivacidad(View view){
        Intent i = new Intent(this, Politicas.class);
        startActivity(i);
    }
}