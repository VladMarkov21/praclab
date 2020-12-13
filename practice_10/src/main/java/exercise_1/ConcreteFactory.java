package exercise_1;

public class ConcreteFactory implements CompexAbstractFactory {
    public Complex createComplex() {
        return new Complex();
    }

    public Complex CreateComplex(int real, int image) {
        return new Complex(real,image);
    }
}
