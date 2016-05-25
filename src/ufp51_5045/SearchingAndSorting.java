/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufp51_5045;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author master
 */
public class SearchingAndSorting {
    
    // attributes
    Scanner userInput;
    int store[] = new int[]{1, 2, 3, 4, 5};   // using for integerSearch() method
    // This is a special method called a constructor
    // It is called when the object is created
    SearchingAndSorting() {
        // attributes
        
        userInput = new Scanner(System.in);

    }
    
    
    
    // Define a method to acomplish each of the tasks you have been set
    

    // method to display a prompt string
    // and read a single integer from the user
    // Note there is no check for invalid input
    // returns the value of the integer entered by the user
    int getInteger(String promptStr) {
        String inputStr;
        int value;
        System.out.println(promptStr);
        inputStr = userInput.nextLine();
        value = Integer.parseInt(inputStr);
        return (value);
    }

    // method to display a prompt string and read a single real number from the user
    // Note there is no check for invalid input
    // returns the value of the real number entered by the user as a float type
    float getReal(String promptStr) {
        String inputStr;
        float value;
        System.out.println(promptStr);
        inputStr = userInput.nextLine();
        value = Float.parseFloat(inputStr);
        return (value);
    }

    // method to display a prompt string
    // and read a text string from the user
    // Note there is no check for invalid input
    // returns the value of the text entered by the user
    String getText(String promptStr) {
        String inputStr;
        String valueStr;
        System.out.println(promptStr);
        valueStr = userInput.nextLine();
        return (valueStr);
    }

    
 
