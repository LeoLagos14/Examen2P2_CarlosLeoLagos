/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_carlosleolagos;

import java.io.Serializable;

/**
 *
 * @author clago
 */
public class Partida implements Serializable{
    
    char[][] tablero = new char[13][33];
    private static final long SerialVersionUID=555L;
    
    public Partida() {
    }

    public char[][] getTablero() {
        return tablero;
    }

    public void setTablero(char[][] tablero) {
        this.tablero = tablero;
    }

    @Override
    public String toString() {
        return "tablero=" + tablero;
    }

   
    
    
}//fin clase
