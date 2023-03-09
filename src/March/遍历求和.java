package March;

public class 遍历求和 {
    public static void main(String[] args) {
        //定义一个数组，并添加数据1，2，3，4，5
        int[] arr = {1,2,3,4,5};
        //求和变量
        int sum = 0;
        //遍历求和
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        //结果
        System.out.println(sum);
    }
}
