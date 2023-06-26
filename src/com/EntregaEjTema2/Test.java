package com.EntregaEjTema2;

public class Test {
    public static void main(String[] args) {
        // funcion que devielve un precion con un iva del 19%
        double total = precioMasIVA(100);
        System.out.println("Total = " + total);
    }

    public static double precioMasIVA (double precio){
        return precio*1.19;
    }
}
