package com.epam.javalambdas;
import java.awt.List;
public class Student {
	private String name;
    private int age;
    private Address address;
    private List mobileNumbers;
	private List mobileNumbers1;
 
    public Student(String name, int age, Address address, List list) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers1 = (List) list;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
 
    public Address getAddress() {
        return address;
    }
 
    public List getMobileNumbers() {
        return mobileNumbers;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public void setAddress(Address address) {
        this.address = address;
    }
 
    public void setMobileNumbers(List mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }
 
    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", address=" + address +
            ", mobileNumbers=" + mobileNumbers +
            '}';
    }
}
