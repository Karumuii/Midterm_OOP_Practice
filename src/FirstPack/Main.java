package FirstPack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sn.nextLine();

        System.out.print("Enter Student ID: ");
        int id = sn.nextInt();

        int grado;
        while (true){
            System.out.print("Enter Grade: ");
            
          if (sn.hasNextInt()){
              grado = sn.nextInt();
              
              if (grado >= 60 && grado <=100){
                   Student s = new Student(name, id, grado);
                   s.display();
                  break;
              } else {
                  System.out.println("Invalid Grade.");
              }
          } else {
              System.out.println("Invalid Input. Try again");
              sn.next();
          }
        }
        
       
    }
}
