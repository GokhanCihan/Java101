// Finds prime numbers between 1 and 100


public class PrimeNumbers {
    public static void main(String[] args) {

        boolean isDividable = false;


        NEXT_NUMBER: for (int number = 2; number < 100; number++ ) {
            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    isDividable = true;
                    continue NEXT_NUMBER;
                }
            }
            System.out.print(number + " ");
        }
    }
    }
