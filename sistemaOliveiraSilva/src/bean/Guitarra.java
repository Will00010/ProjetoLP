/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author carlo
 */
public class Guitarra {
    private int idProdutos;
    private String tipo;
    private String trastes;
    private String modelo;
    private String captadores;
    private String ponte;
    private String canhotoDestro;

    public Guitarra() {
    }

    /**
     * @return the idProdutos
     */
    public int getIdProdutos() {
        return idProdutos;
    }

    /**
     * @param idProdutos the idProdutos to set
     */
    public void setIdProdutos(int idProdutos) {
        this.idProdutos = idProdutos;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the trastes
     */
    public String getTrastes() {
        return trastes;
    }

    /**
     * @param trastes the trastes to set
     */
    public void setTrastes(String trastes) {
        this.trastes = trastes;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the captadores
     */
    public String getCaptadores() {
        return captadores;
    }

    /**
     * @param captadores the captadores to set
     */
    public void setCaptadores(String captadores) {
        this.captadores = captadores;
    }

    /**
     * @return the ponte
     */
    public String getPonte() {
        return ponte;
    }

    /**
     * @param ponte the ponte to set
     */
    public void setPonte(String ponte) {
        this.ponte = ponte;
    }

    /**
     * @return the canhotoDestro
     */
    public String getCanhotoDestro() {
        return canhotoDestro;
    }

    /**
     * @param canhotoDestro the canhotoDestro to set
     */
    public void setCanhotoDestro(String canhotoDestro) {
        this.canhotoDestro = canhotoDestro;
    }
    
             @Override
   public String toString(){
   return getModelo()+ "-" + getTipo();}
    
}
