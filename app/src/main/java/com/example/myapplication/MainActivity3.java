package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
private EditText lista;
private Button btn;
private TextView result1;
ArrayList<Double> numeros = new ArrayList<Double>();
 int conta=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lista=findViewById(R.id.lista);
        btn=findViewById(R.id.promediar);
        result1=findViewById(R.id.resultpro);
    }
    public void promediar(View view){
        double promedio=0;
      if(conta<=10){

          double numero=Double.parseDouble(String.valueOf(lista.getText()));
          numeros.add(numero);
          lista.setText("");
          conta=conta+1;
          if(conta==10){
              btn.setText("Promediando");
              conta=20;
          }
      }
      if(conta==20){
          for (int i=0; i<=9;i++){
              promedio=promedio+numeros.get(i);
          }
          promedio=promedio/10;
          result1.setText("El promedio es:"+promedio);
          btn.setText("Agregar");
          promedio=0;
          conta=0;
          numeros.clear();
      }
    }
}