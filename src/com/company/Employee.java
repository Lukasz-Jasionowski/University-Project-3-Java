package com.company;

public class Employee {
    String name;
    Integer salary;

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Imię: " + name + "\nWymagania finansowe: " + salary + "PLN"+ "\n";
    }

}
