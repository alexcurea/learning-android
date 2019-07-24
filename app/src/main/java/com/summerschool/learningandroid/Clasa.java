package com.summerschool.learningandroid;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class Clasa extends RecyclerView.Adapter<> {

    private Event[] eventList;
    public Clasa(Event[] eventList) {
        this.eventList = eventList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View listItem = layoutInflater.inflate(R.layout.layout, viewGroup,false);

        EventsViewHolder eventsViewHolder = new EventsViewHolder(listItem);


        return eventsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.title.setText;

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public static class EventsViewHolder extends RecyclerView.ViewHolder {

        TextView title, type;

        public EventsViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.item_title);
            type = itemView.findViewById(R.id.item_type);
            
            
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(title.getContext(),DetailViewActivity.class);
                    i.putExtra("Title", title.getText().toString());
                    title.getContext().startActivity(i);
                }
            });
        }
    }
}
