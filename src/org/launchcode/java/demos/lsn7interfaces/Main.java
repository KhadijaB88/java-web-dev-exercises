package org.launchcode.java.demos.lsn7interfaces;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        Comparator comparator = new FlavorComparator();
        Comparator coneCost = new ConeComparator();


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

//        flavors.sort(comparator);
        flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
//        cones.sort(coneCost);
        cones.sort(new ConeComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        System.out.println(flavors);
        System.out.println(cones);
    }
}
