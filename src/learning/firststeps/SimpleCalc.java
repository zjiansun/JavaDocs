package learning.firststeps;
import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operation (+,-,x,/,**) or type 'info' to learn more");

        String opType = sc.nextLine();
        switch (opType){
            case "+":
                System.out.println("Enter the first value: ");
                int a = sc.nextInt();
                System.out.println("Enter the second value:");
                int b = sc.nextInt();
                System.out.println("RESULT: " + addValues(a,b));
                break;
            case "-":
                System.out.println("Enter the first value: ");
                int c = sc.nextInt();
                System.out.println("Enter the second value:");
                int d = sc.nextInt();
                System.out.println("RESULT: " + subValues(c,d));
                break;
            case "x":
                System.out.println("Enter the first value: ");
                int e = sc.nextInt();
                System.out.println("Enter the second value:");
                int f = sc.nextInt();
                System.out.println("RESULT: " + multiplyValues(e,f));
                break;
            case "/":
                System.out.println("Enter the first value: ");
                int g = sc.nextInt();
                System.out.println("Enter the second value:");
                int h = sc.nextInt();
                System.out.println("RESULT: " + divideValues(g,h));
                break;
            case "**":
                System.out.println("Enter the first value: ");
                int i = sc.nextInt();
                System.out.println("Enter the power value:");
                int j = sc.nextInt();
                System.out.println("RESULT: " + exponentValues(i,j));
                break;
            case "info":
                System.out.println("+: Adds two values together");
                System.out.println("-: Subtracts the second value from the first");
                System.out.println("x: Multiples two values together");
                System.out.println("/: Divides the second value from the first");
                System.out.println("**: Raises the first value to power of the second value");
                break;
            default:
                System.out.println("Invalid input! Type 'info' to learn more");
                break;
        }
    }

    static int addValues(int a, int b){
        return a+b;
    }
    static int subValues(int a, int b){
        return a-b;
    }
    static int multiplyValues(int a, int b){
        return a*b;
    }
    static String divideValues(int a, int b){
        String v = String.valueOf(Math.round(a/b));
        String r = String.valueOf(Math.round(a%b));
        return v + "..." + r;
    }
    static int exponentValues(int a, int exp){
        return (int)Math.pow(a,exp);
    }
}
