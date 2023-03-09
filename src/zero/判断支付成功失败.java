import java.util.Scanner;

public class 判断支付成功失败 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("录入一个整数表示实际支付的钱");
        int money = sc.nextInt();
        if (money >= 600) {
            System.out.println("支付成功");
        } else {
            System.out.println("支付失败");
        }
    }
}

