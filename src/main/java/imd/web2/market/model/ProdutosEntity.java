package imd.web2.market.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "produto")
@Entity(name = "Produto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProdutosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Size(min = 1, max = 50, message = "O nome do produto precisar ser preechido, com ate 50 caracteres.")
    private String nome_produto;

    @NotNull
    @Size(min = 1, max = 50, message = "A  descricao do produto precisar ser preechido, com ate 100 caracteres.")
    private String descricao_produt;

    private String preco_produto;

    @Future
    private String data_validade;

    private String estoque;

    @Size(min = 1, max = 50, message = "O fornecedor do produto precisar ser preechido, com ate 50 caracteres.")
    private String fornecedor;

    private boolean ativo;

}
