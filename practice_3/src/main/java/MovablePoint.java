public class MovablePoint implements Movable {
    private int x;



    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    private  int xSpeed;
    private  int ySpeed;
    public MovablePoint(int x, int y,int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "Point ("+ this.x+", "+this.y+")";
    }

    public void moveUp() {

        this.y+=ySpeed;

    }

    public void moveDown() {


        this.y-=ySpeed;
    }

    public void moveLeft() {
        this.x-=xSpeed;

    }

    public void moveRight() {
        this.x+=xSpeed;

    }
}
