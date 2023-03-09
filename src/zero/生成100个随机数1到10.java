import java.util.Random;

public class 生成100个随机数1到10 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int number = r.nextInt(10)+1;
            System.out.println(number);
        }
    }
}
