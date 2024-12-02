package Pa2;

import java.util.Scanner;

public class Pa2 {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter five whole numbers: ");
	        int[] numbers = new int[5];
	        for (int i = 0; i < 5; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        int sumPositive = 0;
	        int sumNonPositive = 0;
	        int totalSum = 0;
	        int countPositive = 0;
	        int countNonPositive = 0;

	        for (int number : numbers) {
	            totalSum += number;
	            if (number > 0) {
	                sumPositive += number;
	                countPositive++;
	            } else {
	                sumNonPositive += number;
	                countNonPositive++;
	            }
	        }

	        double avgPositive = countPositive > 0 ? (double) sumPositive / countPositive : 0.00;
	        double avgNonPositive = countNonPositive > 0 ? (double) sumNonPositive / countNonPositive : 0.00;
	        double avgTotal = (double) totalSum / 5;

	        String positiveWord = countPositive == 1 && sumPositive != 0 ? "number" : "numbers";
	        String nonPositiveWord = countNonPositive == 1 && sumNonPositive != 0 ? "number" : "numbers";

	        System.out.printf("The sum of the %d positive %s: %d%n", countPositive, positiveWord, sumPositive);
	        System.out.printf("The sum of the %d non-positive %s: %d%n", countNonPositive, nonPositiveWord, sumNonPositive);
	        System.out.printf("The sum of the 5 numbers: %d%n", totalSum);
	        System.out.printf("The average of the %d positive %s: %.2f%n", countPositive, positiveWord, avgPositive);
	        System.out.printf("The average of the %d non-positive %s: %.2f%n", countNonPositive, nonPositiveWord, avgNonPositive);
	        System.out.printf("The average of the 5 numbers: %.2f%n", avgTotal);

	        scanner.close();
		
	}

}
