package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParametrisedTest {
    String email;
    String expectedOutput;

    public ParametrisedTest(String email, String expectedOutput) {
        super();
        this.email = email;
        this.expectedOutput = expectedOutput;
    }
    //Creating static method that generates & returns data
    @ Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com","true"},{"abc-100@yahoo.com","true"},{"abc.100@yahoo.com","true"},
                {"abc111@abc.com","true"},{"abc-100@abc.net","true"},{"abc.100@abc.com.au","true"},{"abc@1.com","true"},
                {"abc@gmail.com","true"},{"abc+100@gmail.com","true"}});
    }

    @Test
    public void givenAllEmail_ShouldReturn_True() {
        UserRegistration userRegistration = new UserRegistration();
        Assert.assertEquals(this.expectedOutput,expectedOutput);
    }
}

