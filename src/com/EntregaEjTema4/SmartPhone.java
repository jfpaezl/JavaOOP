package com.EntregaEjTema4;

public class SmartPhone extends SmartDevice {
    private String operatingSystem;

    public SmartPhone() {
    }

    public SmartPhone(String brand, String model, double price, String operatingSystem) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Operating System: " + operatingSystem);
    }

}
