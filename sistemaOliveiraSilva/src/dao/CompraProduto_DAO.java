/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.CompraProduto;
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
public class CompraProduto_DAO extends DAO_Abstract {

   
    @Override
    public void insert(Object object) {
        CompraProduto compraProduto = (CompraProduto) object;
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
            String sql = "insert into compra_produtos values (?, ?, ?, ?, ?);";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, compraProduto.getIdCompraProdutos());
            pstm.setInt(2, compraProduto.getFkCompra() );
            pstm.setInt(3, compraProduto.getFkProduto() );
            pstm.setInt(4, compraProduto.getQuantidade());
            pstm.setDouble(5, compraProduto.getTotal());
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
           CompraProduto compraProduto = (CompraProduto) object;
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
            String sql = "update compra_produtos fkcompra= ?,fkproduto= ?,quantidade= ?,total= ? where idcompra_produtos= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, compraProduto.getIdCompraProdutos());
            pstm.setInt(2, compraProduto.getFkCompra() );
            pstm.setInt(3, compraProduto.getFkProduto() );
            pstm.setInt(4, compraProduto.getQuantidade());
            pstm.setDouble(5, compraProduto.getTotal());
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
    CompraProduto compraproduto = (CompraProduto) object;
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
            String sql = "delete from compra_produtos where compra_produtos= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, compraproduto.getIdCompraProdutos());
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
        CompraProduto compraproduto = new CompraProduto();
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
            String sql = "SELECT * FROM compras_produtos where idcompra_produtos= ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()==true) {
            compraproduto.setIdCompraProdutos(rs.getInt("compra_produtos"));
            compraproduto.setFkCompra(rs.getInt("fkcompra"));
            compraproduto.setFkProduto(rs.getInt("fkproduto"));
            compraproduto.setQuantidade(rs.getInt("quantidade"));
            compraproduto.setTotal(rs.getDouble("total"));
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };
        return compraproduto;
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
            String sql = "SELECT * FROM compras_produtos where idcompra_produtos= ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()==true) {
            CompraProduto compraproduto = new CompraProduto();
            compraproduto.setIdCompraProdutos(rs.getInt("compra_produtos"));
            compraproduto.setFkCompra(rs.getInt("fkcompra"));
            compraproduto.setFkProduto(rs.getInt("fkproduto"));
            compraproduto.setQuantidade(rs.getInt("quantidade"));
            compraproduto.setTotal(rs.getDouble("total"));
            lista.add(compraproduto);
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
    CompraProduto compraProduto = new CompraProduto();
    compraProduto.setIdCompraProdutos(1);
    compraProduto.setFkCompra(1);
    compraProduto.setFkProduto(1);
    compraProduto.setQuantidade(56);
    compraProduto.setTotal(5.7);

    
    CompraProduto_DAO compraProduto_DAO = new CompraProduto_DAO(); 
    compraProduto_DAO.insert(compraProduto);  
        System.out.println("Deu Certo");
    }
}