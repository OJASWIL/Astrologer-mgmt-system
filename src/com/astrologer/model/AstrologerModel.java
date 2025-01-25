package com.astrologer.model;

/**
 *
 * @author Ojaswi
 */
public class AstrologerModel {
     private int lmuId;
    private String name;
    private String position;
    private String contact;
    private short age;

     public AstrologerModel() {
    }

    public AstrologerModel(int lmuId, String name, String description, String contact, short age) {
        this.lmuId = lmuId;
        this.name = name;
        this.position = description;
        this.contact = contact;
        this.age = age;
    }
    
    public int getLmuId() {
        return lmuId;
    }

    public void setLmuId(int lmuId) {
        this.lmuId = lmuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosiotion(String position) {
        this.position = position;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }    
}
