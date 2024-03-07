import java.util.Scanner;
public class Main {

    public static int toggleIBit(int A, int B){
        return A ^ (1 << B);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = toggleIBit(A,B);
        System.out.println(result);
    }
}