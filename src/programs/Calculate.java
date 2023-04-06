package programs;

import java.util.Scanner;

public class Calculate {

    int x;
    int y;

    public Calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What action do you want to perform?\n" +
                "1: add\n" +
                "2: subtract\n" +
                "3: multiply\n" +
                "4: divide");

        switch (scanner.nextInt()) {
            case 1 -> {
                action();
                int add = x + y;
                System.out.println("Addition result: " + add);
            }
            case 2 -> {
                action();
                int subtract = x - y;
                System.out.println("Subtraction result: " + subtract);
            }
            case 3 -> {
                action();
                int multiply = x * y;
                System.out.println("Multiplication result: " + multiply);
            }
            case 4 -> {
                action();
                try {
                    int divide = x / y;
                    System.out.println("Division result: " + divide);
                } catch (ArithmeticException a) {
                    System.out.println("Don't divide by 0");
                }
            }
        }


    }

    public void action() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        x = scanner.nextInt();
        System.out.println("Enter second number: ");
        y = scanner.nextInt();
    }

}
