package calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import org.junit.Test;



import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class DataHandlerRandomTest {

	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"setTitle","setRecurrence"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
	/**
	 * Return a randomly selected appointments to recur Weekly,Monthly, or Yearly !.
	 */
    public static int RandomSelectRecur(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_BY_WEEKLY,Appt.RECUR_BY_MONTHLY,Appt.RECUR_BY_YEARLY};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return the value of the  appointments to recur 
        }	
	/**
	 * Return a randomly selected appointments to recur forever or Never recur  !.
	 */
    public static int RandomSelectRecurForEverNever(Random random){
        int[] RecurArray = new int[] {Appt.RECUR_NUMBER_FOREVER,Appt.RECUR_NUMBER_NEVER};// The list of the of setting appointments to recur RECUR_NUMBER_FOREVER, or RECUR_NUMBER_NEVER

    	int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
        return RecurArray[n] ; // return appointments to recur forever or Never recur 
        }	
   /**
     * Generate Random Tests that tests Appt Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				 int startHour=ValuesGenerator.getRandomIntBetween(random, -30, 30);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, -70, 70);
				 int startDay=ValuesGenerator.getRandomIntBetween(random, -40, 40);
				 int startDay2=ValuesGenerator.getRandomIntBetween(random, -41, 41);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, -20, 20);
				 int startYear=ValuesGenerator.getRandomIntBetween(random, -10000, 10000);
				 int day2=ValuesGenerator.getRandomIntBetween(random, -40, 40);
				 int[] recurDay=ValuesGenerator.generateRandomArray(random, 100);
				 int recurBy=ValuesGenerator.getRandomIntBetween(random, -10000, 10000);
				 int recurInc=ValuesGenerator.getRandomIntBetween(random, -10000, 10000);
				 int recurNum=ValuesGenerator.getRandomIntBetween(random, -10000, 10000);
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 String emailAddress="xyz@gmail.com";
				 
				 //Construct a new Appointment object with the initial data	 
				 //Construct a new Appointment object with the initial data	 
		         Appt appt = new Appt(startHour,
		                  startMinute ,
		                  startDay ,
		                  startMonth ,
		                  startYear ,
		                  title,
		                 description,
		                 emailAddress);	 
		         
		         startHour=ValuesGenerator.getRandomIntBetween(random, -30, 30);
				 startMinute=ValuesGenerator.getRandomIntBetween(random, -70, 70);
				 startDay=ValuesGenerator.getRandomIntBetween(random, -40, 40);
				 startDay2=ValuesGenerator.getRandomIntBetween(random, -41, 41);
				 startMonth=ValuesGenerator.getRandomIntBetween(random, -20, 20);
				 startYear=ValuesGenerator.getRandomIntBetween(random, -10000, 10000);
				 day2=ValuesGenerator.getRandomIntBetween(random, -40, 40);
				 recurDay=ValuesGenerator.generateRandomArray(random, 100);
				 recurBy=ValuesGenerator.getRandomIntBetween(random, -10000, 10000);
				 recurInc=ValuesGenerator.getRandomIntBetween(random, -10000, 10000);
				 recurNum=ValuesGenerator.getRandomIntBetween(random, -10000, 10000);
				 title="Birthday Party";
				 description="This is my birthday party.";
				 emailAddress="xyz@gmail.com";
				 
				 //Construct a new Appointment object with the initial data	 
				 //Construct a new Appointment object with the initial data	 
		         Appt appt2 = new Appt(startHour,
		                  startMinute ,
		                  startDay ,
		                  startMonth ,
		                  startYear ,
		                  title,
		                 description,
		                 emailAddress);	 
		         
		         GregorianCalendar day10 = new GregorianCalendar(2018, 10, 5);
		         GregorianCalendar day11 = new GregorianCalendar(2018, 11, 6);
		         GregorianCalendar day12 = new GregorianCalendar(-2018, -11, -6);
		         CalDay cal = new CalDay(day10);
		         CalDay cal2 = new CalDay(day11);
		         CalDay cal3 = new CalDay(day12);

		         cal.addAppt(appt);
		         cal.addAppt(appt2);
		         cal2.addAppt(appt);
		         cal2.addAppt(appt2);
		         cal3.addAppt(appt);
		         cal3.addAppt(appt2);
		         
		         DataHandler data = new DataHandler();
		         DataHandler data2 = new DataHandler("file_name");
		         DataHandler data3 = new DataHandler("file_name", false);
		  
		         
		         data.deleteAppt(appt);
		         data.deleteAppt(appt2);
		
		         data.getApptRange(day10, day11);
		         data.getApptRange(day11, day10);
		         data.getApptRange(day11, day11);
		         
		         data2.deleteAppt(appt);
		         data2.deleteAppt(appt2);
		
		         data2.getApptRange(day10, day11);
		         data2.getApptRange(day11, day10);
		         data2.getApptRange(day11, day11);
		         
		         data3.deleteAppt(appt);
		         data3.deleteAppt(appt2);
		
		         data3.getApptRange(day10, day11);
		         data3.getApptRange(day11, day10);
		         data3.getApptRange(day11, day11);
		         
		         
			 if(!appt.getValid())continue;
			for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = DataHandlerRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setTitle")){
						   String newTitle=(String) ValuesGenerator.getString(random);
						   appt.setTitle(newTitle);						   
						}
					   else if (methodName.equals("setRecurrence")){
						   int sizeArray=ValuesGenerator.getRandomIntBetween(random, 0, 8);
						   int[] recurDays=ValuesGenerator.generateRandomArray(random, sizeArray);
						   int recur=DataHandlerRandomTest.RandomSelectRecur(random);
						   int recurIncrement = ValuesGenerator.RandInt(random);
						   int recurNumber=DataHandlerRandomTest.RandomSelectRecurForEverNever(random);
						   appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);
						}				
				}
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
			}
		}catch(NullPointerException e){
			
		}
	 
		 System.out.println("Done testing...");
	 }


	


	
}
