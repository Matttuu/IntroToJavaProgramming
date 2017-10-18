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

        


    }

}
