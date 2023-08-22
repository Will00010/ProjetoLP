/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Vendedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u07032685110
 */
public class Vendedor_DAO extends DAO_Abstract {

   
    @Override
    public void insert(Object object) {
        Vendedor vendedor = (Vendedor) object;
   String url, user, password;
        url ="jdbc:mysql://10.7.0.51:33062/db_carlos_oliveira";
        user ="carlos_oliveira";
        password ="carlos_oliveira";
//        url ="jdbc:mysql://127.0.0.1:3306/test" ;
//        user = "root";
//        password= "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into vendedor values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, vendedor.getIdVendedor());
            pstm.setString(2, vendedor.getTelefone());
            pstm.setString(3, vendedor.getSexo());
            pstm.setString(4, vendedor.getPais());
            pstm.setString(5, vendedor.getEstado());
            pstm.setString(6, vendedor.getCidade());
            pstm.setString(7, vendedor.getCep());
            pstm.setString(8, vendedor.getNumero());
            pstm.setString(9, vendedor.getComplemento());
            pstm.setString(10, vendedor.getRua());
            pstm.setInt(11, vendedor.getFkUsuarios());
            pstm.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };
    
    }

    @Override
    public void update(Object object) {
         Vendedor vendedor = (Vendedor) object;
   String url, user, password;
        url ="jdbc:mysql://10.7.0.51:33062/db_carlos_oliveira";
        user ="carlos_oliveira";
        password ="carlos_oliveira";
//        url ="jdbc:mysql://127.0.0.1:3306/test" ;
//        user = "root";
//        password= "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "update vendedor set telefone= ?,sexo= ?,pais= ?,estado= ?,cidade= ?,cep= ?,numero= ?,complemento= ?,rua= ?,fkusuarios= ? where idvendedor= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(11, vendedor.getIdVendedor());
            pstm.setString(1, vendedor.getTelefone());
            pstm.setString(2, vendedor.getSexo());
            pstm.setString(3, vendedor.getPais());
            pstm.setString(4, vendedor.getEstado());
            pstm.setString(5, vendedor.getCidade());
            pstm.setString(6, vendedor.getCep());
            pstm.setString(7, vendedor.getNumero());
            pstm.setString(8, vendedor.getComplemento());
            pstm.setString(9, vendedor.getRua());
            pstm.setInt(10, vendedor.getFkUsuarios());
            pstm.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };
    }

    @Override
    public void delete(Object object) {
   Vendedor vendedor = (Vendedor) object;
   String url, user, password;
        url ="jdbc:mysql://10.7.0.51:33062/db_carlos_oliveira";
        user ="carlos_oliveira";
        password ="carlos_oliveira";
//        url ="jdbc:mysql://127.0.0.1:3306/test" ;
//        user = "root";
//        password= "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "delete from vendedor where idvendedor= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, vendedor.getIdVendedor());
            pstm.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };
    }

    @Override
    public Object list(int id) {
        Vendedor vendedor = new Vendedor();
   String url, user, password;
        url ="jdbc:mysql://10.7.0.51:33062/db_carlos_oliveira";
        user ="carlos_oliveira";
        password ="carlos_oliveira";
//        url ="jdbc:mysql://127.0.0.1:3306/test" ;
//        user = "root";
//        password= "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM vendedor where idvendedor= ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()==true) {
            vendedor.setIdVendedor(rs.getInt("idvendedor"));
            vendedor.setTelefone(rs.getString("telefone"));
            vendedor.setSexo(rs.getString("sexo"));
            vendedor.setPais(rs.getString("pais"));
            vendedor.setEstado(rs.getString("estado"));
            vendedor.setCidade(rs.getString("cidade"));
            vendedor.setCep(rs.getString("cep"));
            vendedor.setNumero(rs.getString("numero"));
            vendedor.setComplemento(rs.getString("numero"));
            vendedor.setRua(rs.getString("rua"));
            vendedor.setFkUsuarios(rs.getInt("fkusuarios"));

            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };
        return vendedor;
    }

    @Override
    public List listAll() {

   String url, user, password;
//        //url ="jdbc:mysql://10.7.0.51:33062/db_carlos_oliveira";
//        //user ="carlos_oliveira";
//        //password ="carlos_oliveira";
        url ="jdbc:mysql://127.0.0.1:3306/test" ;
        user = "root";
        password= "";
        List lista = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM vendedor";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()==true) {
                Vendedor vendedor = new Vendedor();
            vendedor.setIdVendedor(rs.getInt("idvendedor"));
            vendedor.setTelefone(rs.getString("telefone"));
            vendedor.setSexo(rs.getString("sexo"));
            vendedor.setPais(rs.getString("pais"));
            vendedor.setEstado(rs.getString("estado"));
            vendedor.setCidade(rs.getString("cidade"));
            vendedor.setCep(rs.getString("cep"));
            vendedor.setNumero(rs.getString("numero"));
            vendedor.setComplemento(rs.getString("numero"));
            vendedor.setRua(rs.getString("rua"));
            vendedor.setFkUsuarios(rs.getInt("fkusuarios"));
            lista.add(vendedor);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };
        return lista;
    }
    public static void main(String[] args) {
    Vendedor vendedor = new Vendedor();
    vendedor.setIdVendedor(3);
    vendedor.setTelefone("21344");
    vendedor.setSexo("F");
    vendedor.setPais("BR");
    vendedor.setEstado("PR");
    vendedor.setCidade("PPMS");
    vendedor.setCep("98798");
    vendedor.setNumero("2134");
    vendedor.setComplemento("meajuda");
    vendedor.setRua("tangerina2");
    vendedor.setFkUsuarios(2);
    
    Vendedor_DAO vendedor_DAO = new Vendedor_DAO(); 
    vendedor_DAO.insert(vendedor);  
        System.out.println("Deu Certo");
    }
}
