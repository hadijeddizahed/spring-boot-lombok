package me.hadi.lombok.model;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
<<<<<<< Updated upstream
@NoArgsConstructor
=======
>>>>>>> Stashed changes
public class Person implements Serializable {

    private Long id;
    private String name;
    private Long nationalCode;
}
