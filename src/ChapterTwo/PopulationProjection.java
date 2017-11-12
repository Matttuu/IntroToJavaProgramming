package ChapterTwo;

import java.util.Scanner;

public class PopulationProjection {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of years: ");
        int year = input.nextInt();

        int population = year * 65186594;

        System.out.println("The population in " + year + " years is " + population);
    }
}
