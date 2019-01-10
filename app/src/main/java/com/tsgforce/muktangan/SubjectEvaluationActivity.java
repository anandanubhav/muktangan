package com.tsgforce.muktangan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SubjectEvaluationActivity extends AppCompatActivity {

    private static final String TAG = "StudentAssesmentActivit";
    private String studentName;
    private String subjectName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjectevaluation);
        Log.d(TAG, "onCreate: started.");

        Bundle extras = getIntent().getExtras();

        studentName = extras.getString(Constants.KEY_STUDENT, "Student 1");
        subjectName = extras.getString(Constants.KEY_SUBJECT, "Subject 1");

        TextView tv = findViewById(R.id.subjectEvaluation);
        tv.setText(studentName + " - " + subjectName);

        TextView tv1 = findViewById(R.id.subParam1);
        tv1.setText(subjectName+" Evaluation Parameter 1");

        TextView tv2 = findViewById(R.id.subParam2);
        tv2.setText(subjectName+" Evaluation Parameter 2");
    }

    public void saveSubjectEvaluation(View view) {
        Toast.makeText(this, "Saved Evaluation for: "+studentName + "\nfor subject: "+subjectName, Toast.LENGTH_SHORT).show();
    }
}