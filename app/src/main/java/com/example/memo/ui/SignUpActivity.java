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


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        signUp=(Button)findViewById(R.id.button_signin);
        inputEmail=(TextInputEditText)findViewById(R.id.editTextEmail);
        inputName=(TextInputEditText)findViewById(R.id.editTextName);
        inputPassword=(TextInputEditText)findViewById(R.id.editTextPassword);
        inputUsername=(TextInputEditText)findViewById(R.id.editTextUsername);
//        IApiEndPoint apiEndPoint = ApiRetrofit.getInstance().create(IApiEndPoint.class);
//        apiEndPoint.signUp("ccc", "cccc", "ccccccc", "cccc").enqueue(new Callback<BaseResponse<User>>() {
//            @Override
//            public void onResponse(Call<BaseResponse<User>> call, Response<BaseResponse<User>> response) {

//            }

//            @Override
//            public void onFailure(Call<BaseResponse<User>> call, Throwable t) {

//            }
//        });

        signUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
