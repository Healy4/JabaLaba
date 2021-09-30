public class MovableRectangle implements Movable{
    private MovablePoint topLeft = new MovablePoint(0,0,0,0);
    private MovablePoint bottomRight = new MovablePoint(0,0,0,0);

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft.x = x1;
        this.topLeft.y = y1;
        this.topLeft.xSpeed = xSpeed;
        this.topLeft.ySpeed = ySpeed;

        this.bottomRight.x = x2;
        this.bottomRight.y = y2;
        this.bottomRight.xSpeed = xSpeed;
        this.bottomRight.ySpeed = ySpeed;
    }
    @Override
    public String toString(){
        return "\nRectangle's speed: x1 = " + topLeft.xSpeed + ", y1 = " + topLeft.ySpeed +
                ", x2 = " + bottomRight.xSpeed + ", y2 = " + bottomRight.ySpeed + "\nNow locate: " +
                "x1 = " + topLeft.x + ", y1 = " + topLeft.y + ", x2 = " + bottomRight.x + ", y2 = " + bottomRight.y;
    }
    @Override
    public void moveUp(){
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }
    @Override
    public void moveDown(){
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }
    @Override
    public void moveLeft(){
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }
    @Override
    public void moveRight(){
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.x;
    }

    public boolean checkSpeed(){
        return (topLeft.xSpeed == bottomRight.xSpeed) && (topLeft.ySpeed == bottomRight.ySpeed);
    }
}
