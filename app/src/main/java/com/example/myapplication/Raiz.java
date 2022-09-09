package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Raiz extends AppCompatActivity {
    private Button btn;
    private EditText txtnombre;
    private TextView txtraiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiz);
        txtnombre=findViewById(R.id.NombreUsuario);
        txtraiz=findViewById(R.id.Raiz);
        btn=findViewById(R.id.calraiz);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double nombre= Integer.parseInt(String.valueOf(txtnombre.getText()));
                nombre=Math.sqrt(nombre);
                txtraiz.setText("La raiz es:"+nombre);
            }
        });
    }
    public void principal(View view){
        Intent intent1= new Intent(this,MainActivity.class);
        startActivity(intent1);


    }
}