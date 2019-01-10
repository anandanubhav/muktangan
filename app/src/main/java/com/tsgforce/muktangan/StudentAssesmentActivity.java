package com.tsgforce.muktangan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class StudentAssesmentActivity extends AppCompatActivity {

    private static final String TAG = "StudentAssesmentActivit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentassessment);
        Log.d(TAG, "onCreate: started.");
    }

    public void showSubject(View view) {
        Intent intent = new Intent(StudentAssesmentActivity.this, SubjectActivity.class);
        String subjectName = ((TextView)view).getText().toString();
        intent.putExtra(Constants.KEY_STUDENT, subjectName);
        startActivity(intent);
    }
}