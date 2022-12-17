import Builder.Produto;
import Builder.ProdutoBuilder;
import BuilderImmutables.ProdutoImmutables;
import BuilderLombok.ProdutoLombok;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new ProdutoBuilder()
                .id(1)
                .descricao("Microondas de Inox")
                .marca("Electrolux")
                .preco(1000)
                .dataCadastro(LocalDate.now())
                .categoria("Cozinha")
                .createProduto();

        System.out.println(produto);

        ProdutoLombok produtoLombok = ProdutoLombok.builder()
                .id(1)
                .descricao("Geladeira de Inox")
                .marca("Panasonic")
                .preco(10)
                .dataCadastro(LocalDate.now())
                .categoria("Cozinha")
                .build();

        System.out.println(produtoLombok);
    }
}
