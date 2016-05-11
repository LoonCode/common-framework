package com.exampleV3.entity;

import java.io.Serializable;

import com.google.common.base.MoreObjects;

/**
 * @author GuoLong
 */
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    private  String id;

    private  String firstName;
    private  String lastName;
    private  String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("firstName", firstName)
                .add("lastName", lastName)
                .add("email", email)
                .toString();
    }
}
