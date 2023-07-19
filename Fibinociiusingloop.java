   public class Fibinociiusingloop {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series using while-loop :- ");
        int num1 = 0, num2 = 1;
        int limit = 15;
        int iCount = 0;
        while(iCount < limit) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            iCount++;
        }
       }
    }
    
