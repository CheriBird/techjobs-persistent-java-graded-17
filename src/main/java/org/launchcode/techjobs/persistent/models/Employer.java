package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required.")
    @NotNull(message = "Location is required.")
    @Size(max = 50, message = "Location is too many characters.")
    private String location;

    // constructors
    public Employer() {}
    public Employer(String location) { this.location = location; }

    // getters and setter
    public String getLocation( ) { return location; }

    public void setLocation(String location) { this.location = location; }

//    public List<Job> getJobs() { return jobs; }

}
