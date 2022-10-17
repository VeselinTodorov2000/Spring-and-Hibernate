package com.todorov;


import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    @Min(value = 1, message = "Must be greater than 0")
    @Max(value = 10, message = "Must be lower than or equal to 10")
    private Long freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{4}", message = "Must match correct format")
    private String postalCode;

    @CourseCode(value = "JAVA", message = "Must begin with JAVA")
    private String courseCode;
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

    public Long getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Long freePasses) {
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
