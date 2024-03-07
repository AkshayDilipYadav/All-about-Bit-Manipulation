import java.util.Scanner;

public class Main {
    public static int checkBit(int A, int B){
        return (A >> B) & 1;
    }
    public static void main (String[] args){
Scanner sc = new Scanner (System.in);
int A = sc.nextInt();
        int B = sc.nextInt();

        int result = checkBit(A, B);
        System.out.println(result);

    }
}