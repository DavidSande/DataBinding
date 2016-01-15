package com.databin;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.databin.VO.Client;
import com.databin.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Client client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        client = new Client("David");

        binding.setClient(client);

    }

    public void cambiarNombre(View view){

        client.setName("New name");
    }

}
