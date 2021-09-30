public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        this.color = "Red";
        this.filled = false;
        this.width = 3;
        this.length = 5;
    }

    public Rectangle(double width, double length){
        this.color = "Blue";
        this.filled = false;
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length){
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getArea(){
        return width*length;
    }

    @Override
    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString(){
        return "Shape: rectangle, width and length: "+this.width+", "+this.length+", color: "+this.color;
    }
}
