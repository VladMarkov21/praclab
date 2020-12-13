import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTester {

@Test
    public void getTest(){
    LinkedList<String> list= new LinkedList<String>();
    list.add("first");
    list.add("second");
    list.add("third");
    Assert.assertEquals("third",list.get(2));

}

@Test
public void containsTset(){
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(12);
    list.add(13);
    list.add(14);
    Assert.assertEquals(true,list.contains(13));
    Assert.assertEquals(false,list.contains(99));
    list.set(1,99);
    Assert.assertEquals(true,list.contains(99));
}

@Test
    public void sizeTest(){
    LinkedList<Boolean> list= new LinkedList<Boolean>();
    list.add(true);
    list.add(false);
    list.add(true);
    list.add(false);
    Assert.assertEquals(4,list.size());
    list.clear();
    Assert.assertEquals(0,list.size());
}
@Test
    public void removeTest(){
    LinkedList<String> list= new LinkedList<String>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
    Assert.assertEquals("d",list.get(3));
    list.remove(3);
    Assert.assertEquals("e",list.get(3));

}
@Test
    public void addLastTest(){
    LinkedList<Integer> list= new LinkedList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    Assert.assertEquals(3,(int) list.peekLast());
    list.addLast(12);
    Assert.assertEquals(12,(int) list.peekLast());
}
}
