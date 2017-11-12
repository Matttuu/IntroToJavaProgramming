package ChapterTwo;

import java.util.Scanner;

public class FindTheNumberOfYears {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a the number of minutes: ");
        int minutes = input.nextInt();

        int yearsRes = (minutes / 60) / 365;
        int daysRes = minutes % 60;



        System.out.println(minutes + " minutes is approximately " + yearsRes + " years and " + daysRes + " days.");
    }
}
