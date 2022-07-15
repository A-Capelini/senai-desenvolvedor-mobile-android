public class Principal {
    public static void main(String[] args) {
        //DAO_Produtos obj_produtos = new DAO_Produtos();
        DAO_Unidades obj_unidades = new DAO_Unidades();

        //CONSULTAR PRODUTOS
        //obj_produtos.consultar();

        //INSERIR PRODUTOS
        //Produto novoProduto = new Produto(7,"miojo",5.00,10.00,1);
        //obj_produtos.inserir(novoProduto);

        //ALTERAR PRODUTO
        //  Produto produtoAlterado = new Produto(7,"Miojo Alterado",2.5,100.00,2);
        // obj_produtos.alterar(produtoAlterado);

        //EXCLUIR
        //obj_produtos.excluir(4);

        //CONSULTAR UNIDADES
        //obj_unidades.consultar();

        //INSERIR UNIDADES
        //Unidade novaUnidade = new Unidade(7,"Metade");
        //obj_unidades.inserir(novaUnidade);

        //ALTERAR UNIDADE
        //Unidade unidadeAlterada = new Unidade(7,"Centena");
        //obj_unidades.alterar(unidadeAlterada);

        //EXCLUIR UNIDADE
        obj_unidades.excluir(7);


    }
}
