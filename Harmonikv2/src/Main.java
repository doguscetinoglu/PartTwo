public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        double harmonicMean = calculateHarmonicMean(numbers);
        System.out.println("Dizinin harmonik ortalaması: " + harmonicMean);
    }

    public static double calculateHarmonicMean(int[] numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += 1.0 / num; // her sayının tersinin toplamı
        }
        return numbers.length / sum; // toplamın dizinin boyutuna bölünmesi
    }
}
