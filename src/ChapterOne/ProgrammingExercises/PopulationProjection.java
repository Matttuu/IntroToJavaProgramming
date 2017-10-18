package ChapterOne.ProgrammingExercises;

public class PopulationProjection {
    public static void main(String[] args) {

        int birth = 7;
        int death = 13;
        int newImmigrant = 45;
        int currentPopulation = 312032486;
        int year = 365;
        int yearlyBirths = (((60 * 60 * 24 * year) / birth));
        int yearlyDeaths = (((60 * 60 * 24 * year) / death));
        int yearlyImmigrant = (((60 * 60 * 24 * year) / newImmigrant));
        int yearlyPopulation = (yearlyBirths + newImmigrant - yearlyDeaths);

        System.out.println("Current Year Population = " + currentPopulation);
        System.out.println("Next Year's Population = "
                + (currentPopulation + yearlyPopulation));
        System.out.println("Next Two Year's Population = "
                + (currentPopulation + (yearlyPopulation * 2)));
        System.out.println("Next Three Year's Population = "
                + (currentPopulation + (yearlyPopulation * 3)));
        System.out.println("Next Four Year's Population = "
                + (currentPopulation + (yearlyPopulation * 4)));
        System.out.println("Next Five Year'ss Population = "
                + (currentPopulation + (yearlyPopulation * 5)));



    }

}
