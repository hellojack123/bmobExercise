package com.example.bmobexercise.model.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bmobexercise.R;
import com.example.bmobexercise.model.bean.Post;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {
    private List<Post> mPostList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView postWords;
        public ViewHolder( View view) {
            super(view);
            postWords=(TextView) view.findViewById(R.id.post_words);
        }
    }

    public PostAdapter(List<Post> postList){
        mPostList=postList;
    }


    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item,parent,false);
        final ViewHolder holder=new ViewHolder(view);
        //点击事件
        holder.postWords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=holder.getAdapterPosition();
                Post post=mPostList.get(position);
                Toast.makeText(v.getContext(), "你点击了文字: "+post.getContent(), Toast.LENGTH_SHORT).show();
            }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        Post post=mPostList.get(position);
        holder.postWords.setText(post.getContent());
    }

    @Override
    public int getItemCount() {
        return mPostList.size();
    }


}
