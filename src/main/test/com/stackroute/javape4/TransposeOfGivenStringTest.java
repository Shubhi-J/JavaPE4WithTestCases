package com.stackroute.javape4;

import org.junit.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class TransposeOfGivenStringTest {
    TransposeOfGivenString objTransposeOfGivenString;

    @Before
    public void setUp(){
        objTransposeOfGivenString=new TransposeOfGivenString();
    }

    @After
    public void tearDown() {
        objTransposeOfGivenString = null;
    }

    @BeforeClass
    public static void setUpBeforeClass(){}

    @AfterClass
    public static void tearDownAfterClass(){}

    @Test
    public void givenStringShouldReturnTranspose(){
        //assert

        //act
        String result=objTransposeOfGivenString.findTransposeOfGivenString("She sells seashells by the seashore");

        //assert
        assertEquals("erohsaes eht yb sllehsaes slles ehS",result);
    }
    @Test
    public void givenNullShouldReturnNull(){
        //assert

        //act
        String result=objTransposeOfGivenString.findTransposeOfGivenString(null);

        //assert
        assertNull(null);
    }

    @Test
    public void givenStringOfLength1ShouldReturnSameString(){
        //assert

        //act
        String result=objTransposeOfGivenString.findTransposeOfGivenString("S");

        //assert
        assertEquals("S",result);
    }


}