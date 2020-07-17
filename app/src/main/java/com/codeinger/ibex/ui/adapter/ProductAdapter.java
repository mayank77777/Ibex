package com.codeinger.ibex.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.codeinger.ibex.R;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    List<String> list;
    boolean flag;
    OnclickCallbcak onclickCallbcak;

    public ProductAdapter(List<String> list,boolean flag,OnclickCallbcak onclickCallbcak) {
        this.list = list;
        this.flag = flag;
        this.onclickCallbcak = onclickCallbcak;
    }


    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        if(flag){
            if(position%2==0){
                holder.discount.setBackground(ContextCompat.getDrawable(holder.discount.getContext(), R.drawable.primery_box_product));
                holder.addToCart.setBackground(ContextCompat.getDrawable(holder.discount.getContext(), R.drawable.primery_box_product));
            }
            else {
                holder.discount.setBackground(ContextCompat.getDrawable(holder.discount.getContext(), R.drawable.blue_box_product));
                holder.addToCart.setBackground(ContextCompat.getDrawable(holder.discount.getContext(), R.drawable.blue_box_product));
            }
        }
        else {
            if(position%2==0){
                holder.discount.setBackground(ContextCompat.getDrawable(holder.discount.getContext(), R.drawable.blue_box_product));
                holder.addToCart.setBackground(ContextCompat.getDrawable(holder.discount.getContext(), R.drawable.blue_box_product));
            }
            else {
                holder.discount.setBackground(ContextCompat.getDrawable(holder.discount.getContext(), R.drawable.primery_box_product));
                holder.addToCart.setBackground(ContextCompat.getDrawable(holder.discount.getContext(), R.drawable.primery_box_product));
            }
        }

        holder.main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onclickCallbcak.onClick();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView discount,addToCart;
        ConstraintLayout main;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            discount = itemView.findViewById(R.id.discount);
            addToCart = itemView.findViewById(R.id.addToCart);
            main = itemView.findViewById(R.id.main);
        }
    }

    public interface OnclickCallbcak{
        void onClick();
    }
}
