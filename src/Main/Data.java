/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author jakianorah
 */
public class Data {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    
 //JN Contructors
    public Data(String firstName, String lastName, String phoneNumber, String emailAddress) {
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber); 
        setEmailAddress(emailAddress);       
    }
    
//JN sets First Name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
 //JN sets last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 //JN sets Phone number   
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    //sets email address
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
   
  //JN gets first name
    public String getFirstName() {
        return firstName;
    }
    
   //JN  gets lasts name
    public String getLastName() {
        return lastName;
    }
  //JN  gets phone number  
     public String getPhoneNumber() {
        return phoneNumber;
    }
  //JN  gets email address  
    public String getEmailAddress() {
        return emailAddress;
    }
   //JN  display contact for lookup result 
    public void displayData() {
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Email Address: " + this.emailAddress);
        System.out.println("Phone Number: " + this.phoneNumber);
    }
}

