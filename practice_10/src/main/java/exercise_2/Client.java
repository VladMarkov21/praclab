package exercise_2;

public class Client {
    public Chair chair;
    public void sit(){
        System.out.println("Сижу");
    }
    public void setChair(Chair chair){

        System.out.println(chair.toString());
    }
}
