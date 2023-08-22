/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Guitarra;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author carlo
 */
public class GuitarraControle extends AbstractTableModel{
    
    List lista;
    
    public void setList(List lista){
    this.lista = lista;
    };
    public Guitarra getBean(int row){
    return (Guitarra)lista.get(row);
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
       
        Guitarra guitarra = (Guitarra) lista.get(rowIndex);
        if (columnIndex == 0){
        return guitarra.getIdProdutos();
        }
        if (columnIndex == 1){
        return guitarra.getModelo();
        }
        if (columnIndex == 2){
        return guitarra.getCaptadores();
        }
        if (columnIndex == 3){
        return guitarra.getPonte();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
        return "id";
        }
        if (column == 1){
        return "modelo";
        }
        if (column == 2){
        return "captadores";
        }
        if (column == 3){
        return "ponte";
        }
               
        return "";
    };
}
