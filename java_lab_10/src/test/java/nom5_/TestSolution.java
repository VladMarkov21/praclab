package nom5_;

import nom5.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestSolution {
    @Test
    public void testArrayList(){
        Solution solution = new Solution();
        Integer mas[]={1,2,3,4};
        ArrayList<Integer> arr = solution.newArrayList(mas);
        Assert.assertEquals(4,arr.size());
        Assert.assertEquals((Integer)2, arr.get(1));
    }
    @Test
    public void testHashMap(){
        Solution solution = new Solution();
        String mas[]={"Alexey","Egor","Oleg"};
        Integer mas2[]={1,2,3};
        HashMap<Integer, String> hashMap = solution.newHashMap(mas2, mas);
        Assert.assertEquals(3,hashMap.size());
        Assert.assertEquals("Alexey",hashMap.get(1));
    }
}
