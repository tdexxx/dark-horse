package November;

public class 求数组最大值并返回 {
    public static void main(String[] args) {
        int[] arr = {1,5,7,3,8,10};
        int max = getMax(arr);
        System.out.println(max);
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
