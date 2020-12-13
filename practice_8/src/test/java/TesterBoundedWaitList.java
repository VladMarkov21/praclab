import org.junit.Assert;
import org.junit.Test;

public class TesterBoundedWaitList {
    @Test
    public void testgetCapacity() {
        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<Integer>(10);

        Assert.assertEquals(10, boundedWaitList.getCapacity());
    }



}
