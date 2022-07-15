import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*Classe que realiza a conexão com o Banco de Dados*/
public class Conexao {
    private String caminho = "jdbc:mysql://localhost:3306/comabem"; //endereço do banco
    private String usuario = "root"; // usuario do banco de dados
    private String senha = "@Aca11091979"; //senha do usuario do banco de dados
    public Connection conn; //atributo para conexão

    public void conexao() //método para abrir a conexão com o banco
    {
        try //bloco para realização casso não ocorram erros
        {
            conn=DriverManager.getConnection(caminho,usuario,senha);
            System.out.println("CONECTADO COM SUCESSO!!!");
        }
        catch (SQLException ex) //bloco para execusão, caso ocorra erro no try
        {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null,ex);
        }
    }

    public void desconecta() //método para fechar a conexão com o banco de dados
    {
        try ////bloco para realização casso não ocorram erros
        {
            conn.close();
            System.out.println("DESCONECTADO COM SUCESSO!!!");
        }
        catch (SQLException ex) ////bloco para execusão, caso ocorra erro no try
        {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null,ex);
            System.out.println("ERRO AO FECHAR CONEXÃO!!!");
        }
    }

    //método main utilizado somente para teste da classe conexão (pode ser apagado se quiser)
    public static void main(String[] args) {
        Conexao obj_conexao = new Conexao();
        obj_conexao.conexao();
    }
}

