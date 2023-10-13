package com.skyblue.javastringarray;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.skyblue.javastringarray.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private final Context context = this;

    // Method 1
    private String[] friends = new String[]{"Akila", "Karuppusamy", "Santhiya", "Sangeetha"};
    // Method 2
    private String[] friends2 = {"Akila", "Karuppusamy", "Santhiya", "Sangeetha"};
    // Method 3
    private String[] friends3 =new String[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Method 1
        for (String i: friends){
            Log.e("string_array", "Method 1 :" + i);
        }

        // Method 2
        for (int a = 0; a<friends2.length; a++){
            Log.e("string_array", "Method 2 :" + friends2[a]);
        }

        // Method 3
        friends3[0]="Akila";
        friends3[1]="Karuppusamy";
        friends3[2]="Santhiya";
        friends3[3]="Sangeetha";

        int i = 0;
        while (i < friends3.length) {
            Log.e("string_array", "Method 3 :" + friends3[i]);
            i++;
        }
    }
}