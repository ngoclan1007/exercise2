import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào chuỗi 1");
        String str1 = sc.nextLine();
        System.out.println("nhập vào chuỗi 2");
        String str2 = sc.nextLine();

//      so sánh giá trị hai chuỗi
        System.out.println("1. str1 equals str2 : " + (str1.equals(str2)));

//      So sánh kích thước 2 chuỗi
        int str1Dai = str1.length();
        int str2Dai = str2.length();
        System.out.println("2. chuỗi str1 có độ dài bằng str2: " + (str1Dai==str2Dai));
//       Kiểm tra chuỗi đầu tiên có chứa chuỗi thứ 2 không
        System.out.println("3. str1 có chứa str2 : " + (str1.contains(str2)));
    }
}
