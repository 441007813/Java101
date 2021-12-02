import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float var ;
    System.out.println("Entar a Number ");   
    
    var = scan.nextFloat();
    
    if (var < 0) {
        System.out.println("negative");
    }else{
        System.out.println("positive");
    }
   
    }
    
    
}
