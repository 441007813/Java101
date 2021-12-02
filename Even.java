import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int var1 = scan.nextInt();
        if(var1 % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }      
}
