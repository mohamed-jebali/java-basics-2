public class StringsMethod {
    
    public static void main(String[]args){

        StringsMethod conversionMethod = new StringsMethod(); // creo un istanza a StringsMethod per usare il metodo creato sotto convertToInteger

        App checkNumbersArray = new App(); // creo un istanza App per utilizzare la funzione 


        int[] array = {1,2,3,4,5,6,7,8,9,10};

        checkNumbersArray.checkOddEven(array); // uso la funzione appartente all'oggetto App


        // OPERATORE DI CONFRONTO ==
        
        String number =  new String("123");

        String number2 = new String("123");

        boolean checkNumbers = number == number2; // in questo confronto si verifica se i due sono le stesse istanze di oggetti

        System.out.println(checkNumbers); // output false


        // METODO EQUALS

        String number3 =  "1234";
        

        String secondCheck = (number3.equals(number)) ? "i numeri sono uguali" : "i numeri sono diversi"; // condizione falsa quindi ramo else attraverso questo metodo si verifica il contenuto della stringa

        System.out.println(secondCheck.toUpperCase()); // output i numeri sono diversi con il metodo ToUpperCase() --> tutto maiuscolo

        System.out.println("here is your conversion: " + (conversionMethod.convertToInteger(number) + 2)); // mettere le parentesi se no lo tratta come una stringa il numero dato che il messaggio iniziale


        StringBuffer str = new StringBuffer("hello"); // atraverso l'uso della classe StringBuffer si possono modificare le stringhe 
        // grazie ai metodi 

        str.replace(0, 1, "H"); // metodo replace primo argomento stringa che voglio modificare secondo argomento fino a dove la modifica finisce terzo argomenot stringa con la quale devo modificare l'elemento


        str.insert(5, " World"); // metodo per inserire una stringa in base all'indice selezionato in questo caso non si parte da zero ma da 1 quindi [0] = H [1] = e [2] = l [3] = l [4] = o [5] = " " [6] = "W" [7] = o [8] = r [9] = l [10] = d

        

        

        System.out.println(str); // output Hello

        StringBuffer str2 = str;

        boolean thirdCheck = (str == str2) ? true : false; // confronto se si tratta dello stesso oggetto

        String equalStringCheck = (str.equals(str2)) ? "il contenuto e' uguale" : "il contenuto e' diverso"; 

        System.out.println(equalStringCheck);

        System.out.println(thirdCheck); // output true dato che si tratta dello stesso oggetto in questo caso
        

    }

    /** funzione che consente la conversione da stringa a numero intero
     * 
     * @param numberReference --> argomento di tipo stringa che verra' poi convertito 
     * @return ritorna un tipo di dato intero 
     */


    public int convertToInteger(String numberReference){

        int numberConversion = Integer.parseInt(numberReference);

        return numberConversion;


    }


}
