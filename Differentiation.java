
import java.util.Scanner;

public class Differentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, h = 0.001, fx, fxh, answer;

        System.out.print("Enter value of x: ");
        x = sc.nextDouble();

        fx = x * x;
        fxh = (x + h) * (x + h);

        answer = (fxh - fx) / h;

        System.out.println("Differentiation = " + answer);
    }
}
