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
public class CompraProduto {
    private int idCompraProdutos;
    private int fkCompra;
    private int fkProduto;
    private int quantidade;
    private double total;

    public CompraProduto() {
    }

    /**
     * @return the idCompraProdutos
     */
    public int getIdCompraProdutos() {
        return idCompraProdutos;
    }

    /**
     * @param idCompraProdutos the idCompraProdutos to set
     */
    public void setIdCompraProdutos(int idCompraProdutos) {
        this.idCompraProdutos = idCompraProdutos;
    }

    /**
     * @return the fkCompra
     */
    public int getFkCompra() {
        return fkCompra;
    }

    /**
     * @param fkCompra the fkCompra to set
     */
    public void setFkCompra(int fkCompra) {
        this.fkCompra = fkCompra;
    }

    /**
     * @return the fkProduto
     */
    public int getFkProduto() {
        return fkProduto;
    }

    /**
     * @param fkProduto the fkProduto to set
     */
    public void setFkProduto(int fkProduto) {
        this.fkProduto = fkProduto;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
