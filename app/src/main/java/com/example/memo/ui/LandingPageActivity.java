package com.example.memo.ui;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.memo.Profile;
import com.example.memo.R;
import com.example.memo.ui.home.HomeFragment;

public class LandingPageActivity extends AppCompatActivity implements View.OnClickListener {
    Button login;
    Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);
        login= (Button)findViewById(R.id.button_login);
        login.setOnClickListener(this);
        signIn = (Button)findViewById(R.id.button_signin);
        signIn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_login:
                Intent explicit = new Intent(LandingPageActivity.this, LoginActivity.class);
                startActivity(explicit);
                break;
            case R.id.button_signin:
                Intent implicit = new Intent(LandingPageActivity.this, SignUpActivity.class);
                startActivity(implicit);
                break;
            default:
                break;
        }
    }
}