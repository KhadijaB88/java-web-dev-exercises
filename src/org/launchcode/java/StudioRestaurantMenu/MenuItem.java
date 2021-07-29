package org.launchcode.java.StudioRestaurantMenu;

public class MenuItem {

    private String name;
    private String description;
    private String category;
    private double price;
    private boolean isNewItem;
//    private String lastUpdated;

    public MenuItem(String name, String description, String category, double price){
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNewItem = true;

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getCategory(){
        return this.category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public boolean getIsNewItem(){
        return this.isNewItem;
    }

    public void setIsNewItem(){
        this.isNewItem = isNewItem;
    }


}
