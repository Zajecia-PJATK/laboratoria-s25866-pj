class Circle {
    double radius = 1;
    String color = "red";
    public Circle(){}
    public Circle (double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color) {
        this.radius=radius;
        this.color=color;
    }
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        double temp = radius * radius;
        temp = temp * Math.PI;
        return temp;
    }


    public String toString() {
        return "Circle[" + "radius=" + radius + ", color='" + color + '\'' + ']';
    }
}
class Cylinder extends Circle{
    double height;
    public Cylinder (){
        this.height=1;}
    public Cylinder(double height){
        this.height=height;
    }
    public Cylinder(double radius,double height){
        super(radius);
        this.radius=radius;
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getValue(){
        return getArea()*height;
    }
}

