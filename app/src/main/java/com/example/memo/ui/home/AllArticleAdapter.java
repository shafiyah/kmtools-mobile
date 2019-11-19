package com.example.memo.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.memo.R;
import com.example.memo.model.Article;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AllArticleAdapter extends RecyclerView.Adapter<AllArticleAdapter.RecycleViewHolder>{
private ArrayList<Article> dataList;
private RecycleViewHolder holder;

public AllArticleAdapter(ArrayList<Article> dataList) {
        this.dataList = dataList;
        }

@Override
public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_latest_article, parent, false);
        return new RecycleViewHolder(view);
        }

@Override
public void onBindViewHolder(RecycleViewHolder holder, int position) {

        holder.txtJudulArticle.setText(dataList.get(position).getTitle());
        Picasso.get().load(dataList.get(position).getFoto()).into(holder.imageViewArticle);

        }

@Override
public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
        }

public class RecycleViewHolder extends RecyclerView.ViewHolder{
    private TextView txtJudulArticle;
    private ImageView imageViewArticle;

    public RecycleViewHolder(View itemView) {
        super(itemView);
        txtJudulArticle = (TextView) itemView.findViewById(R.id.txtJudulArticle);
        imageViewArticle = (ImageView) itemView.findViewById(R.id.imageViewArticle);
    }
}
}
