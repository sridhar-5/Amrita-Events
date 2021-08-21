package com.craftofcode.amrita_event;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.Viewholder> {

    private Context context;
    private ArrayList<Event_Details> eventDetailsArrayList;


    public EventsAdapter(Context context, ArrayList<Event_Details> eventDetailsArrayList) {
        this.context = context;
        this.eventDetailsArrayList = eventDetailsArrayList;
    }

    @NonNull
    @Override
    public EventsAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_list, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventsAdapter.Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        Event_Details event = eventDetailsArrayList.get(position);
        holder.eventName.setText(event.getEvent_name());
        holder.eventClub.setText(event.getEvent_club());
        holder.eventDate.setText(event.getEvent_date());
        holder.eventTime.setText(event.getEvent_time());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return eventDetailsArrayList.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private TextView eventName, eventClub, eventDate, eventTime;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            eventName = itemView.findViewById(R.id.card_title);
            eventClub = itemView.findViewById(R.id.card_club);
            eventDate = itemView.findViewById(R.id.card_date);
            eventTime = itemView.findViewById(R.id.card_time);
        }
    }
}