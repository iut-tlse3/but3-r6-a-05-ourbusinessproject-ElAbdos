package fr.just_abdel.ourbusinessproject;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
public class Project {

    /**
     * Get and Set the title of the project
     */
    @Getter  @NotBlank
    private String title;

    /**
     * Get and Set the description of the project
     */
    @Getter private String description;

}
