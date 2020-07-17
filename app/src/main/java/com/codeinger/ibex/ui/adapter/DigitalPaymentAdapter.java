package com.codeinger.ibex.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codeinger.ibex.R;

import java.util.List;

public class DigitalPaymentAdapter extends RecyclerView.Adapter<DigitalPaymentAdapter.DigitalPaymentViewHolder> {


    List<String> list;

    public DigitalPaymentAdapter(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public DigitalPaymentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.digital_method, parent, false);
        return new DigitalPaymentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DigitalPaymentViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class DigitalPaymentViewHolder extends RecyclerView.ViewHolder {

        public DigitalPaymentViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
