/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_carlosleolagos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author clago
 */
public class Partida implements Serializable{
    
    ArrayList<char[][]> listaMatrices = new ArrayList();
    private static final long SerialVersionUID=555L;
    
    public Partida() {
    }

    public ArrayList<char[][]> getListaMatrices() {
        return listaMatrices;
    }

    public void setListaMatrices(ArrayList<char[][]> listaMatrices) {
        this.listaMatrices = listaMatrices;
    }

    @Override
    public String toString() {
        return "listaMatrices=" + listaMatrices;
    }

    
    
   
    
    
}//fin clase
