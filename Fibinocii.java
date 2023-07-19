import java.util.*;
import java.util.stream.Stream;

public class Fibinocii
{
    public static void main(String args[])
    {
        System.out.println("Fibonacci Series using Java Stream :- ");
 
        Stream.iterate(new int[]{0,1}, f -> new int[]{f[1], f[0]+f[1]}) // 1. Iterate fibonacci number
        .limit(15) // 2. limit to 10 Integer numbers
        .map(n -> n[0]) // get 0th index from Arrays of size-2
        .forEach(fibNum -> System.out.print(fibNum + " ")); // 3. print to console
    }
}