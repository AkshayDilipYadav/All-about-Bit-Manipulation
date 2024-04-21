import java.util.Scanner;
public class Main {

    public static int singleNumber(int [] A){
        int result =0;
        for (int i = 0; i < A.length; i++){
            result ^= A[i];
        }
        return result;
    }
    public static void main (String[] args){
        Scanner sc  = new Scanner (System.in);
        int N = sc.nextInt();
        int [] A = new int [N];
        for (int i = 0; i < N; i++){
            A[i]=sc.nextInt();
        }
        int result = singleNumber(A);
        System.out.println(result);
    }
}