package com.stackroute.javape4;

import org.junit.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class CalculateMultipleOccurrencesOfAWordTest {
    CalculateMultipleOccurrencesOfAWord objCalculateMultipleOccurrencesOfAWord;

    @Before
    public void setUp(){
        objCalculateMultipleOccurrencesOfAWord=new CalculateMultipleOccurrencesOfAWord();
    }

    @After
    public void tearDown() {
        objCalculateMultipleOccurrencesOfAWord = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}

    @AfterClass
    public static void tearDownAfterClass(){}

    @Test
    public void givenStringWithMatchingWordShouldReturnOccurance(){
        //assert

        //act
        String result=objCalculateMultipleOccurrencesOfAWord.findMultipleOccurrenceOfGivenWord("She sells seashells by the seashore","se");

        //assert
        assertEquals("Found at 4-6\n" +
                "Found at 10-12\n" +
                "Found at 27-29\n",result);
    }

    @Test
    public void givenStringWithoutMatchingWordShouldReturnNotMatched(){
        //assert

        //act
        String result=objCalculateMultipleOccurrencesOfAWord.
                findMultipleOccurrenceOfGivenWord("She sells seashells by the seashore","mi");

        //assert
        assertEquals("not found",result);
    }
    @Test
    public void givenNullShouldReturnErrorMessage(){
        //assert

        //act
        String result=objCalculateMultipleOccurrencesOfAWord.
                findMultipleOccurrenceOfGivenWord(null,"mi");

        //assert
        assertEquals("input string or given word is null",result);
    }

}