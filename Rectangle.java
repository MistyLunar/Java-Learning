public class Rectangle {
    double width;
    double height;

    public void area(){
        System.out.println("面积为：" + (width * height));
    }

    public void perimeter(){
        System.out.println("周长为：" + (height + width) * 2);
    }
}
