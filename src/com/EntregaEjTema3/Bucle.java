package com.EntregaEjTema3;

public class Bucle {
    static String nombres[] = {"Ana", "Juan", "Pedro", "Andres", "Paola"};

    public static void main(String[] args) {
        for (String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
