package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    private TextView tvcetak,tvperulangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvcetak=findViewById(R.id.tvcetak);
        tvperulangan=findViewById(R.id.tvperulangan);

        String angka="4,9,7,5,8,9,3";
        String strarray[]=angka.split(",");
        int[] number=new int[strarray.length];
        ArrayList<String> list=new ArrayList<>(Arrays.asList(strarray));
        int pj=strarray.length;
        int jum=0;
        String a;

        for (int i=0; i<pj; i++){
            number[i]=Integer.parseInt(strarray[i]);
        }

      //  79,59,57,89,39,39,38,37,35,34

        for (int i=0; i<pj; i++){
            for (int j=i+1; j<pj; j++){
                if (number[i]>number[j]){
                    Collections.swap(list,i,j);
                    Toast.makeText(this,"["+Integer.toString(number[j])+","+Integer.toString(number[i])+"]" +
                            " -> "+list,Toast.LENGTH_LONG).show();
                    jum++;
               }
            }
        }
        tvcetak.setText("Jumlah swap= "+Integer.toString(jum));
        tvperulangan.setText("Swap terakhir= "+list);
    }
}