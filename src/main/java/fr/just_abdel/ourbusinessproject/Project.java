package fr.just_abdel.ourbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Entity
@Setter
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

    // Maintenir la relation bidirectionnelle
    /**
     * Get and Set the enterprise owning the project
     */
    @NotNull
    @Getter
    @ManyToOne
    private Enterprise enterprise;

    /**
     * Get the id of the project
     * @return the id of the project
     */
    public Object getId() {
        return id;
    }

}
