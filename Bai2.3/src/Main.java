import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random =  new Random();
        double rannum = random.nextDouble(1, 100);
        System.out.println(rannum);
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số a");
        double a = sc.nextDouble();
        boolean sosanh = rannum == a;
        String result = sosanh ? "rannum và số a bằng nhau" : "rannum và số a không bằng nhau";
        System.out.println(result);
    }
}
