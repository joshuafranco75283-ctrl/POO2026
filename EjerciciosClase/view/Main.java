package view;

import domain.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int option = 0;
        System.out.println("Welcome to the menu of calculus of area and perimeter of geometric figures");
        System.out.println("How many geometric figures would you like to register?");
        int numshapes = Integer.parseInt(scanner.nextLine());
        Shape[] shapes = new Shape[numshapes];
        do { 
            System.out.println("What woulf you like to do?");
            System.out.println("1. Register a geometric figure");
            System.out.println("2. Show the current almacenated figures");
            System.out.println("3. Search your figure by ID and show its information");
            System.out.println("4. Calculate the area and perimeter of all the figures");
            System.out.println("5. Exit");
            option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    System.out.println("You have selected the option to register a geometric figure");
                    break;
                case 2:
                    System.out.println("You have selected the option to show the current almacenated figures");
                    break;
                case 3:
                    System.out.println("You have selected the option to search your figure by ID and show its information");
                    break;
                case 4:
                    System.out.println("You have selected the option to calculate the area and perimeter of all the figures");
                    break;
                case 5:
                    System.out.println("You have selected the option to exit");
                    break;
            }
        } while (option!=5);
    }
}