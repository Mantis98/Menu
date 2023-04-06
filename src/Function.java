import programs.AddUser;
import programs.Calculate;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Function {

    public void program() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String command = toString();

        System.out.println(command);
        switch (sc.nextInt()) {
            case 1:
                AddUser addUser = new AddUser();
                System.out.println("Person added");
                break;
            case 2:
                Calculate calculate = new Calculate();
                break;
            default:
                System.out.println("Bye");
        }
    }


    @Override
    public String toString() {
        return "What's your command? \n" +
                "1: add user \n" +
                "2: open calculator \n" +
                "3: exit";
    }
}


