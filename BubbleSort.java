public class BubbleSort {
    public static void main(String[] args){

        int arreglo[]={3,60,35,2,45,320,5};
        int swap=0;
        
        System.out.println("Array Before Bubble Sort");

        for(int iterador=0;iterador<arreglo.length;iterador ++){
            System.out.println(arreglo[iterador]);
        }

        //proceso de ordenar el arreglo

        for(int ite=0;ite<arreglo.length;ite ++){
            for(int ite2=1;ite2<(arreglo.length-ite);ite2 ++){
                if(arreglo[ite2-1]>arreglo[ite2]){
                    //intercambio de elementos
                    swap=arreglo[ite2-1];
                    arreglo[ite2-1]=arreglo[ite2];
                    arreglo[ite2]=swap;
                }
            }
        }

        System.out.println("Array After Bubble Sort");

        for(int iterador=0;iterador<arreglo.length;iterador ++){
            System.out.println(arreglo[iterador]);
        }
    }
}