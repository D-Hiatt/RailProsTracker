package com.railpros.gwr;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class DynamicList extends ListActivity {
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
/*
	        adapter = new DynamicListAdapter(this);
	        adapter.addRowView("account", "arrowDw");
	        adapter.addRowView("password", "arrowDw");
	        setListAdapter(adapter);
	   }

	...

	   protected void onListItemClick(ListView listView, View view, int position, long id) {
	    switch (position) {
	        case 0: accIsEditable = adapter.setEditable(position); break;
	        case 1: 
	            if(accIsEditable) {
	                                    //TODO do something..
	                break;
	            }
	            pwIsEditable = adapter.setEditable(position);
	            break;
	            
	            
	            public class DynamicListAdapter extends BaseAdapter {
	 public View getView(int position, View convertView, ViewGroup parent) {

		  ViewHolder holder = null;

		    if (rowTitles.get(position).equals("edit")) {
		        if(et == null){
		            et = new EditText(activity);
		            et.setText("Test");
		        }
		        return et;
		    }
		    else {
		        convertView = new TextRow(activity);
		        holder = new ViewHolder(((TextRow) convertView).getTextView(), ((TextRow) convertView).getImageView());
		        convertView.setTag(holder);
		        holder.getTextView().setText(StringManager.getInstance().getText(rowTitles.get(position), activity));
		        holder.getImageView().setImageBitmap(assetController.getBitmap(additiveIcons.get(position) + ".png", null));
		        return convertView;
		    }
		  }
} 


	          ... */
	   } 
} 

	
