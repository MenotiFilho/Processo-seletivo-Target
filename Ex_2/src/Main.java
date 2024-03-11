import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        BigInteger num = scan.nextBigInteger();

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        while (a.compareTo(num) < 0) {
            BigInteger temp = a;
            a = b;
            b = temp.add(b);
        }

        if (a.equals(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
    }
}