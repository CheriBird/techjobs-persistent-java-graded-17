package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description is required.")
    @NotNull(message = "Description is required.")
    @Size(max = 50, message = "Description is too many characters.")
    private String description;

    // constructors
    public Skill() {}
    public Skill(String description) { this.description = description; }

    // getter and setter
    public String getDescription( ) { return description; }

    public void setDescription(String description) {
        this.description = description;
    }
}
