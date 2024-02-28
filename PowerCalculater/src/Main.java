import java.util.Scanner;

public class Main {

    // Recursive metot ile üs alma işlemi
    static int power(int base, int exponent) {
        // Üs 0 ise 1 döndürülür
        if (exponent == 0) {
            return 1;
        }
        // Üs 1 ise taban değeri döndürülür
        else if (exponent == 1) {
            return base;
        }
        // Üs negatif ise tabanın tersi alınarak recursive olarak devam edilir
        else if (exponent < 0) {
            return 1 / power(base, -exponent);
        }
        // Diğer durumlarda recursive olarak üs alma işlemine devam edilir
        else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int exponent = scan.nextInt();

        // power metodu çağrılarak üs alma işlemi gerçekleştirilir
        int result = power(base, exponent);
        System.out.println("Sonuç: " + result);
    }
}
