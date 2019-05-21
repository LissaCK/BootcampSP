package com.ridezum.helper;

public class UserDriver {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String zipcode;
    private String referralCode;

    public UserDriver(){
        firstName = "lisa";
        lastName = "Ko";
        email = "ls@80";
        phone = "11111111111";
        zipcode = "1111111";
        referralCode = "1111";
    }


    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String  getEmail(){
        return email;
    }
     public String getPhone(){
        return phone;
     }

     public String getZipcode(){
        return zipcode;
     }

     public String getReferralCode(){
        return referralCode;
     }

}
