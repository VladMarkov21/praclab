import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestUnfairWaitList {
    @Test
    public void testremove() throws IOException {
        UnfairWaitList<Integer> unfairWaitList= new UnfairWaitList<Integer>();
        unfairWaitList.add(1);
        unfairWaitList.add(2);

        unfairWaitList.remove(1);
        Assert.assertEquals(true,unfairWaitList.contains(2));
    }

}
