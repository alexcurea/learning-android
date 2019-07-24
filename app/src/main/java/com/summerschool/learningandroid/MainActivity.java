package com.summerschool.learningandroid;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

  Button startDate;
  Button stopDate;
  TextView date;
  TextView date2;
  Button findFriendBtn;

  DatePickerDialog datePickerDialog;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    startDate = (Button)findViewById(R.id.startDate);
    stopDate = (Button)findViewById(R.id.stopDate);
    date = (TextView)findViewById(R.id.date);
    date2 = (TextView)findViewById(R.id.date2);
    findFriendBtn=(Button)findViewById(R.id.find);

    startDate.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        // calender class's instance and get current date , month and year from calender
        final Calendar c = Calendar.getInstance();
        int mYear = c.get(Calendar.YEAR); // current year
        int mMonth = c.get(Calendar.MONTH); // current month
        int mDay = c.get(Calendar.DAY_OF_MONTH); // current day
        // date picker dialog
        datePickerDialog = new DatePickerDialog(MainActivity.this,
                new DatePickerDialog.OnDateSetListener() {

                  @Override
                  public void onDateSet(DatePicker view, int year,
                                        int monthOfYear, int dayOfMonth) {
                    // set day of month , month and year value in the edit text
                    date.setText(dayOfMonth + "/"
                            + (monthOfYear + 1) + "/" + year);

                  }
                }, mYear, mMonth, mDay);

        datePickerDialog.show();
        startDate.setVisibility(View.GONE);
      }
    });


    stopDate.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        // calender class's instance and get current date , month and year from calender
        final Calendar c = Calendar.getInstance();
        int mYear = c.get(Calendar.YEAR); // current year
        int mMonth = c.get(Calendar.MONTH); // current month
        int mDay = c.get(Calendar.DAY_OF_MONTH); // current day
        // date picker dialog
        datePickerDialog = new DatePickerDialog(MainActivity.this,
                new DatePickerDialog.OnDateSetListener() {

                  @Override
                  public void onDateSet(DatePicker view, int year,
                                        int monthOfYear, int dayOfMonth) {
                    // set day of month , month and year value in the edit text
                    date2.setText(dayOfMonth + "/"
                            + (monthOfYear + 1) + "/" + year);

                  }
                }, mYear, mMonth, mDay);
        datePickerDialog.show();
        stopDate.setVisibility(View.GONE);
      }
    });

    findFriendBtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        startActivity(new Intent(MainActivity.this, EventListActivity.class));
      }
    });
  }
}
