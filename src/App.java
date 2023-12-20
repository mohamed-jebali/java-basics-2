public class App {
    public static void main(String[] args) throws Exception {

        App functionCheck = new App();

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        functionCheck.checkOddEven(array);

        MathExercise Mathfunctions = new MathExercise(3, 3);

        System.out.println(Mathfunctions.somma(3, 3));

        System.out.println(Mathfunctions.sottrazione(3, 3));

        System.out.println(Mathfunctions.moltiplicazione(3, 3));

        System.out.println(Mathfunctions.divisione(3, 3));



    }

    /** La funzione verifica se i numeri all'interno dell'array sono pari o dispari
     * <div>
     * <img src="https://www.programmingsimplified.com/sites/default/files/odd-even.png" alt="Odd-Even Image">
     * </div>
     *
     * 
     * @param arrayExample argomento array numerico // commento con uso della libreria javadoc 
     */

    public void checkOddEven(int[] arrayExample){

        for(int i = 0; i< arrayExample.length;i++){
            if(arrayExample[i] % 2 == 0){
                System.out.println(arrayExample[i] + " is even");
            }
            else{
                System.out.println(arrayExample[i] + " is odd");
            }
        }
    }
}
