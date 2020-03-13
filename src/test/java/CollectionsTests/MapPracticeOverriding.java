package CollectionsTests;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Collections.MapPractice;

public class MapPracticeOverriding extends MapPracticeTests {
	private MapPractice mapPractice;
    private Map map1;

    @Before
    public void setup(){
        mapPractice = new MapPractice();
        map1 = new TreeMap<String, String>();
        map1.put("Mario", "Mario Bros.");
        map1.put("Donkey Kong", "Donkey Kong");
        map1.put("Link", "Legend of Zelda");
        map1.put("Samus Aran", "Metroid");
        map1.put("Yoshi", "Yoshi's World");
        map1.put("Kirby", "Kirby");
        map1.put("Fox McCloud", "Star Fox");
        map1.put("Pikachu", "Pokemon");
        map1.put("Luigi", "Mario Bros.");
        map1.put("Captain Falcon", "F-Zero");
        map1.put("Ness", "EarthBound");
        map1.put("Jigglypuff", "Pokemon");
    }

    @Test
    public void findValueOfTest1(){
        // Given
        String key = "Link";
        // When
        String expected = "Legend of Zelda";
        String actual = (String) mapPractice.findValueOf(map1, key);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findValueOfTest2(){
        // Given
        String key = "Mario";
        // When
        String expected = "Mario Bros.";
        String actual = (String) mapPractice.findValueOf(map1, key);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findValueOfTest3(){
    	//Test for key not in map
        // Given
        String key = "Zimu";
        // When
        String expected = null;
        String actual = (String) mapPractice.findValueOf(map1, key);
        // Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void findValueofTest4() {
    	//Test all keys
    	//Given
    	String[] keys = {"Mario","Donkey Kong","Link","Samus Aran","Yoshi","Kirby","Fox McCloud","Pikachu","Luigi","Captain Falcon","Ness","Jigglypuff"};
    	ArrayList<String> expected = new ArrayList();
    	ArrayList<String> actual = new ArrayList();
    	//When
    	for (int i=0; i<keys.length; i++) {
    		expected.add(map1.get(keys[i]).toString());
    		String temp = mapPractice.findValueOf(map1, keys[i]).toString();
    		actual.add(temp);
    	}
    	//Then
    	Assert.assertEquals(expected, actual);
    }
    

    @Test
    public void findKeysOfTest1(){
        // Given
        String value = "Donkey Kong";
        // When
        Object[] expected = {"Donkey Kong"};
        Object[] actual = mapPractice.findKeysOf(map1, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findKeysOfTest2(){
        // Given
        String value = "Devil May Cry";
        // When
        Object[] expected = {};
        Object[] actual = mapPractice.findKeysOf(map1, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findKeysOfTest3(){
        // Given
        String value = "Pokemon";
        // When
        Object[] expected = {"Jigglypuff", "Pikachu"};
        Object[] actual = mapPractice.findKeysOf(map1, value);
        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest1(){
        // Given
        Integer upTo = 20;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        expected.put(3, 2);
        expected.put(4, 3);
        expected.put(5, 5);
        expected.put(6, 8);
        expected.put(7, 13);
        expected.put(8, 21);
        expected.put(9, 34);
        expected.put(10, 55);
        expected.put(11, 89);
        expected.put(12, 144);
        expected.put(13, 233);
        expected.put(14, 377);
        expected.put(15, 610);
        expected.put(16, 987);
        expected.put(17, 1597);
        expected.put(18, 2584);
        expected.put(19, 4181);
        expected.put(20, 6765);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest2(){
        // Given
        Integer upTo = 5;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        expected.put(3, 2);
        expected.put(4, 3);
        expected.put(5, 5);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest3(){
        // Given
        Integer upTo = 2;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        expected.put(2, 1);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest4(){
        // Given
        Integer upTo = 1;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 1);
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibonacciTreeTest5(){
        // Given
        Integer upTo = 0;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        Map<Integer, Integer> actual = mapPractice.fibonacciTree(upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest1(){
        // Given
        Integer upTo = 10;
        Integer first = 2;
        Integer second = 2;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 2);
        expected.put(2, 2);
        expected.put(3, 4);
        expected.put(4, 6);
        expected.put(5, 10);
        expected.put(6, 16);
        expected.put(7, 26);
        expected.put(8, 42);
        expected.put(9, 68);
        expected.put(10, 110);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest2(){
        // Given
        Integer upTo = 8;
        Integer first = 5;
        Integer second = 2;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 5);
        expected.put(2, 2);
        expected.put(3, 7);
        expected.put(4, 9);
        expected.put(5, 16);
        expected.put(6, 25);
        expected.put(7, 41);
        expected.put(8, 66);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest3(){
        // Given
        Integer upTo = 12;
        Integer first = 3;
        Integer second = -4;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 3);
        expected.put(2, -4);
        expected.put(3, -1);
        expected.put(4, -5);
        expected.put(5, -6);
        expected.put(6, -11);
        expected.put(7, -17);
        expected.put(8, -28);
        expected.put(9, -45);
        expected.put(10, -73);
        expected.put(11, -118);
        expected.put(12, -191);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest4(){
        // Given
        Integer upTo = 1;
        Integer first = 56;
        Integer second = -4;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        expected.put(1, 56);
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void crazySpiralTest5(){
        // Given
        Integer upTo = 0;
        Integer first = 334124535;
        Integer second = -413141793;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void crazySpiralTest6(){
    	//Test for two zero
        // Given
        Integer upTo = 200;
        Integer first = 0;
        Integer second = 0;
        // When
        Map<Integer, Integer> expected = new TreeMap<Integer, Integer>();
        for (int i=0; i<200; i++) {
        	expected.put(i+1,0);
        }
        Map<Integer, Integer> actual = mapPractice.crazySpiral(first, second, upTo);
        // Then
        Assert.assertEquals(expected, actual);
    }
}
