package com.example.memo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.memo.MainActivity;
import com.example.memo.R;
import com.example.memo.data.Api.ApiRetrofit;
import com.example.memo.data.Api.IApiEndPoint;
import com.example.memo.model.BaseResponse;
import com.example.memo.model.User;
import com.google.android.material.textfield.TextInputEditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUpActivity extends AppCompatActivity {

    Button signUp;
    TextInputEditText inputEmail;
    TextInputEditText inputName;
    TextInputEditText inputPassword;
    TextInputEditText inputUsername;
    String message;
    User user;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        signUp=(Button)findViewById(R.id.button_signin);
        inputEmail=(TextInputEditText)findViewById(R.id.editTextEmail);
        inputName=(TextInputEditText)findViewById(R.id.editTextName);
        inputPassword=(TextInputEditText)findViewById(R.id.editTextPassword);
        inputUsername=(TextInputEditText)findViewById(R.id.editTextUsername);

        signUp.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    IApiEndPoint apiEndPoint = ApiRetrofit.getInstance().create(IApiEndPoint.class);
                    apiEndPoint.signUp(inputName.getText().toString(), inputUsername.getText().toString(),inputEmail.getText().toString(), inputPassword.getText().toString()).enqueue(new Callback<BaseResponse<User>>() {
                        @Override
                        public void onResponse(Call<BaseResponse<User>> call, Response<BaseResponse<User>> response) {
                           message=response.message();
                           Log.e("lele", call.request().toString());
                           Log.e("lala", response.body().toString());
                            user=response.body().getData();
                            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                            startActivity(intent);
                        }

                        @Override
                        public void onFailure(Call<BaseResponse<User>> call, Throwable t) {
                            Toast.makeText(getApplicationContext(), "gagal", Toast.LENGTH_LONG).show();
                        }

                    });

                }
            });
        }
    }