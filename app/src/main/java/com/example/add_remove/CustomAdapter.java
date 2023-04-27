package com.example.add_remove;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class CustomAdapter extends ArrayAdapter<Contact> {

    ArrayAdapter<Contact> dataset;
    Contact context;



    public CustomAdapter(@NonNull Context context, int resource) {



        super(context, resource);
    }
}
