public class PetersLCG {
    public static void main(String[] args){

        //implementacion del un generador propuesto por Ivan
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
