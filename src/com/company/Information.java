package com.company;

public class Information {
    private String firstname;
    private String lastname;
    private String accountnumber;
    private double salary;
    private String employeeposition;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getSalary() {
        return salary;
    }

    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
    }

    public String getEmployeeposition() {
        return employeeposition;
    }

    public void setEmployeeposition(String employeeposition) {
        this.employeeposition = employeeposition;
    }
}
