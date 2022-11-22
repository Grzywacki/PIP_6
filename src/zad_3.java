import java.util.Scanner;
public class zad_3 {
    public static void main(String[] args) {
        //zad3
        int i;
        int z=1;
        System.out.println("podaj liczbe");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(i=1;i<=n;i++){
            z=z*i;

        }
        System.out.println("silnia to "+z);

    }
}