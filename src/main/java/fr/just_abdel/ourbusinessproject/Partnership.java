package fr.just_abdel.ourbusinessproject;

import jakarta.validation.constraints.NotNull;
import lombok.Setter;

import java.util.Date;

@Setter

public class Partnership {
    @NotNull private Date creationDate;
    @NotNull private Enterprise enterprise;
    @NotNull private Project project;
}
