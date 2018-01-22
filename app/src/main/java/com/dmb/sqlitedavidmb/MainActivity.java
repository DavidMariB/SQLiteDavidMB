package com.dmb.sqlitedavidmb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dmb.sqlitedavidmb.Adapter.MyDBAdapter;
import com.dmb.sqlitedavidmb.Student.SearchStudentActivity;
import com.dmb.sqlitedavidmb.Student.StudentActivity;
import com.dmb.sqlitedavidmb.Subject.SearchSubjectActivity;
import com.dmb.sqlitedavidmb.Subject.SubjectActivity;
import com.dmb.sqlitedavidmb.Teacher.SearchTeacherActivity;
import com.dmb.sqlitedavidmb.Teacher.TeacherActivity;

public class MainActivity extends AppCompatActivity {


    public static MyDBAdapter myDBAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.myDBAdapter = new MyDBAdapter(getApplicationContext());
    }

    public void estudiantes(View v) {
        Intent i = new Intent(this,StudentActivity.class);
        startActivity(i);
    }

    public void mostrarEstudiantes(View v) {
        Intent i = new Intent(this,SearchStudentActivity.class);
        startActivity(i);
    }

    public void profesores(View v) {
        Intent i = new Intent(this,TeacherActivity.class);
        startActivity(i);
    }

    public void mostrarProfesores(View v) {
        Intent i = new Intent(this,SearchTeacherActivity.class);
        startActivity(i);
    }

    public void subjectsActivity(View v){
        Intent intent = new Intent(this, SubjectActivity.class);
        startActivity(intent);
    }

    public void showSubjectsActivity(View v){
        Intent intent = new Intent(this, SearchSubjectActivity.class);
        startActivity(intent);
    }

    public void eliminarBD(View v) {
        this.myDBAdapter.deleteDB();
    }
}
