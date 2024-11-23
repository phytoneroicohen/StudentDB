package com.example.students_db;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter<myHolder> {

    Context context;
    List<Student> items;

    public myAdapter(Context context, List<Student> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myHolder holder, int position) {
        holder.idView.setText(items.get(position).getId());
        holder.nameView.setText(items.get(position).getName());
        holder.adsressView.setText(items.get(position).getAddress());
        holder.ageView.setText(items.get(position).getAge());
        holder.gradesView.setText(items.get(position).getGrades());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
