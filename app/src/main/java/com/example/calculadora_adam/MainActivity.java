package com.example.calculadora_adam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView pantalla;
    public double operan1, operan2, res;
    int ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //LLama al splashteme que ya creamos


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla =(EditText)findViewById(R.id.tv1);
    }

    public void btn1 (View view){
        String c = pantalla.getText().toString();
        c = c + "1";
        pantalla.setText(c);
    }
    public void btn2 (View view){
        String c = pantalla.getText().toString();
        c = c + "2";
        pantalla.setText(c);
    }
    public void btn3 (View view){
        String c = pantalla.getText().toString();
        c = c + "3";
        pantalla.setText(c);
    }
    public void btn4 (View view){
        String c = pantalla.getText().toString();
        c = c + "4";
        pantalla.setText(c);
    }
    public void btn5 (View view){
        String c = pantalla.getText().toString();
        c = c + "5";
        pantalla.setText(c);
    }
    public void btn6 (View view){
        String c = pantalla.getText().toString();
        c = c + "6";
        pantalla.setText(c);
    }
    public void btn7 (View view){
        String c = pantalla.getText().toString();
        c = c + "7";
        pantalla.setText(c);
    }
    public void btn8 (View view){
        String c = pantalla.getText().toString();
        c = c + "8";
        pantalla.setText(c);
    }
    public void btn9 (View view){
        String c = pantalla.getText().toString();
        c = c + "9";
        pantalla.setText(c);
    }
    public void btn0 (View view){
        String c = pantalla.getText().toString();
        c = c + "0";
        pantalla.setText(c);
    }

    public void btnPunto (View view){
        String c = pantalla.getText().toString();
        c = c + ".";
        pantalla.setText(c);
    }

    public void btnSum (View view){
        try {
            String aux1= pantalla.getText().toString();
            operan1=Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){ }
        pantalla.setText("");
        ope=1;
        //La operacion 1 va a corresponder a suma
    }

    public void btnRes (View view){
        try {
            String aux1= pantalla.getText().toString();
            operan1=Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){ }
        pantalla.setText("");
        ope=2;
        //La operacion 2 va a corresponder a resta
    }

    public void btnMult (View view){
        try {
            String aux1= pantalla.getText().toString();
            operan1=Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){ }
        pantalla.setText("");
        ope=3;
        //La operacion 3 va a corresponder a multiplicar
    }

    public void btnDiv (View view){
        try {
            String aux1= pantalla.getText().toString();
            operan1=Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){ }
        pantalla.setText("");
        ope=4;
        //La operacion 4 va a corresponder a dividir
    }


    public void btnSin (View view){
        try {
            String aux1= pantalla.getText().toString();
            operan1=Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){ }
        pantalla.setText("SIN(" + operan1 + ")" );
        ope=5;
        //La operacion 5 va a corresponder a seno
    }

    public void btnCos (View view){
        try {
            String aux1= pantalla.getText().toString();
            operan1=Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){ }
        pantalla.setText("COS(" + operan1 + ")" );
        ope=6;
        //La operacion 6 va a corresponder a coseno
    }

    public void btnTan (View view){
        try {
            String aux1= pantalla.getText().toString();
            operan1=Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){ }
        pantalla.setText("TAN(" + operan1 + ")" );
        ope=7;
        //La operacion 7 va a corresponder a tangente
    }

    public void btnIgual (View view){
        try {
            String aux2= pantalla.getText().toString();
            operan2=Double.parseDouble(aux2);
        }catch (NumberFormatException nfe){ }
        pantalla.setText("");

        if (ope==1){
            res=operan1+operan2;
        }else if (ope==2){
            res=operan1-operan2;
        }else if (ope==3){
            if (operan2==0.0){
                pantalla.setText("MATH ERROR");
            }else {
                res=operan1*operan2;
            }
        }else if (ope==4){
            res=operan1/operan2;
        }else if (ope==5){
            double rad=Math.toRadians(operan1);
            res=(Math.sin(rad));
        }
        else if (ope==6){
            double rad=Math.toRadians(operan1);
            res=(Math.cos(rad));
        }
        else if (ope==7){
            double rad=Math.toRadians(operan1);
            res=(Math.tan(rad));
        }

        pantalla.setText(""+res);
        operan1=res;

    }

    public void borrarT (View view){
        pantalla.setText("");
        operan2=0.0;
        operan1=0.0;
        res=0.0;
    }

    public void del (View view){
        if (!pantalla.getText().toString().equals("")){
            pantalla.setText(pantalla.getText().subSequence(0, pantalla.getText().length()-1)+"");
        }
    }


}