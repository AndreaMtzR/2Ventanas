package com.example.formulariopract2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DATOS extends AppCompatActivity {
    private Button SALIR1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

    }
    public void salir (View view){
        finish();
    }
}