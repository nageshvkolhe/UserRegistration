package Com.Samples;

import org.junit.Assert;


import org.junit.Test;


public class UserTest {

	    @Test
		public void givenFirstName_WhenProper_ShouldReturnTrue() {
			User validator = new User();
			boolean result = validator.validateFirstName("Nagesh");
			Assert.assertTrue(result);							
		}
	    
	    @Test
		public void givenFirstName_WhenShort_ShouldReturnFalse() {
			User validator = new User();
			boolean result = validator.validateFirstName("Na");
			Assert.assertTrue(result);
		}
	    
	    @Test
		public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() {
			User validator = new User();
			boolean result = validator.validateFirstName("N@gesh");
			Assert.assertFalse(result);
		}
	    
	    @Test
		public void givenLastName_WhenProper_ShouldReturnTrue() {
			User validator = new User();
		  boolean result = validator.validateLastName("Kolhe");
		  Assert.assertTrue(result);
		}

		@Test
		public void givenLastName_WhenProper_ShouldReturnfalse() {
			User validator = new User();
		  boolean result = validator.validateLastName("05Kolhe");
		  Assert.assertFalse(result);
		}

		@Test
		public void givenLastName_WhenProper_ShouldReturnfalse12() {
			User validator = new User();
		  boolean result = validator.validateLastName("Kolhe555");
		  Assert.assertFalse(result);
		}

	    
	    @Test
		public void givenEmail_WhenEmailValid_ShouldReturnTrue() {
			User validator = new User();
			boolean result = validator.validateEmailAddress("abc.xyz@bridgelabz.co.in");
			Assert.assertTrue(result);
		}
	    
	    @Test
		public void givenEmail_WhenProper_ShouldReturnTrue() {
			User validator = new User();
		    boolean result = validator.validateEmailAddress("abc@bridgelabz.co.in");
		    Assert.assertTrue(result);
		}

		@Test
		public void givenEmail_WhenProper_ShouldReturnfalse() {
			User validator = new User();
		    boolean result = validator.validateEmailAddress("abc.xyz@.co.in");
		    Assert.assertFalse(result);
		}

		@Test
		public void givenEmail_WhenProper_ShouldReturnTrue1() {
			User validator = new User();
		    boolean result = validator.validateEmailAddress("abc.12@.com");
		    Assert.assertTrue(result);
		}


		@Test
		public void givenEmail_WhenProper_ShouldReturnfalse12() {
			User validator = new User();
		    boolean result = validator.validateEmailAddress("abc.xyz@.co.net");
		    Assert.assertFalse(result);
		}

		
		@Test
		public void givenMobile_WhenProper_ShouldReturnTrue() {
			User validator = new User();
		    boolean result = validator.validateMobileNumber("8007705205");
		    Assert.assertTrue(result);
		}

		@Test
		public void givenMobile_WhenProper_ShouldReturnTrue12() {
			User validator = new User();
		    boolean result = validator.validateMobileNumber("8089312804");
		    Assert.assertTrue(result);
		}

		@Test
		public void givenMobile_WhenProper_ShouldReturnfalse() {
			User validator = new User();
		    boolean result = validator.validateMobileNumber("45892804");
		    Assert.assertFalse(result);
		}

		@Test
		public void givenMobile_WhenProper_ShouldReturnfalse12() {
			User validator = new User();
		    boolean result = validator.validateMobileNumber("5285054546592404");
		    Assert.assertFalse(result);
		}

		@Test
		public void givenPassword_WhenProper_ShouldReturnTrue() {
			User validator = new User();
		    boolean result = validator.validatePassword("N@gerkol14h");
		    Assert.assertTrue(result);
		}
      
		@Test
		public void givenPassword_WhennotProper_ShouldReturnfalse() {
			User validator = new User();
		    boolean result = validator.validatePassword("nageshkolhe");
		    Assert.assertTrue(result);
		}

		@Test
		public void givenPassword_WhennotProper_ShouldReturnfalse1() {
			User validator = new User();
		    boolean result = validator.validatePassword("Nageshkolhe");
		    Assert.assertTrue(result);
		}
		
		@Test
		public void givenPassword_WhennotProper_ShouldReturnfalse12() {
			User validator = new User();
		    boolean result = validator.validatePassword("nageshkolhe@");
		    Assert.assertTrue(result);
		}


}
