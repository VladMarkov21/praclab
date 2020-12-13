package exercise_1;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory concreteFactory= new ConcreteFactory();
       Complex complex= concreteFactory.CreateComplex(12,3);
        System.out.println(complex.toString());
    }
}
