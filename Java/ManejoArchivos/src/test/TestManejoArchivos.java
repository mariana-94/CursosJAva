package test;

import manejoarchivos.ManejoArchivos;

public class TestManejoArchivos {

    public static void main(String[] args) {
        var nombreArchivo = "Prueba.txt";
        //ManejoArchivos.crearArchivo(nombreArchivo);

//        ManejoArchivos.anexarArchivo(nombreArchivo, "Hola desde Java");
//        ManejoArchivos.anexarArchivo(nombreArchivo, "adios");
        ManejoArchivos.leeerArchivo(nombreArchivo);
    }
}
