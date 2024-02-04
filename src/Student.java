 public class Student{
        
        private String name;
        private int dateOfBirth;
        // private int[] votes;

        // Student(String name,int dateOfBirth){
        //     this.name = name;
        //     this.dateOfBirth = dateOfBirth;
        //     // this.votes = votes;
        // }

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
    }