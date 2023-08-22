/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Pedaleira;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author carlo
 */
public class PedaleiraControle extends AbstractTableModel{
    List lista;
    
    public  void setList(List lista){
    this.lista = lista;
    };
    public Pedaleira getBean(int row){
    return (Pedaleira)lista.get(row);
    }
        
    @Override
    public int getRowCount() {
       return lista.size();
    }

    @Override
    public int getColumnCount() {
return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       
        Pedaleira pedaleira = (Pedaleira) lista.get(rowIndex);
        if (columnIndex == 0){
        return pedaleira.getIdPedaleira();
        }
        if (columnIndex == 1){
        return pedaleira.getIr();
        }
        if (columnIndex == 2){
        return pedaleira.getPedalExpressão();
        }
        if (columnIndex == 3){
        return pedaleira.getSaidaUsb();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
        return "id";
        }
        if (column == 1){
        return "IR";
        }
        if (column == 2){
        return "PedalExpressão";
        }
        if (column == 3){
        return "SaidaUSB";
        }
               
        return "";
    };
}
