//Authors: Kyle Sutherland, Peter Adamson

import java.util.Calendar;

public class MyCalendar{

  private int year;

  public MyCalendar(int y){
    year = y;
  }
  
  public MyCalendar(){
  
  }
  
  public static boolean isLeapYear(int year){
  
   boolean leapYear = false;
    if(year %4==0){
      leapYear = true;
      if(year %100 == 0){
	      leapYear = false;
	      if(year %400 ==0){
	        leapYear = true;
	      }
      }
    }
  return leapYear;
  }
  
  public static boolean isLeapYear(){
  
  Calendar now = Calendar.getInstance();
  int currentYear = now.get(Calendar.YEAR);
  
   boolean leapYear = false;
    if(currentYear %4==0){
      leapYear = true;
      if(currentYear %100 == 0){
	      leapYear = false;
	      if(currentYear %400 ==0){
	        leapYear = true;
	      }
      }
    }
    return leapYear;
  }
  
  
  public int getYear(){
    return year;
  }




}
