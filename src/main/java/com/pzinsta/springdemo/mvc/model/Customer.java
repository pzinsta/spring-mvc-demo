package com.pzinsta.springdemo.mvc.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.pzinsta.springdemo.mvc.validation.CourseCode;

public class Customer {
    private String firstName;
    
    @NotNull(message = "Last name is required")
    @Size(min = 2, message = "Last name should be at least {min} characters long")
    private String lastName;

    @NotNull(message = "required")
    @Min(value = 0, message = "Must be greater than or equal to {value}")
    @Max(value = 10, message = "Must be less than or equal to {value}")
    private Integer freePasses;
    
    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 characters/digits")
    private String postalCode;
    
    @CourseCode
    private String courseCode;
    
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

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
