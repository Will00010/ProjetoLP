/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Compras;
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
public class Compras_DAO extends DAO_Abstract {

   
    @Override
    public void insert(Object object) {
        Compras compras = (Compras) object;
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
            String sql = "insert into compras values (?, ?, ?, ?, ?);";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, compras.getIdCompras());
            pstm.setDate(2, new java.sql.Date(compras.getData().getTime()));
            pstm.setInt(3, compras.getFkCliente() );
            pstm.setDouble(4, compras.getTotal() );
            pstm.setInt(5, compras.getFkFornecedor() );
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
        Compras compras = (Compras) object;
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
            String sql = "update compras set data= ?,fkcliente= ?,total= ?,fkfornecedor= ? where idcompras= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(5, compras.getIdCompras());
            pstm.setDate(1, new java.sql.Date(compras.getData().getTime()));
            pstm.setInt(2, compras.getFkCliente() );
            pstm.setDouble(3, compras.getTotal() );
            pstm.setInt(4, compras.getFkFornecedor() );
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
    Compras compras = (Compras) object;
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
            String sql = "delete from compras where idcompras= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, compras.getIdCompras());
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
    Compras compras = new Compras();
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
            String sql = "SELECT * FROM compras where idcompras= ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()==true) {
            compras.setIdCompras(rs.getInt("idcompras"));
            compras.setData(rs.getDate("data"));
            compras.setFkCliente(rs.getInt("fkcliente"));
            compras.setTotal(rs.getDouble("total"));
            compras.setFkFornecedor(rs.getInt("fkfornecedor"));
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };
        return compras;
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
            String sql = "SELECT * FROM compras";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()==true) {
            Compras compras = new Compras();    
            compras.setIdCompras(rs.getInt("idcompras"));
            compras.setData(rs.getDate("data"));
            compras.setFkCliente(rs.getInt("fkcliente"));
            compras.setTotal(rs.getDouble("total"));
            compras.setFkFornecedor(rs.getInt("fkfornecedor"));
            lista.add(compras);
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
    Compras compras = new Compras();
    compras.setIdCompras(2);
    //compras.setData("");
    compras.setFkCliente(1);
    compras.setTotal(56.7);
    compras.setFkFornecedor(1);

    
    Compras_DAO compras_DAO = new Compras_DAO(); 
    compras_DAO.insert(compras);  
        System.out.println("Deu Certo");
    }
}

