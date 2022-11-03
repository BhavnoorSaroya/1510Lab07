/**
 * 
 */
package ca.bcit.comp1510.lab07;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

/**
 * @author saroy
 *
 */
class TestThisTest {
    TestThis tester = new TestThis();
    /**
     * Test method for {@link ca.bcit.comp1510.lab07.TestThis#largest(int, int, int)}.
     */
    @Test
    void testLargestIntIntInt() {
        int randNum1 = (int) (Math.random()*100);
        int randNum2 = randNum1 - 1;
        int randNum3 = randNum2 - 1;
        
        assertEquals(tester.largest(randNum3, randNum2, randNum1), randNum1);
    }
    
    /**
     * Test method for {@link ca.bcit.comp1510.lab07.TestThis#largest(int, int, int)}.
     */
    @Test
    void testLargestIntIntInt2() {
        assertEquals(tester.largest(1, 2, 3), 3);
    }
    
    /**
     * Test method for {@link ca.bcit.comp1510.lab07.TestThis#largest(int, int, int)}.
     */
    @Test
    void testLargestIntIntInt3() {
        assertEquals(tester.largest(6 , 6, 9), 9);
    }
    
    
 
    /**
     * Test method for {@link ca.bcit.comp1510.lab07.TestThis#largest(java.util.List)}.
     */
    @Test
//    void testLargestListOfInteger() {
//        int j = 10;
//        ArrayList<Integer> ints = new ArrayList<Integer>();
//        for(int i = 0; i < j; i++) {
//            ints.add((int) (Math.random()*100 - i * 100));
//        }
//        assertEquals(tester.largest(ints), ints.get(0)); 
//    }
    
    
    void testLargestListOfInteger() {
        int j = 10;
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(-1);
        ints.add(1);
        ints.add(3);
        assertEquals(tester.largest(ints), 3); 
    }
    
    
    
    
    /**
     * Test method for {@link ca.bcit.comp1510.lab07.TestThis#largest(java.util.List)}.
     */
    @Test
    void testLargestListOfInteger2() {
        //int j = 10; 
        ArrayList<Integer> ints2 = new ArrayList<Integer>();
        ints2.add(1);
        ints2.add(3);
        ints2.add(-1);
        assertEquals(tester.largest(ints2), 3); 
    }
    
    /**
     * Test method for {@link ca.bcit.comp1510.lab07.TestThis#largest(java.util.List)}.
     */
    @Test
    void testLargestListOfInteger3() {
        
        //int j = (int) (Math.random()*10);

        ArrayList<Integer> ints3 = new ArrayList<Integer>();
        
        ints3.add(3);

        ints3.add(-1);

        ints3.add(1);

        assertEquals(tester.largest(ints3), 3); 
    } 
    
    
//    void testLargestListOfInteger2() {
//        int j = 100;
//        ArrayList<Integer> ints2 = new ArrayList<Integer>(j);
//        for(int i = 0; i < j; i++) {
//            ints2.add((int) (Math.random()*100 - i * 2));
//        }
//        assertEquals(tester.largest(ints2), ints2.get(0));
//    }
//    
//    
//    void testLargestListOfInteger3() {
//        int j = 1000;
//        ArrayList<Integer> ints3 = new ArrayList<Integer>(j);
//        for(int i = 0; i < j; i++) {
//            ints3.add((int) (Math.random()*100 - i * 4));
//        }
//        assertEquals(tester.largest(ints3), ints3.get(0));
//    }

}
