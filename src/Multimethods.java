import java.util.Scanner;

public class Multimethods {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to find their sum: ");
        int a =scanner.nextInt();

        System.out.println("Enter another number: ");
        int b = scanner.nextInt();

        int result = calculateSum(a, b);

        System.out.println("The sum of "+ a +" and "+ b +" is "+result);

        //method 2
        System.out.println("Enter length to find area of rectangle: ");
        double length = scanner.nextDouble();

        System.out.println("Enter width of rectangle: ");
        double width = scanner.nextDouble();

        double areaOfRectangle = findArea(length, width);

        System.out.println("The area of rectangle is: "+ areaOfRectangle);

        //method 3

        System.out.println("Enter a number to find it's square: ");
        int num = scanner.nextInt();

        int square = findSquare(num);

        System.out.println("The square of "+ num +" is " +square);

        //method 4

        System.out.println("To calculate the interest Enter principal's amount: ");
        float principalsAmount = scanner.nextFloat();

        System.out.println("Enter rate: ");
        float rate = scanner.nextFloat();

        System.out.println("Enter time: ");
        float time = scanner.nextFloat();

        float interest = calculateInterest(principalsAmount, rate, time);

        System.out.println("The interest is: "+ interest);

        //method 5
        System.out.println("Enter a number to find average: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter another number: ");
        int num2 = scanner.nextInt();

        System.out.println("Last one: ");
        int num3 = scanner.nextInt();

        int average = findAverage(num1, num2, num3);

        System.out.println("The average of "+ num1 +", "+ num2 + " and "+ num3 + " is: "+average);


    }
    public static int calculateSum(int a,int b){

        return a + b;
    }
    public static double findArea(double length,double width){

        return length * width;
    }
    public static int findSquare(int num)
    {
        return num * num;
    }
    public static float calculateInterest(float principalsAmount, float rate, float time){
        return (principalsAmount * rate * time) / 100;
    }
    public static int findAverage(int num1, int num2, int num3){
        return (num1 + num2  +num3) / 3;
    }
}
