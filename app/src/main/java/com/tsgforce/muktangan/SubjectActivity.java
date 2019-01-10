package com.tsgforce.muktangan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SubjectActivity extends AppCompatActivity {

    private static final String TAG = "StudentAssesmentActivit";
    private String studentName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        Bundle extras = getIntent().getExtras();
        studentName = extras.getString(Constants.KEY_STUDENT, "Student 1");

        TextView tv = findViewById(R.id.subjectAssessment);
        tv.setText(studentName+" - Assesment Subjects");
        Log.d(TAG, "onCreate: started.");
    }

    public void evaluateSubject(View view) {
        String subjectName = ((TextView)view).getText().toString();
        Intent intent = new Intent(SubjectActivity.this, SubjectEvaluationActivity.class);
        intent.putExtra(Constants.KEY_STUDENT, studentName);
        intent.putExtra(Constants.KEY_SUBJECT, subjectName);
        startActivity(intent);
    }
}