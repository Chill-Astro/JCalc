import java.util.Scanner;
public class JvCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("JCalc : A Simple and Lightweight Calculator. Made in Java!");
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

        while (true) {
            System.out.println();
            System.out.print("Enter choice [ 1 - 12 ] : ");
            String ch = sc.next();
            System.out.println();

            switch (ch) {
                case "1": // Addition
                    System.out.print("Enter first number : ");
                    double num1_add = sc.nextDouble();
                    System.out.print("Enter second number : ");
                    double num2_add = sc.nextDouble();
                    System.out.println(num1_add + " + " + num2_add + " = " + (num1_add + num2_add));
                    break;
                case "2": // Subtraction
                    System.out.print("Enter first number : ");
                    double num1_sub = sc.nextDouble();
                    System.out.print("Enter second number : ");
                    double num2_sub = sc.nextDouble();
                    System.out.println(num1_sub + " - " + num2_sub + " = " + (num1_sub - num2_sub));
                    break;
                case "3": // Multiplication
                    System.out.print("Enter first number : ");
                    double num1_mul = sc.nextDouble();
                    System.out.print("Enter second number : ");
                    double num2_mul = sc.nextDouble();
                    System.out.println(num1_mul + " * " + num2_mul + " = " + (num1_mul * num2_mul));
                    break;
                case "4": // Division
                    System.out.print("Enter first number : ");
                    double num1_div = sc.nextDouble();
                    System.out.print("Enter second number : ");
                    double num2_div = sc.nextDouble();
                    System.out.println(num1_div + " / " + num2_div + " = " + (num1_div / num2_div));
                    break;
                case "5": // Exponents
                    System.out.print("Enter base (x) : ");
                    double base_exp = sc.nextDouble();
                    System.out.print("Enter exponent (y) : ");
                    double exponent_exp = sc.nextDouble();
                    System.out.println(base_exp + " ^ " + exponent_exp + " = " + Math.pow(base_exp, exponent_exp));
                    break;
                case "6": // Square Root
                    System.out.print("Enter a number : ");
                    double num_sqrt = sc.nextDouble();
                    System.out.println("Root " + num_sqrt + " = " + Math.sqrt(num_sqrt));
                    break;
                case "7": // Cube Root
                    System.out.print("Enter a number : ");
                    double num_cbrt = sc.nextDouble();
                    System.out.println("C. Root " + num_cbrt + " = " + Math.cbrt(num_cbrt));
                    break;
                case "8": // Rounding
                    System.out.print("Enter a number : ");
                    double num_round = sc.nextDouble();
                    System.out.println((long) Math.round(num_round));
                    break;
                case "9": // Heron's Formula
                    System.out.println("NOTE: Some Calculations may print 0.0 depending on the values!");
                    System.out.println();
                    System.out.print("Enter the first side [a] : ");
                    double side_a = sc.nextDouble();
                    System.out.print("Enter the second side [b] : ");
                    double side_b = sc.nextDouble();
                    System.out.print("Enter third side [c] : ");
                    double side_c = sc.nextDouble();
                    double perimeter = side_a + side_b + side_c;
                    System.out.println("Perimeter =" + perimeter);
                    double s = perimeter / 2;
                    System.out.println("s = " + s);
                    double area = Math.sqrt(s * (s - side_a) * (s - side_b) * (s - side_c));
                    System.out.println("Area = " + area);
                    break;
                case "10": // Simple Interest
                    System.out.print("Enter the Principal : ");
                    double principal_si = sc.nextDouble();
                    System.out.print("Enter the Rate [ as a percentage, ex : 10 for 10% ] : ");
                    double rate_si = sc.nextDouble();
                    System.out.print("Enter the Time [ Years ] : ");
                    double time_si = sc.nextDouble();
                    double simpleInterest = (principal_si * rate_si * time_si) / 100;
                    System.out.println("Simple Interest " + simpleInterest);
                    System.out.println("Amount = " + (simpleInterest + principal_si));
                    break;
                case "11": // Compound Interest
                    System.out.println("Compound Interest Calculation");
                    System.out.println();
                    System.out.print("Enter the Principal : ");
                    double principal_ci = sc.nextDouble();
                    System.out.print("Enter the Rate [ as a percentage, ex : 10 for 10% ] : ");
                    double rate_ci = sc.nextDouble();
                    System.out.print("Enter the number of times interest is compounded per year: ");
                    double n_ci = sc.nextDouble();
                    System.out.print("Enter the Time [ Years ] : ");
                    double time_ci = sc.nextDouble();
                    double amount_ci = principal_ci * Math.pow(((100 + rate_ci) / 100), (n_ci * time_ci));
                    double compoundInterest = amount_ci - principal_ci;
                    System.out.println("Compound Interest = " + compoundInterest);
                    System.out.println("Amount = " + amount_ci);
                    break;
                case "12":
                    System.out.println();
                    System.out.println("Exiting Program....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a Valid Input! Restarting the Program...");
                    break;
            }

            if (!ch.equals("12")) {
                System.out.print("Do you want to do another calculation? (y/n): ");
                String next_calc = sc.next();
                if (next_calc.equalsIgnoreCase("n") || next_calc.equalsIgnoreCase("no")) {
                    break;
                }
            }
        }
        sc.close();
    } // end of main
} // end of class