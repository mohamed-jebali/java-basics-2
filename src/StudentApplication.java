public class StudentApplication {
    public static void main(String[] args) {
        Student student1 = new Student();

        Student student2 = new Student();

        student1.setName("Marco");
        student1.setDateOfBirth(1999);

        student2.setName("Marco");
        student2.setDateOfBirth(1989);

//      System.out.println(student1.toString());
        System.out.println(student1); // stampare in console la variabile senza il richiamo del metodo
                                      // toString() produce lo stesso risultato

        System.out.println(student2);

        if(student1.equals(student2)){
            System.out.println("il nome e' la data di nascita sono uguali");
        }
        else {
            System.out.println("il nome e' la data di nascita sono diversi");
        }

     }
}
