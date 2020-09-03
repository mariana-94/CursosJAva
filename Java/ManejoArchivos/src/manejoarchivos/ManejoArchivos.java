package manejoarchivos;

import java.io.*;

public class ManejoArchivos {

    //CREAR ARCHIVOS
    public static void crearArchivo(String nombre) {
        File archivo = new File(nombre);//crear un elemento de tipo file
        try {
            PrintWriter salida = new PrintWriter(archivo);//se crea el flujo
            salida.close();//se crea el archivo y cierra el flujo
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    ///ESCRIBIR EN EL ARCHIVO
    public static void escribirArchivo(String nombreArhivo, String contenido) {
        File archivo = new File(nombreArhivo);//crear un elemento de tipo file
        try {
            PrintWriter salida = new PrintWriter(archivo);//se crea el flujo
            salida.println(contenido);
            salida.close();//se crea el archivo y cierra el flujo
            System.out.println("Se ha escrito en el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    //ANEXAR INFORMACION EN EL ACHIVO
    public static void anexarArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);//crear un elemento de tipo file
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));//se anexa informacion
            salida.println(contenido);
            salida.close();//se crea el archivo y cierra el flujo
            System.out.println("Se ha anexado en el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    //LEER ARCHIVO
    public static void leeerArchivo(String nombreArchivo) {
        var archivo = new File(nombreArchivo);//crear un elemento de tipo file
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while(lectura!=null){
                System.out.println("Lectura = " +lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
