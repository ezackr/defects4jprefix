/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 18:10:50 GMT 2024
 */
package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.FDistribution;
import org.apache.commons.math3.random.Well19937c;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class FDistribution_ESTest extends FDistribution_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(223.0646342768073, 223.0646342768073);
        double double0 = fDistribution0.calculateNumericalVariance();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.11081436276435852, 4.0);
        fDistribution0.getSupportUpperBound();
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.11081436276435852, 4.0);
        double double0 = fDistribution0.sample();
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.11081436276435852, 4.0);
        double double0 = fDistribution0.sample();
        double double1 = fDistribution0.getNumericalVariance();
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.11081436276435852, 4.0);
        double double0 = fDistribution0.sample();
        double double1 = fDistribution0.getNumericalVariance();
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.11081436276435852, 4.0);
        double double0 = fDistribution0.sample();
        double double1 = fDistribution0.getNumericalVariance();
        fDistribution0.isSupportConnected();
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.11081436276435852, 4.0);
        double double0 = fDistribution0.sample();
        double double1 = fDistribution0.getNumericalVariance();
        fDistribution0.getNumericalMean();
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        Well19937c well19937c0 = new Well19937c(558L);
        FDistribution fDistribution0 = new FDistribution(well19937c0, 558L, 0.5080875158309937, 4.0);
        boolean boolean0 = fDistribution0.isSupportUpperBoundInclusive();
        fDistribution0.getDenominatorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        Well19937c well19937c0 = new Well19937c(558L);
        FDistribution fDistribution0 = new FDistribution(well19937c0, 558L, 0.5080875158309937, 4.0);
        boolean boolean0 = fDistribution0.isSupportUpperBoundInclusive();
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        Well19937c well19937c0 = new Well19937c(558L);
        FDistribution fDistribution0 = new FDistribution(well19937c0, 558L, 0.5080875158309937, 4.0);
        boolean boolean0 = fDistribution0.isSupportUpperBoundInclusive();
    }

    @Test(timeout = 4000)
    public void test310() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.5162794589996338, 0.5162794589996338, 2309.0260330782);
        boolean boolean0 = fDistribution0.isSupportLowerBoundInclusive();
        fDistribution0.getDenominatorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test311() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.5162794589996338, 0.5162794589996338, 2309.0260330782);
        boolean boolean0 = fDistribution0.isSupportLowerBoundInclusive();
    }

    @Test(timeout = 4000)
    public void test312() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.5162794589996338, 0.5162794589996338, 2309.0260330782);
        boolean boolean0 = fDistribution0.isSupportLowerBoundInclusive();
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test413() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.11081436276435852, 4.0);
        double double0 = fDistribution0.density(0.11081436276435852);
    }

    @Test(timeout = 4000)
    public void test514() throws Throwable {
        FDistribution fDistribution0 = null;
        fDistribution0 = new FDistribution((-964.0708713912), 2.5411510467529297, (-964.0708713912));
    }

    @Test(timeout = 4000)
    public void test615() throws Throwable {
        FDistribution fDistribution0 = null;
        fDistribution0 = new FDistribution(2.601412773132324, (-2097.546418667));
    }

    @Test(timeout = 4000)
    public void test716() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.5162794589996338, 0.5162794589996338, 2309.0260330782);
        double double0 = fDistribution0.getNumericalMean();
        fDistribution0.getDenominatorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test717() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.5162794589996338, 0.5162794589996338, 2309.0260330782);
        double double0 = fDistribution0.getNumericalMean();
    }

    @Test(timeout = 4000)
    public void test718() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.5162794589996338, 0.5162794589996338, 2309.0260330782);
        double double0 = fDistribution0.getNumericalMean();
        fDistribution0.getNumeratorDegreesOfFreedom();
    }
}
