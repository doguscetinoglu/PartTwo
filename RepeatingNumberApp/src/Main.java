public class Main {
    public static void main(String[] args) {
        int[] list = {2,4,7,8,10,26}; // Değerler
        for (int i = 0; i < list.length; i++){ // Döngü alanı
            if (list[i] % 2 == 0){ // Çift sayı bulabilmesi için gereken formül
                System.out.println(list[i]);
            }
        }

    }
}
