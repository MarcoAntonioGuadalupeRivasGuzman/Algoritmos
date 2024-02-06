public class MergeSort {
    
    public static void main (String[] args){
        int[] numbers = { 3, 60, 35, 2, 45, 320, 5 };

        System.out.println("Array Before Merge Sort");

        for (int iterador = 0; iterador < numbers.length; iterador++) {
            System.out.println(numbers[iterador]);
        }

        mergeSort(numbers);

        System.out.println("Array After Merge Sort");

        for (int iterador = 0; iterador < numbers.length; iterador++) {
            System.out.println(numbers[iterador]);
        }
    }

    public static void mergeSort(int[] inputArray){

        int inputLength = inputArray.length;

        if(inputLength <2){
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength-midIndex];

        for(int i=0; i<midIndex; i++){
            leftHalf[i] = inputArray[i];
        }

        for(int i=midIndex; i<inputLength; i++ ){
            rightHalf[i-midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //merge
        merge(inputArray, leftHalf, rightHalf);

    }

    public static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int iteInput=0, iteLeft=0, iteRight=0;

        while (iteLeft<leftSize && iteRight<rightSize) {
            if(leftHalf[iteLeft]<=rightHalf[iteRight]){
                inputArray[iteInput] = leftHalf[iteLeft];
                iteLeft ++;
            }
            else{
                inputArray[iteInput] = rightHalf[iteRight];
                iteRight ++;
            }
            iteInput ++;
        }

        while (iteLeft<leftSize) {
            inputArray[iteInput] = leftHalf[iteLeft];
            iteLeft ++;
            iteInput ++;
        }

        while (iteRight<rightSize) {
            inputArray[iteInput] = rightHalf[iteRight];
            iteRight ++;
            iteInput ++;
        }


    }
}
