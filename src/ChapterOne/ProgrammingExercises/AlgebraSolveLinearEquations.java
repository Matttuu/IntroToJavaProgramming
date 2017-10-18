package ChapterOne.ProgrammingExercises;

public class AlgebraSolveLinearEquations {
    public static void main(String[] args) {
        System.out.println("" +
                "3.4x + 50.2y = 44.5 \n" +
                "2.1x + .55y = 5.9\n" +
                "-------------------");

        System.out.println("" +
                "    (44.5 * .55) - (50.2 * 5.9)\n" +
                "x = ---------------------------- = " + (((44.5 * 0.5) - (50.2 * 5.9)) / ((3.4 * .55) - (50.2 * 2.1))));
        System.out.println("    (3.4 * .55)  - (50.2 * 2.1) \n");

        System.out.println("" +
                "    (3.4 * 5.9) - (44.5 * 2.1)\n" +
                "y = ---------------------------- = " + (((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * .55) - (50.2 * 2.1))));
        System.out.println("    (3.4 * .55)  - (50.2 * 2.1) ");



    }
}
