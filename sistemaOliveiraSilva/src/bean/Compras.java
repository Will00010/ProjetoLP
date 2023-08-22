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
public class Compras {
    private int idCompras;
    private Date data;
    private int fkCliente;
    private double total;
    private int fkFornecedor;

    public Compras() {
    }

    /**
     * @return the idCompras
     */
    public int getIdCompras() {
        return idCompras;
    }

    /**
     * @param idCompras the idCompras to set
     */
    public void setIdCompras(int idCompras) {
        this.idCompras = idCompras;
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

    /**
     * @return the fkFornecedor
     */
    public int getFkFornecedor() {
        return fkFornecedor;
    }

    /**
     * @param fkFornecedor the fkFornecedor to set
     */
    public void setFkFornecedor(int fkFornecedor) {
        this.fkFornecedor = fkFornecedor;
    }


    
}
