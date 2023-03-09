package March;

import java.util.Random;

public class 生成10个随机数求和求平均求小于平均的个数 {
    public static void main(String[] args) {
        //生成随机数
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
        }

        //求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("和为" + sum);

        //求平均数
        int avg = sum / arr.length;
        System.out.println("平均数为" + avg);

        //求小于平均数的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        System.out.println("有" + count + "个数比平均数小");

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
