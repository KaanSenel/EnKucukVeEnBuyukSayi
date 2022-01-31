import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int max=0;
        int min=0;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz : ");
        int adet=scanner.nextInt();
        int sayi;
        for (int i = 0; i < adet; i++) {
            System.out.print("Sayı giriniz :");
            sayi=scanner.nextInt();
            if(max<sayi) {
                max = sayi;
            }
            if(min>sayi){
                min=sayi;
            }
        }
        System.out.println("max : "+max);
        System.out.println("min : "+min);
    }
}
