package com.summerschool.learningandroid;

public class Event {
  public Event(String title, String type, String date, String countPeople) {
    this.title = title;
    this.type = type;
    this.countPeople = countPeople;
    this.date = date;
  }

  public Event(){

  }
  String title;
  String type;
  String countPeople;
  String date;



  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }



  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getCountPeople() {
    return countPeople;
  }

  public void setCountPeople(String countPeople) {
    this.countPeople = countPeople;
  }




}
