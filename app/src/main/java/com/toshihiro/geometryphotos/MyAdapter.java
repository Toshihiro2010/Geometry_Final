package com.toshihiro.geometryphotos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import ssru.toshihiro.geometryphoto.R;

/**
 * Created by Admin on 02-Feb-17.
 */
public class MyAdapter extends BaseAdapter {
    Context context;
    String[] strName;
    int[] resId;
    String[] formula;

    public MyAdapter(Context context, int[] resId, String[] strName,String[] formula) {
        this.context = context;
        this.resId = resId;
        this.strName = strName;
        this.formula = formula;
    }
    public int getCount() {
        return strName.length;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //View view1 = inflater.inflate(R.layout.my_listview, parent, false);

        if (view == null) {
            view = inflater.inflate(R.layout.my_listview, parent, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.txtItem);
        textView.setText(strName[position]);

        ImageView imageView = (ImageView) view.findViewById(R.id.imgItem);
        imageView.setBackgroundResource(resId[position]);



        return view;
    }
}
