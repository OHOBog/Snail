import java.util.*;

public class Task {
    static double exit;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,h;
        double sum;
        //Start Data
        System.out.print("a : ");
        a = scan.nextInt();
        System.out.print("b : ");
        b = scan.nextInt();
        System.out.print("h : ");
        h = scan.nextInt();
        
        sum = a-b;
        exit = h/sum;
        
        if(exit <= 0 & sum != 0) {
            System.out.println("Impossible");
        }else {
            System.out.println(exit +" днів");
        }
    }
}