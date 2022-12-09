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
import java.util.ArrayList;

/**
 *
 * @author clago
 */
public class GuardarPartida {
    
    private ArrayList<BananaSuprema> listabSupremas = new ArrayList();
    private ArrayList<BananasSubditas> listabanansSub = new ArrayList();
    private File archivo = null;

    public GuardarPartida(String path) {
        archivo = new File(path);
    }

    public ArrayList<BananaSuprema> getListabSupremas() {
        return listabSupremas;
    }

    public void setListabSupremas(ArrayList<BananaSuprema> listabSupremas) {
        this.listabSupremas = listabSupremas;
    }


    public ArrayList<BananasSubditas> getListabanansSub() {
        return listabanansSub;
    }

    public void setListabanansSub(ArrayList<BananasSubditas> listabanansSub) {
        this.listabanansSub = listabanansSub;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

     public void cargarArchivo() {
        try {            
            listabSupremas = new ArrayList();
            listabanansSub = new ArrayList();
            BananaSuprema bananaSupretemp;
            BananasSubditas bananaSubditemp;
            if (archivo.exists()) {
                FileInputStream entrada= new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                
                try {
                    while ((bananaSupretemp = (BananaSuprema)objeto.readObject()) != null) {                        
                        listabSupremas.add(bananaSupretemp);
                    }
                     while ((bananaSubditemp = (BananasSubditas)objeto.readObject()) != null) {                        
                        listabanansSub.add(bananaSubditemp);
                    }
                    
                } catch (Exception e) {
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
            for (BananaSuprema t : listabSupremas) {
                bw.writeObject(t);
            }
            for (BananasSubditas b : listabanansSub) {
                bw.writeObject(b);
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
