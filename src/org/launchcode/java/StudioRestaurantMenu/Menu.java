package org.launchcode.java.StudioRestaurantMenu;
//
//
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
//
public class Menu {
    ////utilize the date class
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    //adding menu item
    public void addMenuItem(MenuItem newMenuItem) {
        this.menuItems.add(newMenuItem);
        this.lastUpdated = LocalDate.now();
    }

    //removing items
    public void removeMenuItem(MenuItem menuItem) {
        this.menuItems.remove(menuItem);
    }


    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        String returnString = "";
        for(MenuItem menuItem: this.menuItems){
            returnString = returnString + menuItem + "\n";
        }
        returnString = returnString + "Last updated: " + this.lastUpdated;
        return returnString;
    }

}

