/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author u07032685110
 */
public class ListaUsuariosB {
    public static void main(String[] args) {
     List lista = new ArrayList();   
     Usuarios usuarios = new Usuarios();
     usuarios.setIdUsuarios(1);
     usuarios.setNome("Teste");
     usuarios.setApelido("kkkkkk");
     lista.add(usuarios);
    }
   
}

