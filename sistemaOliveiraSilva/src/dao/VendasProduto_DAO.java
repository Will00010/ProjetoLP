/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.VendasProduto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u07032685110
 */
public class VendasProduto_DAO extends DAO_Abstract {

   
    @Override
    public void insert(Object object) {
        VendasProduto vendasProduto = (VendasProduto) object;
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
            String sql = "insert into vendas_produto values (?, ?, ?, ?, ?);";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, vendasProduto.getIdVendasProduto());
            pstm.setInt(2, vendasProduto.getFkVendas());
            pstm.setInt(3, vendasProduto.getFkProdutos());
            pstm.setInt(4, vendasProduto.getQuantidade());
            pstm.setDouble(5, vendasProduto.getValorUnitario());
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
            VendasProduto vendasProduto = (VendasProduto) object;
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
            String sql = "update vendas_produto values fkvendas= ?,fkProdutos= ?,quantidade= ?,valorunitario ? where idvendas_produto= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(5, vendasProduto.getIdVendasProduto());
            pstm.setInt(1, vendasProduto.getFkVendas());
            pstm.setInt(2, vendasProduto.getFkProdutos());
            pstm.setInt(3, vendasProduto.getQuantidade());
            pstm.setDouble(4, vendasProduto.getValorUnitario());
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
    VendasProduto vendasproduto = (VendasProduto) object;
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
            String sql = "delete from vendas_produto where idvendas= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, vendasproduto.getIdVendasProduto());
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
        VendasProduto vendasproduto = new VendasProduto();
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
            vendasproduto.setIdVendasProduto(rs.getInt("idvendas_produto"));
            vendasproduto.setFkVendas(rs.getInt("fkvendas"));
            vendasproduto.setFkProdutos(rs.getInt("fkprodutos"));
            vendasproduto.setQuantidade(rs.getInt("quantidade"));
            vendasproduto.setValorUnitario(rs.getDouble("valorunitario"));
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };
        return vendasproduto;
    }

    @Override
    public List listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
    VendasProduto vendasProduto = new VendasProduto();
    vendasProduto.setIdVendasProduto(1);
    vendasProduto.setFkVendas(1);
    vendasProduto.setFkProdutos(1);
    vendasProduto.setQuantidade(3);
    vendasProduto.setValorUnitario(155.78);

    
    VendasProduto_DAO vendasProduto_DAO = new VendasProduto_DAO(); 
    vendasProduto_DAO.insert(vendasProduto);  
        System.out.println("Deu Certo");
    }
}