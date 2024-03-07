import java.util.Scanner;
public class Main {

    public static int unsetIBit (int A, int B){
        if (((A >> B)&1)==1){
A ^=(1 << B);
        }return A;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
       int updatedA= unsetIBit (A, B);
       System.out.print(updatedA);
    }
}