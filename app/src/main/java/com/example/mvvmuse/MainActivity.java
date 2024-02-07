package com.example.mvvmuse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
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

        binding.setHesaplamaSonucu(viewModel.getSonuc());

    }
    public void buttonToplamaTikla(String alinanSayi1,String alinanSayi2){
        viewModel.toplamaYap(alinanSayi1,alinanSayi2);
        binding.setHesaplamaSonucu(viewModel.getSonuc());

    }
    public void buttonCarpmaTikla(String alinanSayi1,String alinanSayi2){
        viewModel.carpmaYap(alinanSayi1,alinanSayi2);
        binding.setHesaplamaSonucu(viewModel.getSonuc());

    }

}