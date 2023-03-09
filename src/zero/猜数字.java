import java.util.Random;
import java.util.Scanner;

public class 猜数字 {
    public static void main(String[] args) {
        int count = 0;
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        System.out.println(number);
        Scanner sc = new Scanner(System.in);
        while (true){

            System.out.println("请输入你要猜的数字");
            int guessNumber = sc.nextInt();
            if (guessNumber > number){
                System.out.println("大了");
            } else if (guessNumber < number) {
                System.out.println("小了");
            }else{
                System.out.println("猜中了");
                break;
            }
            count++;
            System.out.println("已经猜了" + count + "次");
            if (count == 3){
                System.out.println("让我告诉你吧是" + number);
                break;
            }
        }

    }
}
