import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int var;
        System.out.println("Entar a Number");
        var = scan.nextInt();
        var %= 2;
        switch (var){
            case 0:
                System.out.println("E");
                break;
             default:
             System.out.println("O");   
        }
        
    }
}
