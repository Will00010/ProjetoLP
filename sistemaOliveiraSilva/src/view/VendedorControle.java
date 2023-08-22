/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import bean.Vendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author carlo
 */
public class VendedorControle extends AbstractTableModel{

    List lista;
    
    public void setlist(List lista){
    this.lista = lista;
    };
    public Vendedor getBean(int row){
    return (Vendedor)lista.get(row);
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
       
        Vendedor vendedor = (Vendedor) lista.get(rowIndex);
        if (columnIndex == 0){
        return vendedor.getIdVendedor();
        }
        if (columnIndex == 1){
        return vendedor.getFkUsuarios();
        }
        if (columnIndex == 2){
        return vendedor.getTelefone();
        }
        if (columnIndex == 3){
        return vendedor.getCidade();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
        return "id";
        }
        if (column == 1){
        return "fkUsuario";
        }
        if (column == 2){
        return "telefone";
        }
        if (column == 3){
        return "cidade";
        }
               
        return "";
    };
    
}
