package com.stackroute.javape4;

import org.junit.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class FindHarryInAStringTest {
    FindHarryInAString objFindHarryInAString;

    @Before
    public void setUp(){
        objFindHarryInAString=new FindHarryInAString();
    }

    @After
    public void tearDown() {
        objFindHarryInAString = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}

    @AfterClass
    public static void tearDownAfterClass(){}

    @Test
    public void givenStringWithHarryShouldReturnTrue(){
        //assert

        //act
        boolean result=objFindHarryInAString.findHarryInGivenString("My name is Harry");

        //assert
        assertEquals(true,result);
    }

    @Test
    public void givenStringWithoutHarryShouldReturnFalse(){
        //assert

        //act
        boolean result=objFindHarryInAString.findHarryInGivenString("My name is arry");

        //assert
        assertEquals(false,result);
    }

    @Test
    public void givenNullShouldReturnNull(){
        //assert

        //act
        boolean result=objFindHarryInAString.findHarryInGivenString("My name is arry");

        //assert
        assertEquals(false,result);
    }
}