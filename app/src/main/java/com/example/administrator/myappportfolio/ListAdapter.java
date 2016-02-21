package com.example.administrator.myappportfolio;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Administrator on 2016-02-20.
 * Used as my app portfolio
 */
public class ListAdapter extends BaseAdapter {
    Context context;
    LayoutInflater lInflater;
    List<String> data;

    ListAdapter(Context context, List<String> data){
        this.context = context;
        this.data = data;
        lInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null){
            view = lInflater.inflate(R.layout.list_item_app_name,parent,false);
        }
        Button button = ((Button) view.findViewById(R.id.list_item_app_name_button));
        button.setText(data.get(position));
        if(position == (getCount()-1)){
            view.setBackgroundColor(Color.RED);
            button.setTextColor(Color.WHITE);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "This button will launch my capstone app", Toast.LENGTH_LONG).show();
                }
            });
        }else{
            view.setBackgroundColor(Color.parseColor("#F08C35"));
            button.setTextColor(Color.BLACK);
        }
        return view;
    }
}
