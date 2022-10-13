/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import manejoarchivos.*;
/**
 *
 * @author ingri
 */
public class PPal {
    public static void main (String[] args){
        String nombreArchivo = "prueba2.txt";
        //String contenido = "hola mundo";
        //ManejoArchivos.crearArchivo(nombreArchivo);
        //ManejoArchivos.escribirArchivo(nombreArchivo,"hola mundo");
        ManejoArchivos.agregarArchivo(nombreArchivo, " que tal ?");
        ManejoArchivos.leerArchivo(nombreArchivo);
        ManejoArchivos.leerArchivoPorPalabra(nombreArchivo);
    }
   
}
