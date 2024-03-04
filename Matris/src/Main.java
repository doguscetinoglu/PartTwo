public class Main {
    public static void main(String[] args) {
        // İki boyutlu bir matris oluşturuyoruz
        int[][] liste = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Matris:");

        // Matrisin elemanlarını yazdırmak için döngü
        for (int dikey = 0; dikey < liste.length; dikey++) {
            for (int yatay = 0; yatay < liste[dikey].length; yatay++) {
                System.out.print(liste[dikey][yatay] + " ");
            }
            System.out.println("");
        }

        System.out.println("Transpoze :");

        // Matrisin transpozunu almak için döngü
        for (int dikey = 0; dikey < liste[0].length; dikey++) {
            for (int yatay = 0; yatay < liste.length; yatay++) {
                System.out.print(liste[yatay][dikey] + " ");
            }
            System.out.println("");
        }
    }
}
