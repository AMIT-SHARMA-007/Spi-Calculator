package com.example.amit.resultchecker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amit on 26-Dec-15.
 */
public class Me5 extends Activity {
    private Spinner subjects[];
    private List<String> grades;
    private ArrayAdapter<String> dataAdapterGrades;
    private Button resultButton;
    private int credits[], totCredits=0;
    private float result=10.0f;
    private float temp1=0.0f, temp2=0.0f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.me5);
        subjects = new Spinner[8];
        subjects[0] = (Spinner)findViewById(R.id.select_grade_1);
        subjects[1] = (Spinner)findViewById(R.id.select_grade_2);
        subjects[2] = (Spinner)findViewById(R.id.select_grade_3);
        subjects[3] = (Spinner)findViewById(R.id.select_grade_4);
        subjects[4] = (Spinner)findViewById(R.id.select_grade_5);
        subjects[5] = (Spinner)findViewById(R.id.select_grade_6);
        subjects[6] = (Spinner)findViewById(R.id.select_grade_7);
        subjects[7] = (Spinner)findViewById(R.id.select_grade_8);

        credits = new int[]{4,4,4,4,3,1,3,2};

        resultButton = (Button) findViewById(R.id.result_button);
        grades = new ArrayList<String>();
        grades.add("A+");
        grades.add("A");
        grades.add("B+");
        grades.add("B");
        grades.add("C+");
        grades.add("C");
        grades.add("IF");
        dataAdapterGrades = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,grades);
        dataAdapterGrades.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        subjects[0].setAdapter(dataAdapterGrades);
        subjects[1].setAdapter(dataAdapterGrades);
        subjects[2].setAdapter(dataAdapterGrades);
        subjects[3].setAdapter(dataAdapterGrades);
        subjects[4].setAdapter(dataAdapterGrades);
        subjects[5].setAdapter(dataAdapterGrades);
        subjects[6].setAdapter(dataAdapterGrades);
        subjects[7].setAdapter(dataAdapterGrades);
        for(int i=0; i<credits.length; i++){
            totCredits = totCredits + credits[i];
        }


        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1 = 0.0f;
                temp2 = 0.0f;
                result = 0.0f;
                for(int i=0; i<credits.length; i++){
                    if(subjects[i].getSelectedItemId() == 0)
                        temp2 = (float)(10*credits[i]);
                    else if(subjects[i].getSelectedItemId() == 1)
                        temp2 = (float)(9*credits[i]);
                    else if(subjects[i].getSelectedItemId() == 2)
                        temp2 = (float)(8*credits[i]);
                    else if(subjects[i].getSelectedItemId() == 3)
                        temp2 = (float)(7*credits[i]);
                    else if(subjects[i].getSelectedItemId() == 4)
                        temp2 = (float)(6*credits[i]);
                    else if(subjects[i].getSelectedItemId() == 5)
                        temp2 = (float)(5*credits[i]);
                    else if(subjects[i].getSelectedItemId() == 6)
                        temp2 = (float)(0*credits[i]);
                    else
                        temp2 = 0.0f;

                    temp1 = temp1 + temp2;
                }

                result = temp1/totCredits;

                Toast.makeText(getApplicationContext(), "Your spi: " + String.valueOf(result), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
