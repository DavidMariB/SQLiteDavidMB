package com.dmb.sqlitedavidmb.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.dmb.sqlitedavidmb.Model.Student;
import com.dmb.sqlitedavidmb.Model.Subject;
import com.dmb.sqlitedavidmb.R;

import java.util.ArrayList;

/**
 * Created by davidmari on 22/1/18.
 */

public class SubjectsAdapter extends BaseAdapter {
    Context context;
    ArrayList<Subject> subjects;

    public SubjectsAdapter(Context context, ArrayList<Subject> subjects) {
        this.context=context;
        this.subjects=subjects;
    }

    @Override
    public int getCount() {
        return subjects.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Subject getItem(int position) {
        return subjects.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.item_subject, null);


        Subject subject = getItem(position);
        ((TextView) view.findViewById(R.id.listSubName)).setText(subject.getNombre());
        ((TextView) view.findViewById(R.id.listSubHours)).setText(subject.getHoras()+"hs");

        return view;
    }
}
