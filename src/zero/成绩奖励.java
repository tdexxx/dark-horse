import java.util.Scanner;

public class 成绩奖励 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入成绩");
        int score = sc.nextInt();

        if(score <=100 && score >= 0){
            if(score <=100 && score >= 95){
                System.out.println("自行车");
            } else if (score <= 94 && score >= 90) {
                System.out.println("游乐场");
            } else if (score <= 89 && score >= 80) {
                System.out.println("变形金刚");
            }else{
                System.out.println("挨打");
            }

        }else{
            System.out.println("输入不合法");
        }




    }
}
