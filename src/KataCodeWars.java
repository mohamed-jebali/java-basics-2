public class KataCodeWars {
    public static void main(String [] args){


        int[] arrayNumber = {10,5,3,1,4};


        for (int i = 0; i < arrayNumber.length; i++) {
            if(arrayNumber[i] == 10){
                int start = arrayNumber[i];
                System.out.println(" ____ ........................ ^ " + arrayNumber[i]);

                for (int j = start-1; j >= 0 ; j--) {
                    if(j > 5){
                      System.out.println("|    |........................ | " + j);
                    }
                    switch (j){
                        case 5:
                            System.out.println("|    | ____ .................. | " + j);
                            break;
                        case 4:
                            System.out.println("|    ||    |............ ____  | " + j);
                            break;
                        case 3:
                            System.out.println("|    ||    | ____ ......|    | | " + j);
                            break;
                        case 2:
                            System.out.println("|    ||    ||    |......|    | | " + j);
                            break;
                        case 1:
                            System.out.println("|    ||    ||    | ____ |    | | " + j);
                            break;
                        case 0:
                            System.out.println("|    ||    ||    ||    ||    | | " + j);
                            break;
                    }
                }
            }
        }
    }
}

//Description:
//
//You have done some data collection today and you want the data
// to be well presented by a graph so you have decided to make a quick diagram.
// Suppose that for this kata your data is presented by an array by their value
// eg [10,5,3,1,4], then you must present your data as follows:
//
//
//        for data = [10,5,3,1,4] :
//         ____ ........................ ^ 10
//        |    |........................ | 9
//        |    |........................ | 8
//        |    |........................ | 7
//        |    |........................ | 6
//        |    | ____ .................. | 5
//        |    ||    |............ ____  | 4
//        |    ||    | ____ ......|    | | 3
//        |    ||    ||    |......|    | | 2
//        |    ||    ||    | ____ |    | | 1
//        |    ||    ||    ||    ||    | | 0
