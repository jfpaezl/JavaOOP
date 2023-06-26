package com.EntregaEjTema4;

public class SmartWatch extends SmartDevice{
    private String displayType;

    public SmartWatch() {
    }

    public SmartWatch(String brand, String model, double price, String displayType) {
        super(brand, model, price);
        this.displayType = displayType;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Display Type: " + displayType);
    }
}
