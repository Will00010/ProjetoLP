/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Pedaleira;
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
public class Pedaleira_DAO extends DAO_Abstract {

   
    @Override
    public void insert(Object object) {
        Pedaleira pedaleira = (Pedaleira) object;
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
            String sql = "insert into pedaleira values (?, ?, ?, ?, ?);";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, pedaleira.getIdPedaleira() );
            pstm.setString(2, pedaleira.getPedalExpressão() );
            pstm.setString(3, pedaleira.getLoop() );
            pstm.setString(4, pedaleira.getIr());
            pstm.setString(5, pedaleira.getSaidaUsb());

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
        Pedaleira pedaleira = (Pedaleira) object;
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
            String sql = "update pedaleira set pedalexpressao= ?,`loop`= ?,ir= ?,saidausb= ? where idpedaleira= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(5, pedaleira.getIdPedaleira() );
            pstm.setString(1, pedaleira.getPedalExpressão() );
            pstm.setString(2, pedaleira.getLoop() );
            pstm.setString(3, pedaleira.getIr());
            pstm.setString(4, pedaleira.getSaidaUsb());

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
   Pedaleira pedaleira = (Pedaleira) object;
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
            String sql = "delete from pedaleira where idpedaleira= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, pedaleira.getIdPedaleira());
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
        Pedaleira pedaleira = new Pedaleira();
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
            String sql = "SELECT * FROM pedaleira where idpedaleira= ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()==true) {
            pedaleira.setIdPedaleira(rs.getInt("idpedaleira"));
            pedaleira.setPedalExpressão(rs.getString("pedalexpressao"));
            pedaleira.setLoop(rs.getString("loop"));
            pedaleira.setIr(rs.getString("ir"));
            pedaleira.setSaidaUsb(rs.getString("saidausb"));

            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };
        return pedaleira;
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
            String sql = "SELECT * FROM pedaleira";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()==true) {
            Pedaleira pedaleira = new Pedaleira();    
            pedaleira.setIdPedaleira(rs.getInt("idpedaleira"));
            pedaleira.setPedalExpressão(rs.getString("pedalexpressao"));
            pedaleira.setLoop(rs.getString("loop"));
            pedaleira.setIr(rs.getString("ir"));
            pedaleira.setSaidaUsb(rs.getString("saidausb"));
            lista.add(pedaleira);
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
    Pedaleira pedaleira = new Pedaleira();
    pedaleira.setIdPedaleira(2);
    pedaleira.setPedalExpressão("Nao");
    pedaleira.setLoop("Sim");
    pedaleira.setIr("Sim");
    pedaleira.setSaidaUsb("Sim");

    
    Pedaleira_DAO pedaleira_DAO = new Pedaleira_DAO(); 
    pedaleira_DAO.insert(pedaleira);  
        System.out.println("Deu Certo");
    }
}
