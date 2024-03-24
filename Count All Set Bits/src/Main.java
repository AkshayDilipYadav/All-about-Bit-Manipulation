import java.util.Scanner;
public class Main {

    public static String getBits(int A ){
        char[] bits = new char[32];
        for (int i = 31; i >= 0; i--){
            int bit = (A>>i)&1;
            bits[31-i] = (char)(bit + '0');
        }
        return new String(bits);
    }

    public static int countSetBits(int A){
        int count = 0;
        while (A >0) {
            A &= (A-1);
            count++;
        }
        return count;
        }

    public static void main (String[] args) {
        Scanner sc= new Scanner (System.in);
        int A = sc.nextInt();
        String bitsOf = getBits(A);
        System.out.println(bitsOf);
        int result  = countSetBits(A);
        System.out.println(result);
    }
}