package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);

    ArrayList<ShowUser> userList = new ArrayList<>();

    String name;
    String surname;
    int yearOfBirth;


    public void addUser() {
        System.out.println("Enter name: ");
        name = scanner.next();
        System.out.println("Enter surname: ");
        surname = scanner.next();
        System.out.println("Enter year of birth: ");
        yearOfBirth = scanner.nextInt();
        ShowUser user = new ShowUser(name, surname, yearOfBirth);
        userList.add(user);
    }

    public void displayUser() {
        System.out.println("List of users: ");
        for (ShowUser user : userList) {
            System.out.println(user);
        }
    }
}

class ShowUser {
    private final String name;
    private final String surname;
    private final int yearOfBirth;

    public ShowUser(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Surname: " + surname +
                ", Year of birth: " + yearOfBirth;
    }
}
