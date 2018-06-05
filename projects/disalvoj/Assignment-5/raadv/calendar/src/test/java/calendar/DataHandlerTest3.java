
// A JUnit test class to test the class DataHandler.


package calendar;

import org.junit.Test;
import static org.junit.Assert.*;
import calendar.Appt;
import calendar.CalDay;
import calendar.DataHandler;

import java.util.GregorianCalendar;
import java.util.LinkedList;


public class DataHandlerTest3{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
	  String fileName = "hello";
	  boolean autoSave = true;
	  boolean autoSave2 = false;
	  GregorianCalendar firstDay = new GregorianCalendar(2018, 10, 20);
	  GregorianCalendar lastDay = new GregorianCalendar(2018, 10, 21);
	  int startHour = 0;
	  int startMinute=50;
	  int startDay=15;
	  int startMonth=01;
	  int startYear=2018;
	  String title="Birthday Party";
	  String description="This is my birthday party.";
	  String emailAddress = "party";
	  boolean diagnose = true;
	  
	  DataHandler handler = new DataHandler(fileName, autoSave);
	  DataHandler handler2 = new DataHandler();
	  DataHandler handler3 = new DataHandler(fileName);
	  
	  
	  
	  Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description,
				emailAddress);
	
	  handler.getApptRange(firstDay, lastDay);
	  appt.setRecurrence(null, 1, 1, 1);
	  handler.getApptRange(firstDay, lastDay);
	  handler.saveAppt(appt);
	  handler.deleteAppt(appt);
	  
	  
	  
	  
  }
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {

  }

}
