package imd.web2.market.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Table(name = "produto")
@Entity(name = "Produto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message = "O nome do produto precisar ser preechido, com ate 50 caracteres.")
    private String nome_produto;

    @NotNull
    @Size(min = 1, max = 50, message = "A  descricao do produto precisar ser preechido, com ate 100 caracteres.")
    private String descricao_produto;

    private long preco_produto;

    @Future
    private LocalDate data_validade;

    private String estoque;

    @Size(min = 1, max = 50, message = "O fornecedor do produto precisar ser preechido, com ate 50 caracteres.")
    private String fornecedor;

    private boolean ativo;

}
