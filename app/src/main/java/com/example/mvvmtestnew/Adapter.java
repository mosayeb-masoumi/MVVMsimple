package com.example.mvvmtestnew;

import android.app.Activity;
import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    List<User> userList;
    Context context;

    public Adapter(List<User> userList, Context context) {
        this.userList = userList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new RecyclerViewViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        User user = userList.get(position);
        RecyclerViewViewHolder viewHolder= (RecyclerViewViewHolder) holder;

        viewHolder.txtView_title.setText(user.getTitle());
        viewHolder.txtView_description.setText(user.getDescription());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    class RecyclerViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgView_icon;
        TextView txtView_title;
        TextView txtView_description;

        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgView_icon = itemView.findViewById(R.id.imgView_icon);
            txtView_title = itemView.findViewById(R.id.txtView_title);
            txtView_description = itemView.findViewById(R.id.txtView_description);
        }
    }
}
