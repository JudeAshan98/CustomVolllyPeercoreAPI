package com.example.customvolllypeercore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<ModelClass> {

    //the hero list that will be displayed
    private List<ModelClass> heroList;

    //the context object
    private Context mCtx;

    //here we are getting the herolist and context
    //so while creating the object of this adapter class we need to give herolist and context
    public ListViewAdapter(List<ModelClass> heroList, Context mCtx) {
        super(mCtx, R.layout.list_items, heroList);
        this.heroList = heroList;
        this.mCtx = mCtx;
    }

    //this method will return the list item
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //getting the layoutinflater
        LayoutInflater inflater = LayoutInflater.from(mCtx);

        //creating a view with our xml layout
        View listViewItem = inflater.inflate(R.layout.list_items, null, true);

        //getting text views
        TextView textViewName = listViewItem.findViewById(R.id.code);
        TextView textViewImageUrl = listViewItem.findViewById(R.id.description);

        //Getting the hero for the specified position
        ModelClass hero = heroList.get(position);

        //setting hero values to textviews
        textViewName.setText(hero.getCode());
        textViewImageUrl.setText(hero.getDescription()
        );

        //returning the listitem
        return listViewItem;
    }
}