package com.mmp.plansgrid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterPlansBasic extends RecyclerView.Adapter<AdapterPlansBasic.ViewHolder> {

    ArrayList<String> listvaluetype;
    ArrayList<String> listtime;
    ArrayList<String> listamount;
    Context context;

    public AdapterPlansBasic(ArrayList<String> listvaluetype, ArrayList<String> timeperiod, ArrayList<String> listamount, Context context) {
        this.listvaluetype = listvaluetype;
        this.listtime=timeperiod;
        this.listamount=listamount;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.view_my_articles, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.valuetype.setText(listvaluetype.get(i).toString());
        viewHolder.timePeriod.setText(listtime.get(i).toString());
        viewHolder.amount.setText(listamount.get(i).toString());
    }

    @Override
    public int getItemCount() {
        return listvaluetype.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
//        public ImageView imgArticle;
        public TextView valuetype;
        public TextView timePeriod;
        public TextView amount;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            valuetype     = itemView.findViewById(R.id.valuetype);
            timePeriod =itemView.findViewById(R.id.timeperiod);
            amount=itemView.findViewById(R.id.actualpayable);
        }
    }
}
