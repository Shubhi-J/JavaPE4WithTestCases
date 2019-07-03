package com.stackroute.javape4;

import org.junit.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class SortWordsOfStringTest {
    SortWordsOfString objSortWordsOfString;

    @Before
    public void setUp(){
        objSortWordsOfString=new SortWordsOfString();
    }

    @After
    public void tearDown() {
        objSortWordsOfString = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}

    @AfterClass
    public static void tearDownAfterClass(){}

    @Test
    public void givenStringShouldReturnStringAfterSorting(){
        //assert

        //act
        String result=objSortWordsOfString.sortWordsInParagraph("I am Shubhi");

        //assert
        assertEquals("am I Shubhi",result);
    }

    @Test
    public void givenNullShouldReturnNull(){
        //assert

        //act
        String result=objSortWordsOfString.sortWordsInParagraph(null);

        //assert
        assertNull(null);
    }

    @Test
    public void givenNumericStringShouldReturnSortedNumericString(){
        //assert

        //act
        String result=objSortWordsOfString.sortWordsInParagraph("65 12 09 90");

        //assert
        assertEquals("09 12 65 90",result);
    }

}