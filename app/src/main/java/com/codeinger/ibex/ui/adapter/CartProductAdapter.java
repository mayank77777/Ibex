package com.codeinger.ibex.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codeinger.ibex.R;

import java.util.List;

public class CartProductAdapter extends RecyclerView.Adapter<CartProductAdapter.CartProductViewHolder> {

    List<String> list;

    public CartProductAdapter(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public CartProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.mycart, parent, false);
        return new CartProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartProductViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class CartProductViewHolder extends RecyclerView.ViewHolder {

        public CartProductViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
