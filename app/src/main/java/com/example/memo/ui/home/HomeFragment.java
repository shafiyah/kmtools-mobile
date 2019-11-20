package com.example.memo.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.memo.R;
import com.example.memo.data.Api.ApiRetrofit;
import com.example.memo.data.Api.IApiEndPoint;
import com.example.memo.model.Article;
import com.example.memo.model.ArticleBasedonCategory;
import com.example.memo.model.BaseResponse;
import com.example.memo.model.Categories;
import com.example.memo.model.UserInterestCategory;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment {

    private RecyclerView rvRecommended;
    private RecyclerView rvLatest;
    private ArticleAdapter recommendetAdapter;
    private ArticleAdapter latestAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final View root = inflater.inflate(R.layout.fragment_home, container, false);

        rvRecommended = root.findViewById(R.id.recycleViewRecommonded);
        rvLatest = root.findViewById(R.id.recycleViewLatestArticle);

//        IApiEndPoint apiEndPoint = ApiRetrofit.getInstance().create(IApiEndPoint.class);
//        apiEndPoint.getArticleBasedonCategory("fjgpjhpjhposjhpotk  ").enqueue(new Callback<ArticleBasedonCategory<List<Article>>>() {
//            @Override
//            public void onResponse(Call<ArticleBasedonCategory<List<Article>>> call, Response<ArticleBasedonCategory<List<Article>>> response) {
//                recommendetAdapter=new ArticleAdapter(response.body().getData());
//                rvRecommended.setAdapter(recommendetAdapter);
//                rvRecommended.setLayoutManager(new LinearLayoutManager(getContext()));
//
//            }
//
//            @Override
//            public void onFailure(Call<ArticleBasedonCategory<List<Article>>> call, Throwable t) {
//
//            }
//        });
//
//        apiEndPoint.getListAllArticle("llokoono").enqueue(new Callback<BaseResponse<List<Article>>>() {
//            @Override
//            public void onResponse(Call<BaseResponse<List<Article>>> call, Response<BaseResponse<List<Article>>> response) {
//                latestAdapter = new ArticleAdapter(response.body().getData());
//                rvLatest.setAdapter(latestAdapter);
//                rvLatest.setLayoutManager(new LinearLayoutManager(getContext()));
//            }
//
//            @Override
//            public void onFailure(Call<BaseResponse<List<Article>>> call, Throwable t) {
//
//            }
//        });
        return root;
    }
}