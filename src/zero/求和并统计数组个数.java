import java.util.Random;

public class 求和并统计数组个数 {
    public static void main(String[] args) {
        int[] arr = new int[10];
      Random r = new Random();
     //  int number = r.nextInt();
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("数据中所以的和为" + sum);

        int avg = sum / arr.length;
        System.out.println("数组的平均值为" + avg);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg){
                count++;
            }
            }
            System.out.println("比平均数小的有" + count + "个");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        }

    }

