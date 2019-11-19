package com.example.memo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.example.memo.MainActivity;
import com.example.memo.R;
import com.example.memo.data.Api.ApiRetrofit;
import com.example.memo.data.Api.IApiEndPoint;
import com.example.memo.model.ResponseLogin;
import com.example.memo.ui.home.HomeFragment;
import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoginActivity extends AppCompatActivity {
    Button login;
    TextInputEditText inputEmail;
    TextInputEditText inputPassword;
    String token ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        login =(Button)findViewById(R.id.button_login);
        inputEmail=(TextInputEditText)findViewById(R.id.editTextEmail);
        inputPassword=(TextInputEditText)findViewById(R.id.editTextPassword);


        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                IApiEndPoint apiEndPoint = ApiRetrofit.getInstance().create(IApiEndPoint.class);
                apiEndPoint.login(inputEmail.getText().toString(), inputPassword.getText().toString()).enqueue(new Callback<ResponseLogin>() {
                    @Override
                    public void onResponse(Call<ResponseLogin> call, Response<ResponseLogin> response) {
                        token = response.body().getToken();

                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onFailure(Call<ResponseLogin> call, Throwable t) {
                    }

                });

            }
        });
    }


}

