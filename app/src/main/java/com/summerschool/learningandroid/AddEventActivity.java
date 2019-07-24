package com.summerschool.learningandroid;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddEventActivity extends AppCompatActivity {

    public Event newEvent= new Event("","","","");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        EditText addTitle = (EditText) findViewById(R.id.addTitle);
        EditText addType = (EditText) findViewById(R.id.addType);
        EditText addDate = (EditText) findViewById(R.id.addDate);
        EditText addPeople = (EditText) findViewById(R.id.addPeople);
        Button submit = (Button) findViewById(R.id.submit);


        final String stringTitle = addTitle.getText().toString();
        final String stringType = addType.getText().toString();
        final String stringDate = addDate.getText().toString();
        final String stringPeople = addPeople.getText().toString();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Event added", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                newEvent  =   new Event(stringTitle,stringType,stringDate,stringPeople);



            }
        });

    }
}
