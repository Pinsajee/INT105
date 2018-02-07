/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author INT105
 */
public class TestFirstAddTest {
    @Test
    
    public void add2NumberAndCheckResult() {
        int x = 2 , y = 3;
        int result = 5;
        int computed = TestFirstAdd.add2Integers(x , y);
        assertEquals(computed, result);
            }
    
    @Test
    public void addNumberLessThanZero() {
        int x = -2 , y = -3;
        int result = -5;
        int computed = TestFirstAdd.add2Integers(x , y);
        assertEquals(computed, result);
    } 
}
