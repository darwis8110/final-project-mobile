package io.github.darwishub.konversi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText edt_angka;
    Button bhg, bdag, bg, bdg, bons, bpon, bcg, bmg;
    TextView hsl;

    double angka;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_angka = (EditText) findViewById(R.id.ET_input);
        bhg = (Button) findViewById(R.id.bhg);
        bdag = (Button) findViewById(R.id.bdag);
        bg = (Button) findViewById(R.id.bg);
        bdg = (Button) findViewById(R.id.bdg);
        bons = (Button) findViewById(R.id.bons);
        bpon = (Button) findViewById(R.id.bpon);
        bcg = (Button) findViewById(R.id.bcg);
        bmg = (Button) findViewById(R.id.bmg);
        hsl = (TextView) findViewById(R.id.output);
    }



    public boolean cek(){
        if(edt_angka.getText().toString().isEmpty()){
            Toast.makeText(this, "Masukkan Nominal", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
    public void bhg (View v){
        if(!cek()){
            return;
        }
        try{
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch (Exception ex){
            Toast.makeText(this, "Masukkan Nominal", Toast.LENGTH_SHORT).show();

        }
        double hasil = angka * 10;
        hsl.setText(Integer.toString((int) hasil));
        Toast.makeText(this,"1 kg = 10 hg", Toast.LENGTH_SHORT).show();
    }
    public void bdag (View v){
        if(!cek()){
            return;
        }
        try{
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch (Exception ex){
            Toast.makeText(this, "Masukkan Nominal", Toast.LENGTH_SHORT).show();

        }
        double hasil = angka * 100;
        hsl.setText(Integer.toString((int) hasil));
        Toast.makeText(this,"1 kg = 100 dag", Toast.LENGTH_SHORT).show();
    }
    public void bg (View v){
        if(!cek()){
            return;
        }
        try{
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch (Exception ex){
            Toast.makeText(this, "Masukkan Nominal", Toast.LENGTH_SHORT).show();

        }
        double hasil = angka * 1000;
        hsl.setText(Integer.toString((int) hasil));
        Toast.makeText(this,"1 kg = 1000 g", Toast.LENGTH_SHORT).show();
    }
    public void bdg (View v){
        if(!cek()){
            return;
        }
        try{
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch (Exception ex){
            Toast.makeText(this, "Masukkan Nominal", Toast.LENGTH_SHORT).show();

        }
        double hasil = angka * 10000;
        hsl.setText(Integer.toString((int) hasil));
        Toast.makeText(this,"1 kg = 10000 dg", Toast.LENGTH_SHORT).show();
    }
    public void bons (View v){
        if(!cek()){
            return;
        }
        try{
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch (Exception ex){
            Toast.makeText(this, "Masukkan Nominal", Toast.LENGTH_SHORT).show();

        }
        double hasil = angka * 10;
        hsl.setText(Integer.toString((int) hasil));
        Toast.makeText(this,"1 kg = 10 ons", Toast.LENGTH_SHORT).show();
    }
    public void bpon (View v){
        if(!cek()){
            return;
        }
        try{
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch (Exception ex){
            Toast.makeText(this, "Masukkan Nominal", Toast.LENGTH_SHORT).show();

        }
        double hasil = angka * 2;
        hsl.setText(Integer.toString((int) hasil));
        Toast.makeText(this,"1 kg = 2 pon", Toast.LENGTH_SHORT).show();
    }

    public void bcg (View v){
        if(!cek()){
            return;
        }
        try{
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch (Exception ex){
            Toast.makeText(this, "Masukkan Nominal", Toast.LENGTH_SHORT).show();

        }
        double hasil = angka * 100000;
        hsl.setText(Double.toString((int) hasil));
        Toast.makeText(this,"1 kg = 100000 centigram", Toast.LENGTH_SHORT).show();
    }

    public void bmg (View v){
        if(!cek()){
            return;
        }
        try{
            angka = Double.parseDouble(edt_angka.getText().toString());
        }catch (Exception ex){
            Toast.makeText(this, "Masukkan Nominal", Toast.LENGTH_SHORT).show();

        }
        double hasil = angka * 1000000;
        hsl.setText(Double.toString((int) hasil));
        Toast.makeText(this,"1 kg = 1000000 miligram", Toast.LENGTH_SHORT).show();
    }


}


