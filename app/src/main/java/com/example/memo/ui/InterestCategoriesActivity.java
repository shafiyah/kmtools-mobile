package com.example.memo.ui;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.memo.R;

public class InterestCategoriesActivity extends AppCompatActivity {
    Button btnFrontend;
    Button btnBackend;
    Button btnUx;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rule_user);
        btnFrontend=(Button)findViewById(R.id.imageViewFrontend);
        btnBackend=(Button)findViewById(R.id.imageViewBackend);
        btnUx=(Button)findViewById(R.id.imageViewUI);
    }
}
