/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 00:02:37 GMT 2024
 */
package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.fraction.Fraction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Fraction_ESTest extends Fraction_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Fraction fraction0 = Fraction.MINUS_ONE;
        long long0 = fraction0.longValue();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Fraction fraction0 = Fraction.MINUS_ONE;
        Fraction fraction1 = fraction0.MINUS_ONE.add(fraction0);
        fraction1.getDenominator();
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        Fraction fraction0 = Fraction.MINUS_ONE;
        Fraction fraction1 = fraction0.MINUS_ONE.add(fraction0);
        fraction1.longValue();
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Fraction fraction0 = Fraction.MINUS_ONE;
        fraction0.hashCode();
        fraction0.getDenominator();
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        Fraction fraction0 = Fraction.MINUS_ONE;
        fraction0.hashCode();
        fraction0.getNumerator();
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        Fraction fraction0 = new Fraction(2230.7586);
        Fraction fraction1 = fraction0.subtract(fraction0);
        fraction1.getDenominator();
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        Fraction fraction0 = new Fraction(2230.7586);
        Fraction fraction1 = fraction0.subtract(fraction0);
        fraction1.floatValue();
    }

    @Test(timeout = 4000)
    public void test037() throws Throwable {
        Fraction fraction0 = new Fraction(2230.7586);
        Fraction fraction1 = fraction0.subtract(fraction0);
        fraction0.getDenominator();
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        Fraction fraction0 = Fraction.ONE;
        float float0 = fraction0.floatValue();
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        Fraction fraction0 = null;
        fraction0 = new Fraction((double) 5, 5);
    }

    @Test(timeout = 4000)
    public void test0610() throws Throwable {
        Fraction fraction0 = Fraction.MINUS_ONE;
        int int0 = fraction0.intValue();
    }

    @Test(timeout = 4000)
    public void test0711() throws Throwable {
        Fraction fraction0 = null;
        fraction0 = new Fraction(Double.POSITIVE_INFINITY);
    }

    @Test(timeout = 4000)
    public void test0812() throws Throwable {
        Fraction fraction0 = new Fraction(Integer.MIN_VALUE);
        fraction0.negate();
    }

    @Test(timeout = 4000)
    public void test0913() throws Throwable {
        Fraction fraction0 = null;
        fraction0 = new Fraction((double) 570, 570);
    }

    @Test(timeout = 4000)
    public void test1014() throws Throwable {
        Fraction fraction0 = null;
        fraction0 = new Fraction((-3131.8932626321), (-3131.8932626321), (-618));
    }

    @Test(timeout = 4000)
    public void test1115() throws Throwable {
        Fraction fraction0 = new Fraction(3941.159081, 570);
        fraction0.doubleValue();
    }

    @Test(timeout = 4000)
    public void test1216() throws Throwable {
        Fraction fraction0 = null;
        fraction0 = new Fraction(0, 0);
    }

    @Test(timeout = 4000)
    public void test1317() throws Throwable {
        Fraction fraction0 = null;
        fraction0 = new Fraction(1963, Integer.MIN_VALUE);
    }

    @Test(timeout = 4000)
    public void test1418() throws Throwable {
        Fraction fraction0 = null;
        fraction0 = new Fraction(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Test(timeout = 4000)
    public void test1519() throws Throwable {
        Fraction fraction0 = new Fraction((-1), (-1));
        fraction0.getNumerator();
    }

    @Test(timeout = 4000)
    public void test1520() throws Throwable {
        Fraction fraction0 = new Fraction((-1), (-1));
        fraction0.doubleValue();
    }

    @Test(timeout = 4000)
    public void test1621() throws Throwable {
        Fraction fraction0 = new Fraction(641, 641);
        fraction0.floatValue();
    }

    @Test(timeout = 4000)
    public void test1622() throws Throwable {
        Fraction fraction0 = new Fraction(641, 641);
        fraction0.getNumerator();
    }

    @Test(timeout = 4000)
    public void test1723() throws Throwable {
        Fraction fraction0 = Fraction.MINUS_ONE;
        Fraction fraction1 = fraction0.abs();
        fraction1.getDenominator();
    }

    @Test(timeout = 4000)
    public void test1724() throws Throwable {
        Fraction fraction0 = Fraction.MINUS_ONE;
        Fraction fraction1 = fraction0.abs();
        fraction1.shortValue();
    }

    @Test(timeout = 4000)
    public void test1825() throws Throwable {
        Fraction fraction0 = Fraction.TWO;
        Fraction fraction1 = fraction0.abs();
        fraction1.byteValue();
    }

    @Test(timeout = 4000)
    public void test1926() throws Throwable {
        Fraction fraction0 = Fraction.ZERO;
        int int0 = fraction0.compareTo(fraction0);
        fraction0.doubleValue();
    }

    @Test(timeout = 4000)
    public void test1927() throws Throwable {
        Fraction fraction0 = Fraction.ZERO;
        int int0 = fraction0.compareTo(fraction0);
    }

    @Test(timeout = 4000)
    public void test2028() throws Throwable {
        Fraction fraction0 = Fraction.ZERO;
        Fraction fraction1 = Fraction.MINUS_ONE;
        int int0 = fraction1.compareTo(fraction0);
    }

    @Test(timeout = 4000)
    public void test2029() throws Throwable {
        Fraction fraction0 = Fraction.ZERO;
        Fraction fraction1 = Fraction.MINUS_ONE;
        int int0 = fraction1.compareTo(fraction0);
        fraction1.floatValue();
    }

    @Test(timeout = 4000)
    public void test2130() throws Throwable {
        Fraction fraction0 = Fraction.MINUS_ONE;
        Fraction fraction1 = Fraction.TWO;
        int int0 = fraction1.compareTo(fraction0);
    }

    @Test(timeout = 4000)
    public void test2131() throws Throwable {
        Fraction fraction0 = Fraction.MINUS_ONE;
        Fraction fraction1 = Fraction.TWO;
        int int0 = fraction1.compareTo(fraction0);
        fraction1.longValue();
    }

    @Test(timeout = 4000)
    public void test2232() throws Throwable {
        Fraction fraction0 = Fraction.ONE;
        Fraction fraction1 = fraction0.subtract(fraction0);
        boolean boolean0 = fraction0.equals(fraction1);
    }

    @Test(timeout = 4000)
    public void test2233() throws Throwable {
        Fraction fraction0 = Fraction.ONE;
        Fraction fraction1 = fraction0.subtract(fraction0);
        boolean boolean0 = fraction0.equals(fraction1);
        fraction1.getDenominator();
    }

    @Test(timeout = 4000)
    public void test2234() throws Throwable {
        Fraction fraction0 = Fraction.ONE;
        Fraction fraction1 = fraction0.subtract(fraction0);
        boolean boolean0 = fraction0.equals(fraction1);
        fraction1.equals((Object) fraction0);
    }

    @Test(timeout = 4000)
    public void test2235() throws Throwable {
        Fraction fraction0 = Fraction.ONE;
        Fraction fraction1 = fraction0.subtract(fraction0);
        boolean boolean0 = fraction0.equals(fraction1);
        fraction1.doubleValue();
    }

    @Test(timeout = 4000)
    public void test2336() throws Throwable {
        Fraction fraction0 = Fraction.TWO;
        boolean boolean0 = fraction0.equals(fraction0);
    }

    @Test(timeout = 4000)
    public void test2437() throws Throwable {
        Fraction fraction0 = Fraction.TWO;
        boolean boolean0 = fraction0.equals((Object) null);
    }

    @Test(timeout = 4000)
    public void test2538() throws Throwable {
        Fraction fraction0 = Fraction.ONE;
        Fraction fraction1 = Fraction.getReducedFraction(1, 2);
        Fraction fraction2 = fraction1.subtract(fraction0);
        Fraction fraction3 = Fraction.MINUS_ONE;
        boolean boolean0 = fraction3.equals(fraction2);
        fraction2.equals((Object) fraction3);
    }

    @Test(timeout = 4000)
    public void test2539() throws Throwable {
        Fraction fraction0 = Fraction.ONE;
        Fraction fraction1 = Fraction.getReducedFraction(1, 2);
        Fraction fraction2 = fraction1.subtract(fraction0);
        Fraction fraction3 = Fraction.MINUS_ONE;
        boolean boolean0 = fraction3.equals(fraction2);
        fraction0.equals((Object) fraction3);
    }

    @Test(timeout = 4000)
    public void test2540() throws Throwable {
        Fraction fraction0 = Fraction.ONE;
        Fraction fraction1 = Fraction.getReducedFraction(1, 2);
        Fraction fraction2 = fraction1.subtract(fraction0);
        Fraction fraction3 = Fraction.MINUS_ONE;
        boolean boolean0 = fraction3.equals(fraction2);
    }

    @Test(timeout = 4000)
    public void test2541() throws Throwable {
        Fraction fraction0 = Fraction.ONE;
        Fraction fraction1 = Fraction.getReducedFraction(1, 2);
        Fraction fraction2 = fraction1.subtract(fraction0);
        Fraction fraction3 = Fraction.MINUS_ONE;
        boolean boolean0 = fraction3.equals(fraction2);
        fraction2.getNumerator();
    }

    @Test(timeout = 4000)
    public void test2542() throws Throwable {
        Fraction fraction0 = Fraction.ONE;
        Fraction fraction1 = Fraction.getReducedFraction(1, 2);
        Fraction fraction2 = fraction1.subtract(fraction0);
        Fraction fraction3 = Fraction.MINUS_ONE;
        boolean boolean0 = fraction3.equals(fraction2);
        fraction2.floatValue();
    }

    @Test(timeout = 4000)
    public void test2643() throws Throwable {
        Fraction fraction0 = Fraction.ZERO;
        Fraction fraction1 = fraction0.negate();
        boolean boolean0 = fraction1.equals(fraction0);
    }

    @Test(timeout = 4000)
    public void test2744() throws Throwable {
        Fraction fraction0 = Fraction.ONE;
        fraction0.add((Fraction) null);
    }

    @Test(timeout = 4000)
    public void test2845() throws Throwable {
        Fraction fraction0 = Fraction.ZERO;
        Fraction fraction1 = fraction0.add(fraction0);
    }

    @Test(timeout = 4000)
    public void test2946() throws Throwable {
        Fraction fraction0 = Fraction.ZERO;
        Fraction fraction1 = fraction0.subtract(fraction0);
        fraction1.equals((Object) fraction0);
    }

    @Test(timeout = 4000)
    public void test2947() throws Throwable {
        Fraction fraction0 = Fraction.ZERO;
        Fraction fraction1 = fraction0.subtract(fraction0);
    }

    @Test(timeout = 4000)
    public void test3048() throws Throwable {
        Fraction fraction0 = Fraction.getReducedFraction(8, 2826);
        Fraction fraction1 = fraction0.add(fraction0);
        fraction1.doubleValue();
    }

    @Test(timeout = 4000)
    public void test3049() throws Throwable {
        Fraction fraction0 = Fraction.getReducedFraction(8, 2826);
        Fraction fraction1 = fraction0.add(fraction0);
        fraction0.getNumerator();
    }

    @Test(timeout = 4000)
    public void test3150() throws Throwable {
        Fraction fraction0 = new Fraction((-2146085373), 100);
        Fraction fraction1 = new Fraction((-2146085373), 688);
        fraction0.subtract(fraction1);
    }

    @Test(timeout = 4000)
    public void test3251() throws Throwable {
        Fraction fraction0 = Fraction.TWO;
        Fraction fraction1 = fraction0.ONE.divide(fraction0);
        fraction1.doubleValue();
    }

    @Test(timeout = 4000)
    public void test3352() throws Throwable {
        Fraction fraction0 = Fraction.ZERO;
        fraction0.multiply((Fraction) null);
    }

    @Test(timeout = 4000)
    public void test3453() throws Throwable {
        Fraction fraction0 = Fraction.MINUS_ONE;
        Fraction fraction1 = fraction0.ZERO.multiply(fraction0);
        fraction1.getNumerator();
    }

    @Test(timeout = 4000)
    public void test3554() throws Throwable {
        Fraction fraction0 = Fraction.ZERO;
        Fraction fraction1 = fraction0.MINUS_ONE.multiply(fraction0);
        fraction1.doubleValue();
    }

    @Test(timeout = 4000)
    public void test3655() throws Throwable {
        Fraction fraction0 = Fraction.MINUS_ONE;
        fraction0.divide((Fraction) null);
    }

    @Test(timeout = 4000)
    public void test3756() throws Throwable {
        Fraction fraction0 = Fraction.ZERO;
        fraction0.ONE.divide(fraction0);
    }

    @Test(timeout = 4000)
    public void test3857() throws Throwable {
        Fraction.getReducedFraction(0, 0);
    }

    @Test(timeout = 4000)
    public void test3958() throws Throwable {
        Fraction fraction0 = Fraction.getReducedFraction(0, 3950);
        fraction0.doubleValue();
    }

    @Test(timeout = 4000)
    public void test4059() throws Throwable {
        Fraction fraction0 = Fraction.getReducedFraction(Integer.MIN_VALUE, Integer.MIN_VALUE);
        fraction0.getDenominator();
    }

    @Test(timeout = 4000)
    public void test4060() throws Throwable {
        Fraction fraction0 = Fraction.getReducedFraction(Integer.MIN_VALUE, Integer.MIN_VALUE);
        fraction0.doubleValue();
    }

    @Test(timeout = 4000)
    public void test4161() throws Throwable {
        Fraction.getReducedFraction(629, Integer.MIN_VALUE);
    }

    @Test(timeout = 4000)
    public void test4262() throws Throwable {
        Fraction.getReducedFraction(Integer.MIN_VALUE, (-2115431652));
    }
}
