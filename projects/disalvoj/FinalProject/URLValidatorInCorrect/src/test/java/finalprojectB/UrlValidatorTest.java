
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
	   UrlValidator url = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   //valid URLS
	   assertTrue(url.isValid("http://www.google.com"));
	   assertTrue(url.isValid("http://google.com"));
	   //FAILURE:  assertTrue(url.isValid("google.com"));
	   //ERROR:    assertTrue(url.isValid("https://www.google.com/search?q=pie&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiRhp7M1rPbAhWtHjQIHbUfB34Q_AUICigB&biw=1536&bih=700&dpr=1.25#imgrc=Ml01ptT80Q0DCM"));
	   //ERROR:    assertTrue(url.isValid("ftp://www.example.com"));
	   
	   //invalid URLS
	   assertFalse(url.isValid("hslgkjslguiod"));
	   assertFalse(url.isValid("something@this@you"));
	   assertFalse(url.isValid(""));
	   //ERROR:    assertFalse(url.isValid("htp://google.com"));
	   //FAILURE:  assertFalse(url.isValid("http://google..com"));
	   assertFalse(url.isValid("textfile.txt"));
   }
   
   
   public void testYourFirstPartition() //valid scheme
   {
	   UrlValidator url = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   assertTrue(url.isValid("http://www.example.com/Kappa%$)#$%OMEGALUL"));


   }
   
   public void testYourSecondPartition() //no scheme
   {
	   UrlValidator url = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   assertFalse(url.isValid("www.example.com/Kappa%$)#$%OMEGALUL"));

   }
   
   public void testYourThirdPartition() //invalid athority
   {
	   UrlValidator url = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   // FAILURE   assertFalse(url.isValid("http://www.goo gle.com"));

   }
   
   public void testYourForthPartition() //valid athority
   {
	   UrlValidator url = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   assertTrue(url.isValid("http://www.google.com"));

   }
   
   public void testYourFifthPartition() //with query
   {
	   UrlValidator url = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   //FAILURE   assertTrue(url.isValid("http://www.example.com/Kappa/LUL/OMEGALUL?&SeemsGood/KappaPride"));

   }
   
   public void testYourSixthPartition() //no query
   {
	   UrlValidator url = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   assertFalse(url.isValid("http://www.example.com/Kappa/LUL/OMEGALU L?&SeemsGood/KappaPride"));


   }
   
   public void testIsValid()
   {
	   	  String schemes[] = new String[5];
	   	  schemes[0]= "";
	      schemes[1]= "http://";
	      schemes[2]= "http:";
	      schemes[3]= "ftp://";
	      schemes[4]= "fdslgn";


	       String authority[] = new String[5];
	       authority[0]= "";
	       authority[1]= "www.google.com";
	       authority[2]= "twitch.tv";
	       authority[3]= "fdslgiog";
	       authority[4]= "12ab.3c";

	       String port[] = new String[4];
	       port[0]= "";
	       port[1]= ":0";
	       port[2]= ":ljiowrg";
	       port[3]= ":-1";

	       String path[] = new String[4];
	       path[0]= "/";
	       path[1]= "/abc123";
	       path[2]= "stuff";
	       path[3]= "gsdjkgoi";

	       String query[] = new String[3];
	       query[0]= "";
	       path[1]= "@#garbage";
	       path[2]= "!@#dsbgsr";
	       
	       UrlValidator url = new UrlValidator(schemes, null, UrlValidator.ALLOW_ALL_SCHEMES);
	       
	       String testUrl;
	       boolean result;
	       int counter = 0;
	       
	       for(int i = 0; i < 5; i++ ) {
	    	   for(int j = 0; j < 5; j++) {
	    		   for(int k = 0; k < 4; k++) {
	    			   for(int l = 0; l < 4; l++) {
	    				   for(int m = 0; m < 3; m++) {
	    					   counter++;
	    					   
	    					   testUrl = schemes[i] + authority[j] + port[k] + path[l] + query[m];
	    					   
	    					   if(i < 5 && j < 5 && k < 4 && l < 4 && m < 3) {
	    						  // result = url.isValid(testUrl);
	    						   System.out.print(testUrl);
	    						   System.out.print("\t\t\t");
	    						 //  System.out.print(result);
	    						   System.out.print("\n");
	    					   }
	    					   System.out.print(counter);
	    				   }
	    			   }
	    		   }
	    	   }
	       }


   }
   


}
