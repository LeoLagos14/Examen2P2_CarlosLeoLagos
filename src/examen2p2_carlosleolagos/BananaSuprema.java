/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_carlosleolagos;

/**
 *
 * @author clago
 */
public class BananaSuprema {
    
    private int posx,posy;

    public BananaSuprema() {
    }

    public BananaSuprema(int posx, int posy) {
        this.posx = posx;
        this.posy = posy;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    @Override
    public String toString() {
        return "BananaSuprema{" + "posx=" + posx + ", posy=" + posy + '}';
    }
    
    
    
}//fin clase
