public class TestMovable {
    public static void main(String[] args) {
        MovablePoint movablePoint= new MovablePoint(4,5,1,2);
        MovableCircle movableCircle= new MovableCircle(12,8,3,2,6);
        System.out.println("First pozition: "+movablePoint.toString());
        System.out.println("moveRight(1)->moveUp(2):");
        movablePoint.moveRight();
        movablePoint.moveUp();
        System.out.println("After activity:"+movablePoint.toString());
        System.out.println("First pozition: "+movableCircle.toString());
        System.out.println("moveLeft(3)->moveDown(2)");
        movableCircle.moveLeft();
        movableCircle.moveDown();
        System.out.println("After activity:"+movableCircle.toString());
    }
}
