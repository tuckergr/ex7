package com.company;

class ContactInfo {
    private String name;
    private String emailAddress;

    public ContactInfo(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void display() {
        System.out.println("My name is " + name + ", my email is " + emailAddress );
    }


}
