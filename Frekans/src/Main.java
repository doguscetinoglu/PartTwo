import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        // Dizideki maksimum elemanı bulma
        int maksimum = Arrays.stream(dizi).max().getAsInt();

        // Frekansları depolamak için maksimum elemanın bir fazlası kadar bir dizi oluşturma
        int[] frekanslar = new int[maksimum + 1];

        // Dizideki elemanların frekanslarını hesaplama
        for (int eleman : dizi) {
            frekanslar[eleman]++;
        }

        // Sonuçları yazdırma
        for (int i = 0; i < frekanslar.length; i++) {
            if (frekanslar[i] > 0) {
                System.out.println(i + " sayısı " + frekanslar[i] + " kere tekrar edildi.");
            }
        }
    }
}
