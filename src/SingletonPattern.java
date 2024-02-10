public class SingletonPattern {

    // Il pattern singleton istanzia un'unica istanza di una classe
    // utilizzando

    private  static  SingletonPattern singletonPattern; // dichiarazione della classe con static per indicare l'univocita'
    private static String name;
    private static Integer age;

    private SingletonPattern(){

    }

    public String getName(){
        return name;
    }

    public static void setAge(Integer newAge) {
        SingletonPattern.age = newAge;
    }

    public Integer getAge(){
        return age;
    }

    public void setName(String newName){
        SingletonPattern.name = newName;
    }

    public static SingletonPattern getSingletonPatternInstance(){
        if(singletonPattern == null){
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }
}
