package exercise_2;

public class Main {
    public static void main(String[] args) {
        Client client= new Client();

        ChairFactory chairFactory= new ChairFactory();
        FunctionalChair functionalChair=chairFactory.createFunctionalChair();
        MagicChair magicChair=chairFactory.createMagicanChair();

        System.out.println(functionalChair.sum(12,13));
        magicChair.doMagic();
        client.setChair(functionalChair);
    }

}
