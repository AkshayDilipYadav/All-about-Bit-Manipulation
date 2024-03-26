import java.util.Scanner;
public class Main {

    public static int magicNumber(int A){
        int pow =1, answer =0;
        while (A !=0){
            pow = pow *5;
            if ((int)(A & 1)==1){answer += pow;}
            A >>=1;
        }
        return answer;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(magicNumber(A));
    }
}