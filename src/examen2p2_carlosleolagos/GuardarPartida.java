/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_carlosleolagos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author clago
 */
public class GuardarPartida implements Serializable{
    
    private ArrayList<Partida> listaPartida = new ArrayList();
    private File archivo = null;
    private static final long SerialVersionUID=555L;

    public GuardarPartida(String path) {
        archivo = new File(path);
    }

    public ArrayList<Partida> getListaPartida() {
        return listaPartida;
    }

    public void setListaPartida(ArrayList<Partida> listaPartida) {
        this.listaPartida = listaPartida;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setPartida(Partida pa){
        listaPartida.add(pa);
    }
    
    public void cargarArchivo() {
        try {            
            listaPartida = new ArrayList();
            Partida partidaTemp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((partidaTemp = (Partida) objeto.readObject()) != null) {
                        listaPartida.add(partidaTemp);
                    }
                } catch (EOFException e) {
                    
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Partida t : listaPartida) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
    

    
    
}//fin clase
