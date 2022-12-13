class Circle {
    private int radius;
    public Circle(int radius) { this.radius = radius; }
    public int getRadius() { return radius; }
}

public class NamedCircle06 extends Circle {
    private String name;
    public NamedCircle06 (int radius, String name) {
        super(radius);
        this.name = name;
    }

    public void show(){
        System.out.println(name + ", " + "반지름 = " + getRadius());
    }

    public static void main(String[] args){
        NamedCircle06 w = new NamedCircle06(5, "Waffle");
        w.show();
    }
}