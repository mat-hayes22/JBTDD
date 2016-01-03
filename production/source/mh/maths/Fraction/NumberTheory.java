package mh.maths.Fraction;

/**
 * Created by mat on 03/01/2016.
 */
public class NumberTheory {


    public static int gcd(int a, int b) {

        while (b != 0){
            int t=b;
            b = a%t;
            a =t;
        }
        return Math.abs(a);
    }
}
