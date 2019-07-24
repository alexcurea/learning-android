package com.summerschool.learningandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class activity_to extends AppCompatActivity {

    RecyclerView eventList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to);

        addEventBtn =

        String s=getIntent().getStringExtra("ActivityType");
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();

        ArrayList<Event> events = new ArrayList<Event>() {
                events.add(new Event("title 1", "bicicleta",2));
                events.add(new Event("title 2", "bicicleta",2));
            events.add(new Event("title 3", "bicicleta",2));
            events.add(new Event("title 4", "bicicleta",2));
            events.add(new Event("title 5", "bicicleta",2));
            events.add(new Event("title 6", "bicicleta",2));
            events.add(new Event("title 7", "bicicleta",2));

        };

        String newEventTitle = getIntent().getStringExtra("title_key");
        String newEventType = getIntent().getStringExtra("type_key");
        int newEventNumber = getIntent().getIntExtra("number_key", 0);

        if(newEventTitle!= null && newEventType!= null) {
            Event newEvent = new Event(newEventTitle, newEventType, newEventNumber);

            events(events.length)
        }

        eventList = findViewById(R.id.event_list);

        eventList.setLayoutManager(new LinearLayoutManager(this));
        eventList.setHasFixedSize(true);
        eventList.setAdapter(new Event());
    }
}
