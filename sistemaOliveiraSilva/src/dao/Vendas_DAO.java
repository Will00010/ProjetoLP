/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Vendas;
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
public class Vendas_DAO extends DAO_Abstract {

   
    @Override
    public void insert(Object object) {
        Vendas vendas = (Vendas) object;
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
            String sql = "insert into vendas values (?, ?, ?, ?, ?);";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, vendas.getIdVendas());
            pstm.setDate(2, new java.sql.Date(vendas.getData().getTime()));
            pstm.setInt(3, vendas.getFkCliente() );
            pstm.setInt(4, vendas.getFkVendedor() );
            pstm.setDouble(5, vendas.getTotal() );
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
    Vendas vendas = (Vendas) object;
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
            String sql = "update vendas set data= ?,fkcliente= ?,fkvendedor= ?,total= ? where idvendas= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(5, vendas.getIdVendas());
            pstm.setDate(1, new java.sql.Date(vendas.getData().getTime()));
            pstm.setInt(2, vendas.getFkCliente());
            pstm.setInt(3, vendas.getFkVendedor() );
            pstm.setDouble(4, vendas.getTotal() );
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
    Vendas vendas = (Vendas) object;
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
            String sql = "delete from vendas where idvendas= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, vendas.getIdVendas());
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
        Vendas vendas = new Vendas();
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
            String sql = "SELECT * FROM vendas where idvendas= ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()==true) {
            vendas.setIdVendas(rs.getInt("idvendas"));
            vendas.setData(rs.getDate("data"));
            vendas.setFkCliente(rs.getInt("fkcliente"));
            vendas.setFkVendedor(rs.getInt("fkvendedor"));
            vendas.setTotal(rs.getDouble("total"));
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };
        return vendas;
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
            String sql = "SELECT * FROM vendas";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
           while (rs.next()==true) {
            Vendas vendas = new Vendas();
            vendas.setIdVendas(rs.getInt("idvendas"));
            vendas.setData(rs.getDate("data"));
            vendas.setFkCliente(rs.getInt("fkcliente"));
            vendas.setFkVendedor(rs.getInt("fkvendedor"));
            vendas.setTotal(rs.getDouble("total"));
            lista.add(vendas);
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
    Vendas vendas = new Vendas();
    vendas.setIdVendas(3);
    //vendas.setData("");
    vendas.setFkCliente(1);
    vendas.setFkVendedor(1);
    vendas.setTotal(56.7);

    
    Vendas_DAO vendas_DAO = new Vendas_DAO(); 
    vendas_DAO.insert(vendas);  
        System.out.println("Deu Certo");
    }
}

