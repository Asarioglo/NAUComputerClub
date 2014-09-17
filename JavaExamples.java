/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asarioglo
 */
import java.util.Scanner;

public class JavaExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }
    
    public static int add(int num1, int num2) {
        return (num1 + num2);
    }
    
    public static int subtract(int num1, int num2) {
        return (num1 - num2);
    }
    
    public static int multiply(int num1, int num2) {
        return (num1 * num2);
    }
    
    public static int divide(int num1, int num2) {
        return (num1 / num2);
    }

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers, and the operator between them \n"
                + "Two numbers, and operator between then separated by space, in form a + b");
        String input = scan.nextLine();
        String[] tokens = input.split(" ");
        if(tokens.length != 3) {
            System.out.println("Invalid input, try again \n"
                    + "Do not Forget:");
            menu();
        } else {
            char operator = tokens[1].charAt(0);
            int number1 = Integer.parseInt(tokens[0]);
            int number2 = Integer.parseInt(tokens[2]);
            int answer = 0;
            switch(operator) {
                case '+': 
                    answer = add(number1, number2);
                    break;
                case '-': 
                    answer = subtract(number1, number2);
                    break;
                case '*': 
                    answer = multiply(number1, number2);
                    break;
                case '/': 
                    answer = divide(number1, number2);
                    break;
                default: 
                    System.out.print("Invalid input!!!!!");
                    break;
            }
            System.out.println(answer);
            menu();
        }
    }
}
