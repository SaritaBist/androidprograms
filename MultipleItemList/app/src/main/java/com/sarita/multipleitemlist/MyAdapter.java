package com.sarita.multipleitemlist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] fooditem;
    private final String[] burger;
    private final Integer[] imgid;

    public MyAdapter(Activity context, String[] fooditem, String[] burger, Integer[] imgid) {
        super(context, R.layout.my_menu_item_layout, fooditem);
        this.context = context;
        this.fooditem = fooditem;
        this.burger = burger;
        this.imgid = imgid;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = getContext().();
        View rowView = inflater.inflate(R.layout.my_menu_item_layout, null, true);
        TextView titleText = (TextView) rowView.findViewById(R.id.tv1);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageview);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.tv2);
        titleText.setText(fooditem[position]);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(burger[position]);
        return rowView;
    }
}
