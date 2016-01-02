package com.example.amit.resultchecker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by amit on 27-Dec-15.
 */
public class SelectNoSubjects extends Activity {

    private Button noSubjectsButton;
    private EditText noSubjects;
    private int noOfSubjects;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_no_subject);
        noSubjectsButton = (Button) findViewById(R.id.no_subjects_button);
        noSubjects = (EditText) findViewById(R.id.no_subjects);
        noSubjectsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!(noSubjects.getText().toString()).equals("")) {
                    noOfSubjects = Integer.parseInt(noSubjects.getText().toString());
                    /*String s = String.valueOf(noOfSubjects);
                    Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
                    */
                    Intent i;
                    i = new Intent(SelectNoSubjects.this, Subjects.class);
                    i.putExtra("No of subjects", noOfSubjects);
                    startActivity(i);

                }
                else
                    Toast.makeText(getApplicationContext(), "Empty no. of subjects not allowed", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
