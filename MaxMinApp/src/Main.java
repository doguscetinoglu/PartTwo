import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Sayı Giriniz! : ");
        int hedef = scan.nextInt();

        int[] dizi = {1, 3, 5, 7, 9, 11}; // Örnek dizi


        // Diziyi küçükten büyüğe sırala
        Arrays.sort(dizi);

        // En küçük en yakın sayıyı bulma
        int enKucukEnYakin = -1;
        for (int eleman : dizi) {
            if (eleman < hedef) {
                enKucukEnYakin = eleman;
            } else {
                break; // Hedef sayıdan büyük olanı bulduktan sonra döngüden çık
            }
        }

        // En büyük en yakın sayıyı bulma
        int enBuyukEnYakin = -1;
        for (int i = dizi.length - 1; i >= 0; i--) {
            if (dizi[i] > hedef) {
                enBuyukEnYakin = dizi[i];
            } else {
                break; // Hedef sayıdan küçük olanı bulduktan sonra döngüden çık
            }
        }

        // Sonuçları yazdırma
        System.out.println("Hedef sayıdan küçük en yakın sayı: " + enKucukEnYakin);
        System.out.println("Hedef sayıdan büyük en yakın sayı: " + enBuyukEnYakin);
    }
}
