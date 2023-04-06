package programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddUser {

    String name;
    String lastName;
    int yearOfBirth;


    public AddUser() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter last name: ");
        lastName = scanner.nextLine();
        System.out.println("Enter year of birth: ");
        yearOfBirth = scanner.nextInt();

        File file = new File("C:\\Users\\mateu\\OneDrive\\Desktop\\users.txt");
        PrintWriter save = new PrintWriter(file);
        save.println(name);
        save.println(lastName);
        save.println(yearOfBirth);
        save.close();

    }
}
