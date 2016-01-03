package mh.maths.Fraction;

import static mh.maths.Fraction.NumberTheory.gcd;

/**
 * Created by mat on 01/01/2016.
 */
public class Fraction {


    private final int denominator;
    private final int numerator;

    public Fraction(int integerValue) {
        this(integerValue,1);
    }

    public Fraction(int numerator, int denominator) {
        final int signOfDenom = denominator < 0 ? -1 : 1;
        // CONTRACT : GCD never returns 0
        final int gcd = gcd(numerator, denominator) * signOfDenom;
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Fraction plus(Fraction that) {
            return new Fraction(this.numerator * that.denominator + that.numerator * this.denominator,
                    this.denominator * that.denominator);
    }

    @Override
    public boolean equals(Object other) {

        if (other instanceof Fraction) {
            Fraction that = (Fraction)other;
            return this.numerator == that.numerator
                    && this.denominator == that.denominator;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * denominator + numerator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}
