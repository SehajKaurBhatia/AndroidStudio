package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
//import android.widget.Plain Text;
import com.example.myapplication3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    binding.button.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            String userText=binding.editTextText.getText().toString();
            binding.TextView.setText(userText);
        }

        });


    }
}