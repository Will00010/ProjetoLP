/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author carlo
 */
import bean.Usuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u07032685110
 */
public class UsuariosControle extends AbstractTableModel{
    
    List lista;
    
    public void setList(List lista){
    this.lista = lista;
    };
    public Usuarios getBean(int row){
    return (Usuarios)lista.get(row);
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
       
        Usuarios usuarios = (Usuarios) lista.get(rowIndex);
        if (columnIndex == 0){
        return usuarios.getIdUsuarios();
        }
        if (columnIndex == 1){
        return usuarios.getNome();
        }
        if (columnIndex == 2){
        return usuarios.getApelido();
        }
        if (columnIndex == 3){
        return usuarios.getCpf();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
        return "id";
        }
        if (column == 1){
        return "nome";
        }
        if (column == 2){
        return "apelido";
        }
        if (column == 3){
        return "cpf";
        }
               
        return "";
    };
    
}
