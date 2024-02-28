import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        scanner.close();

        // Sayının asal olup olmadığını kontrol et
        if (isPrime(number)) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }
    }

    // Asal sayı kontrolü için recursive metot
     static boolean isPrime(int n) {
        // 2'den küçük sayılar asal değildir
        if (n <= 1) {
            return false;
        }
        // 2 bir asal sayıdır
        if (n == 2) {
            return true;
        }
        // 2'den başlayarak n/2'ye kadar olan sayılar üzerinde kontrol yap
        return isPrimeRecursive(n, 2);
    }

    // Recursive olarak asal sayı kontrolü
    public static boolean isPrimeRecursive(int n, int divisor) {
        // Eğer bölen, n'nin karekökünden büyükse, asal olduğu kesinleşir
        if (divisor > Math.sqrt(n)) {
            return true;
        }
        // Eğer n, bölenle tam bölünüyorsa, asal değildir
        if (n % divisor == 0) {
            return false;
        }
        // Bir sonraki bölen için recursive olarak çağır
        return isPrimeRecursive(n, divisor + 1);
    }
}
