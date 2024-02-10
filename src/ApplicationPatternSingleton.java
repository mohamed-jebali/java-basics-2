public class ApplicationPatternSingleton {

    public static void main(String[] args) {
        SingletonPattern firstInstance = SingletonPattern.getSingletonPatternInstance();
        SingletonPattern secondInstance = SingletonPattern.getSingletonPatternInstance();

        System.out.println(firstInstance == secondInstance); // l'output dara' true e' l'indirizzo di memoria
                                                             // sara' lo stesso dato che sono lo stessa istanza
                                                             // SingletonPattern
        System.out.println(firstInstance);
        System.out.println(secondInstance);
    }
}
