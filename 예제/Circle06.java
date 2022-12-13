public class Circle06 {
    int radius;
    String name;

    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle06 pizza;
        pizza = new Circle06();
        
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle06 donut = new Circle06();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}