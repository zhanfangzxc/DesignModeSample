package com.zss.iteratormode;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenuNew;
    Menu dinerMenuNew;
    Menu cafeMenu;

//    public Waitress(PancakeHouseMenuNew pancakeHouseMenuNew, DinerMenuNew dinerMenuNew) {
//        this.pancakeHouseMenuNew = pancakeHouseMenuNew;
//        this.dinerMenuNew = dinerMenuNew;
//    }

    public Waitress(Menu pancakeHouseMenuNew, Menu dinerMenuNew,CafeMenu cafeMenu) {
        this.pancakeHouseMenuNew = pancakeHouseMenuNew;
        this.dinerMenuNew = dinerMenuNew;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenuNew.createIterator();
        Iterator dinerIterator = dinerMenuNew.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("Menu\n----\nBreakfast");
        printMenu(pancakeIterator);
        System.out.println("\nLunch");
        printMenu(dinerIterator);
        System.out.println("\nCAFE");
        printMenu(cafeIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
