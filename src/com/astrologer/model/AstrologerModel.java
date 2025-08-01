package com.astrologer.model;

/**
 *
 * @author Ojaswi
 */
public class AstrologerModel {
     private int id;
    private String name;
    private String position;
    private String contact;
    private short age;

     public AstrologerModel() {
    }

    public AstrologerModel(int id, String name, String description, String contact, short age) {
        this.id = id;
        this.name = name;
        this.position = description;
        this.contact = contact;
        this.age = age;
    }
    
    public int getId() {
        return id;
    }

    public void setLmuId(int id) {
        this.id = id;
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
