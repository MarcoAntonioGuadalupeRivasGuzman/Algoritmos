public class BlumBlumShub {
    
    public static void main(String[] args){
        //implementacion de un generador de numeros pseudoaleatorios
        //con el algoritmo blum blum shub
        int period=10,a=121,c=553,m=177;
        float xi=0,seed=23,ramdomNumber=0;

        for(int ite=0;ite<period;ite ++){
            xi=((a*seed)+c)%m;
            seed=xi;
            ramdomNumber=xi/(m-1);
            System.out.println(ramdomNumber);
        }
    }
}
