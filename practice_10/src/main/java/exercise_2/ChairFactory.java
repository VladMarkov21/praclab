package exercise_2;

public class ChairFactory implements AbstractChairFactory  {

    public VictorianChair createVictorianChair() {
        return new VictorianChair((int)Math.random());
    }

    public MagicChair createMagicanChair() {
        return new MagicChair();
    }

    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
