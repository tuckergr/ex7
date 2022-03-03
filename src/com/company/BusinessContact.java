package com.company;

class BusinessContact extends ContactInfo {
    private String phoneNum;

    public BusinessContact(String name, String emailAddress, String phoneNum) {
        super(name, emailAddress);
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(phoneNum);
    }
}
