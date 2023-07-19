   public class Fibinociiusingloop {
        public static void main(String[] args) {
            System.out.println("Fibonacci Series using for-loop :- ");
            int num1 = 0, num2 = 1;
            int limit = 15;
            for(int i = 0; i < limit; i++) {
                System.out.print(num1 + " ");
                int sum = num1 + num2;
                num1 = num2;
                num2 = sum;
            }
         }
    }
    
