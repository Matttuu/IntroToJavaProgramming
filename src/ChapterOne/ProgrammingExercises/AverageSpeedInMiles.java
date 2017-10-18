package ChapterOne.ProgrammingExercises;

public class AverageSpeedInMiles {
    public static void main(String[] args) {
        System.out.println("Distance = 14km \nTime = 45 minutes 30 seconds = (45 x 60) + 30 \n"
                + "                               -------------- hours \n"
                + "                                    3600            \n"
                + "1 mile = 1.6 kilometers. \nAverage Speed in miles per hour = "
                + (14.0 / 1.6)/ (((45.0 * 60.0) + 30.0) / 3600) + " mph.");
    }
}
