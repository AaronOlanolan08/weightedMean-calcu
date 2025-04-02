package olanolan;

import java.util.Scanner;

/**
 *
 * @author New User
 */
public class WeightedMean {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalMean = 0;
        double overallMean = 0;

         System.out.print("Enter the total number of responses: ");
        int responses = scanner.nextInt();

        for (int j = 0; j < 5; j++) {
            double meanSum = 0;
            for (int i = 0; i < 4; i++) {
                int fives = scanner.nextInt();
                int fours = scanner.nextInt();
                int threes = scanner.nextInt();
                int twos = scanner.nextInt();
                int ones = scanner.nextInt();

                int sum = 0;

                sum += fives * 5;
                sum += fours * 4;
                sum += threes * 3;
                sum += twos * 2;
                sum += ones * 1;

                double mean = (double) sum / responses;

                System.out.println("Weighted mean: " + mean);

                meanSum += mean;
            }
            totalMean = meanSum / 4;
            String category = "";
            switch (j) {
                case 0 -> category = "Activity Design";
                case 1 -> category = "Activity Objectives";
                case 2 -> category = "Speakers";
                case 3 -> category = "Facilities/Arrangements";
                case 4 -> category = "Desired Outcomes";
            }
            System.out.println(category + " mean: " + totalMean);
            overallMean += totalMean;
        }

        double overall = (double) overallMean / 5;
        System.out.println("Overall mean: " + overall);
    }
}
