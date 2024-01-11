public class SelectionSort {

    public static void main(String[] args) {

        int[] numbers = { 3, 60, 35, 2, 45, 320, 5 };
        int minNum = 0, indexMin = 0, swap = 0;

        System.out.println("Array Before Selection Sort");

        for (int iterador = 0; iterador < numbers.length; iterador++) {
            System.out.println(numbers[iterador]);
        }

        for (int ite = 0; ite < numbers.length - 1; ite++) {
            minNum = numbers[ite];
            indexMin = ite;
            for (int ite2 = ite + 1; ite2 < numbers.length; ite2++) {
                if (numbers[ite2] < minNum) {
                    minNum = numbers[ite2];
                    indexMin = ite2;
                }
            }
            swap = numbers[ite];
            numbers[ite] = minNum;
            numbers[indexMin] = swap;
        }

        System.out.println("Array After Selection Sort");

        for (int iterador = 0; iterador < numbers.length; iterador++) {
            System.out.println(numbers[iterador]);
        }

    }
}
