package excercises;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle?");
        Double userLength = input.nextDouble();

        System.out.println("What is the width of the rectangle?");
        Double userWidth = input.nextDouble();

        Double rectangleArea = userLength * userWidth;
        System.out.println("The area of your rectangle is" + rectangleArea);
}

}