package CollectionsTests;

import java.util.*;

import Collections.ArrayLists;

import org.junit.*;

public class ArrayListsTestOverriding extends ArrayListsTest{
	private ArrayLists arrayLists;
	
	@Before
	public void setupTest() {
		arrayLists = new ArrayLists();
	}
	
	@Test
	public void addShitTest1() {
		//Test for two list
		// Given
		ArrayList<Integer> original1 = new ArrayList<Integer>();
		for (int i=0; i<20; i++) {
			original1.add(i);
		}
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        for (int i=0; i<2; i++) {
			original2.add(i+30);
		}
        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        original1.add(30);
        original1.add(31);
        // Then
        Assert.assertEquals(original1, actual);
	}
	
	@Test
	public void addShitTest2() {
		//Test for empty list
		// Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        for (int i=0; i<20; i++) {
			original1.add(i);
		}
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        // Then
        Assert.assertEquals(original1, actual);
	}
	
	@Test
	public void addShitTest3() {
		//Test for two empty list
		// Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        // When
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        // Then
        Assert.assertEquals(original1, actual);
	}
	
	@Test
	public void addShitTogetherTest1(){
		//Test for two list
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        for (int i=0; i<20; i++) {
			original1.add(i-10);
		}
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        for (int i=0; i<10; i++) {
			original1.add(i);
		}
        // When
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 35;
        // Then
        Assert.assertEquals(expected, actual);
    }
	
	@Test
    public void addShitTogetherTest2(){
		//Test for one empty list
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        for (int i=0; i<10; i++) {
			original2.add(i);
		}
        // when
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 45;
        // Then
        Assert.assertEquals(expected, actual);
    }
	
	@Test
    public void addShitTogetherTest3(){
		//Test for two empty list
        // Given
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        // When
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 0;
        // Then
        Assert.assertEquals(expected, actual);
    }
	
	@Test
    public void removeAllTest1(){
		//Test for remove multiple Integer
        // Given
        ArrayList<Integer> original = new ArrayList<Integer>();
        for (int i=0; i<10; i++) {
			original.add(i);
		}
        original.add(9);
        // When
        Integer toRemove = 9;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        original.remove(10);
        original.remove(9);
        // Then
        Assert.assertEquals(original, actual);
    }

    @Test
    public void removeAllTest2(){
    	//Test for remove all Integer
        // Given
        ArrayList<Integer> original = new ArrayList<Integer>();
        for (int i=0; i<10; i++) {
			original.add(10);
		}
        // When
        Integer toRemove = 10;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        ArrayList<Integer> expect = new ArrayList<Integer>();
        // Then
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void removeAllTest3(){
    	//Test for remove null
        // Given
        ArrayList<Integer> original = new ArrayList<Integer>();
        for (int i=0; i<10; i++) {
			original.add(i);
		}
        // When
        Integer toRemove = null;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        // Then
        Assert.assertEquals(original, actual);
    }

    @Test
    public void happyListTest1(){
    	//Test for True case
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("Using");
        original.add("hire");
        original.add("employ");
        original.add("object");
        original.add("goingdown");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void happyListTest2(){
    	//Test for false case
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("Using");
        original.add("the");
        original.add("Hllo");
        original.add("Wrd");
        original.add("guie");
        original.add("start");
        original.add("bnch");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void happyListTest3(){
    	//Test for empty list
        // Given
        ArrayList<String> original = new ArrayList<String>();
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void happyListTest4(){
    	//Test for only one string list
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("write comments and open a pull request");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void happyListTest5(){
    	//Test for empty value
        // Given
        ArrayList<String> original = new ArrayList<String>();
        original.add("Believe");
        original.add("");
        original.add("Achieve!");
        // When
        boolean actual = arrayLists.happyList(original);
        // Then
        Assert.assertFalse(actual);
    }

}
