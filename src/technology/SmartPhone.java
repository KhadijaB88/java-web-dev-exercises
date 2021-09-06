package technology;

public class SmartPhone extends Computer {

    private int numberOfPictures;

    public SmartPhone(int ram, int cost, String manufacturer, int numberOfPictures) {
        super(ram, cost, manufacturer);
        this.numberOfPictures = numberOfPictures;
    }

    public int getNumberOfPictures() {
        return this.numberOfPictures;
    }

    public static String textingSomeone(String text){
        return "text sent";
    }
}
