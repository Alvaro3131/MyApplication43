package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private Button btn, btn2, btn3;
private EditText txtnombre;
private TextView txtraiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnombre=findViewById(R.id.NombreUsuario);
        txtraiz=findViewById(R.id.Raiz);
        btn=findViewById(R.id.btnButton);
        btn2=findViewById(R.id.btnvista1);
        btn3=findViewById(R.id.btnvista2);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               double nombre= Integer.parseInt(String.valueOf(txtnombre.getText()));
               nombre=Math.sqrt(nombre);
               txtraiz.setText("La raiz es:"+nombre);
           }
       });

    }
    public void mostrar1(View view){
        Intent intent1= new Intent(this,MainActivity2.class);
        startActivity(intent1);
    }
    public void mostrar2(View view){
        Intent intent1= new Intent(this,MainActivity3.class);
        startActivity(intent1);


    }
    public void mostrar3(View view){
        Intent intent1= new Intent(this,MainActivity4.class);
        startActivity(intent1);


    }
}