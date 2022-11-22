import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //zad1
        Scanner sc = new Scanner(System.in);
        System.out.print("podaj from");
        int from= sc.nextInt();
        System.out.print("podaj to");
        int to= sc.nextInt();
        for(;from<=to; from++)
            System.out.print(from);
        from++;
    }

}