/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

/**
 *
 * @author carlo
 */
public class Vendas {
   private int idVendas;
   private Date data; 
   private int fkCliente; 
   private int fkVendedor;
   private double total;

    public Vendas() {
    }

    /**
     * @return the idVendas
     */
    public int getIdVendas() {
        return idVendas;
    }

    /**
     * @param idVendas the idVendas to set
     */
    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the fkCliente
     */
    public int getFkCliente() {
        return fkCliente;
    }

    /**
     * @param fkCliente the fkCliente to set
     */
    public void setFkCliente(int fkCliente) {
        this.fkCliente = fkCliente;
    }

    /**
     * @return the fkVendedor
     */
    public int getFkVendedor() {
        return fkVendedor;
    }

    /**
     * @param fkVendedor the fkVendedor to set
     */
    public void setFkVendedor(int fkVendedor) {
        this.fkVendedor = fkVendedor;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

}
