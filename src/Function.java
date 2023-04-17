import programs.User;
import programs.Calculator;

import java.util.Scanner;

public class Function {
    User user = new User();

    public void program() {

        int userSelected;

        System.out.println("Welcome!");
        while (true) {
            System.out.println(this);
            userSelected = MenuData();
            switch (userSelected) {
                case 1:
                    user.addUser();
                    break;
                case 2:
                    new Calculator();
                    break;
                case 3:
                    user.displayUser();
                    break;
                case 4:
                    System.out.println("Bye");
                    System.exit(0);
                default:
                    System.out.println("Incorrect data");
                    break;
            }
        }
    }

    public static int MenuData() {
        int selection;
        Scanner sc = new Scanner(System.in);
        selection = sc.nextInt();
        return selection;
    }


    @Override
    public String toString() {
        return "\nWhat's your command? \n" +
                "1: add user \n" +
                "2: open calculator \n" +
                "3: show list of users \n" +
                "4: exit";
    }
}


