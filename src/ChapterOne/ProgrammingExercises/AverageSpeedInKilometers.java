package ChapterOne.ProgrammingExercises;

public class AverageSpeedInKilometers {
    public static void main(String[] args) {
        System.out.println("Distance = 24 miles =" + (24.0 * 1.6) + " kilometers\n");
        System.out.println("Time = 1 hour 40 minutes 35 seconds" + " = "
                + (1 + (((40.0 * 60.0) + 35.0) / 3600)) + " hours.\n");
        System.out.print("Average Speed In kilometers per hour = ");
        System.out.println(((24.0 * 1.6) / (1 + (((40.0 * 60.0) + 35.0) / 3600)))
                + " kph.");
    }
}

