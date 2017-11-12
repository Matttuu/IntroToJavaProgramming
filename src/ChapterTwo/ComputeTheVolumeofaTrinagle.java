package ChapterTwo;

import java.util.Scanner;

public class ComputeTheVolumeofaTrinagle {
    public static void main(String args[])
    {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the side of the Triangle:");
        double side = input.nextDouble();
        double areal = ( Math.sqrt(3)/4 ) * ( side*side );
        double volume = areal * side;
        System.out.println("Enter length of the sides and height of the Equilateral triangle: " + side + " The area is " + areal + " The volume of the Triangular prism is " + volume);
    }
}
