package Abstraction;

import java.util.Scanner;

public class Main {
    private static int readRange(Scanner sn,String statement, int min, int max){
        while(true){
            System.out.print(statement);
            String input = sn.nextLine().trim();
            
            try{
                int value = Integer.parseInt(input);
                
                if(value >= min && value <= max){
                    return value;
                }
                System.out.println("Please Enter a Number between " + min + " and " + max);
            } catch (Exception e){
                System.out.println("Invalid Number. Please enter a valid one.");
            }
        }
    }
    //                                              String state
    private static void valid(int choice,Scanner sn){
           System.out.println();

           int num1 = readInt(sn, "Enter first num: ");
           int num2 = readInt(sn, "Enter second num: ");

           Calc c;
           if (choice == 1) {
               c = new Add();
           } else {
               c = new Sub();
           }

           c.calculate(num1, num2);
           c.display();

    }
    
    private static int readInt(Scanner sn, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sn.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Try again.");
            }
        }
    }
    public static void main(String[] args) {
         Scanner sn = new Scanner(System.in);
         System.out.println("1. Addition");
         System.out.println("2. Subtraction");
        
         int choice = readRange(sn, "Enter your choice (1-2): ", 1, 2);
         
         if (choice == 1){
             valid(choice, sn);
         } else if (choice == 2){
             valid(choice, sn);
         } else {
             System.out.println("Invalid Number");
         }
        
        
         
       
         
    }
}
