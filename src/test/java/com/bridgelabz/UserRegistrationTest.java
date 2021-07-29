package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    //Creating Object for UserRegistration class
    UserRegistration userRegistration = new UserRegistration();
    //testCases for validating  firstName
    @Test
    public void givenFirstName_whenValid_thenReturnTrue() {
        //calling validateFirstName method
        boolean result = userRegistration.validateFirstName("Bhavani");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenStartingNotCapital_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("bhavani");
        Assert.assertFalse(result);
    }
    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean result = userRegistration.validateFirstName("Bh");
        Assert.assertFalse(result);
    }
   //testCases for validating  lastName
    @Test
    public void givenLastName_whenValid_thenReturnTrue() {
        //calling validateLastName method
        boolean result = userRegistration.validateLastName("Girineni");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenStartingNotCapital_ShouldReturnFalse() {
        boolean result = userRegistration.validateLastName("girineni");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean result = userRegistration.validateLastName("Gi");
        Assert.assertFalse(result);
    }
    //Creating testcases for emailId
    @Test
    public void  givenEmailId_WhenValid_ShouldReturnTrue() {
        boolean result = userRegistration.validateEmailId("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }
    @Test
    public void givenMail_WithoutName_ShouldReturnFalse() {
        boolean result = userRegistration.validateEmailId("@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMail_WithoutAtTHERate_ShouldReturnFalse() {
        boolean result = userRegistration.validateEmailId("girineni.gmail.com");
        Assert.assertFalse(result);
    }
    //Creating testcases for mobileFormat
    @Test
    public void givenPhoneNumber_WhenValid_ShouldReturnTrue(){
        boolean result = userRegistration.validatePhoneNumber("91 8309483421");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPhoneNumber_WhenNoSpaceAfter1stCode_ShouldReturnFalse() {
        boolean result = userRegistration.validatePhoneNumber("918309483421");
        Assert.assertFalse(result);
    }
    @Test
    public void  givenPhoneNumber_WhenSmall_ShouldReturnFalse() {
        boolean result = userRegistration.validatePhoneNumber("91 830948");
        Assert.assertFalse(result);
    }
    //Creating testcases for Password
    @Test
    public void  givenPassword_WhenMin8Chars_ShouldReturnTrue() {
        boolean result = userRegistration.validatePassword("Bhavani@123");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenNotHavingMin8Chars_ShouldReturnFalse() {
        boolean result = userRegistration.validatePassword("Bhav2@");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenAtleast1UpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.validatePassword("BH@s1231$");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenNotHaving1UpperCase_ShouldReturnFalse() {
        boolean result = userRegistration.validatePassword("bhavani@12");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenAtleast1NumericNumber_ShouldReturnTrue() {
        boolean result = userRegistration.validatePassword("123&Bha1$");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenNot1NumericNumber_ShouldReturnFalse () {
        boolean result = userRegistration.validatePassword("bhavani@");
        Assert.assertFalse(result);
    }
}
