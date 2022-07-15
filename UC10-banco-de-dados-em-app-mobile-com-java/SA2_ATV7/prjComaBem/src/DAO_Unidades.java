import java.sql.*;

public class DAO_Unidades {

    Conexao obj_conexao = new Conexao(); //instância da classe conexão

    /*método para realizar a consulta da unidade no banco de dados */
    public void consultar(){
        obj_conexao.conexao(); // abertura da conexão com o banco
        Statement stm = null; //objeto para executar instruções sql
        ResultSet rs = null; //classe da API java para percorrer um datatable

        try
        {
            stm = obj_conexao.conn.createStatement();
            rs = stm.executeQuery("select * from unidades");
            while (rs.next())
                System.out.println(rs.getInt(1) +
                        " " + rs.getString(2));
            obj_conexao.desconecta();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }



    /*método para realizar a Inserção da unidade no banco de dados */
    public void inserir(Unidade u){
        obj_conexao.conexao();
        PreparedStatement pst = null;
        String sql = "INSERT INTO Unidades (cd_unidade, ds_unidade) VALUES (?,?)";
        try
        {
            pst = obj_conexao.conn.prepareStatement(sql);
            pst.setInt(1,u.getCd_unidade());
            pst.setString(2,u.getDs_unidade());
            pst.execute();
            obj_conexao.desconecta();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*método para realizar a Alteração da unidade no banco de dados */
    public void alterar(Unidade u){
        obj_conexao.conexao();
        PreparedStatement pst = null;
        String sql = "UPDATE Unidades SET ds_unidade=? WHERE cd_unidade=?";

        try
        {
            pst = obj_conexao.conn.prepareStatement(sql);

            pst.setString(1,u.getDs_unidade());
            pst.setDouble(2,u.getCd_unidade());
            pst.execute();
            obj_conexao.desconecta();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*método para realizar a exclusão da unidade no banco de dados */
    public void excluir(int id){
        obj_conexao.conexao();
        PreparedStatement pst = null;
        String sql = "DELETE from Unidades WHERE cd_unidade=?";
        try
        {
            pst = obj_conexao.conn.prepareStatement(sql);
            pst.setInt(1,id);
            pst.execute();
            obj_conexao.desconecta();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
