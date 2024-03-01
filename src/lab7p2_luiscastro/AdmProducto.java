/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_luiscastro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lfern
 */
public class AdmProducto {
    ArrayList<Producto> listaProductos = new ArrayList();
    File archivo = null;

    public AdmProducto(String path) {
        archivo = new File(path);
    }

    public ArrayList<Producto> getProductos() {
        return listaProductos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.listaProductos = productos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "productos=" + listaProductos;
    }
    
    public void cargarArchivo(){
        Scanner sc = null;
        listaProductos = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(",");
            while (sc.hasNext()) {
                listaProductos.add(new Producto(sc.nextInt(), 
                        sc.nextLine(), 
                        sc.nextInt(), 
                        sc.nextDouble(), 
                        sc.nextInt(), 
                        sc.nextInt()));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
    
    public void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo,true);
            bw = new BufferedWriter(fw);
            for (Producto p : listaProductos) {
                bw.write(p.getId()+",");
                bw.write(p.getNombre()+",");
                bw.write(p.getCategory()+",");
                bw.write(p.getPrecio()+",");
                bw.write(p.getAisle()+",");
                bw.write(p.getBin());
                bw.write("\n");
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
