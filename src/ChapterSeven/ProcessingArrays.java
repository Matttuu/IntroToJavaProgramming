package ChapterSeven;

public class ProcessingArrays {
    public static void main(String[] args) {
        double[] myList = new double[10];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter " + myList.length + " values: ");

        // Initializing arrays with input values
       /* for (int i = 0; i < myList.length; i++)
            myList[i] = input.nextDouble(); */

        //Initializing arrays with random values
        for (int i = 0; i < myList.length; i++){
            myList[i] = Math.random() * 100;
        }



        // Displaying arrays

        for (int i = 0; i < myList.length; i++){
            System.out.println(myList[i] + " ");
        }
        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total +=myList[i];
            System.out.println(" = " + total);
        }

        // Finding the largest element
       /* double max = myList[0];
        for (int i = 1; i < myList.length; i++){
            if (myList[i] > max) max = myList[i];
            System.out.println(max);
        }*/

        //Finding the smallest index of the largest element:
        double max = myList[0];
        int indexOfMax = 0;
        for (int i = 1; i < myList.length; i++){
            if (myList[i] > max){
                max = myList[i];
                indexOfMax = i;
            }
            System.out.println(max);
        }

        // Random shuffling
        for (int i = myList.length - 1; i > 0; i--){
            // Generate an index j randomly with 0 <= j <= i
            int j = (int)(Math.random() * (i+1));

            // Swap myList[i] with myList[j]

            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }

        //Shifting elements

        double temp = myList[0]; // Retain the first element

        // Shift element left
        for (int i = 1; i < myList.length; i++){
            myList[i-1] = myList[i];
        }
        // Move the first element to fill in the last position
        myList[myList.length - 1] = temp;


        // Simplifying coding:

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("Enter a month number (1 to 12): ");
        int monthNumber = input.nextInt();
        System.out.println("The month is " + months[monthNumber - 1]);
    }

}
