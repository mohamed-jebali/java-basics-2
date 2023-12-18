import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class FIleExercise {
    
    public static void main(String[]args){


        File file = new File("Maven.txt");

        try{
            if(file.createNewFile()){
                System.out.println("File creato con successo");
                FileWriter fileText = new FileWriter("Maven.txt");
                fileText.write("file text creato con successo! \n");
                fileText.append("puoi scrivere da qui \n \n");
                fileText.close();
            }
            else{
                 System.out.println("File gia' creato");
            }
        }
        catch(IOException error){
            System.out.println("Si è verificato un errore durante la creazione del file");
        }


        Scanner input = new Scanner(System.in);


        try{
            System.out.println("Inserisci il testo");

            String UserInput = input.nextLine();

            FileWriter writeByUser = new FileWriter("Maven.txt", true);

            writeByUser.append(UserInput);

            writeByUser.close();
        }
        catch(IOException error){
            System.out.println("Si è verificato un errore durante la scrittura nel file\"");
        }
        catch(InputMismatchException error){
            System.out.println("Errore inserisci del contenuto valido");
        }
        finally{
            input.close();
        }
    }
}
