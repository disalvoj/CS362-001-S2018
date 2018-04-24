package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01() throws Throwable{
		 
		 int startHour=8;
		 int startMinute=15;
		 int startDay=25;
		 int startMonth=7;
		 int startYear=2018;
		 String title="Graduation";
		 String description="This is my graduation date.. yay :D";
		 String emailAddress="lastfirst@gmail.com";
		 
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description, emailAddress);
		 appt.toString();

	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(8, appt.getStartHour());
		 assertEquals(15, appt.getStartMinute());
		 assertEquals(25, appt.getStartDay());
		 assertEquals(7, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Graduation", appt.getTitle());
		 assertEquals("This is my graduation date.. yay :D", appt.getDescription());
		 assertEquals("lastfirst@gmail.com", appt.getEmailAddress());
	 }

	 @Test
	  public void test02()  throws Throwable  {
		 int startHour = 24;
		 int startMinute=50;
		 int startDay=2;
		 int startMonth=7;
		 int startYear=2018;
		 String title = "something";
		 String description = "something else";
		 String emailAddress = "email@email.email";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description, emailAddress);
		 // assertions
		 assertTrue(appt.getValid());
		 assertEquals(24, appt.getStartHour());
		 assertEquals(50, appt.getStartMinute());
		 assertEquals(2, appt.getStartDay());
		 assertEquals(7, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("something", appt.getTitle());
		 assertEquals("something else", appt.getDescription());
		 assertEquals("email@email.email", appt.getEmailAddress());
	 }
//add more unit tests as you needed
	 @Test
	 public void test03()  throws Throwable  {
		int startHour=12;
		int startMinute=60;
		int startDay=1;
		int startMonth=12;
		int startYear=2018;
		String title="title";
		String description="description";
		String emailAddress="";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description, emailAddress);
	
		// assertions
		assertTrue(appt.getValid());
			 assertEquals(12, appt.getStartHour());
			 assertEquals(60, appt.getStartMinute());
			 assertEquals(1, appt.getStartDay());
			 assertEquals(12, appt.getStartMonth());
			 assertEquals(2018, appt.getStartYear());
			 assertEquals("title", appt.getTitle());
			 assertEquals("description", appt.getDescription());
			 assertEquals("", appt.getEmailAddress());

	 }
	 
	@Test
	public void test04()  throws Throwable {
		int startHour = -10;
		int startMinute = 6;
		int startDay = 21;
		int startMonth = 11;
		int startYear = 2018;
		String title = "title";
		String description = "";
		String emailAddress="email";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description, emailAddress);

		// assertions
		assertTrue(appt.getValid());
		assertEquals(-10, appt.getStartHour());
		assertEquals(6, appt.getStartMinute());
		assertEquals(21, appt.getStartDay());
		assertEquals(11, appt.getStartMonth());
		assertEquals(2018, appt.getStartYear());
		assertEquals("title", appt.getTitle());
		assertEquals("", appt.getDescription());
		assertEquals("email", appt.getEmailAddress());


	}
	@Test
	public void test05()  throws Throwable  {
		int startHour=15;
		int startMinute=30;
		int startDay=35;
		int startMonth=02;
		int startYear=2018;
		String title="Birthday Party";
		String description="This is my birthday party.";
		String emailAddress = "email.com";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description, emailAddress);
		// assertions
		
		assertTrue(appt.getValid());
		assertEquals(15, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(35, appt.getStartDay());
		assertEquals(02, appt.getStartMonth());
		assertEquals(2018, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
		assertEquals("email.com", appt.getEmailAddress());
	}


	@Test
	public void test06()  throws Throwable  {
		int startHour = 12;
		int startMinute=15;
		int startDay=12;
		int startMonth=00;
		int startYear=2018;
		String title = "month";
		String description = "blaah";
		String emailAddress = "blah";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description, emailAddress);
		// assertions
		assertTrue(appt.getValid());
		assertEquals(12, appt.getStartHour());
		assertEquals(15, appt.getStartMinute());
		assertEquals(12, appt.getStartDay());
		assertEquals(00, appt.getStartMonth());
		assertEquals(2018, appt.getStartYear());
		assertEquals("month", appt.getTitle());
		assertEquals("blaah", appt.getDescription());
		assertEquals("blah", appt.getEmailAddress());
	}


@Test
public void test07()  throws Throwable  {
	int startHour = 22;
	int startMinute=65;
	int startDay=22;
	int startMonth=8;
	int startYear=2018;
	String title = null;
	String description = null;
	String emailAddress = null;
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description, emailAddress);
	// assertions
	appt.toString();

	assertTrue(appt.getValid());
	assertEquals(22, appt.getStartHour());
	assertEquals(65, appt.getStartMinute());
	assertEquals(22, appt.getStartDay());
	assertEquals(8, appt.getStartMonth());
	assertEquals(2018, appt.getStartYear());
	//assertEquals("", appt.getTitle());
	//assertEquals("", appt.getDescription());
	//assertEquals("", appt.getEmailAddress());

}
	@Test
	public void test08()  throws Throwable  {
		int startHour = 21;
		int startMinute=50;
		int startDay=15;
		int startMonth=01;
		int startYear=2018;
		String title="Birthday Party";
		String description="This is my birthday party.";
		String emailAddress = "";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description, emailAddress);
		startHour = 11;
		startMinute=40;
		startDay=25;
		startMonth=11;
		startYear=2019;

		appt.setStartHour(startHour);
		appt.setStartMinute(startMinute);
		appt.setStartDay(startDay);
		appt.setStartMonth(startMonth);
		appt.setStartYear(startYear);

		// assertions
		assertTrue(appt.getValid());
		//assertEquals(11, appt.getStartHour());
		//assertEquals(40, appt.getStartMinute());
		//assertEquals(25, appt.getStartDay());
		//assertEquals(11, appt.getStartMonth());
		//assertEquals(2019, appt.getStartYear());
		//assertEquals("Birthday Party", appt.getTitle());
		//assertEquals("This is my birthday party.", appt.getDescription());
	}
}
