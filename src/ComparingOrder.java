 import java.util.Scanner; //Problem:5.7

public class ComparingOrder{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        if (num1 < num2 && num2 < num3){
            System.out.println("Increasing");
        } else if (num1 > num2 && num2 > num3){
            System.out.print("Decreasing");
        } else {
            System.out.print("Neither");
        }
    }
}