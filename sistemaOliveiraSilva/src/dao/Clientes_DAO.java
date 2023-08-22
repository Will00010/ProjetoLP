/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Cliente;
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
public class Clientes_DAO extends DAO_Abstract {

   
    @Override
    public void insert(Object object) {
        Cliente cliente = (Cliente) object;
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
            String sql = "insert into cliente values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, cliente.getIdCliente());
            pstm.setInt(2, cliente.getFkUsuario());
            pstm.setString(3, cliente.getEmail());
            pstm.setString(4, cliente.getTelefone());
            pstm.setString(5, cliente.getSexo() );
            pstm.setString(6, cliente.getInteresses());
            pstm.setString(7, cliente.getRg());
            pstm.setString(8, cliente.getPais());
            pstm.setString(9, cliente.getEstado());
            pstm.setString(10, cliente.getCidade());
            pstm.setString(11, cliente.getBairro());
            pstm.setString(12, cliente.getCep());
            pstm.setString(13, cliente.getNumero());
            pstm.setString(14, cliente.getComplemento());
            pstm.setString(15, cliente.getRua());
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
                Cliente cliente = (Cliente) object;
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
            String sql = "update cliente set fkUsuario= ?,email= ?,telefone= ?,sexo= ?,interesses= ?,rg= ?,pais= ?,estado= ?,cidade= ?,bairro= ?,cep= ?,numero= ?,complemento= ?,rua= ? where idcliente= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(15, cliente.getIdCliente());
            pstm.setInt(1, cliente.getFkUsuario());
            pstm.setString(2, cliente.getEmail());
            pstm.setString(3, cliente.getTelefone());
            pstm.setString(4, cliente.getSexo() );
            pstm.setString(5, cliente.getInteresses());
            pstm.setString(6, cliente.getRg());
            pstm.setString(7, cliente.getPais());
            pstm.setString(8, cliente.getEstado());
            pstm.setString(9, cliente.getCidade());
            pstm.setString(10, cliente.getBairro());
            pstm.setString(11, cliente.getCep());
            pstm.setString(12, cliente.getNumero());
            pstm.setString(13, cliente.getComplemento());
            pstm.setString(14, cliente.getRua());
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
               Cliente cliente = (Cliente) object;
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
            String sql = "delete from cliente where idcliente= ?;";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, cliente.getIdCliente());
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
        Cliente cliente = new Cliente();
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
            String sql = "SELECT * FROM cliente where idcliente= ?";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()==true) {
            cliente.setIdCliente(rs.getInt("idcliente"));
            cliente.setFkUsuario(rs.getInt("fkusuario"));
            cliente.setEmail(rs.getString("email"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setSexo(rs.getString("sexo"));
            cliente.setInteresses(rs.getString("interesses"));
            cliente.setRg(rs.getString("rg"));
            cliente.setPais(rs.getString("pais"));
            cliente.setEstado(rs.getString("estado"));
            cliente.setCidade(rs.getString("cidade"));
            cliente.setBairro(rs.getString("bairro"));
            cliente.setCep(rs.getString("cep"));
            cliente.setNumero(rs.getString("numero"));
            cliente.setComplemento(rs.getString("complemento"));
            cliente.setRua(rs.getString("rua"));
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
         System.out.println("Erro na conexão");
         System.exit(0);
        
        } catch (SQLException ex) {
            Logger.getLogger(TesteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        };
        return cliente;
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
            String sql = "SELECT * FROM cliente";
            PreparedStatement pstm = cnt.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()==true) {
            Cliente cliente = new Cliente();
            cliente.setIdCliente(rs.getInt("idcliente"));
            cliente.setFkUsuario(rs.getInt("fkusuario"));
            cliente.setEmail(rs.getString("email"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setSexo(rs.getString("sexo"));
            cliente.setInteresses(rs.getString("interesses"));
            cliente.setRg(rs.getString("rg"));
            cliente.setPais(rs.getString("pais"));
            cliente.setEstado(rs.getString("estado"));
            cliente.setCidade(rs.getString("cidade"));
            cliente.setBairro(rs.getString("bairro"));
            cliente.setCep(rs.getString("cep"));
            cliente.setNumero(rs.getString("numero"));
            cliente.setComplemento(rs.getString("complemento"));
            cliente.setRua(rs.getString("rua"));
            lista.add(cliente);
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
    Cliente cliente = new Cliente();
    cliente.setIdCliente(1);
    cliente.setFkUsuario(2);
    cliente.setEmail("teste@gmail");
    cliente.setTelefone("1234598");
    cliente.setSexo("M");
    cliente.setInteresses("guitarHero");
    cliente.setRg("1245661");
    cliente.setPais("BR");
    cliente.setEstado("MS");
    cliente.setCidade("Carapicuiba");
    cliente.setBairro("carapicuibinha");
    cliente.setCep("123533231");
    cliente.setNumero("123");
    cliente.setComplemento("kkkkkk");
    cliente.setRua("teste");

    
    Clientes_DAO cliente_DAO = new Clientes_DAO(); 
    cliente_DAO.insert(cliente);  

        System.out.println("Deu Certo");
    }
}
