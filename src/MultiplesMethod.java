public class MultiplesMethod {
    
    public static void main(String[] args) {

        MultiplesMethod functionMultiplise = new MultiplesMethod();

        System.out.println("la somma: " + functionMultiplise.solution(16));
        
    }

    public int solution(int number) {
        int sum = 0;
        
        for (int i = 1; i < number; i++) {

            if(i % 3 == 0 || i % 5 == 0){

                if(i % 3 == 0 && i % 5 == 0){
                    System.out.println("multipli per 3 e 5: " + i);

                    sum += i;
                }
                else{
                    sum += i;
                    System.out.println("multipli per 3 o 5: " + i);
                }

            }
        }
       return sum;
      }
}



// CODEWARS EXERCISE

// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

// Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

// Note: If the number is a multiple of both 3 and 5, only count it once.

// Courtesy of projecteuler.net (Problem 1)
