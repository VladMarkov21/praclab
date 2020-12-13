import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<Integer>(4);
        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<Integer>();
        try {
            boundedWaitList.add(1);
            boundedWaitList.add(3);
            boundedWaitList.add(4);
            System.out.println(boundedWaitList.toString());
            boundedWaitList.add(5);
            boundedWaitList.add(6);


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        unfairWaitList.add(1);
        unfairWaitList.add(2);
        unfairWaitList.add(3);
        System.out.println(unfairWaitList.toString());
        unfairWaitList.remove(2);
        System.out.println(unfairWaitList.toString());


    }
}
