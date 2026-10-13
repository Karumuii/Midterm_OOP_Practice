package SecondPack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         
         Scanner sn = new Scanner(System.in);
         
         System.out.print("Employee Type:");
         System.out.println("1. Full-Time");
         System.out.println("2. Part-Time");
         int choice;
         
         Workers work;
         while(true){
              System.out.println("Enter your choice: ");
              
              if (sn.hasNextInt()){
                  choice = sn.nextInt();
                  
                  if(choice == 1){
                      work = new FullTime();
                  }
              }
              
         }
         
         
    }
}
