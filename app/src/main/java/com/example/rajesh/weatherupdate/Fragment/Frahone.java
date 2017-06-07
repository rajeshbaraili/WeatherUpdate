package com.example.rajesh.weatherupdate.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rajesh.weatherupdate.Model;
import com.example.rajesh.weatherupdate.Network.RestClient;
import com.example.rajesh.weatherupdate.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by rajesh on 5/21/2017.
 */

class Frahone extends Fragment {


    private ArrayList<Model.ListBean> data;
    private DataAdapter adapter;

    Context context;
    RecyclerView recyclerView;

    LinearLayoutManager linearLayoutManager;

    public Frahone(List<String> mFragmentTitleList) {
    }

    public Frahone() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.rec);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);


        // Call<Model> s= RestClient.get().getJSON();

        Call<Model> call = RestClient.get().getJSON();
        call.enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {
                Model jsonResponse = response.body();
                 Log.e(">>>>",""+jsonResponse.getList());

                data = new ArrayList(jsonResponse.getList());

                adapter = new DataAdapter(data);
//
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Model> call, Throwable t) {
                Log.e(">>>>", "" + t.getMessage());
            }
        });


        return view;

    }


}
