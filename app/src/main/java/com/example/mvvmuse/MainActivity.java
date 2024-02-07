package com.example.mvvmuse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mvvmuse.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.textViewSonuc.setText("0");


        binding.buttonTopla.setOnClickListener(v -> {
            String alinanSayi1=binding.editTextSayi1.getText().toString();
            String alinanSayi2=binding.editTextSayi2.getText().toString();

            int sayi1=Integer.parseInt(alinanSayi1);
            int sayi2=Integer.parseInt(alinanSayi2);

            int toplam=sayi1+sayi2;

            binding.textViewSonuc.setText(String.valueOf(toplam));


        });

        binding.buttonCarpma.setOnClickListener(v -> {
            String alinanSayi1=binding.editTextSayi1.getText().toString();
            String alinanSayi2=binding.editTextSayi2.getText().toString();

            int sayi1=Integer.parseInt(alinanSayi1);
            int sayi2=Integer.parseInt(alinanSayi2);

            int carpma= sayi1 * sayi2;

            binding.textViewSonuc.setText(String.valueOf(carpma));
        });
    }
}