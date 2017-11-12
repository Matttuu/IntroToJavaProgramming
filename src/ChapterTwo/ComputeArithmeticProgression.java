package ChapterTwo;

import java.util.Scanner;

public class ComputeArithmeticProgression {
    public static void main(String[] args) {
        {
            Scanner in = new Scanner(System.in);
            double AP;
            int a,n,d;
            a = 3;
            d = 8;
            n = 4;
            AP = a + (n-1) * d;
            System.out.println("Arithmetic progression is : " + AP);
        }
    }
}
