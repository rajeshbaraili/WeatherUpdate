package com.example.rajesh.weatherupdate.Fragment;


import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rajesh.weatherupdate.Model;
import com.example.rajesh.weatherupdate.R;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<Model.ListBean> android;
    int day;

    public DataAdapter(ArrayList<Model.ListBean> android) {
        this.android = android;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ss = android.get(i).getDt_txt();
      // int sso = Integer.parseInt(android.get(1).getDt_txt());
      //  int ssth = Integer.parseInt(android.get(4).getDt_txt());
       // int sst = Integer.parseInt(android.get(8).getDt_txt());
        try {
            Date today = df.parse(ss);

            SimpleDateFormat sdf = new SimpleDateFormat("dd");
            day = Integer.parseInt(sdf.format(today));
            Log.e(">>>>>>>>>>>", String.valueOf(day));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        viewHolder.tv_name.setText("" + android.get(i).getMain().getTemp_max());
        viewHolder.tv_version.setText("" + android.get(i).getMain().getTemp_min());
        viewHolder.tv_api_level.setText("" + android.get(i).getDt_txt());


    }

    @Override
    public int getItemCount() {
        return android.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_name, tv_version, tv_api_level;

        public ViewHolder(View view) {
            super(view);

            tv_name = (TextView) view.findViewById(R.id.tv_name);
            tv_version = (TextView) view.findViewById(R.id.tv_version);
            tv_api_level = (TextView) view.findViewById(R.id.tv_api_level);

        }
    }

}