public class QuickSort {
    
    public static void main(String[] args){

        int[] numbers = { 3, 60, 35, 2, 45, 320, 5 };

        System.out.println("Array Before Quick Sort");

        for (int iterador = 0; iterador < numbers.length; iterador++) {
            System.out.println(numbers[iterador]);
        }

        quickSort(numbers, 0, numbers.length-1);

        System.out.println("Array After Quick Sort");

        for (int iterador = 0; iterador < numbers.length; iterador++) {
            System.out.println(numbers[iterador]);
        }

    }


    public static void quickSort(int [] arry, int lowIndex, int highIndex){
        
    }
}
