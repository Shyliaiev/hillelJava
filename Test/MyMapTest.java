import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class MyMapTest {

    MyMap<Integer, String> myMap;

    @Before
    public void setup() {
        myMap = new MyMap<>();
    }

    @Test
    public void size() {
        Assert.assertEquals("size()=0 fail",0,myMap.size());
        myMap.put(1,"PO");
        Assert.assertEquals("size()!=0 fail",1,myMap.size());
    }

    @Test
    public void isEmptyTrue() {
        Assert.assertTrue("isEmpty()=true fail", myMap.isEmpty());
        myMap.put(4,"");
        Assert.assertFalse("isEmpty()=false fail", myMap.isEmpty());
    }

    @Test
    public void containsKey() {
        myMap.put(1,"@");
        Assert.assertTrue("containsKey()=True",myMap.containsKey(1));
        Assert.assertFalse("containsKey()=False",myMap.containsKey(2));
    }

    @Test
    public void containsValue() {
        Assert.assertFalse("containsValue() example = null", myMap.containsValue("12"));
        myMap.put(20,"Hello");
        myMap.put(98,"See you");
        myMap.put(234,"See you");
        myMap.put(67894,"See you");
        myMap.put(9785613,"See you");
        Assert.assertFalse("containsValue() example does not contain smth",myMap.containsValue(""));
        Assert.assertTrue("containsValue() example contains this",myMap.containsValue("See you"));
    }

    @Test
    public void get() {
        Assert.assertNull("get() is not null before intialization", myMap.get(65));
        myMap.put(20,"Hello");
        myMap.put(98,"See you");
        myMap.put(234,"See you");
        myMap.put(67894,"See you");
        myMap.put(9785613,"See you");
        Assert.assertNull("get() is not null at missed key", myMap.get(65));
        Assert.assertNotNull("get() is null while should not", myMap.get(234));
        Assert.assertEquals("Hello",myMap.get(20));
    }

    @Test
    public void put() {
        myMap.put(20,"Hello");
        Assert.assertEquals(1,myMap.size());
    }

    @Test
    public void remove() {
        myMap.put(20,"Hello");
        myMap.put(98,"See you");
        Assert.assertNull(myMap.remove(12));
        Assert.assertEquals("Hello",myMap.get(20));
    }

    @Test
    public void clear() {
        myMap.put(12,"Val");
        Assert.assertEquals(1,myMap.size());
        myMap.clear();
        Assert.assertEquals(0,myMap.size());
        Assert.assertNull(myMap.get(1));
    }

    @Test
    public void keySet() {
        myMap.put(20,"Hello");
        myMap.put(98,"See you");
        myMap.put(234,"See you");
        myMap.put(67894,"See you");
        myMap.put(9785613,"See you");
        Set mySet=myMap.keySet();
        Assert.assertTrue(mySet.contains(98));
    }

    @Test
    public void values() {
        myMap.put(20,"Hello");
        myMap.put(98,"See you");
        myMap.put(234,"See you");
        myMap.put(67894,"See you");
        myMap.put(9785613,"See you");
        Collection temp = myMap.values();
        Assert.assertTrue(temp.contains("See you"));
    }
}