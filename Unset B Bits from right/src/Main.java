import java.util.Scanner;
public class Main {

    public static long unsetBBits(long A, int B){
        return (A >> B) << B;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long A  = sc.nextInt();
        int B  = sc.nextInt();

        long result =unsetBBits(A,B);

        System.out.print(result);

    }
}