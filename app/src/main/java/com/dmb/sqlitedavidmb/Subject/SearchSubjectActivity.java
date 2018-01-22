package com.dmb.sqlitedavidmb.Subject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.dmb.sqlitedavidmb.Adapter.SubjectsAdapter;
import com.dmb.sqlitedavidmb.MainActivity;
import com.dmb.sqlitedavidmb.Model.Subject;
import com.dmb.sqlitedavidmb.R;

import java.util.ArrayList;

public class SearchSubjectActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_subject);

        this.listView = findViewById(R.id.subjectListView);
    }

    public void searchSubjects(View v){
        String sql="SELECT * FROM asignaturas;";

        ArrayList<Subject> showSubjects = MainActivity.myDBAdapter.searchSubject(sql);
        SubjectsAdapter subjectsAdapter = new SubjectsAdapter(getApplicationContext(),showSubjects);
        listView.setAdapter(subjectsAdapter);
    }
}
