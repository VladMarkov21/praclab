public class MovableCircle extends MovablePoint  implements Movable {
    private int radius;

    private MovablePoint center;
    public MovableCircle( int x,int y,int xSpeed,int ySpeed,int radius){
        super(x,y,xSpeed,ySpeed);
        this.radius=radius;


    }

    @Override
    public String toString() {
       return "Circle: ("+getX()+", "+getY()+")  "+"radius:"+this.radius;
    }

    public void moveUp() {
        setY(getY()+getySpeed());

    }

    public void moveDown() {
       setY(getY()-getySpeed());

    }

    public void moveLeft() {
       setX(getX()-getxSpeed());

    }

    public void moveRight() {
        setX(getX()-getxSpeed());

    }
}
