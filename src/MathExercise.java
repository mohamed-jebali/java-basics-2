public class MathExercise{

    private int a;
    private int b;


    public int getA(){
        return a;
    }

    public int setA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public int setB(){
        return b;
    }

    

    public MathExercise(int a,int b){
        this.a = a;
        this.b = b;
    }

    public int somma(int a,int b){
        return a + b;
    }
        public int sottrazione(int a,int b){
        return a - b;
    }
        public int moltiplicazione(int a,int b){
        return a * b;
    }
        public int divisione(int a,int b){
        return a / b;
    }
}