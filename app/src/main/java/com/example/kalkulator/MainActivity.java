package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText liczba1=(EditText) findViewById(R.id.editTextLiczba1);
        final EditText liczba2=(EditText) findViewById(R.id.editTextLiczba2);

        Button btnDodawanie = (Button) findViewById((R.id.buttonDodawanie));
        Button btnOdejmowanie = (Button) findViewById((R.id.buttonOdejmowanie));
        Button btnMnozenie = (Button) findViewById((R.id.buttonMnozenie));
        Button btnDzielenie = (Button) findViewById((R.id.buttonDzielenie));



        btnDodawanie.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String LiczbaA = liczba1.getText().toString();
                String LiczbaB = liczba2.getText().toString();
                Double A = Double.valueOf("" + LiczbaA);
                Double B = Double.valueOf("" + LiczbaB);

                Double wynik = A + B;
                String textWynik = wynik.toString();
                Toast.makeText(getApplicationContext(), "wynik dodawania to: "+wynik, Toast.LENGTH_SHORT).show();
            }
        });

        btnOdejmowanie.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String LiczbaA = liczba1.getText().toString();
                String LiczbaB = liczba2.getText().toString();
                Double A = Double.valueOf("" + LiczbaA);
                Double B = Double.valueOf("" + LiczbaB);

                Double wynik = A - B;
                String textWynik = wynik.toString();
                Toast.makeText(getApplicationContext(), "wynik odejmowania to: "+wynik, Toast.LENGTH_SHORT).show();
            }
        });


        btnMnozenie.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){String LiczbaA = liczba1.getText().toString();
                String LiczbaB = liczba2.getText().toString();
                Double A = Double.valueOf("" + LiczbaA);
                Double B = Double.valueOf("" + LiczbaB);

                Double wynik = A * B;
                String textWynik = wynik.toString();
                Toast.makeText(getApplicationContext(), "wynik mnozenia to: "+wynik, Toast.LENGTH_SHORT).show();
            }
        });



        btnDzielenie.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){String LiczbaA = liczba1.getText().toString();
                String LiczbaB = liczba2.getText().toString();
                Double A = Double.valueOf("" + LiczbaA);
                Double B = Double.valueOf("" + LiczbaB);

                Double wynik = A / B;
                String textWynik = wynik.toString();
                Toast.makeText(getApplicationContext(), "wynik dzielenia to: "+wynik, Toast.LENGTH_SHORT).show();
            }
        });


/*        if (liczba1.length()==0||liczba2.length()==0){
            Toast.makeText(getApplicationContext(), "Wypelnij wzystkie pola", Toast.LENGTH_SHORT).show();
        }else{
        }*/



    }
}