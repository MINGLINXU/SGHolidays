package com.myapplicationdev.android.sgholidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomerAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<PH> PHList;

    public CustomerAdapter(Context context, int resource, ArrayList<PH> objects){
        super(context,resource,objects);

        parent_context = context;
        layout_id = resource;
        PHList = objects;
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent){

        LayoutInflater inflater=(LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvDate = rowView.findViewById(R.id.tvDate);
        ImageView iv = rowView.findViewById(R.id.imageView);

        PH currentItem = PHList.get(position);
        tvTitle.setText(currentItem.getTitle());
        tvDate.setText(currentItem.getDate());
        if(currentItem.getImgName() == "christmas"){
            iv.setImageResource(R.drawable.christmas);
        }
        else if (currentItem.getImgName() == "cny"){
            iv.setImageResource(R.drawable.cny);
        }
        else if (currentItem.getImgName() == "deepavali"){
            iv.setImageResource(R.drawable.deepavali);
        }else if (currentItem.getImgName() == "goodfriday"){
            iv.setImageResource(R.drawable.goodfriday);
        }else if (currentItem.getImgName() == "harirayahaji"){
            iv.setImageResource(R.drawable.harirayahaji);
        }else if (currentItem.getImgName() == "harirayapuasa"){
            iv.setImageResource(R.drawable.harirayapuasa);
        }else if (currentItem.getImgName() == "labourday"){
            iv.setImageResource(R.drawable.labourday);
        }else if (currentItem.getImgName() == "nationalday"){
            iv.setImageResource(R.drawable.nationalday);
        }else if (currentItem.getImgName() == "newyear"){
            iv.setImageResource(R.drawable.newyear);
        }else if (currentItem.getImgName() == "vesakday"){
            iv.setImageResource(R.drawable.vesakday);
        }


        return  rowView;
    }
}
