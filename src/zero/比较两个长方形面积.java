public class 比较两个长方形面积 {
    public static void main(String[] args) {
        double area1 = getArea(5.3,1.7);
        double area2 = getArea(2.4,2.7);
        if (area1 > area2){
            System.out.println("第一个长方形大");
        }else {System.out.println("第二个长方形大");}
    }
    public static double getArea(double len,double width){
        double area = len * width;
        return area;
    }
}
