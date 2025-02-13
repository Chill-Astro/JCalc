import java.util.Scanner;
public class JavaCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PyCalc : A Simple and Lightweight Calculator. Made in Python!");
        System.out.println();
        System.out.println("Select a Mathematical Operation : ");
        System.out.println();
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponents (x^y)");
        System.out.println("6. Square Root");
        System.out.println("7. Cube Root");
        System.out.println("8. Approximate / Rounding");
        System.out.println("9. Heron's Formula");
        System.out.println("10. Simple Interest");
        System.out.println("11. Compound Interest");
        System.out.println("12. Exit Program");

        while(true) {
            System.out.println();
            System.out.print("Enter choice [ 1 - 12 ] : ");
            String ch = sc.next();
            System.out.println();

            if (ch.equals("1") || ch.equals("2") || ch.equals("3") || ch.equals("4") || ch.equals("5") || ch.equals("6") || ch.equals("7") || ch.equals("8") || ch.equals("9") || ch.equals("10") || ch.equals("11") || ch.equals("12")) {
                if (ch.equals("1")) {
                    System.out.print("Enter first number : ");
                    double x = sc.nextDouble();
                    System.out.print("Enter second number : ");
                    double y = sc.nextDouble();
                    System.out.println(x + " + " + y + " = " + (x + y));

                } else if (ch.equals("2")) {
                    System.out.print("Enter first number : ");
                    double x = sc.nextDouble();
                    System.out.print("Enter second number : ");
                    double y = sc.nextDouble();
                    System.out.println(x + " - " + y + " = " + (x - y));

                } else if (ch.equals("3")) {
                    System.out.print("Enter first number : ");
                    double x = sc.nextDouble();
                    System.out.print("Enter second number : ");
                    double y = sc.nextDouble();
                    System.out.println(x + " * " + y + " = " + (x * y));

                } else if (ch.equals("4")) {
                    System.out.print("Enter first number : ");
                    double x = sc.nextDouble();
                    System.out.print("Enter second number : ");
                    double y = sc.nextDouble();
                    System.out.println(x + " / " + y + " = " + (x / y));
                } else if (ch.equals("5")) {
                    System.out.print("Enter first number : ");
                    double x = sc.nextDouble();
                    System.out.print("Enter second number : ");
                    double y = sc.nextDouble();
                    System.out.println(x + " ^ " + y + " = " + Math.pow(x, y));
                } else if (ch.equals("6")) {
                    System.out.print("Enter a number : ");
                    double x = sc.nextDouble();
                    System.out.println("Root x = " + Math.sqrt(x));
                } else if (ch.equals("7")) {
                    System.out.print("Enter a number : ");
                    double x = sc.nextDouble();
                    System.out.println("C. Root x = " + Math.cbrt(x));
                } else if (ch.equals("8")) {
                    System.out.print("Enter a number : ");
                    double x = sc.nextDouble();
                    System.out.println((long)Math.round(x)); // Casting to long as Math.round(double) returns long
                } else if (ch.equals("9")) {
                    System.out.println("NOTE: Some Calculations may print 0.0 depending on the values!");
                    System.out.println();
                    System.out.print("Enter the first side [a] : ");
                    double a = sc.nextDouble();
                    System.out.print("Enter the second side [b] : ");
                    double b = sc.nextDouble();
                    System.out.print("Enter third side [c] : ");
                    double c = sc.nextDouble();
                    double s = a + b + c;
                    System.out.println("Perimeter =" + s);
                    s /= 2;
                    System.out.println("s = " + s);
                    double ar = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                    System.out.println("Area = " + ar);
                } else if (ch.equals("10")) {
                    System.out.print("Enter the Principal : ");
                    double p = sc.nextDouble();
                    System.out.print("Enter the Rate [ as a percentage, ex : 10 for 10% ] : ");
                    double r = sc.nextDouble();
                    System.out.print("Enter the Time [ Years ] : ");
                    double t = sc.nextDouble();
                    double si = p * r * t;
                    si /= 100;
                    System.out.println("Simple Interest " + si);
                    System.out.println("Amount = " + (si + p));
                } else if (ch.equals("11")) {
                    System.out.println("Compound Interest Calculation");
                    System.out.println();
                    System.out.print("Enter the Principal : ");
                    double p = sc.nextDouble();
                    System.out.print("Enter the Rate [ as a percentage, ex : 10 for 10% ] : ");
                    double r = sc.nextDouble();
                    System.out.print("Enter the number of times interest is compounded per year: ");
                    double n = sc.nextDouble();
                    System.out.print("Enter the Time [ Years ] : ");
                    double t = sc.nextDouble();
                    double a = p * Math.pow(((100 + r) / 100), (n * t));
                    double ci = a - p;
                    System.out.println("Compound Interest = " + ci);
                    System.out.println("Amount = " + a);
                } else if (ch.equals("12")) {
                    System.out.println();
                    System.out.println("Exiting Program....");
                    System.exit(0);
                }

                System.out.print("Do you want to do another calculation? (y/n): ");
                String next_calc = sc.next();
                if (next_calc.equalsIgnoreCase("n") || next_calc.equalsIgnoreCase("no")) {
                    break;
                }
            } else {
                System.out.println("Please enter a Valid Input! Restarting the Program...");
            }
        }
        sc.close();
    }
}