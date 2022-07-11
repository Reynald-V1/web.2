package eaj.web.prova2sapataria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "usuario")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    String nome;

    @NotBlank
    @Size(min = 6)
    String password;
    boolean admin;

}
