package StringsTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Strings.BasicStrings;

public class BasicStringsTestOverriding extends BasicStringsTest {
	private BasicStrings basicStrings;

    @Before
    public void setup(){
        basicStrings = new BasicStrings();
    }

    @Test
    public void flipConcatTest1(){
        // Given
        String string1 = " Bunny";
        String string2 = "Bugs";
        String expected = "Bugs Bunny";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void flipConcatTest2(){
        // Given
        String string1 = " Go";
        String string2 = "Let's";
        String expected = "Let's Go";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void flipConcatTest3(){
        // Given
        String string1 = "Mario!";
        String string2 = "It's a me! ";
        String expected = "It's a me! Mario!";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void flipConcatTest4(){
    	//Test for empty string
        // Given
        String string1 = "";
        String string2 = "";
        String expected = "";
        // When
        String actual = basicStrings.flipConcat(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCharTest1(){
        // Given
        String string1 = "You can do this!";
        char expected = 'c';
        // When
        char actual = basicStrings.getChar(string1, 4);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCharTest2(){
        // Given
        String string1 = "You can do this!";
        char expected = '!';
        // When
        char actual = basicStrings.getChar(string1, 15);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSeeTest1(){
        // Given
        String string1 = "Haters";
        String expected = "      ";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSeeTest2(){
        // Given
        String string1 = "I Can't Do It";
        String expected = "             ";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void iCantSeeTest3(){
        // Given
        String string1 = "";
        String expected = "";
        // When
        String actual = basicStrings.iCantSee(string1);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loudAndClearTest1(){
        // Given
        String string = "";
        String expected = "";
        // When
        String actual = basicStrings.loudAndClear(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void loudAndClearTest2(){
        // Given
        String string = "lEt mE hEaR yOu";
        String expected = "LET ME HEAR YOU";
        // When
        String actual = basicStrings.loudAndClear(string);
        // Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void loudAndClearTest3(){
    	//Test for non charater string
        // Given
        String string = "73764&^%";
        String expected = "73764&^%";
        // When
        String actual = basicStrings.loudAndClear(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest1(){
        // Given
        String string = "lEt mE hEaR yOu";
        String expected = "LeT Me HeAr YoU";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest2(){
        // Given
        String string = "I love Y'ALL!";
        String expected = "i LOVE y'all!";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseCaseTest3(){
        // Given
        String string = "";
        String expected = "";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void reverseCaseTest4(){
    	//Test for non character string
        // Given&^%&*
        String string = "3785&^%&*8363";
        String expected = "3785&^%&*8363";
        // When
        String actual = basicStrings.reverseCase(string);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest1(){
        // Given
        String string1 = "";
        String string2 = "";
        String expected = "";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest2(){
        // Given
        String string1 = "W abs";
        String string2 = "ed et";
        String expected = "We da best";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneAtATimeTest3(){
        // Given
        String string1 = "Chr 9.0";
        String string2 = "oot";
        String expected = "Cohort 9.0";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void oneAtATimeTest4(){
    	//Test for one empty string
        // Given
        String string1 = "basicStrings";
        String string2 = "";
        String expected = "basicStrings";
        // When
        String actual = basicStrings.oneAtATime(string1, string2);
        // Then
        Assert.assertEquals(expected, actual);
    }
}