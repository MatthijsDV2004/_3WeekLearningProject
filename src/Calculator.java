import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int integer;
        String symbol;
        int numModify;
        System.out.print("Enter first integer: ");
        integer = s.nextInt();
        do {
            System.out.print("Put symbol if you want to add, subtract, multiply or divide (s to stop): ");

            symbol = s.next();

            if (symbol.equals("+")) {
                numModify = addition();
                integer += numModify;
            } else if(symbol.equals("-")){
                numModify = subtraction();
                integer -= numModify;
            } else if(symbol.equals("*")){
                numModify = multiplication();
                integer *= numModify;
            } else if(symbol.equals("/")){
                numModify = division();
                if (numModify == 0){
                    System.out.println("Undefined");
                    return;
                }
                integer /= numModify;
            }
            System.out.println("Your current number is: " + integer);
        } while (!symbol.equalsIgnoreCase("s"));
        System.out.println("Your final value is: " + integer);
    }

    public static int addition() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to add:");
        return s.nextInt();
    }

    public static int subtraction() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to subtract:");
        return s.nextInt();
    }
    public static int multiplication() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to multiply:");
        return s.nextInt();
    }
    public static int division() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to divide:");
        return s.nextInt();
    }
}