    boolean linearSearch(int[] arr, int target) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == target) {
                return true;
            }
            ++i;
        }
        return false;
    }

    void PlanetWeight() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in Kgs: \n");
        DecimalFormat df = new DecimalFormat("#.00");

        double humanWeight = input.nextDouble();
        double mass = humanWeight / 9.8;

        double timePeriod;
        double earthTimePeriod = 2 * Math.PI * Math.sqrt(0.5 / 1);

        System.out.print("Your mass on Earth is: " + mass + "\n");
        System.out.print("The time period of a 0.5m pendulum on Earth is: " + df.format(earthTimePeriod) + "\n");

        System.out.print("Choose your planetary body: \n 1. Mercury \n 2. Venus \n 3. Moon \n 4. Mars \n 5. Jupiter \n 6. Saturn \n 7. Uranus \n 8. Neptune\nType the number you want: ");
        Scanner input2 = new Scanner(System.in);
        int planetNumInt = input2.nextInt();

        int switchArray[] = {1, 2, 3, 4, 5, 6, 7, 8};

        switch (planetNumInt) {
            case 1:
                if (linearSearch(switchArray, 1)) {
                    planetNumInt = (int) (humanWeight * 0.378);
                    System.out.println("Your weight on Mercury is " + df.format(planetNumInt) + "kg\n");
                    timePeriod = 2 * Math.PI * Math.sqrt(0.5 / 0.378);
                    System.out.println("The time period of a 0.5m pendulum on Mercury is: " + df.format(timePeriod) + "s\n");
                }
                break;

            case 2:
                if (linearSearch(switchArray, 2)) {
                    planetNumInt = (int) (humanWeight * 0.907);
                    System.err.println("Your weight on Venus is " + df.format(planetNumInt) + "kg\n");
                    timePeriod = 2 * Math.PI * Math.sqrt(0.5 / 0.907);
                    System.out.println("The time period of a 0.5m pendulum on Venus is: " + df.format(timePeriod) + "s\n");
                }
                break;

            case 3:
                if (linearSearch(switchArray, 3)) {
                    planetNumInt = (int) (humanWeight * 0.166);
                    System.err.println("Your weight on the Moon is " + df.format(planetNumInt) + "kg\n");
                    timePeriod = 2 * Math.PI * Math.sqrt(0.5 / 0.166);
                    System.out.println("The time period of a 0.5m pendulum on Moon is: " + df.format(timePeriod) + "s\n");
                }
                break;

            case 4:
                if (linearSearch(switchArray, 4)) {
                    planetNumInt = (int) (humanWeight * 0.377);
                    System.err.println("Your weight on Mars is " + df.format(planetNumInt) + "kg\n");
                    timePeriod = 2 * Math.PI * Math.sqrt(0.5 / 0.377);
                    System.out.println("The time period of a 0.5m pendulum on Mars is: " + df.format(timePeriod) + "s\n");
                }
                break;

            case 5:
                if (linearSearch(switchArray, 5)) {
                    planetNumInt = (int) (humanWeight * 2.36);
                    System.err.println("Your weight on Jupiter is " + df.format(planetNumInt) + "kg\n");
                    timePeriod = 2 * Math.PI * Math.sqrt(0.5 / 2.36);
                    System.out.println("The time period of a 0.5m pendulum on Jupiter is: " + df.format(timePeriod) + "s\n");
                }
                break;

            case 6:
                if (linearSearch(switchArray, 6)) {
                    planetNumInt = (int) (humanWeight * 0.916);
                    System.err.println("Your weight on Saturn is " + df.format(planetNumInt) + "kg\n");
                    timePeriod = 2 * Math.PI * Math.sqrt(0.5 / 0.916);
                    System.out.println("The time period of a 0.5m pendulum on Saturn is: " + df.format(timePeriod) + "s\n");
                }
                break;

            case 7:
                if (linearSearch(switchArray, 7)) {
                    planetNumInt = (int) (humanWeight * 0.889);
                    System.err.println("Your weight on Uranus is " + df.format(planetNumInt) + "kg\n");
                    timePeriod = 2 * Math.PI * Math.sqrt(0.5 / 0.889);
                    System.out.println("The time period of a 0.5m pendulum on Uranus is: " + df.format(timePeriod) + "s\n");
                }
                break;

            case 8:
                if (linearSearch(switchArray, 8)) {
                    planetNumInt = (int) (humanWeight * 1.12);
                    System.err.println("Your weight on Neptune is " + df.format(planetNumInt) + "kg\n");
                    timePeriod = 2 * Math.PI * Math.sqrt(0.5 / 1.12);
                    System.out.println("The time period of a 0.5m pendulum on Neptune is: " + df.format(timePeriod) + "s\n");
                }
                break;

            default:
                System.out.println("Wrong number.");
                break;

        }

    }

    void HerosMethod() {
        Scanner input = new Scanner(System.in);
        final double epsilon = 0.02; // amount of precision
        double guess;       // first guess of value
        //double root;    // current estimate of sqrt(x)
        //double lroot;   // last estimate of sqrt(x)
        double value;   // number of which we're trying to find the sqrt

        // read x
        do {
            System.out.println("Enter the number: ");
            value = input.nextDouble();

            if (value < 0) {
                System.out.println("No real results.\n");
                System.out.println("Please enter a positive number. \n");
            }
        } while (value < 0);

        System.out.println("Enter your first guess of the root: \n");
        guess = input.nextDouble();

        // Hero's Method
        int iterations = 0;

        while (Math.abs((guess * guess) - value) > epsilon) {

            guess = (guess + (value / guess)) / 2.0;
            iterations++;
        }

        System.out.printf("Square root of " + value + " is %5.2f \n", guess);

        System.out.println("This value has been iterated " + iterations + " amounts of times.");

        System.out.println("Math.sqrt(value) = " + Math.sqrt(value));

    }

    // Gets search term and performs the search
    void doSearch() {
        int searchTerm;
        System.out.println(store.length);
        searchTerm = getInteger("Please enter a number: \n");

        if (intSearch(store, searchTerm)) {
            System.out.println("Integer was found. \n");
        } else {
            System.out.println(searchTerm + " was not found in the array.\n");
        }

    }

    // Searches for a specified integer within an array
    boolean intSearch(int[] intArray, int searchFor) {
        int i = 0;
        boolean found = false;

        do {
            if (intArray[i] == searchFor) {
                found = true;
            }

            i++;
            System.out.print(i + " ");
        } while (!found && i < intArray.length);

        return found;
    }

    void doSort() {
        bubbleSort(store);

    }

    void bubbleSort(int[] intArray) {
        int i;                  // index
        int j;                  // index 2
        int numSwaps = 0;       // number of swaps
        int numCompares = 0;    // number of comparisions

        for (i = 0; i < intArray.length; i++) {
            for (j = i + 1; j < intArray.length; j++) {
                int temp = 0;   // temporary placeholder for swapping numbers
                if (intArray[i] > intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;

                    numSwaps++;
                }

                numCompares++;
            }
        }

        System.out.print("Printing numbers in ascending order: \n");
        for (i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + "\n");
        }
        System.out.print("Number of swaps: " + numSwaps + "\n");
        System.out.print("Number of comparisions: " + numCompares + "\n");
    }

    void bubbleSort2(int[] intArray) {
        int i;                  // index
        int j;                  // index 2
        int numSwaps = 0;       // number of swaps
        int numCompares = 0;    // number of comparisions
        int length = intArray.length;
        boolean swapped = false;

        do {
            swapped = false;
            for (j = 0; j < length - 1; j++) {
                int temp = 0;   // temporary placeholder for swapping numbers
                if (intArray[j] > intArray[j + 1]) {
                    temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                    swapped = true;

                    numSwaps++;
                }
                numCompares++;
            }
            length--;
        } while (swapped);

        System.out.print("Printing numbers in ascending order: \n");
        for (i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + "\n");
        }
        System.out.print("Number of swaps: " + numSwaps + "\n");
        System.out.print("Number of comparisions: " + numCompares + "\n");
    }
    
}
