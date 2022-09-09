package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
private Button btn;
private EditText n1,n2,n3;
private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn=findViewById(R.id.comparar);
        n1=findViewById(R.id.textnumero1);
        n2=findViewById(R.id.textnumero2);
        n3=findViewById(R.id.textnumero3);
        result=findViewById(R.id.resultado);
    }
    public void comparar(View view){
        int numero1=Integer.parseInt(String.valueOf(n1.getText()));
        int numero2=Integer.parseInt(String.valueOf(n2.getText()));
        int numero3=Integer.parseInt(String.valueOf(n3.getText()));
        if (numero1>numero2 && numero1>numero3){
            result.setText("El numero: "+numero1+" es mayor de todos");
        }else if(numero2>numero1 && numero2>numero3){
            result.setText("El numero: "+numero2+" es mayor de todos");
        }else if(numero3>numero1 && numero3>numero2){
            result.setText("El numero: "+numero3+" es mayor de todos");
        }else if(numero3==numero2 && numero1==numero2){
            result.setText("Los numeros son iguales");
        }else if(numero3==numero2){
            result.setText("El numero 2 y 3 son iguales");
        }else if(numero1==numero2){
            result.setText("El numero 1 y 2 son iguales");
        }else if(numero1==numero3){
            result.setText("El numero 1 y 3 son iguales");
        }


    }
    public void principal(View view){
        Intent intent1= new Intent(this,MainActivity.class);
        startActivity(intent1);

    }
}