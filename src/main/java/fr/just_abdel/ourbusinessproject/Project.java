package fr.just_abdel.ourbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Table (name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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
