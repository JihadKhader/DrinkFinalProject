package com.example.drinkfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Spinner spinner ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
    }
    private void setViews(){
        spinner = (Spinner)findViewById(R.id
                .spinner);
        editText = findViewById(R.id.edtDrinks);
    }

    public void btnClick(View view) {
        String drink = spinner.getSelectedItem().toString();
        editText.setText(drink);
    }
}
