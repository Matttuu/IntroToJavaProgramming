package ChapterTwo;

import java.util.Scanner;

public class ConvertMileToKilometre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles: ");
        double antalMiles = input.nextDouble();

        double kilometer = antalMiles * 1.6;

        System.out.println(antalMiles + " miles " + " er " + kilometer + " Kilometer.");

    }
}
