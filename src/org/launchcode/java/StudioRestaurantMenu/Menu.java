package org.launchcode.java.StudioRestaurantMenu;

import java.util.ArrayList;

public class Menu {
//utilize the date class
    private ArrayList<MenuItem> listOfItems;

    public Menu(ArrayList<MenuItem> listOfItems){
        this.listOfItems = listOfItems;
    }

    public ArrayList<MenuItem> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(ArrayList<MenuItem> listOfItems) {
        this.listOfItems = listOfItems;
    }
}
