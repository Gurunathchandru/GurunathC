import java.util.Scanner;

class Calculator {
    private double a;
    private double b;
    private String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public double calculate() {
        switch (operation) {
            case "addition":
                return a + b;
            case "subtraction":
                return a - b;
            case "multiplication":
                return a * b;
            case "division":
                if (b != 0) return a / b;
                else throw new ArithmeticException("Division by zero");
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Enter type of operation (Addition, Subtraction, Multiplication, Division): ");
        String op = sc.nextLine();

        Calculator calc = new Calculator(a, b, op);
        try {
            double result = calc.calculate();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
