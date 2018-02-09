import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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

    }

    @Test
    public void put() {
    }

    @Test
    public void remove() {
    }

    @Test
    public void putAll() {
    }

    @Test
    public void clear() {
    }

    @Test
    public void keySet() {
    }

    @Test
    public void values() {
    }
}