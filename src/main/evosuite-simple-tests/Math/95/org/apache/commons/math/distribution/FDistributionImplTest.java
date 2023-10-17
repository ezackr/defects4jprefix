/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 20:23:31 GMT 2023
 */
package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.distribution.FDistributionImpl;
import org.junit.runner.RunWith;

public class FDistributionImplTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        FDistributionImpl fDistributionImpl0 = null;
        try {
            fDistributionImpl0 = new FDistributionImpl(1122.5185115, (-1684.087766816052));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // degrees of freedom must be positive.
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2421.0, 2421.0);
        // Undeclared exception!
        try {
            fDistributionImpl0.inverseCumulativeProbability((-1.643181065367639E-4));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // p must be between 0.0 and 1.0, inclusive.
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1701.2, 3161.329915527);
        double double0 = fDistributionImpl0.getInitialDomain((-9.837447530487956E-5));
        assertEquals(1701.2, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1701.2, 3161.329915527);
        double double0 = fDistributionImpl0.getInitialDomain((-9.837447530487956E-5));
        assertEquals(1.000633045631028, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(8.441822398385275E-5, 0.9999999999999971);
        double double0 = fDistributionImpl0.getInitialDomain(0.9995456442973051);
        assertEquals(8.441822398385275E-5, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(8.441822398385275E-5, 0.9999999999999971);
        double double0 = fDistributionImpl0.getInitialDomain(0.9995456442973051);
        assertEquals((-0.9999999999999942), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1701.2, 3161.329915527);
        double double0 = fDistributionImpl0.getDomainUpperBound(417.040445);
        assertEquals(1.7976931348623157E308, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1701.2, 3161.329915527);
        double double0 = fDistributionImpl0.getDomainUpperBound(417.040445);
        assertEquals(1701.2, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1701.2, 3161.329915527);
        double double0 = fDistributionImpl0.getDomainUpperBound(417.040445);
        assertEquals(3161.329915527, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1701.2, 3161.329915527);
        double double0 = fDistributionImpl0.getDomainLowerBound(1023.111003045955);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test0510() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1701.2, 3161.329915527);
        double double0 = fDistributionImpl0.getDomainLowerBound(1023.111003045955);
        assertEquals(3161.329915527, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test0511() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1701.2, 3161.329915527);
        double double0 = fDistributionImpl0.getDomainLowerBound(1023.111003045955);
        assertEquals(1701.2, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test0612() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1107.0, 1.0E-14);
        double double0 = fDistributionImpl0.cumulativeProbability(1.0E-14);
        assertEquals((-1.5787371410169726E-13), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test0813() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1389.8747, 1389.8747);
        // Undeclared exception!
        try {
            fDistributionImpl0.inverseCumulativeProbability(1.7976931348623157E308);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // p must be between 0.0 and 1.0, inclusive.
        }
    }

    @Test(timeout = 4000)
    public void test0914() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1701.2, 3161.329915527);
        fDistributionImpl0.setDenominatorDegreesOfFreedom(1023.111003045955);
        assertEquals(1023.111003045955, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1015() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(4347.3109934, 4347.3109934);
        // Undeclared exception!
        try {
            fDistributionImpl0.setNumeratorDegreesOfFreedom(0.0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // degrees of freedom must be positive.
        }
    }

    @Test(timeout = 4000)
    public void test1116() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.7976931348623157E308);
        double double0 = fDistributionImpl0.cumulativeProbability((-1817.526));
        assertEquals(1.7976931348623157E308, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1117() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.7976931348623157E308);
        double double0 = fDistributionImpl0.cumulativeProbability((-1817.526));
        assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1118() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.7976931348623157E308);
        double double0 = fDistributionImpl0.cumulativeProbability((-1817.526));
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1219() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1701.2, 3161.329915527);
        double double0 = fDistributionImpl0.getDenominatorDegreesOfFreedom();
        assertEquals(1701.2, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1220() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1701.2, 3161.329915527);
        double double0 = fDistributionImpl0.getDenominatorDegreesOfFreedom();
        assertEquals(3161.329915527, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1321() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1701.2, 3161.329915527);
        double double0 = fDistributionImpl0.getNumeratorDegreesOfFreedom();
        assertEquals(3161.329915527, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1322() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1701.2, 3161.329915527);
        double double0 = fDistributionImpl0.getNumeratorDegreesOfFreedom();
        assertEquals(1701.2, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1423() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(8.441822398385275E-5, 0.9999999999999971);
        // Undeclared exception!
        try {
            fDistributionImpl0.setDenominatorDegreesOfFreedom(0.0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // degrees of freedom must be positive.
        }
    }

    @Test(timeout = 4000)
    public void test1524() throws Throwable {
        FDistributionImpl fDistributionImpl0 = null;
        try {
            fDistributionImpl0 = new FDistributionImpl((-2976.553895288), (-2976.553895288));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // degrees of freedom must be positive.
        }
    }

    @Test(timeout = 4000)
    public void test1625() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1389.8747, 1389.8747);
        double double0 = fDistributionImpl0.inverseCumulativeProbability(1.0);
        assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1626() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1389.8747, 1389.8747);
        double double0 = fDistributionImpl0.inverseCumulativeProbability(1.0);
        assertEquals(1389.8747, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1627() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1389.8747, 1389.8747);
        double double0 = fDistributionImpl0.inverseCumulativeProbability(1.0);
        assertEquals(1389.8747, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1728() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2446.3075409, 2446.3075409);
        double double0 = fDistributionImpl0.inverseCumulativeProbability(0.0);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1729() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2446.3075409, 2446.3075409);
        double double0 = fDistributionImpl0.inverseCumulativeProbability(0.0);
        assertEquals(2446.3075409, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1730() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2446.3075409, 2446.3075409);
        double double0 = fDistributionImpl0.inverseCumulativeProbability(0.0);
        assertEquals(2446.3075409, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1831() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(234.30556717516757, 234.30556717516757);
        try {
            fDistributionImpl0.inverseCumulativeProbability(0.9999999999999999);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Number of iterations=2, maximum iterations=2,147,483,647, initial=1.009, lower bound=0, upper bound=179,769,313,486,231,570,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000, final a value=0, final b value=3.009, f(a)=-1, f(b)=0
        }
    }

    @Test(timeout = 4000)
    public void test1932() throws Throwable {
        FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1389.8747, 1389.8747);
        double double0 = fDistributionImpl0.cumulativeProbability(1389.8747);
        assertEquals(1.0, double0, 0.01);
    }
}
