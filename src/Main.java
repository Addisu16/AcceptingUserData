import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2023;
        try {
            System.out.println(userDataAccepting(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));

        }

    }

    public static String userDataAccepting(int currentYear) {
        // currentYear = 2023;
        String name = System.console().readLine("Hi,What is your name?");
        System.out.println(name + " Thanks for confirmed your name");
        String userBorn = System.console().readLine("what year you're born in: ");
        int age = Integer.parseInt(userBorn);
        int yourAge = currentYear - age;

        return "you are " + yourAge + " years old";

    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi,what's your name");
        String name = scanner.nextLine();
        System.out.println("What year you're born in");
        String dateOfBirth = scanner.nextLine();

        //String name = System.console().readLine("Hi,What is your name?");
        // System.out.println(name + " Thanks for confirmed your name");
        //String userBorn = System.console().readLine("what year you're born in: ");
        int age = Integer.parseInt(dateOfBirth);
        int yourAge = currentYear - age;
        try {
            if (age > currentYear)
                System.out.println("Enter a valid age number");
        } catch (Exception e) {
            System.out.println("Continue");
            if (age < currentYear)
                return "you're " + yourAge + " years old";
        }
        return "";
    }
    }



