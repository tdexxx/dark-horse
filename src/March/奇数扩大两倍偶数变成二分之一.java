package March;

public class 奇数扩大两倍偶数变成二分之一 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                arr[i]=arr[i]/2;
            }else{
                arr[i]=arr[i]*2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
