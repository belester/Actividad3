package com.anitey.belester.actividad33;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.anitey.belester.actividad33.modelo.Usuario;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();

        Usuario u = intent.getParcelableExtra("user");



        ((TextView)findViewById(R.id.textView)).setText(u.nombre);

        ((TextView)findViewById(R.id.textView2)).setText(u.apellido);

        ((TextView)findViewById(R.id.textView3)).setText(u.edad);
    }
}
