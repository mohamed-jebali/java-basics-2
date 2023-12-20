import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        try{
                System.out.println("Inserisci i dati della base");

                int base = input.nextInt();

                System.out.println("Inserisci i dati dell' altezza");

                int altezza = input.nextInt();

                Scanner input2 = new Scanner(System.in);

                try{

                System.out.println("che cosa vuoi calcolare area o perimetro??");

                String method = input2.nextLine();
                
                if(method.equalsIgnoreCase("area")){

                    Rectangle rectangleFunctions = new Rectangle(base, altezza);

                    System.out.println("il risultato: " +  rectangleFunctions.area() + " mq");

                }
                else if(method.equalsIgnoreCase("perimetro")){

                    Rectangle rectangleFunctions = new Rectangle(base, altezza);

                    System.out.println("il risultato: " +  rectangleFunctions.perimetro() + " cm");
                }
                else{
                    System.out.println("Errore inserisci un metodo");
                }
                }catch(InputMismatchException error){
                    System.out.println("Errore non puoi inserire un numero come metodo");
                }
                finally{
                    input2.close();
                }

        }
        catch(InputMismatchException error){
            System.out.println("Errore inserisci un valore numerico");
        }
        finally{
            input.close();
        }


    }

    private int base;
    private int height;
    
    public Rectangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    public int getBase(){
        return base;
    }

    public int getHeight(){
        return height;
    }

    public int area(){

        int result = base * height;

        return result;
    }


    public int perimetro(){

        int result = (2*base) + (2*height);
        
        return result;
    }
}
