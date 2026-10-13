package Abstraction;

public class Sub extends Calc{

    int num1;
    int num2;
    int result;

    @Override
    void calculate(int num1, int num2) {
        result = num1 - num2;
    }
    void display(){
        System.out.println("Result for Sub: " + result);
    }
   
    
    
}




