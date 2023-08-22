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
public class Pedaleira {
    private int idPedaleira;
    private String pedalExpressão;
    private String loop;
    private String ir;
    private String saidaUsb;

    public Pedaleira() {
    }

    /**
     * @return the idPedaleira
     */
    public int getIdPedaleira() {
        return idPedaleira;
    }

    /**
     * @param idPedaleira the idPedaleira to set
     */
    public void setIdPedaleira(int idPedaleira) {
        this.idPedaleira = idPedaleira;
    }

    /**
     * @return the pedalExpressão
     */
    public String getPedalExpressão() {
        return pedalExpressão;
    }

    /**
     * @param pedalExpressão the pedalExpressão to set
     */
    public void setPedalExpressão(String pedalExpressão) {
        this.pedalExpressão = pedalExpressão;
    }

    /**
     * @return the loop
     */
    public String getLoop() {
        return loop;
    }

    /**
     * @param loop the loop to set
     */
    public void setLoop(String loop) {
        this.loop = loop;
    }

    /**
     * @return the ir
     */
    public String getIr() {
        return ir;
    }

    /**
     * @param ir the ir to set
     */
    public void setIr(String ir) {
        this.ir = ir;
    }

    /**
     * @return the saidaUsb
     */
    public String getSaidaUsb() {
        return saidaUsb;
    }

    /**
     * @param saidaUsb the saidaUsb to set
     */
    public void setSaidaUsb(String saidaUsb) {
        this.saidaUsb = saidaUsb;
    }
    
}
