import java.util.Comparator;

public class Student implements Comparator {
    public int getBall() {
        return ball;
    }


    private int ball;
    private String name;
    private String sername;

    public Student(String name,String sername,int ball){
        this.name=name;
        this.sername=sername;
        this.ball=ball;
    }
    public Student(){}
    public void out(){
        System.out.println(name+" / "+ sername+" / "+ ball);
    }

    // Не нужно в данном задании
    public int compare(Object o1, Object o2) {
        Student first= (Student) o1;
        Student second= (Student) o2;
        return ((Student) o1).getBall()-((Student) o2).getBall();
    }


}
