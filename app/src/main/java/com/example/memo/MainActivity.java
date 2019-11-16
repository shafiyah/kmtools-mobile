package com.example.memo;

import android.os.Bundle;

import com.example.memo.data.Api.ApiRetrofit;
import com.example.memo.data.Api.IApiEndPoint;
import com.example.memo.model.ResponseLogin;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IApiEndPoint apiEndPoint = ApiRetrofit.getInstance().create(IApiEndPoint.class);
        apiEndPoint.login("bitter@nut.co.nk", "12345").enqueue(new Callback<ResponseLogin>() {
            @Override
            public void onResponse(Call<ResponseLogin> call, Response<ResponseLogin> response) {
                token = response.body().getToken();
            }

            @Override
            public void onFailure(Call<ResponseLogin> call, Throwable t) {

            }
        });

        BottomNavigationView navView = findViewById(R.id.nav_view);

       // Passing each menu ID as a set of Ids because each
        //menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_search, R.id.navigation_profile)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

}
