package com.zss.iteratormode;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenuNew pancakeHouseMenuNew = new PancakeHouseMenuNew();
        DinerMenuNew dinerMenuNew = new DinerMenuNew();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(pancakeHouseMenuNew, dinerMenuNew,cafeMenu);
        waitress.printMenu();
    }
}
