package com.java.training;

/**
 * Created by anchalmal on 1/25/17.
 */
import java.util.ArrayList;
import java.util.List;

public class Employee {
    int id;
    String name;
    private int age;
    List<Address> addresses;

    public Employee(int id, String name1, int age) {
        this.id = id;
        name = name1;
        this.age = age;
    }
    public Employee(){
        addresses = new ArrayList<>();
    };

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0){
            this.age = age;
        }

    }
    public void addAddress(Address address){
        this.addresses.add(address);
    }
    public static Employee createEmployee(int id, String name, int age){
        Employee emp = new Employee();
        emp.id=id;
        emp.name=name;
        emp.setAge(age);
        return emp;
    }
}