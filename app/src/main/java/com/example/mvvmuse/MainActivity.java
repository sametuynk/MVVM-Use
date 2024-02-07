package com.example.mvvmuse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mvvmuse.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding=ActivityMainBinding.inflate(getLayoutInflater());
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.textViewSonuc.setText("0");
        binding.setMainActivityNesnesi(this);


    }
    public void buttonToplamaTikla(String alinanSayi1,String alinanSayi2){

        int sayi1=Integer.parseInt(alinanSayi1);
        int sayi2=Integer.parseInt(alinanSayi2);

        int toplam=sayi1+sayi2;

        binding.textViewSonuc.setText(String.valueOf(toplam));
    }
    public void buttonCarpmaTikla(String alinanSayi1,String alinanSayi2){

        int sayi1=Integer.parseInt(alinanSayi1);
        int sayi2=Integer.parseInt(alinanSayi2);

        int carpma= sayi1 * sayi2;

        binding.textViewSonuc.setText(String.valueOf(carpma));
    }
}