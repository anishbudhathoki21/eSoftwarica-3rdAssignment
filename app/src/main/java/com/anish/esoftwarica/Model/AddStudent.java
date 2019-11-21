package com.anish.esoftwarica.Model;

public class AddStudent {

    String Fname,Address,Gender;
    int Age, image;

    public AddStudent(String fname, String address, String gender, int age, int image) {
        this.Fname = fname;
        this.Address = address;
        this.Gender = gender;
        this.Age = age;
        this.image = image;
    }


    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
