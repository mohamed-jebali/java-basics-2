import java.lang.StringBuilder;

public class PascalCase {

  public String toCamelCase(String s){

    StringBuilder string = new StringBuilder(s);


    for (int i = 0; i < string.length(); i++) {

         char charSelected = string.charAt(i);

         
         

        if(charSelected == '_' || charSelected == '-'){

            


             char index = string.charAt(i+1); // prendo le iniziali delle parole


             
            index = Character.toUpperCase(index); // prendo le inziali e utilizzo la funzione toUpperCase() per renderle maiuscole
             
             
            // System.out.println(index); 

            string.setCharAt(i+1, index); // imposto i + 1 uguale al carattere succesivo a '-' e '_' e lo sostituisco a index  

            // System.out.println(i);

            string.deleteCharAt(i); // una volta trovato i caratteri '_' e '-' all'interno del if statement li elimino con la funzione deleteChartAt


            
            
            
        }
    }
    return string.toString(); // porto a schermo la stringa convertita con il metodo toString passado da StringBuilder a String
    

  }
  public static void main(String[]args){

    String word1 = "the-stealth-warrior";

    String word2 = "The_Stealth_Warrior";

    String word3 = "The_Stealth-Warrior";

    PascalCase function = new PascalCase();

    System.out.println("primo caso: " + function.toCamelCase(word1));

    System.out.println("secondo caso: " + function.toCamelCase(word2));

    System.out.println("terzo caso: " + function.toCamelCase(word3));

  }
}


// CODE WARS --> Convert string to camel case

// link --> https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java

// Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

// Examples

// "the-stealth-warrior" gets converted to "theStealthWarrior"

// "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

// "The_Stealth-Warrior" gets converted to "TheStealthWarrior"

