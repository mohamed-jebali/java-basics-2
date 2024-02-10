 public class Student{
        
        private String name;
        private int dateOfBirth;
        public String setName(String name){
            return this.name = name;
        }

        public String getName(){
            return name;
        }


        public int setDateOfBirth(int dateOfBirth){
            return this.dateOfBirth = dateOfBirth;
        }

        public int getDateOfBirth(){
            return dateOfBirth;
        }


        // Il metodo toString permette di ottimizare il codice si tratta di un metodo
        // che appartiene all'oggetto object in java si puo' usare il metodo per fare
        // un override che permette di semplificare la stampa su console mettendo
        // solo la variabile appartente all'oggetto senza l'uso dei getters
        //  System.out.println(student1); output Student{name='Marco', dateOfBirth=1999}

     @Override
     public String toString() {
         return "Student{" +
                 "name='" + name + '\'' +
                 ", dateOfBirth=" + dateOfBirth +
                 '}';
     }

     @Override
     public boolean equals(Object obj){
            Student student = (Student) obj;
            if(name.equals(student.getName()) && dateOfBirth == student.getDateOfBirth()){
                return  true;
            }
            else{
                return false;
         }
     }
 }