package com.EntregaEjTema4;

public class Test {
    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone("Apple", "iPhone 12", 999.99, "iOS");
        smartphone.printInfo();

        System.out.println();

        SmartWatch smartwatch = new SmartWatch("Samsung", "Galaxy Watch 4", 299.99, "AMOLED");
        smartwatch.printInfo();
    }
}
