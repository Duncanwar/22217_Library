/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moodle;

/**
 *
 * @author duncan
 */
public class Client {
   private String regNo;
   private String firstName;
   private String lastName;
   private String phoneNumber;
   private String emailAddress;
   private String clientCategory;
   private String photo;

   public Client(){}
   
    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getClientCategory() {
        return clientCategory;
    }

    public void setClientCategory(String clientCategory) {
        this.clientCategory = clientCategory;
    }
    

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Client{" + "regNo=" + regNo + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + ", photo=" + photo + '}';
    }
}
