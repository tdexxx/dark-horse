import java.util.Scanner;

public class 奇数坐左边 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票号");
        int ticket = sc.nextInt();
        if (ticket >= 0 && ticket <= 100) {
            if (ticket % 2 == 1) {
                System.out.println("奇数坐左边");
            } else {
                System.out.println("偶数坐右边");
            }
            } else {
            System.out.println("请输入0-100的数");}
    }
}