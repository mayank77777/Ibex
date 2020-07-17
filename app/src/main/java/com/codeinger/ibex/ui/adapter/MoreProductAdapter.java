package com.codeinger.ibex.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codeinger.ibex.R;

import java.util.List;

public class MoreProductAdapter extends RecyclerView.Adapter<MoreProductAdapter.MoreProductViewHolder> {

    List<String> list;

    public MoreProductAdapter(List<String> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public MoreProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.mycart, parent, false);
        return new MoreProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoreProductViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MoreProductViewHolder extends RecyclerView.ViewHolder {

        public MoreProductViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
