package com.example.digitaltasbeeh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class adapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    Context context;
    int pics[];

    public adapter(Context context,int pics[]){
        this.context=context;
        this.pics=pics;
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return pics.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=layoutInflater.inflate(R.layout.newlayout,null);
        ImageView img=view.findViewById(R.id.img);
        img.setImageResource(pics[position]);
        return view;
    }
}