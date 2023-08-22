/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Fornecedor;
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
public class Fornecedor_DAO extends DAO_Abstract {

   
    @Override
    public void insert(Object object) {
        Fornecedor fornecedor = (Fornecedor) object;
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
            String sql = "insert into fornecedor values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, fornecedor.getIdFornecedor());
            pstm.setInt(2, fornecedor.getFkUsuario());
            pstm.setString(3, fornecedor.getTelefone());
            pstm.setString(4, fornecedor.getSexo());
            pstm.setString(5, fornecedor.getPais() );
            pstm.setString(6, fornecedor.getEstado());
            pstm.setString(7, fornecedor.getCidade());
            pstm.setString(8, fornecedor.getCep());
            pstm.setString(9, fornecedor.getNumero());
            pstm.setString(10, fornecedor.getRua());
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
        Fornecedor fornecedor = (Fornecedor) object;
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
            String sql = "update fornecedor set fkusuario= ?,telefone= ?,sexo= ?,pais= ?,estado= ?,cidade= ?,cep= ?,numero= ?,rua= ? where idfornecedor= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(10, fornecedor.getIdFornecedor());
            pstm.setInt(1, fornecedor.getFkUsuario());
            pstm.setString(2, fornecedor.getTelefone());
            pstm.setString(3, fornecedor.getSexo());
            pstm.setString(4, fornecedor.getPais() );
            pstm.setString(5, fornecedor.getEstado());
            pstm.setString(6, fornecedor.getCidade());
            pstm.setString(7, fornecedor.getCep());
            pstm.setString(8, fornecedor.getNumero());
            pstm.setString(9, fornecedor.getRua());
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
    Fornecedor fornecedor = (Fornecedor) object;
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
            String sql = "delete from fornecedor where idfornecedor= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, fornecedor.getIdFornecedor());
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
            Fornecedor fornecedor = new Fornecedor();
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
            String sql = "SELECT * FROM fornecedor where idfornecedor= ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()==true) {
            fornecedor.setIdFornecedor(rs.getInt("idfornecedor"));
            fornecedor.setFkUsuario(rs.getInt("fkusuario"));
            fornecedor.setTelefone(rs.getString("telefone"));
            fornecedor.setSexo(rs.getString("sexo"));
            fornecedor.setPais(rs.getString("pais"));
            fornecedor.setEstado(rs.getString("estado"));
            fornecedor.setCidade(rs.getString("cidade"));
            fornecedor.setCep(rs.getString("cep"));
            fornecedor.setNumero("numero");
            fornecedor.setRua(rs.getString("rua"));
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };
        return fornecedor;
    }

    @Override
    public List listAll() {

   String url, user, password;
        url ="jdbc:mysql://10.7.0.51:33062/db_carlos_oliveira";
        user ="carlos_oliveira";
        password ="carlos_oliveira";
//        url ="jdbc:mysql://127.0.0.1:3306/test" ;
//        user = "root";
//        password= "";
        List lista = new ArrayList();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM fornecedor";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()==true) {
                Fornecedor fornecedor = new Fornecedor();
            fornecedor.setIdFornecedor(rs.getInt("idfornecedor"));
            fornecedor.setFkUsuario(rs.getInt("fkusuario"));
            fornecedor.setTelefone(rs.getString("telefone"));
            fornecedor.setSexo(rs.getString("sexo"));
            fornecedor.setPais(rs.getString("pais"));
            fornecedor.setEstado(rs.getString("estado"));
            fornecedor.setCidade(rs.getString("cidade"));
            fornecedor.setCep(rs.getString("cep"));
            fornecedor.setNumero("numero");
            fornecedor.setRua(rs.getString("rua"));
            lista.add(fornecedor);
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
    Fornecedor fornecedor = new Fornecedor();
    fornecedor.setIdFornecedor(2);
    fornecedor.setFkUsuario(2);
    fornecedor.setTelefone("12345");
    fornecedor.setSexo("M");
    fornecedor.setPais("PY");
    fornecedor.setEstado("PJ");
    fornecedor.setCidade("ponta grossa");
    fornecedor.setCep("123456");
    fornecedor.setNumero("1234");
    fornecedor.setRua("kkkkkkkkkk");
    
    Fornecedor_DAO fornecedor_DAO = new Fornecedor_DAO(); 
    fornecedor_DAO.insert(fornecedor);  
        System.out.println("Deu Certo");
    }
}
