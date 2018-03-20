package com.zss.iteratormode;

import java.awt.*;
import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs,sausage", true, 2.99);
        addItem("K&B's  Pancake Breakfast", "Pancakes with screamed eggs,and toast", true, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        menuItems.add(item);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public void printMenus() {
        for (Object menuItem1 : menuItems) {
            MenuItem menuItem = (MenuItem) menuItem1;
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
        }
    }
}


