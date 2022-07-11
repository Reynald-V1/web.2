package eaj.web.prova2sapataria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.Date;

@NoArgsConstructor
@Entity
@AllArgsConstructor
@Data
public class Sapatos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Size(min=5)
    String nome;

    @Positive
    @NotBlank
    float preco;

    @Positive
    @NotBlank
    int tamanho;

    String marca;
    boolean Deleted;
    String ImageUri;

//c) Defina os atributos do seu tema. Cada tema deve ser especificado como uma classe com pelo
 //menos 7 atributos, alguns atributos serão: ID (Long), Deleted (Date), ImageUri(String)
}
