import java.util.Scanner;

class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int a = 0;
        int b = num;
        while (num != 0) {
            a = num % 10 + a * 10;
            num = num / 10;

        }
        if (a == b) {

            System.out.println("The number is Palindrome");

        } else {
            System.out.println("The number is not Palindrome");
        }
        sc.close();
    }
}
