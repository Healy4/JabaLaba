public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center = new MovablePoint(0,0,0,0);

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center.x = x;
        this.center.y = y;
        this.center.xSpeed = xSpeed;
        this.center.ySpeed = ySpeed;
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "\nCircle's speed: x = " + center.xSpeed + ", y = " + center.ySpeed + " Now locate: " +
                "x = " + center.x + ", y = " + center.y;
    }
    @Override
    public void moveUp(){
        center.y += center.ySpeed;
    }
    @Override
    public void moveDown(){
        center.y -= center.ySpeed;
    }
    @Override
    public void moveLeft(){
        center.x += center.xSpeed;
    }
    @Override
    public void moveRight(){
        center.x -= center.xSpeed;
    }
}
