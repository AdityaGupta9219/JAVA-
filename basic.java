 import java.util.Scanner;
 class basic{
    public static void main(String[] args)
    {
        System.out.println("hello aditya");
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number :");
        int number = scanner.nextInt();
        System.out.println("given number is "+number);
        scanner.close();
    }
}