package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description is required.")
    @NotNull(message = "Description is required.")
    @Size(max = 50, message = "Description is too many characters.")
    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    // constructors
    public Skill( ) { }

//    public Skill(String description) {
//        this.description = description;
//    }

    // getters and setters
    public String getDescription( ) { return description; }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs( ) { return jobs; }

    public void setJobs(List<Job> jobs) { this.jobs = jobs; }

}
