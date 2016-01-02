package com.example.amit.resultchecker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

public class MainActivity extends Activity {
    /*private EditText noSubjects;
    private Button noSubjectsButton;
    private int noOfSubjects;*/
    private Spinner selectSem, selectBranch;
    private String s;
    private List<String> sems;
    private List<String> branches;
    private ArrayAdapter<String> dataAdapterSem;
    private ArrayAdapter<String> dataAdapterBranch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectSem = (Spinner) findViewById(R.id.select_sem_spin);
        selectBranch = (Spinner) findViewById(R.id.select_branch_spin);
        sems = new ArrayList<String>();
        sems.add("Select Semester: ");
        sems.add("5");
        sems.add("3");
        sems.add("1");
        sems.add("Not in the list?click here");
        branches = new ArrayList<String>();
        branches.add("Select Branch: ");
        branches.add("C.E");
        branches.add("I.T");
        branches.add("Mech");
        branches.add("Civil");
        branches.add("I.C");
        branches.add("Chemical");
        branches.add("E.C");
        branches.add("Electrical");
        branches.add("Not in the list?click here");
        dataAdapterSem = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sems);
        dataAdapterSem.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       // noSubjects = (EditText) findViewById(R.id.no_subjects);
       // noSubjectsButton = (Button) findViewById(R.id.no_subjects_button);
        dataAdapterBranch = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, branches);
        dataAdapterBranch.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selectSem.setAdapter(dataAdapterSem);
        selectBranch.setAdapter(dataAdapterBranch);
        selectBranch.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                final Intent intent;
                switch (position){
                    case 9:
                        intent = new Intent(MainActivity.this, SelectNoSubjects.class);
                        selectBranch.setSelection(0);
                        startActivity(intent);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        selectSem.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                final Intent intent;
                switch (position) {
                    case 0:
                        break;
                    case 1: //sem 5
                        if(selectBranch.getSelectedItemId()==1) { //ce

                            intent = new Intent(MainActivity.this, Ce5.class);
                            selectSem.setSelection(0);
                            startActivity(intent);


                        }
                        else if(selectBranch.getSelectedItemId()==2){ //it

                            intent = new Intent(MainActivity.this, It5.class);
                            selectSem.setSelection(0);
                            startActivity(intent);

                        }
                        else if(selectBranch.getSelectedItemId()==3){ //me

                            intent = new Intent(MainActivity.this, Me5.class);
                            selectSem.setSelection(0);
                            startActivity(intent);

                        }
                        else if(selectBranch.getSelectedItemId()==4){ //civil

                            intent = new Intent(MainActivity.this, Civil5.class);
                            selectSem.setSelection(0);
                            startActivity(intent);


                        }
                        else if(selectBranch.getSelectedItemId()==5){ //ic

                            intent = new Intent(MainActivity.this, Ic5.class);
                            selectSem.setSelection(0);
                            startActivity(intent);


                        }
                        else if(selectBranch.getSelectedItemId()==6){ //chem

                            intent = new Intent(MainActivity.this, Chemical5.class);
                            selectSem.setSelection(0);
                            startActivity(intent);


                        }
                        else if(selectBranch.getSelectedItemId()==7){ //ec

                            intent = new Intent(MainActivity.this, Ec5.class);
                            selectSem.setSelection(0);
                            startActivity(intent);


                        }
                        else if(selectBranch.getSelectedItemId()==8){ //elec

                            intent = new Intent(MainActivity.this, Electrical5.class);
                            selectSem.setSelection(0);
                            startActivity(intent);


                        }
                        else if(selectBranch.getSelectedItemId()==9){ //not in

                            intent = new Intent(MainActivity.this, SelectNoSubjects.class);
                                selectSem.setSelection(0);
                                 startActivity(intent);
                        }
                        else{}
                        break;

                    case 2: //sem3
                        if(selectBranch.getSelectedItemId()==1) { //ce

                            intent = new Intent(MainActivity.this, Ce3.class);
                            selectSem.setSelection(0);
                            startActivity(intent);


                        }
                        else if(selectBranch.getSelectedItemId()==2){ //it

                            intent = new Intent(MainActivity.this, It3.class);
                            selectSem.setSelection(0);
                            startActivity(intent);

                        }
                        else if(selectBranch.getSelectedItemId()==3){ //me

                            intent = new Intent(MainActivity.this, Me3.class);
                            selectSem.setSelection(0);
                            startActivity(intent);

                        }
                        else if(selectBranch.getSelectedItemId()==4){ //civil

                            intent = new Intent(MainActivity.this, Civil3.class);
                            selectSem.setSelection(0);
                            startActivity(intent);


                        }
                        else if(selectBranch.getSelectedItemId()==5){ //ic

                            intent = new Intent(MainActivity.this, Ic3.class);
                            selectSem.setSelection(0);
                            startActivity(intent);


                        }
                        else if(selectBranch.getSelectedItemId()==6){ //chem

                            intent = new Intent(MainActivity.this, Chemical3.class);
                            selectSem.setSelection(0);
                            startActivity(intent);


                        }
                        else if(selectBranch.getSelectedItemId()==7){ //ec

                            intent = new Intent(MainActivity.this, Ec3.class);
                            selectSem.setSelection(0);
                            startActivity(intent);


                        }
                        else if(selectBranch.getSelectedItemId()==8){ //elec

                            intent = new Intent(MainActivity.this, Electrical3.class);
                            selectSem.setSelection(0);
                            startActivity(intent);


                        }
                        else if(selectBranch.getSelectedItemId()==9){ //not in

                            intent = new Intent(MainActivity.this, SelectNoSubjects.class);
                            selectSem.setSelection(0);
                            startActivity(intent);
                        }
                        else{}
                        break;

                    case 3: //sem1

                        if(selectBranch.getSelectedItemId()==1) { //ce

                            intent = new Intent(MainActivity.this, Ce1.class);
                            selectSem.setSelection(0);
                            startActivity(intent);


                        }
                        else if(selectBranch.getSelectedItemId()==2){ //it

                            intent = new Intent(MainActivity.this, It1.class);
                            selectSem.setSelection(0);
                            startActivity(intent);

                        }
                        else if(selectBranch.getSelectedItemId()==3){ //me

                            intent = new Intent(MainActivity.this, Me1.class);
                            selectSem.setSelection(0);
                            startActivity(intent);

                        }
                        else if(selectBranch.getSelectedItemId()==4){ //civil

                            intent = new Intent(MainActivity.this, Civil1.class);
                            selectSem.setSelection(0);
                            startActivity(intent);


                        }
                        else if(selectBranch.getSelectedItemId()==5){ //ic

                            intent = new Intent(MainActivity.this, Ic1.class);
                            selectSem.setSelection(0);
                            startActivity(intent);


                        }
                        else if(selectBranch.getSelectedItemId()==6){ //chem

                            intent = new Intent(MainActivity.this, Chemical1.class);
                            selectSem.setSelection(0);
                            startActivity(intent);


                        }
                        else if(selectBranch.getSelectedItemId()==7){ //ec

                            intent = new Intent(MainActivity.this, Ec1.class);
                            selectSem.setSelection(0);
                            startActivity(intent);


                        }
                        else if(selectBranch.getSelectedItemId()==8){ //elec

                            intent = new Intent(MainActivity.this, Electrical1.class);
                            selectSem.setSelection(0);
                            startActivity(intent);


                        }
                        else if(selectBranch.getSelectedItemId()==9){ //not in

                            intent = new Intent(MainActivity.this, SelectNoSubjects.class);
                            selectSem.setSelection(0);
                            startActivity(intent);
                        }
                        else{}
                        break;

                    case 4: //not in the list
                           intent = new Intent(MainActivity.this, SelectNoSubjects.class);
                            selectSem.setSelection(0);
                           startActivity(intent);
                        break;
                    default:
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        /*noSubjectsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(noSubjects.getText().toString()).equals("")) {
                    noOfSubjects = Integer.parseInt(noSubjects.getText().toString());
                *//*s = String.valueOf(noOfSubjects);
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();*//*
                    Intent i;
                  *//*  i = new Intent(MainActivity.this, Subjects.class);
                    i.putExtra("No of subjects", noOfSubjects);
                    startActivity(i);
*//*
                }
                else
                    Toast.makeText(getApplicationContext(), "Dude!!! Write something (Atleast here)", Toast.LENGTH_SHORT).show();
            }
        });
*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()){
            case R.id.action_settings:
                finish();
        }


        return super.onOptionsItemSelected(item);
    }
}
