import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh góc vuông a");
        double a = sc.nextDouble();
        System.out.println("Nhập cạnh góc vuông b");
        double b = sc.nextDouble();
        System.out.printf("\ntam giác vuông có cạnh a : %.2f, Cạnh b : %.2f, có cạnh huyền c = %.2f",
                a, b, Math.sqrt((a*a+b*b)));

    }
}
