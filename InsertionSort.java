public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = { 3, 60, 35, 2, 45, 320, 5 };
        int currentNum = 0;

        System.out.println("Array Before Insertion Sort");

        for (int iterador = 0; iterador < numbers.length; iterador++) {
            System.out.println(numbers[iterador]);
        }

        for (int ite = 1; ite < numbers.length; ite++) {
            currentNum = numbers[ite];
            int ite2 = ite - 1;
            while (ite2 >= 0 && numbers[ite2] > currentNum) {
                numbers[ite2 + 1] = numbers[ite2];
                ite2--;
            }
            numbers[ite2 + 1] = currentNum;
        }

        System.out.println("Array After Insertion Sort");

        for (int iterador = 0; iterador < numbers.length; iterador++) {
            System.out.println(numbers[iterador]);
        }
    }
}
