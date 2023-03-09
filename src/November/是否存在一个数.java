package November;

public class 是否存在一个数 {
    public static void main(String[] args) {
        int arr[] = {1,5,8,12,56,89,34,67};
        boolean falg = contains(arr,5);
        System.out.println(falg);

    }
    public static boolean contains (int [] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;
            }
            
        }
        return false;
    }
}
