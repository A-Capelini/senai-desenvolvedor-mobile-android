public class Produto {
    private int cd_produto;
    private String ds_produto;
    private double vl_produto;
    private double qt_produto;
    private int cd_unidade;

    public int getCd_produto() {
        return cd_produto;
    }

    /*Método construtor que recebe o código do produto, descrição do produto, valor do produto, quantidade
    do produto e codigo da unidade do produto como argumento e realiza a inserção de seus valores através dos
    respectivos métodos sets */
    public Produto(int cd_produto, String ds_produto, double vl_produto, double qt_produto, int cd_unidade) {
        this.setCd_produto(cd_produto);
        this.setDs_produto(ds_produto);
        this.setVl_produto(vl_produto);
        this.setQt_produto(qt_produto);
        this.setCd_unidade(cd_unidade);
    }

    /*Método construtor vazio, criado para permitir que a classe seja instânciada sem a passagem de argumentos */
    public Produto() {
    }

    /*Método set para permitir a inserção de valores do atributo codigo do produto */
    public void setCd_produto(int cd_produto) {
        this.cd_produto = cd_produto;
    }

    /*Método get para permitir o acesso ao atributo de descrição do Produto*/
    public String getDs_produto() {
        return ds_produto;
    }

    /*Método set para permitir a inserção de valores do atributo descrição do produto */
    public void setDs_produto(String ds_produto) {
        this.ds_produto = ds_produto;
    }

    /*Método get para permitir o acesso ao atributo de Valor do Produto*/
    public double getVl_produto() {
        return vl_produto;
    }

    /*Método set para permitir a inserção de valores do atributo valor do produto */
    public void setVl_produto(double vl_produto) {
        this.vl_produto = vl_produto;
    }

    /*Método get para permitir o acesso ao atributo de quantidade do Produto*/
    public double getQt_produto() {
        return qt_produto;
    }

    /*Método set para permitir a inserção de valores do atributo quantidade do produto */
    public void setQt_produto(double qt_produto) {
        this.qt_produto = qt_produto;
    }

    /*Método get para permitir o acesso ao atributo de cd da Unidade do Produto*/
    public int getCd_unidade() {
        return cd_unidade;
    }

    /*Método set para permitir a inserção de valores do atributo código da Unidade do produto */
    public void setCd_unidade(int cd_unidade) {
        this.cd_unidade = cd_unidade;
    }
}
