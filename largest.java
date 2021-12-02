import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
    System.out.println("Entar a Number 1");   
    int var1 = scan.nextInt();
    System.out.println("Entar a Number 2");
    int var2 = scan.nextInt();
    System.out.println("Entar a Number 3");
    int var3 = scan.nextInt();
      
      if (var1 > var2 && var1 > var3){
          System.out.println(var1);
      }else if (var2 > var1 && var2 > var3){
          System.out.println(var2);
      }else {
          System.out.println(var3);
      }   
}
    }
