package technology;

public class Laptop extends Computer {

    private double weight; // laptop weight in pounds.

    public Laptop(int ram, int cost, String manufacturer, double weight) {
        super(ram, cost, manufacturer);
        this.weight = weight;
    }


    public static String installProgram(String program){
        return program + "installation complete";
        }
    }
