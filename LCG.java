public class LCG {
    
    public static void main(String[] args){
        //implementacion de un generador de numeros pseudoaleatorios
        //con el algoritmo generador lineal congruencial
        int seed=23, a=531, c=32, m=618,period=10,xi=0;

        for(int ite=0; ite<period;ite ++){
            xi=((seed*a)+c)%m;
            seed=xi;
            System.out.println(xi);
        }
        
    }
}
