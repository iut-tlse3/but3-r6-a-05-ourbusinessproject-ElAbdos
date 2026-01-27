package fr.just_abdel.ourbusinessproject;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Setter
public class Project {

    @Getter  @NotEmpty
    private String title;
    @Getter private String description;

    public Project() {}

}
