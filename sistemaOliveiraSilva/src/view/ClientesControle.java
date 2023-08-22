/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author carlo
 */
public class ClientesControle extends AbstractTableModel {
  List lista;
    
    public void setList(List lista){
    this.lista = lista;
    };
    public Cliente getBean(int row){
    return (Cliente)lista.get(row);
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
       
        Cliente cliente = (Cliente) lista.get(rowIndex);
        if (columnIndex == 0){
        return cliente.getIdCliente();
        }
        if (columnIndex == 1){
        return cliente.getFkUsuario();
        }
        if (columnIndex == 2){
        return cliente.getTelefone();
        }
        if (columnIndex == 3){
        return cliente.getEmail();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
        return "idcliente";
        }
        if (column == 1){
        return "fkUsuario";
        }
        if (column == 2){
        return "telefone";
        }
        if (column == 3){
        return "email";
        }
               
        return "";
    };
   
}
