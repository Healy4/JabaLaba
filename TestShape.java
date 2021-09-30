import java.lang.*;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", false, 5.5);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        //System.out.println(s1.getRadius());
        //Родительские классы не могут содержать
        //В себе методы дочерних классов

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape();
        //Класс Shape - абстрактный класс
        //Нельзя создать объект абстрактного класса

        Shape s3 = new Rectangle("Black", false, 8, 7);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        //System.out.println(s3.getLength());
        //Родительские классы не могут содержать
        //В себе методы дочерних классов

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getLength());

        //System.out.println(r2.getSide());
        //Родительские классы не могут содержать
        //В себе методы дочерних классов
        //В данном случае Rectangle
        //Пытается унаследовать методы Square

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

        MovableCircle moveC = new MovableCircle(0, 0, 1, 3, 8);
        System.out.println(moveC.toString());
        moveC.moveDown();
        moveC.moveLeft();
        System.out.println(moveC.toString());
        moveC.moveUp();
        moveC.moveRight();
        System.out.println(moveC.toString());

        MovableRectangle moveR = new MovableRectangle(0,0,0,0,5,9);
        if (moveR.checkSpeed()){
            System.out.println(moveR.toString());
            moveR.moveDown();
            moveR.moveLeft();
            System.out.println(moveR.toString());
            moveR.moveUp();
            moveR.moveRight();
            System.out.println(moveR.toString());
        }
        else{
            System.out.println("Sorry, but the speed of the first point is " +
                    "different from the speed the second.");
        }

    }
}
