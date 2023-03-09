package March;

public class 数组动态初始化 {
    public static void main(String[] args) {
        String[] arr = new String[50];
        arr[0] = "zhangsan";
        arr[1] = "lisi";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //整数类型 0
        //小数类型 0.0
        //字符类型 '/u0000' 空格
        //布尔类型 false
        //引用数据类型 null
    }
}
