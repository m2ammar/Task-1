import java.util.Scanner;

public class MultiRToP {

    public static double retRent(double rent, int days){
        return rent*days;
    }

    //Method2
    public static void carAvail(String name) {
        String cars[] = {"Corolla", "Civic", "Cultus", "Sportage" };
        boolean found=false;


        for (String car : cars) {
            if (name.equalsIgnoreCase(car)) {
                found = true;
                break;
            }
        }
            if(found){
            System.out.println(name + " is Available");
        } else {
            System.out.println(name + " not Available");
        }
    }

    //Method3
    public static void discount(double amount){

        if(amount>8000){
            amount=amount-(amount*(50.0/100));
            System.out.println("The total amount after 50% discount is "+amount);
        } else if (amount>4000) {
            amount=amount-(amount*(20.0/100));
            System.out.println("The total amount after 20% discount is "+amount);
        }else if(amount>2000) {
            amount = amount - (amount * (10.0 / 100));
            System.out.println("The total amount after 10% discount is " + amount);
        }else {
            System.out.println("The total amount  is "+amount);
        }

    }


    //Method4
    public static void receipt(String name, int days, double total){
        System.out.println("---------------------------------------");
        System.out.println("Car Name: "+name);
        System.out.println("Total Days Rented: "+days);
        System.out.println("Total Amount: "+total+" PKR");
        System.out.println("Thank you for choosing our service!");
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rent per day");
        double rent=sc.nextDouble();

        System.out.println("How many days have you rented a car");
        int day=sc.nextInt();

        double total= retRent(rent, day);
        System.out.println("The total cost for "+day+" day renting this car is "+total);
        sc.nextLine();

        //Method2
        System.out.println("Enter a car to check  if it is available or not");
        String name=sc.nextLine().trim();

        carAvail(name);

        //Method3
        System.out.println("Enter total to check if is there any discount available for you");
        double amount=sc.nextDouble();
        sc.nextLine();

       discount(amount);

       //Method4
        System.out.println("Enter name of rented car");
        String car=sc.nextLine();

        System.out.println("Enter how many days have you rented a car");
        int days=sc.nextInt();

        System.out.println("Enter total Bill");
        double totalBill=sc.nextDouble();

        receipt(car, days, totalBill);

    }
}