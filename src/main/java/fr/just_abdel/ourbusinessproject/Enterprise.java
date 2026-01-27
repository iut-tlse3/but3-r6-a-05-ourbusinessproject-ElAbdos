package fr.just_abdel.ourbusinessproject;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enterprise {

    /**
     * Get and Set the name of the enterprise
     */
    @NotBlank private String name;

    /**
     * Get and Set the description of the enterprise
     */
    @Size(min = 10)  private String description;

    /**
     * Get and Set the contact name of the enterprise
     */
    @NotBlank private String contactName;

    /**
     * Get and Set the contact email of the enterprise
     */
    @NotBlank @Email private String contactEmail;

    public Enterprise() {}
}
