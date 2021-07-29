package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    //Creating Object for UserRegistration class
    UserRegistration userRegistration = new UserRegistration();
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
}
