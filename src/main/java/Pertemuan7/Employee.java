/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

import java.util.Date;

/**
 *
 * @author kuraohikari
 */
public class Employee {

    private static final double BASE_SALARY = 15000.00;
    private String name;
    private double salary;
    private Date birthDate;

    public Employee(String name, double salary, Date DoB) {
        this.name = name;
        this.salary = salary;
        this.birthDate = DoB;
    }

    public Employee(String name, double salary) {
        this(name, salary, null);
    }

    public Employee(String name, Date DoB) {
        this(name, BASE_SALARY, DoB);
    }

    public Employee(String name) {
        this(name, BASE_SALARY);
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public static void main(String[] args) {

    }
}
