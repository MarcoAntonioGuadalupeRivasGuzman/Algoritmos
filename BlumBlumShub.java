public class BlumBlumShub {
    
    public static void main(String[] args){
        //implementacion de un generador de numeros pseudoaleatorios
        //con el algoritmo blum blum shub
        int period=10,m=177,xi=0,seed=23;

        for(int ite=0;ite<period;ite ++){
            xi=(seed*seed)%m;
            seed=xi;
            System.out.println(xi);
        }
    }
}
