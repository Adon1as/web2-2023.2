package imd.web2.market.model;

import jakarta.persistence.*;
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
public class produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome_produto;
    private String descricao_produt;
    private String preco_produto;
    private String data_validade;
    private String estoque;
    private String fornecedor;
    private boolean ativo;

}
