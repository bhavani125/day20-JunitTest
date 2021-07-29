package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    String namePattern = "^[A-Z][a-z]{3,}$";

    //Creating validateFirstName Method
    public boolean validateFirstName(String name) {
        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher = pattern.matcher(name);
        return matcher.find();
    }
    //Creating validateLastName method
    public boolean validateLastName(String name) {
        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher = pattern.matcher(name);
        return matcher.find();

    }
     //Creating validateEmailId method
    public boolean validateEmailId(String email) {
        String emailPattern ="^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();

    }
    //Creating validatePhoneNumber Method
    public boolean validatePhoneNumber(String number) {
        String phonePattern = "^[0-9]{2}[ ][0-9]{10}";
        Pattern pattern = Pattern.compile(phonePattern);
        Matcher matcher = pattern.matcher(number);
        return matcher.find();
    }
    //Creating validatePassword Method
    public boolean validatePassword(String password) {
      String passwordPattern="(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[^A-Za-z0-9])(?=.{8,})";
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}
