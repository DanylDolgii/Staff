package com.task.staff.entity;

public class Employee {

    private final String name;
    private final String position;
    private final String phone;
    private final int salary;

    public Employee(String name, String position, String phone, int salary) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }
}
