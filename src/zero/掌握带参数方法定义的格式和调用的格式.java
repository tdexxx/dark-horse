public class 掌握带参数方法定义的格式和调用的格式 {
    public static void main(String[] args) {
        getSum(10,20);
    }
    public static void getSum(int num1 ,int num2){
        int result = num1 + num2;
        System.out.println(result);
    };
}
