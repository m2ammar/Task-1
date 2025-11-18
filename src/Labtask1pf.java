import java.sql.SQLOutput;
import java.util.Scanner;

public class Labtask1pf {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\"Hello " + name + ", you are " + age +" years old!\"");


        System.out.println("Enter your favorite color ");
        String color = scanner.nextLine();

        System.out.println("\"Wow! " + color + " is a beautiful choice\"");

        System.out.println("Enter what's the day today");
        String day = scanner.nextLine();

        System.out.println("\"Happy " + day + "!\"");

        System.out.println("Enter today's temperature: ");
        int temperature = scanner.nextInt();

        System.out.println("\"The recorded temperature today is "+ temperature +"ºC\"");
        scanner.nextLine();

        System.out.println("Enter your city: ");
        String city = scanner.nextLine();

        System.out.println("Enter your country: ");
        String country = scanner.nextLine();

        System.out.println("You live in " + city + ","+ country + ".\"");


    }
}
