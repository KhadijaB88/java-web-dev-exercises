package org.launchcode.java.StudioRestaurantMenu;

import java.util.Date;

public class MenuItem {

    private String name;
    private String description;
    private String category;
    private double price;
    private boolean isNew;

    public MenuItem(String name, String description, String category, double price, boolean isNew) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = isNew;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void setNew(boolean aNew){
        isNew = aNew;
    }
//is menuItem new?
    public String isMenuItemNew(){
        if(this.isNew){
            return("New");
        } else{
            return("");
        }
    }
//print out both

    public void printItem(MenuItem item){
        String itemDescription = item.getDescription();
        System.out.println(itemDescription);
    }

 //menu item equal?

    public boolean isEqual(MenuItem itemToCompare) {
        if (itemToCompare == this) {
            return true;
        }
        if (itemToCompare == null) {
            return false;
        }
        if (itemToCompare.getClass() != getClass()) {
            return false;
        }
        MenuItem theItem = (MenuItem) itemToCompare;
        return theItem.getDescription() == getDescription();
    }
    @Override
    public String toString(){
        return this.name + " $" + this.price + " Description: " + this.description + " " + this.category;
    }

    // #TODO If two MenuItems are equal
    @Override
    public boolean equals(Object otherItem) {
        if(this == otherItem){
            return true;
        }
        if(otherItem == null){
            return false;
        }
        if(this.getClass() != otherItem.getClass()){
            return false;
        }
        MenuItem otherMenuItem = (MenuItem) otherItem;
        return this.name.equals(otherMenuItem.getDescription());
    }

}
