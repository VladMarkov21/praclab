import nom1.ArrayQueeModule;
import org.junit.Assert;
import org.junit.Test;

public class ArrayQueeModuleTset {
    @Test
    public void testAdd() {
        ArrayQueeModule<Integer> module = new ArrayQueeModule<Integer>(3);

        module.addqueu(1);
        module.addqueu(2);
        module.addqueu(3);
        Assert.assertEquals(3,module.getPozition());
        module.addqueu(4);
        Assert.assertEquals(6,module.getCapacity());
        Assert.assertEquals(4,module.getPozition());

    }
    @Test
    public void testElement(){
        ArrayQueeModule<String> module= new ArrayQueeModule<String>(2);
        module.addqueu("hello");
        module.addqueu("world");
        Assert.assertEquals("hello",module.element());
    }
    @Test
    public void testDequeue(){
        ArrayQueeModule<Integer> module= new ArrayQueeModule<Integer>(3);
        module.addqueu(1);
        module.addqueu(2);
        module.addqueu(3);
        Assert.assertEquals(1,module.dequeue());
        Assert.assertEquals(3,module.size());
    }
    @Test
    public void testIsEmpty(){
        ArrayQueeModule<String> module= new ArrayQueeModule<String>(2);

        module.addqueu("hello");
        Assert.assertEquals(false,module.isEmpty());
        module.clear();
        Assert.assertEquals(true,module.isEmpty());
    }
}
