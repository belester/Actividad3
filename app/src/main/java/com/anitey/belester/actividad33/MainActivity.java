package com.anitey.belester.actividad33;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.anitey.belester.actividad33.modelo.Usuario;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void click (View view){
        EditText nombre = findViewById(R.id.nombre);
        String text = nombre.getText().toString();

        EditText apellido = findViewById(R.id.apellido);
        String text2 = apellido.getText().toString();

        EditText edad = findViewById(R.id.edad);
        String number = edad.getText().toString();

        Usuario u = new Usuario(text, text2, new Integer(number));
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("Usuario", u);
        startActivity(intent);
    }
}
