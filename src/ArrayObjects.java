public class ArrayObjects {
    
    public static void main(String[] args) {
        

        Student[] list = new Student[3]; // array di oggetti di Student

        list[0] = new Student();

        list[0].setName("Gaggio"); // metodo setter per impostare il nome all'indice [0]

        list[0].setDateOfBirth(2001);




        list[1] = new Student(); // instanza dell oggetto Student all 'indice [1]
         

        list[1].setName("Raven");

        list[1].setDateOfBirth(1999);


         for (int i = 0; i < list.length-1; i++) {
            System.out.println(list[i].getName() + " " + list[i].getDateOfBirth()); // ciclo for per iterare la lista degli studenti
         }


        // System.out.println(list[0].getName()); // metodo getters per ricavare il nome

        // System.out.println(list[1].getName());// se un oggetto non viene specificato il dato della variabile il valore sara' null

        Integer n1  = Integer.valueOf(44);

        System.out.println(n1);

        


    }
}
