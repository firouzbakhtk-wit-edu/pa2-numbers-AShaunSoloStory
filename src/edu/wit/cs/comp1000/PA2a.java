package edu.wit.cs.comp1000;

import java.util.Scanner;

/*
 * This is Programming Assignment 02 Numbers
 * By Shaun Brothers
 * For Computer Science 1000-19K
 * 
 */
public class PA2a {

	// This calculates the sum and averages of all the positive numbers, negative numbers, total numbers
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int pSum = 0;
        int npSum = 0;
        int tSum = 0;
        int pCount = 0;
        int npCount = 0;

        System.out.printf("Enter five whole numbers: ");

        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();

            tSum += number;

            if (number > 0) {
                pSum += number;
                pCount++;
            } else {
                npSum += number;
                npCount++;
            }
        }

        scanner.close();

        double pAvg = 0.0;
        if (pCount > 0) {
            pAvg = (double) pSum / pCount;
        }

        double npAvg = 0.0;
        if (npCount > 0) {
            npAvg = (double) npSum / npCount;
        }

        double totalAvg = (double) tSum / 5;

        System.out.println("The sum of the " + pCount + " positive numbers: " + pSum);
        System.out.println("The sum of the " + npCount + " non-positive numbers: " + npSum);
        System.out.println("The sum of the 5 numbers: " + tSum);
        System.out.println("The average of the " + pCount + " positive numbers: " + String.format("%.2f", pAvg));
        System.out.println("The average of the " + npCount + " non-positive numbers: " + String.format("%.2f", npAvg));
        System.out.println("The average of the 5 numbers: " + String.format("%.2f", totalAvg));
	}

}
