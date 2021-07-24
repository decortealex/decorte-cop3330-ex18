/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */

import java.util.Scanner;

public class App {
    public static double convertCToF(double C) {
        return (C * 9 / 5) + 32;
    }

    public static double convertFToC(double F) {
        return (F - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String startingUnit, finalUnit;
        double startingTemp, finalTemp;

        System.out.print("Press C to convert from Fahrenheit to Celsius\nPress F to convert Celsius to Fahrenheit\n");
        startingUnit = in.nextLine();
        System.out.print("Please enter the starting temperature: ");
        startingTemp = Double.parseDouble(in.nextLine());

        finalTemp = (startingUnit.equalsIgnoreCase("F")) ? convertCToF(startingTemp)
                                                                    : convertFToC(startingTemp);

        finalUnit = (startingUnit.equalsIgnoreCase("F")) ? "F" : "C";

        System.out.printf("The temperature is %.2f%S", finalTemp, finalUnit);

    }
}
