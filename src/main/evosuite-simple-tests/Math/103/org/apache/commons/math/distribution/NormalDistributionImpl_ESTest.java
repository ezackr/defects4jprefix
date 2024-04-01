/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 21:41:34 GMT 2023
 */
package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.NormalDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class NormalDistributionImpl_ESTest extends NormalDistributionImpl_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.getMean();
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.getMean();
        assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(1038.4, 1038.4);
        double double0 = normalDistributionImpl0.getMean();
        assertEquals(1038.4, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(1038.4, 1038.4);
        double double0 = normalDistributionImpl0.getMean();
        assertEquals(1038.4, normalDistributionImpl0.getStandardDeviation(), 0.01);
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.getInitialDomain(Double.NaN);
        assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.getInitialDomain(Double.NaN);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(3.6899182659531625E-6, 3.6899182659531625E-6);
        double double0 = normalDistributionImpl0.getDomainUpperBound(2.0);
        assertEquals(3.6899182659531625E-6, normalDistributionImpl0.getMean(), 0.01);
    }

    @Test(timeout = 4000)
    public void test037() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(3.6899182659531625E-6, 3.6899182659531625E-6);
        double double0 = normalDistributionImpl0.getDomainUpperBound(2.0);
        assertEquals(1.7976931348623157E308, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test038() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(3.6899182659531625E-6, 3.6899182659531625E-6);
        double double0 = normalDistributionImpl0.getDomainUpperBound(2.0);
        assertEquals(3.6899182659531625E-6, normalDistributionImpl0.getStandardDeviation(), 0.01);
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(1566.870848947, Double.NaN);
        normalDistributionImpl0.setMean((-476.980596301455));
        double double0 = normalDistributionImpl0.getDomainUpperBound(0.0);
        assertEquals((-476.980596301455), normalDistributionImpl0.getMean(), 0.01);
    }

    @Test(timeout = 4000)
    public void test0410() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(1566.870848947, Double.NaN);
        normalDistributionImpl0.setMean((-476.980596301455));
        double double0 = normalDistributionImpl0.getDomainUpperBound(0.0);
        assertEquals((-476.980596301455), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test0511() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.getDomainLowerBound(721.84913012);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test0512() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.getDomainLowerBound(721.84913012);
        assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
    }

    @Test(timeout = 4000)
    public void test0613() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl((-1211.19838853756), 743.307826060422);
        normalDistributionImpl0.setMean(1.7976931348623157E308);
        double double0 = normalDistributionImpl0.getDomainLowerBound(743.307826060422);
        assertEquals(1.7976931348623157E308, normalDistributionImpl0.getMean(), 0.01);
    }

    @Test(timeout = 4000)
    public void test0614() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl((-1211.19838853756), 743.307826060422);
        normalDistributionImpl0.setMean(1.7976931348623157E308);
        double double0 = normalDistributionImpl0.getDomainLowerBound(743.307826060422);
        assertEquals(1.7976931348623157E308, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test0715() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(57.15623566586292);
        double double0 = normalDistributionImpl0.cumulativeProbability((-1218.38709386323));
        assertEquals(57.15623566586292, normalDistributionImpl0.getStandardDeviation(), 0.01);
    }

    @Test(timeout = 4000)
    public void test0716() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        normalDistributionImpl0.setStandardDeviation(57.15623566586292);
        double double0 = normalDistributionImpl0.cumulativeProbability((-1218.38709386323));
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test0817() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.cumulativeProbability(0.0);
        assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
    }

    @Test(timeout = 4000)
    public void test0818() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.cumulativeProbability(0.0);
        assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
    }

    @Test(timeout = 4000)
    public void test0819() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.cumulativeProbability(0.0);
        assertEquals(0.5, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test0920() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.cumulativeProbability((-36.04));
        assertEquals((-4.141131881851834E-14), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test0921() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.cumulativeProbability((-36.04));
        assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1022() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(3.399464998481189E-5, 2649.993);
        // Undeclared exception!
        normalDistributionImpl0.inverseCumulativeProbability(3.399464998481189E-5);
    }

    @Test(timeout = 4000)
    public void test1123() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(Double.NaN, Double.NaN);
        try {
            normalDistributionImpl0.inverseCumulativeProbability(Double.NaN);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Maximal number of iterations (100) exceeded
            //
            verifyException("org.apache.commons.math.analysis.BrentSolver", e);
        }
    }

    @Test(timeout = 4000)
    public void test1224() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        // Undeclared exception!
        try {
            normalDistributionImpl0.inverseCumulativeProbability(1693.465677);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // p must be between 0.0 and 1.0, inclusive.
            //
            verifyException("org.apache.commons.math.distribution.AbstractContinuousDistribution", e);
        }
    }

    @Test(timeout = 4000)
    public void test1325() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        // Undeclared exception!
        normalDistributionImpl0.cumulativeProbability((-871.2354225365));
    }

    @Test(timeout = 4000)
    public void test1426() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = null;
        try {
            normalDistributionImpl0 = new NormalDistributionImpl((-2289.0505632029985), (-36.04));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Standard deviation must be positive.
            //
            verifyException("org.apache.commons.math.distribution.NormalDistributionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test1527() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.getStandardDeviation();
        assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1528() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.getStandardDeviation();
        assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1629() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl((-1.0), Double.NaN);
        double double0 = normalDistributionImpl0.getMean();
        assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1730() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.getInitialDomain(1.0);
        assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1731() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.getInitialDomain(1.0);
        assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1832() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.getDomainLowerBound((-290.6555688));
        assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1833() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.getDomainLowerBound((-290.6555688));
        assertEquals((-1.7976931348623157E308), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1834() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.getDomainLowerBound((-290.6555688));
        assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1935() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.inverseCumulativeProbability(1.0);
        assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1936() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.inverseCumulativeProbability(1.0);
        assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1937() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.inverseCumulativeProbability(1.0);
        assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
    }

    @Test(timeout = 4000)
    public void test2038() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.inverseCumulativeProbability(0.0);
        assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test2039() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.inverseCumulativeProbability(0.0);
        assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
    }

    @Test(timeout = 4000)
    public void test2040() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.inverseCumulativeProbability(0.0);
        assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
    }

    @Test(timeout = 4000)
    public void test2141() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.inverseCumulativeProbability(0.5);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test2142() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.inverseCumulativeProbability(0.5);
        assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
    }

    @Test(timeout = 4000)
    public void test2243() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        // Undeclared exception!
        try {
            normalDistributionImpl0.setStandardDeviation(0.0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Standard deviation must be positive.
            //
            verifyException("org.apache.commons.math.distribution.NormalDistributionImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test2344() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.getInitialDomain((-1878.384842));
        assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test2345() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.getInitialDomain((-1878.384842));
        assertEquals(0.0, normalDistributionImpl0.getMean(), 0.01);
    }

    @Test(timeout = 4000)
    public void test2446() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.getDomainUpperBound((-1569.30441100995));
        assertEquals(1.0, normalDistributionImpl0.getStandardDeviation(), 0.01);
    }

    @Test(timeout = 4000)
    public void test2447() throws Throwable {
        NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
        double double0 = normalDistributionImpl0.getDomainUpperBound((-1569.30441100995));
        assertEquals(0.0, double0, 0.01);
    }
}
