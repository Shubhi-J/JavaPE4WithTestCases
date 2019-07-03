package com.stackroute.javape4;

import org.junit.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNull;

public class ReplaceCharactersTest{
        ReplaceCharacters objReplaceCharacters;

        @Before
        public void setUp(){
            objReplaceCharacters=new ReplaceCharacters();
        }

        @After
        public void tearDown() {
            objReplaceCharacters = null;
        }

        @BeforeClass
        public static void setUpBeforeClass(){}

        @AfterClass
        public static void tearDownAfterClass(){}

        @Test
        public void givenStringShouldReturnStringReplacingDwithFAndLWithT(){
            //assert

            //act
            String result=objReplaceCharacters.replaceCharacters("Delta");

            //assert
            assertEquals("Detta",result);
         }

        @Test
        public void givenStringWithoutdAndfShouldReturnInputString(){
            //assert

            //act
            String result=objReplaceCharacters.replaceCharacters("Shubhi");

            //assert
            assertEquals("Shubhi",result);
         }
        @Test
        public void givenNullShouldReturnNull(){
            //assert

            //act
            String result=objReplaceCharacters.replaceCharacters(null);

            //assert
            assertNull(null);
    }
    }


