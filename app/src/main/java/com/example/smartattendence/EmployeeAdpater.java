package com.example.smartattendence;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmployeeAdpater extends RecyclerView.Adapter<EmployeeAdpater.ViewHolder> {
    private final String[] dataset;
    Context context;
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView tv;

        public ViewHolder(View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.employee_name);
        }
        public TextView getTextView(){
            return tv;
        }
    }

    public EmployeeAdpater(Context c,String[] ds){
        this.dataset = ds;
        this.context = c;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        Context context = parent.getContext();
//        LayoutInflater inflater = LayoutInflater.from(context);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.employee_list_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.getTextView().setText(dataset[position]);
    }

    @Override
    public int getItemCount() {
        return dataset.length;
    }


}
