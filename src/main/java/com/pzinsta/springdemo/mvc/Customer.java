package com.pzinsta.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
    private String firstName;
    
    @NotNull(message = "Last name is required")
    @Size(min = 2, message = "Last name should be at least {min} characters long")
    private String lastName;

    @Min(value = 0, message = "Must be greater than or equal to {value}")
    @Max(value = 10, message = "Must be less than or equal to {value}")
    private int freePasses;
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }
}
