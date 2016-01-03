package mh.maths.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mat on 03/01/2016.
 */
public class GreatestCommonDivisorTest {

    @Test
    public void oneAndOne() throws Exception {
        assertEquals(1, gcd(1,1));
    }

    private int gcd(int a, int b) {

         while (b != 0){
            int t=b;
            b = a%t;
            a =t;
        }
        return a;
    }
}

