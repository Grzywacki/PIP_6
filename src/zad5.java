import java.util.Scanner;
public class zad5 {
    public static void main(String[] args) {
        //zad5
        System.out.println("podaj wyraz do sprawdzenia");
        Scanner sc = new Scanner(System.in);
        String wyraz= sc.nextLine();
        int a=0, b =wyraz.length() -1;
        while(a<b){
            String dropCase = wyraz.toLowerCase();
            if (dropCase.charAt(a) != dropCase.charAt(b)){
                System.out.println("to nie jest palindrom");
                System.exit(0);

            }
            a++;
            b--;
        }
        System.out.println("To jest palindrom");


    }
}