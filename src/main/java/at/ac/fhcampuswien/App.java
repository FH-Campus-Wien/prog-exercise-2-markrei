package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        double input = 0;
        double input2;
        int i = 1;

        System.out.print("Number " + i + ": ");
        input2 = scanner.nextDouble();

        if(input2 > 1) {
            while (input2 > 0){
                i++;
                System.out.print("Number " + i + ": ");
                input2 = scanner.nextDouble();

                if(input2 > input){
                    input = input2;
                }
            }
        } else {
            System.out.println("No number entered.");
            return;
        }

        System.out.println("The largest number is " + String.format("%.2f",input));

    }

    //todo Task 2
    public void stairs(){
        int rows;
        int v = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        rows = scanner.nextInt();

        if(rows < 0){
            System.out.println("Invalid number!");
            return;
        }

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(v + " ");
                v++;
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid(){
        final int ROWS = 6;

        for(int k = 0; k < ROWS; k++){
            for(int i = 2; i <= ROWS - k; i++){
                System.out.print(" ");
                }

            for (int j = 0; j <= k * 2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        int mark = 1;
        int nmark = 0;
        double avg = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);

            while (mark != 0){
                i++;
                System.out.print("Mark " + i + ": ");
                mark = scanner.nextInt();

                if(mark > 0 && mark < 6){
                    avg = avg + mark;
                }
                if(mark == 5){
                    nmark++;
                }
                if(mark > 5 || mark < 0){
                    System.out.println("Invalid mark!");
                    i--;
                }
            }

        if(i > 1){
            System.out.println("Average: " + String.format("%.2f",avg / (i - 1)));
        } else {
            System.out.println("Average: 0.00");
        }

        System.out.println("Negative marks: " + nmark);
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here

        final int ROWS = 4;
        final int COLS = 4;

        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){

                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args){
        App exercise2 = new App();
/*
        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();
*/
        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}