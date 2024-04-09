/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 21:57:07 GMT 2024
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.PoissonDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PoissonDistributionImpl_ESTest extends PoissonDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(2944.346);
      poissonDistributionImpl0.cumulativeProbability(0);
      poissonDistributionImpl0.sample();
      poissonDistributionImpl0.probability(0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(2944.346);
      double double0 = poissonDistributionImpl0.cumulativeProbability(0);
      assertEquals(0.0, double0, 0.01);
      
      int int0 = poissonDistributionImpl0.sample();
      assertEquals(2955, int0);
      
      double double1 = poissonDistributionImpl0.getMean();
      assertEquals(2944.346, double1, 0.01);
      
      double double2 = poissonDistributionImpl0.probability(2955);
      assertEquals(0.007198763302508331, double2, 0.01);
      
      int int1 = poissonDistributionImpl0.getDomainUpperBound(40.0);
      assertEquals(Integer.MAX_VALUE, int1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.6299605249474366, 0.6299605249474366);
      poissonDistributionImpl0.reseedRandomGenerator(0L);
      poissonDistributionImpl0.reseedRandomGenerator(0L);
      double double0 = poissonDistributionImpl0.probability((-2342));
      assertEquals(0.0, double0, 0.01);
      
      int int0 = poissonDistributionImpl0.getDomainLowerBound(1419.1162628977);
      double double1 = poissonDistributionImpl0.normalApproximateProbability(0);
      assertEquals(0.43496791311475197, double1, 0.01);
      
      int int1 = poissonDistributionImpl0.sample();
      assertTrue(int1 == int0);
      
      poissonDistributionImpl0.getDomainUpperBound(0);
      poissonDistributionImpl0.getMean();
      int int2 = poissonDistributionImpl0.getDomainUpperBound(1.5);
      assertEquals(Integer.MAX_VALUE, int2);
      assertEquals(0.6299605249474366, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(2007.6846679, 2007.6846679);
      assertEquals(2007.6846679, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(855.7424007881, 33);
      double double0 = poissonDistributionImpl0.probability(1635);
      assertEquals(5.0206548041628065E-124, double0, 0.01);
      
      double double1 = poissonDistributionImpl0.normalApproximateProbability(589);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.5);
      double double0 = poissonDistributionImpl0.cumulativeProbability((-771));
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.5, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(395.380252670402);
      poissonDistributionImpl0.cumulativeProbability(2512);
      double double0 = poissonDistributionImpl0.cumulativeProbability(1270);
      assertEquals(1.0, double0, 0.01);
      
      int int0 = poissonDistributionImpl0.getDomainLowerBound(1270);
      assertEquals(395.380252670402, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1637.9716, 0);
      int int0 = poissonDistributionImpl0.getDomainLowerBound(0);
      assertEquals(0, int0);
      assertEquals(1637.9716, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1512.0);
      int int0 = poissonDistributionImpl0.getDomainUpperBound(1512.0);
      assertEquals(Integer.MAX_VALUE, int0);
      
      int int1 = poissonDistributionImpl0.getDomainLowerBound(0.0);
      assertEquals(1512.0, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1772.554882, 1772.554882, 172);
      int int0 = poissonDistributionImpl0.sample();
      assertEquals(1781, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.5, (-1));
      assertEquals(0.5, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 0;
      PoissonDistributionImpl poissonDistributionImpl0 = null;
      try {
        poissonDistributionImpl0 = new PoissonDistributionImpl((-793.0), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // the Poisson mean must be positive (-793)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = 0.0;
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0, 0.0);
      int int0 = Integer.MAX_VALUE;
      poissonDistributionImpl0.cumulativeProbability(Integer.MAX_VALUE);
      double double1 = (-1853.023719731909);
      poissonDistributionImpl0.probability((-1853.023719731909));
      // Undeclared exception!
      poissonDistributionImpl0.sample(Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.08713622391223907, 629.07210998);
      int int0 = 166;
      poissonDistributionImpl0.sample(166);
      poissonDistributionImpl0.normalApproximateProbability(166);
      poissonDistributionImpl0.cumulativeProbability(2113929215);
      poissonDistributionImpl0.inverseCumulativeProbability(1.0);
      poissonDistributionImpl0.sample();
      poissonDistributionImpl0.probability(Integer.MAX_VALUE);
      poissonDistributionImpl0.probability(0);
      int int1 = 129;
      double double0 = 1433.879;
      PoissonDistributionImpl poissonDistributionImpl1 = null;
      try {
        poissonDistributionImpl1 = new PoissonDistributionImpl((-491.750552973), 1433.879, 2147483639);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // the Poisson mean must be positive (-491.751)
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }
}
