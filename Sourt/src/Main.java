import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizinin boyutunu al
        System.out.print("Dizinin boyutunu girin: ");
        int size = scanner.nextInt();

        // Dizi oluştur
        int[] array = new int[size];

        // Kullanıcıdan dizinin elemanlarını al
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < size; i++) {
            System.out.print( (i + 1) + ". Elemanı " + ": ");
            array[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sırala
        Arrays.sort(array);

        // Sıralanmış diziyi ekrana bastır
        System.out.println("Sıralanmış dizi: " + Arrays.toString(array));

        scanner.close();
    }
}
