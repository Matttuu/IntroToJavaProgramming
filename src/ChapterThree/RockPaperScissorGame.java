package ChapterThree;

import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarer variablen ai, hvor vi gør brug af Math.random
        int ai = (int)(Math.random() * 3);

        // Brugeren skriver et tal mellem 0-3
        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = input.nextInt();

        System.out.print("The computer is ");
        switch (ai)
        {
            case 0: System.out.print("scissor."); break;
            case 1: System.out.print("rock."); break;
            case 2: System.out.print("paper.");
        }

        System.out.print(" You are ");
        switch (user)
        {
            case 0: System.out.print("scissor"); break;
            case 1: System.out.print("rock"); break;
            case 2: System.out.print("paper ");
        }

        // Her opstiller vi de mulige kombinationer der kan forekomme og resultatet af dem.
        if (ai == user)
            System.out.println(" too. It is a draw");
        else
        {
            boolean win =
                    (user == 0 && ai == 2) ||
                            (user == 1 && ai == 0) ||
                            (user == 2 && ai == 1);
            if (win)
                System.out.println(". You won");
            else
                System.out.println(". You lose");
        }
    }
}