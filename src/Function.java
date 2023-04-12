import programs.AddUser;
import programs.Calculate;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Function {

    public void program() throws FileNotFoundException {
        int userSelected;

        System.out.println(toString());
        userSelected = MenuData();
        switch (userSelected) {
            case 1:
                AddUser addUser = new AddUser();
                break;
            case 2:
                Calculate calculate = new Calculate();
                break;
            default:
                System.out.println("Bye");
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
        return "What's your command? \n" +
                "1: add user \n" +
                "2: open calculator \n" +
                "3: exit";
    }
}


