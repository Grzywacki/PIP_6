import java.util.Scanner;
public class zad_2 {
    public static void main(String[] args) {
        //zad2
        Scanner sc = new Scanner(System.in);
        System.out.print("podaj from");
        int from = sc.nextInt();
        System.out.print("podaj to");
        int to = sc.nextInt();
        System.out.print("podaj dzielnik");
        int d = sc.nextInt();
        int i = 0;
        for(;from<=to; from++) {
            if ((from%d)==0) {
                i+=from;
            }

        }
        System.out.print(i);
    }
}