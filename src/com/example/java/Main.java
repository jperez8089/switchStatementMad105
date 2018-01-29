package com.example.java;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter I number between 1 and 10 so I can translate");
        String input = sc.nextLine();//User input
        int spanishNumber = Integer.parseInt(input);

        switch  (spanishNumber ) {
            case 1:
                System.out.println("The number 1 is Uno in Spanish");//1 - 10 in Spansh
                break;
            case 2:
                System.out.println("The number 2 is Dos in Spanish");
                break;
            case 3:
                System.out.println("The number 3 is Tres in Spanish");
                break;
            case 4:
                System.out.println("The number 4 is Cuatro in Spanish");
                break;
            case 5:
                System.out.println("The number 5 is Cinco in Spanish");
                break;
            case 6:
                System.out.println("The number 6 is Seis in Spanish");
                break;
            case 7:
                System.out.println("The number 7 is Siete in Spanish");
                break;
            case 8:
                System.out.println("The number 8 is Ocho in Spanish");
                break;
            case 9:
                System.out.println("The number 9 is Nueve in Spanish");
                break;
            case 10:
                System.out.println("The number 10 is Diez in Spanish");
                break;
            default:
                System.out.println("Please stay between 1 and 10");
        }



    }
}
