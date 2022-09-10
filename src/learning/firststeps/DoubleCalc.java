package learning.firststeps;
import java.util.Scanner;

public class DoubleCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operation (+,-,x,/) or type 'info' to learn more");

        String opType = sc.nextLine();
        switch (opType){
            case "+":
                System.out.println("Enter the first value to add");
                double a = sc.nextDouble();
                System.out.println("Enter the second value to add");
                double b = sc.nextDouble();
                System.out.println("RESULT: "+addValue(a,b));
                break;

            case "-":
                System.out.println("Enter the first value");
                double c = sc.nextDouble();
                System.out.println("Enter the second value to subtract the first from");
                double d = sc.nextDouble();
                System.out.println("RESULT: "+subValue(c,d));
                break;

            case "x":
                System.out.println("Enter the first value to multiply");
                double e = sc.nextDouble();
                System.out.println("Enter the second value to be multiple with the first");
                double f = sc.nextDouble();
                System.out.println("RESULT: "+multiplyValue(e,f));
                break;

            case "/":
                System.out.println("Enter the first value to be divided");
                double g = sc.nextDouble();
                System.out.println("Enter the second value to divide the first by");
                double h = sc.nextDouble();
                System.out.println("RESULT: "+divideValue(g,h));
                break;

            case "info":
                System.out.println("+: Adds two values together");
                System.out.println("-: Subtracts the second value from the first");
                System.out.println("x: Multiples two values together");
                System.out.println("/: Divides the second value from the first");
                break;

            default:
                System.out.println("Invalid input! Type 'info' to learn more");
                break;
        }
    }

    static double addValue(double a, double b){
        return a+b;
    }
    static double subValue(double a, double b){
        return a-b;
    }
    static double multiplyValue(double a, double b){
        return a*b;
    }
    static double divideValue(double a, double b){
        return a/b;
    }
}
