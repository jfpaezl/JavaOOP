package com.EntregaEjTema5;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.save();
        cocheCrud.delete();
        cocheCrud.findAll();
    }
}
