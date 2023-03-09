public class 纸张折叠多少次能高于山 {
    public static void main(String[] args) {
        //定义山峰高度
        double height = 8844430;
        //定义纸张厚度
        double paper  = 0.1;
        //定义一个变量统计次数
        int count = 0;
        while (paper < height){
            paper = paper*2;
            count++;
        }
        System.out.println(count);
    }
}
