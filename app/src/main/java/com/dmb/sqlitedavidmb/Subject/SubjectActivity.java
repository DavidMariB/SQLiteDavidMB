package com.dmb.sqlitedavidmb.Subject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.dmb.sqlitedavidmb.MainActivity;
import com.dmb.sqlitedavidmb.R;

public class SubjectActivity extends AppCompatActivity {

    EditText subName,subHours, subID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        this.subName = findViewById(R.id.subjectName);
        this.subHours = findViewById(R.id.subjectHours);
        this.subID = findViewById(R.id.subID);

    }

    public void clearSubject(View v){
        this.subName.setText("");
        this.subHours.setText("");
    }

    public void insertSubject(View v){
        MainActivity.myDBAdapter.insertSubject(
                this.subName.getText().toString(),
                Integer.parseInt(this.subHours.getText().toString()));
    }

    public void deleteSubject(View v){
        MainActivity.myDBAdapter.deleteSubject(Integer.parseInt(subID.getText().toString()));
    }
}
