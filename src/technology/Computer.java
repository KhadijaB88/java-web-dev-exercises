package technology;

public class Computer extends AbstractEntity {
    // computer is my parent class

    private int ram;
    private int cost;
    private String manufacturer;

    public Computer(int ram, int cost, String manufacturer) {
        this.ram = ram;
        this.cost = cost;
        this.manufacturer = manufacturer;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public static String computerOn(){
        return "Power ON";
    }

    public static String computerOff(){
        return "Turing off";
    }

//    public void increaseRAM (int n){
//        this.ram = this.ram +n;
//    }
}