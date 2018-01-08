//Authors: Kyle Sutherland, Peter Adamson

public class TestDriverA{

  public static void main(String[] args){

    MyCalendar a = new MyCalendar(2001); //2001 has been tested
    MyCalendar b = new MyCalendar(2004); //2004 has been tested
    MyCalendar c = new MyCalendar(1000); //1000 has been tested
    MyCalendar d = new MyCalendar(2000); //2000 has been tested
    MyCalendar e = new MyCalendar();
    
    if(a.isLeapYear(2001)){
      System.out.printf("%d is a leap year\n", a.getYear());
      }
    else{
      System.out.printf("%d is not a leap year\n", a.getYear());
      }
      
    if(b.isLeapYear(2004)){
      System.out.printf("%d is a leap year\n", b.getYear());
      }
    else{
      System.out.printf("%d is not a leap year\n", b.getYear());
      }
      
    if(c.isLeapYear(1000)){
      System.out.printf("%d is a leap year\n", c.getYear());
      }
    else{
      System.out.printf("%d is not a leap year\n", c.getYear());
      }
      
    if(d.isLeapYear(2000)){
      System.out.printf("%d is a leap year\n", d.getYear());
      }
    else{
      System.out.printf("%d is not a leap year\n", d.getYear());
      }
      
    if(e.isLeapYear()){
      System.out.printf("This year is a leap year\n");
      }
    else{
      System.out.printf("This year is not a leap year\n");
      }
    
  }
}
    
