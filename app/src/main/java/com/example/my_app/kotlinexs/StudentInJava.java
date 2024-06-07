package com.example.my_app.kotlinexs;

public class StudentInJava {
    String name;
    int age;
    String postalAddress;

    public StudentInJava(String name, int age, String postalAddress) {
        this.name = name;
        this.age = age;
        this.postalAddress = postalAddress;
    }

    // For getting and setting the value of class variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }
}
