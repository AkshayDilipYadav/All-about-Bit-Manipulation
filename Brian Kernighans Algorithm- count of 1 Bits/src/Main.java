import java.util.Scanner;

public class Main {
    public static int countOneBit(int A){
        int count = 0;
        while (A>0){
            A &= (A -1);
            count++;
        }return count;

    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int A = sc.nextInt();
        int result = countOneBit(A);
        System.out.println(result);
    }
}