/*
Crear un archivo
Guardar informacion de un archivo
Eliminar informacion de un archivo
Eliminar un archivo

*/
package manejoarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 *
 * @author ingri
 */
public class ManejoArchivos {

    /**
     * @param args the command line arguments
     */
       
    public static void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
        } catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
    }
    
    
}
