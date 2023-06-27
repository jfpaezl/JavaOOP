package com.EntregaEjTema5;

public interface CocheCRUD {
    public default void save(){

    }

    public default void findAll(){

    }
    public default void delete(){
        System.out.println("imprimiendo metodo delete()");
    }

}
