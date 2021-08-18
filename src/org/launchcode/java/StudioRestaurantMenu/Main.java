package org.launchcode.java.StudioRestaurantMenu;
//
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Menu ourMenu = new Menu();
        MenuItem item1 = new MenuItem("taco", "Tasty taco", "Main", 3.50, true);
        MenuItem item2 = new MenuItem("pizza", "Yummy Yummy", "Main", 1.50, true);

         ourMenu.addMenuItem(item1);
         ourMenu.addMenuItem(item2);


        System.out.println(ourMenu);
    }

}

