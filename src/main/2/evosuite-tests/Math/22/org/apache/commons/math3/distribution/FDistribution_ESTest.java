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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FDistribution_ESTest extends FDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(223.0646342768073, 223.0646342768073);
      double double0 = fDistribution0.calculateNumericalVariance();
      assertEquals(0.018507991859445568, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(0.11081436276435852, 4.0);
      assertEquals(Double.POSITIVE_INFINITY, fDistribution0.getSupportUpperBound(), 0.01);
      
      double double0 = fDistribution0.sample();
      assertEquals(2.433110275776629, double0, 0.01);
      
      double double1 = fDistribution0.getNumericalVariance();
      assertEquals(0.11081436276435852, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(Double.NaN, double1, 0.01);
      assertTrue(fDistribution0.isSupportConnected());
      assertEquals(2.0, fDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c(558L);
      FDistribution fDistribution0 = new FDistribution(well19937c0, 558L, 0.5080875158309937, 4.0);
      boolean boolean0 = fDistribution0.isSupportUpperBoundInclusive();
      assertEquals(0.5080875158309937, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(558.0, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(0.5162794589996338, 0.5162794589996338, 2309.0260330782);
      boolean boolean0 = fDistribution0.isSupportLowerBoundInclusive();
      assertEquals(0.5162794589996338, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.5162794589996338, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(0.11081436276435852, 4.0);
      double double0 = fDistribution0.density(0.11081436276435852);
      assertEquals(0.3805598071731199, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FDistribution fDistribution0 = null;
      try {
        fDistribution0 = new FDistribution((-964.0708713912), 2.5411510467529297, (-964.0708713912));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom (-964.071)
         //
         verifyException("org.apache.commons.math3.distribution.FDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FDistribution fDistribution0 = null;
      try {
        fDistribution0 = new FDistribution(2.601412773132324, (-2097.546418667));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom (-2,097.546)
         //
         verifyException("org.apache.commons.math3.distribution.FDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FDistribution fDistribution0 = new FDistribution(0.5162794589996338, 0.5162794589996338, 2309.0260330782);
      double double0 = fDistribution0.getNumericalMean();
      assertEquals(0.5162794589996338, fDistribution0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0.5162794589996338, fDistribution0.getNumeratorDegreesOfFreedom(), 0.01);
  }
}
