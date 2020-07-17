package com.codeinger.ibex.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codeinger.ibex.R;

import java.util.List;

public class OurServiceAdapter  extends RecyclerView.Adapter<OurServiceAdapter.OurServiceViewHolder> {

    List<String> list;

    public OurServiceAdapter(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public OurServiceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.service, parent, false);
        return new OurServiceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OurServiceViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class OurServiceViewHolder extends RecyclerView.ViewHolder {

        public OurServiceViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
