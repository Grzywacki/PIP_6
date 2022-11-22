import java.util.Scanner;
public class zad4 {
    public static void main(String[] args) {
       //zad4
        Scanner n = new Scanner(System.in);
        int liczba = n.nextInt() ;
        boolean pierwsza= true;
        for(int i=2; i<Math.sqrt(liczba); i++){
            if((liczba % i == 0)){
                pierwsza = false;
            }
        }
        if(pierwsza)System.out.println("Liczba " + liczba + " Jest liczbą pierwszą");
        else System.out.println("Liczba " + liczba + " Nie jest liczbą pierwszą");

    }
}