package com.kiran.mvpexample.model;

public class Employee_Module {

    String id,first_name,last_name,email,phone,updated_at,created_at;

    public Employee_Module(String id, String first_name, String last_name, String email, String phone, String updated_at, String created_at){

        this.id=id;
        this.first_name=first_name;
        this.last_name=last_name;
        this.email=email;
        this.phone=phone;
        this.updated_at=updated_at;
        this.created_at=created_at;
    }

    //getter methods


    public String getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getCreated_at() {
        return created_at;
    }
    //Setter Methods


    public void setId(String id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUpdated_at(String updated_at) {

    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
