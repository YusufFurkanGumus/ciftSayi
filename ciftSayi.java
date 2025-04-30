import java.util.Scanner;

public class ciftSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.println("Bir sayı giriniz");
        sayi = input.nextInt();
        System.out.println("0'dan" + sayi + "'e kadar olan çift sayılar:");

        for(int i = 0; i <= sayi; i++){
            if(i % 2 ==0) {
                System.out.println(i + "");
            }

        }
        input.close();




    }
}
