package mh.maths.Fraction;

/**
 * Created by mat on 01/01/2016.
 */
public class Fraction {


    private final int denominator;
    private final int integerValue;
    private final int numerator;

    public Fraction(int integerValue) {

        this.integerValue = integerValue;
        this.numerator = integerValue;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.integerValue = numerator;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {

            return new Fraction(this.integerValue + that.integerValue, denominator );
    }

    public int intValue() {
        return integerValue;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
