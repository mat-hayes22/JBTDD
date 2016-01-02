package mh.maths.Fraction;

/**
 * Created by mat on 01/01/2016.
 */
public class Fraction {


    private int integerValue;

    public Fraction(int integerValue) {

        this.integerValue = integerValue;
    }

    public Fraction plus(Fraction that) {

            return new Fraction(this.integerValue + that.integerValue );
    }

    public int intValue() {
        return integerValue;
    }
}
