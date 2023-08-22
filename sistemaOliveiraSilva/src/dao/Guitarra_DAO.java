/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Guitarra;
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
public class Guitarra_DAO extends DAO_Abstract {

   
    @Override
    public void insert(Object object) {
        Guitarra guitarra = (Guitarra) object;
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
            String sql = "insert into guitarra values (?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, guitarra.getIdProdutos() );
            pstm.setString(2, guitarra.getTipo() );
            pstm.setString(3, guitarra.getTrastes() );
            pstm.setString(4, guitarra.getModelo());
            pstm.setString(5, guitarra.getCaptadores());
            pstm.setString(6, guitarra.getPonte());
            pstm.setString(7, guitarra.getCanhotoDestro());            
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
         Guitarra guitarra = (Guitarra) object;
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
            String sql = "update guitarra set tipo= ?,trastes= ?,modelo= ?,captadores= ?,ponte= ?,canhotoDestro= ? where idprodutos= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(7, guitarra.getIdProdutos() );
            pstm.setString(1, guitarra.getTipo() );
            pstm.setString(2, guitarra.getTrastes() );
            pstm.setString(3, guitarra.getModelo());
            pstm.setString(4, guitarra.getCaptadores());
            pstm.setString(5, guitarra.getPonte());
            pstm.setString(6, guitarra.getCanhotoDestro());
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
        Guitarra guitarra = (Guitarra) object;
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
            String sql = "delete from guitarra where idprodutos= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, guitarra.getIdProdutos());
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
        Guitarra guitarra = new Guitarra();
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
            String sql = "SELECT * FROM guitarra where idprodutos= ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()==true) {
            guitarra.setIdProdutos(rs.getInt("idprodutos"));
            guitarra.setTipo(rs.getString("tipo"));
            guitarra.setTrastes(rs.getString("trastes"));
            guitarra.setModelo(rs.getString("modelo"));
            guitarra.setCaptadores(rs.getString("captadores"));
            guitarra.setPonte(rs.getString("ponte"));
            guitarra.setCanhotoDestro(rs.getString("canhotoDestro"));
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };
        return guitarra;
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
            String sql = "SELECT * FROM guitarra";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()==true) {
            Guitarra guitarra = new Guitarra();
            guitarra.setIdProdutos(rs.getInt("idprodutos"));
            guitarra.setTipo(rs.getString("tipo"));
            guitarra.setTrastes(rs.getString("trastes"));
            guitarra.setModelo(rs.getString("modelo"));
            guitarra.setCaptadores(rs.getString("captadores"));
            guitarra.setPonte(rs.getString("ponte"));
            guitarra.setCanhotoDestro(rs.getString("canhotoDestro"));
            lista.add(guitarra);
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
    Guitarra guitarra = new Guitarra();
    guitarra.setIdProdutos(2);
    guitarra.setTipo("LesPaul");
    guitarra.setTrastes("23");
    guitarra.setModelo("Slash");
    guitarra.setCaptadores("2");
    guitarra.setPonte("fixa");
    guitarra.setCanhotoDestro("canhoto");
    
    Guitarra_DAO guitarra_DAO = new Guitarra_DAO(); 
    guitarra_DAO.insert(guitarra);  
        System.out.println("Deu Certo");
    }
}
