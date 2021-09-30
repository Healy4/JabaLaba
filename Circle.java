public class Circle extends Shape{
    protected double radius;

    public Circle(){
        this.color = "Red";
        this.filled = false;
        this.radius = 3;
    }

    public Circle(double radius){
        this.color = "Blue";
        this.filled = false;
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius){
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString(){
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }
}
