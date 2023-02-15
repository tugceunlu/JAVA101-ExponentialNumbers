import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a , b, x= 1 ;
        System.out.print("Tabanı giriniz: ");
        a = input.nextInt();
        System.out.print("Üssü giriniz: ");
        b = input.nextInt();

        for (int i = 1; i<=b; i++){
             x *= a;
        }

        System.out.print("Cevap: "+x);



    }
}
