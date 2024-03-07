//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static int countOneBit(int A){
        int count = 0;
        while (A>0){
            A &= (A -1);
            count++;
        }return count;

    }
    public static void main(String[] args) {
        /*
- Alex has a cat named Boomer. He decides to put his cat to the test for eternity.

-He starts on day 1 with one stash of food unit, every next day, the stash doubles.

-If Boomer is well behaved during a particular day, only then she receives
food worth equal to the stash produced on that day.

-Boomer receives a net worth of A units of food. What is the number of days she received the stash?
      */
        Scanner sc = new Scanner (System.in);
        int A = sc.nextInt();
        int result = countOneBit(A);
        System.out.println(result);
    }
}