import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your date of birth");
        int age = scan.nextInt();
        age = 2021 - age ;
        System.out.println(age);
    }      
}
