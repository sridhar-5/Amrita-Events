package com.craftofcode.amrita_event;

public class Event_Details {

    private String event_name;
    private String event_description;
    private int event_id;
    private String event_date;
    private String event_time;

    public Event_Details(String name, String description, String date, String time, int id){
        event_id = id;
        event_date = date;
        event_description = description;
        event_name = name;
        event_time = time;
    }

    public String getEvent_name(){
        return event_name;
    }

    public  String getEvent_description(){
        return event_description;
    }

    public String getEvent_date(){
        return event_date;
    }

    public String getEvent_time(){
        return event_time;
    }

    public int getEvent_id(){
        return event_id;
    }

}
