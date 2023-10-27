/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author kuraohikari
 */
public class Manager extends Employee {

    private String Departement;

    public Manager(String Nama, double Salary, String Dept) {
        super(Nama, 30000.00);
        Departement = Dept;

    }

    public Manager(String n, String dept) {
        super(n);
        Departement = dept;
    }

    public Manager(String Dept) {
        super("");
        Departement = Dept;
    }
    
    public void tampilPegawai(){
        System.out.println("Nama Pegawai = " + getName()+ " Gajinya adalah "+ getSalary() + " departmentnya di " + Departement );
    }
}
