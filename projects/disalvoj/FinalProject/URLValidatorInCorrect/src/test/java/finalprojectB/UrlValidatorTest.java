
package finalprojectB;

import junit.framework.TestCase;

//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase {


   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
	   // scheme, Authority, port, path, query
	   String validURL1 = "http://www.google.com";
	   String validURL2 = "www.google.com";
	   String validURL3 = "google.com";
	   String validURL4 = "https://www.google.com/search?q=pie&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiRhp7M1rPbAhWtHjQIHbUfB34Q_AUICigB&biw=1536&bih=700&dpr=1.25#imgrc=Ml01ptT80Q0DCM:"; // picture of a pie from google images
	   
	   String invalidURL1 = "chicken@nuggets";
	   String invalidURL2 = null;
	   String invalidURL3 = "htp://google.com";
	   String invalidURL4 = "http://google..com";
	   String invalidURL5 = "dkfjslhfiotngsdl";
	   
	   String[] theUrl = {"http://", "google", ".com" };
	   
	   UrlValidator url = new UrlValidator(theUrl);
	   
	   url.isValid(validURL1);
	   url.isValid(validURL2);
	   url.isValid(validURL3);
	   url.isValid(validURL4);
	   url.isValid(invalidURL1);
	   url.isValid(invalidURL2);
	   url.isValid(invalidURL3);
	   url.isValid(invalidURL4);
	   url.isValid(invalidURL5);
   }
   
   
   public void testYourFirstPartition()
   {
	 //You can use this function to implement your First Partition testing	   
	   

   }
   
   public void testYourSecondPartition(){
		 //You can use this function to implement your Second Partition testing	 
	   

   }
   //You need to create more test cases for your Partitions if you need to 
   
   public void testIsValid()
   {
	   //You can use this function for programming based testing
	   

   }
   


}
