/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.Usuarios_DAO;

/**
 *
 * @author carlo
 */
public class Login {
    private int idLogin;
    private String apelido;
    private String senha;

    /**
     * @return the idLogin
     */
    public int getIdLogin() {
        return idLogin;
    }

    /**
     * @param idLogin the idLogin to set
     */
    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    /**
     * @return the apelido
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * @param apelido the apelido to set
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean entrar(){
    Usuarios_DAO usuario_DAO = new Usuarios_DAO();
    Usuarios usuario = usuario_DAO.fazerLogin(apelido, senha); 
    if (usuario != null){
    return true;
    } else {
    return false;
    }
    };
}
