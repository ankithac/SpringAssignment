package com.example.tryx.user;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String company;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", company='" + company + '\'' +
                ", phone=" + phone +
                '}';
    }

    public Employee(int id, String name, String email, String company, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.company = company;
        this.phone = phone;
    }
}
