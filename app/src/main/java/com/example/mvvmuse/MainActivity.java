package com.example.mvvmuse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.mvvmuse.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainActivityViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //binding=ActivityMainBinding.inflate(getLayoutInflater());
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        viewModel=new ViewModelProvider(this).get(MainActivityViewModel.class);

        binding.setMainActivityNesnesi(this);


        viewModel.getSonuc().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.setHesaplamaSonucu(s);
            }
        });

    }
    public void buttonToplamaTikla(String alinanSayi1,String alinanSayi2){
        viewModel.toplamaYap(alinanSayi1,alinanSayi2);


    }
    public void buttonCarpmaTikla(String alinanSayi1,String alinanSayi2){
        viewModel.carpmaYap(alinanSayi1,alinanSayi2);


    }

}