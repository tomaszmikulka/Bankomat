import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args){
        int kwota = 10000;
        Scanner sc=new Scanner(System.in);
        System.out.println("Twoje dostępne saldo to: " + kwota + " Ile chcesz wypłacić?");
        int wyplata =sc.nextInt();
        System.out.println("Wypłaciłeś "+ wyplata + ". Twoje dostępne saldo to: " + (kwota-wyplata));
    }
}
