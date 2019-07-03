package com.stackroute.javape4;

import org.junit.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class FindOccurrenceOfCharacterInStringTest {
    FindOccurrenceOfCharacterInString objFindOccurrenceOfCharacterInString;

    @Before
    public void setUp(){
        objFindOccurrenceOfCharacterInString=new FindOccurrenceOfCharacterInString();
    }

    @After
    public void tearDown() {
        objFindOccurrenceOfCharacterInString = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}

    @AfterClass
    public static void tearDownAfterClass(){}

    @Test
    public void givenStringShouldReturnOccurranceOfA(){
        //assert

        //act
        String result=objFindOccurrenceOfCharacterInString.findOccurrenceOfCharacterInString("Java is java again java again",'a');

        //assert
        assertEquals("Number of occurrance of a is 10",result);
    }

    @Test
    public void givenStringWithoutMShouldReturnOccuranceOfZeroOccurrance(){
        //assert

        //act
        String result=objFindOccurrenceOfCharacterInString.findOccurrenceOfCharacterInString("Java is java again java again",'m');

        //assert
        assertEquals("Number of occurrance of m is 0",result);
    }

    @Test
    public void givenNullShouldReturnNull(){
        //assert

        //act
        String result=objFindOccurrenceOfCharacterInString.findOccurrenceOfCharacterInString(null,'m');

        //assert
        assertNull(null);
    }

}