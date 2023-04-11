import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double number;
        String symbol;
        double numModify;
        System.out.print("Enter first number: ");
        number = s.nextDouble();
        do {
            System.out.print("Put symbol or words if you want to add, subtract, multiply, divide, power, or sqrt (s to stop): ");

            symbol = s.next();

            if (symbol.equals("+") || symbol.equals("add")) {
                numModify = addition();
                number += numModify;
            } else if(symbol.equals("-") || symbol.equals("subtract")){
                numModify = subtraction();
                number -= numModify;
            } else if(symbol.equals("*") || symbol.equals("multiply")){
                numModify = multiplication();
                number *= numModify;
            } else if(symbol.equals("/") || symbol.equals("divide")){
                numModify = division();
                if (numModify == 0){
                    System.out.println("Undefined");
                    return;
                }
                number /= numModify;
            } else if(symbol.equals("^") || symbol.equals("power")){
                System.out.print("Enter the power: ");
                int input = s.nextInt();
                number = Math.pow(number, input);
            } else if(symbol.equals("sqrt")){
                number = Math.sqrt(number);
            }
            if(Math.floor(number) == number){
                System.out.println("Your current number is: " + fullNum(number));

            } else {
                System.out.println("Your current number is: " + number);
            }


        } while (!symbol.equalsIgnoreCase("s"));
        System.out.println("Your final value is: " + number);
    }
    public static int fullNum(double digit){
        return (int)(digit);
    }




    public static double addition() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to add:");
        return s.nextDouble();
    }

    public static double subtraction() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to subtract:");
        return s.nextDouble();
    }
    public static double multiplication() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to multiply:");
        return s.nextDouble();
    }
    public static double division() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to divide:");
        return s.nextDouble();
    }

}
