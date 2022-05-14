class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
class Circle extends Shape{
    double radius;
    public Circle(){}
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double temp=radius*radius;
        return temp* Math.PI;
    }
    public double getPerimeter(){
        double temp=2*radius;
        return temp*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() +
                "}radius=" + radius +
                '}';
    }

}
class Rectangle extends Shape{
    double width=1;
    double lenght=1;
    public Rectangle(){}
    public Rectangle(double width,double lenght){
        this.width=width;
        this.lenght=lenght;
    }
    public Rectangle(double width,double lenght,String color,boolean filled){
        super(color, filled);
        this.width=width;
        this.lenght=lenght;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLenght() {
        return lenght;
    }
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return lenght * width;
    }
    public double getPerimeter(){
        double temp1=lenght*2;
        double temp2=width*2;
        return temp1+temp2;
    }

    @Override
    public String toString() {
        return "Rectangle{"+ super.toString() +
                "width=" + width +
                ", lenght=" + lenght +
                '}';
    }
}
public class Square extends Rectangle{
    public Square(){}
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side, color, filled);
    }
    public void setSide(double side){
        this.lenght=side;
        this.width=side;
    }
    public double getSide(){
        return lenght+width;
    }

    @Override
    public String toString() {
        return "Square{Rectangle{"+ super.toString() +
                "width=" + width +
                ", lenght=" + lenght +
                '}';
    }
}