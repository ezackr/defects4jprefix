/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 21:51:54 GMT 2023
 */

package org.apache.commons.math.stat.regression;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.regression.SimpleRegression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleRegression_ESTest extends SimpleRegression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[8][9];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getIntercept();
      assertEquals(8L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval((-332.6275957666524));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.predict(2856.9300351024867);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[8][1];
      double[] doubleArray1 = new double[3];
      doubleArray1[1] = (-664.5058);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray0[1] = doubleArray2;
      doubleArray0[2] = doubleArray1;
      doubleArray0[3] = doubleArray0[2];
      doubleArray0[4] = doubleArray2;
      doubleArray0[5] = doubleArray0[3];
      doubleArray0[6] = doubleArray0[0];
      doubleArray0[7] = doubleArray0[1];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getTotalSumSquares();
      assertEquals(8L, simpleRegression0.getN());
      assertEquals(827939.9216880751, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[8][3];
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = (-1699.8032292);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = 608.60225;
      doubleArray0[2] = doubleArray2;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSlopeConfidenceInterval();
      assertEquals(51595.19674997763, simpleRegression0.getRegressionSumSquares(), 0.01);
      assertEquals(2.761406698728713, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[6][3];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 350.1744551119643;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[1] = (-2509.484689958194);
      doubleArray0[2] = doubleArray2;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSignificance();
      assertEquals(6L, simpleRegression0.getN());
      assertEquals(0.7039999999999997, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[8][3];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 608.60225;
      doubleArray1[1] = (-1699.8032292);
      doubleArray0[0] = doubleArray1;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getRegressionSumSquares();
      assertEquals(8L, simpleRegression0.getN());
      assertEquals(2528164.6407489046, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[6][3];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 350.1744551119643;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[1] = (-2509.484689958194);
      doubleArray0[2] = doubleArray2;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getRSquare();
      assertEquals(6L, simpleRegression0.getN());
      assertEquals(0.03999999999999997, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[2][2];
      simpleRegression0.addData(doubleArray0);
      long long0 = simpleRegression0.getN();
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[6][8];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 1811.9723634207528;
      doubleArray1[1] = (-1.0);
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray0[0];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getMeanSquareError();
      assertEquals(6L, simpleRegression0.getN());
      assertEquals(5.551115123125783E-17, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[8][3];
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = (-1699.8032292);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = 608.60225;
      doubleArray0[2] = doubleArray2;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getInterceptStdErr();
      assertEquals(8L, simpleRegression0.getN());
      assertEquals(242.82903274285715, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.addData((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[6][9];
      double[] doubleArray1 = new double[1];
      doubleArray0[4] = doubleArray1;
      // Undeclared exception!
      try { 
        simpleRegression0.addData(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval(0.05);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.TDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getMeanSquareError();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getTotalSumSquares();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[8][1];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = doubleArray0[1];
      doubleArray0[4] = doubleArray0[3];
      doubleArray0[5] = doubleArray1;
      doubleArray0[6] = doubleArray0[1];
      doubleArray0[7] = doubleArray0[1];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getTotalSumSquares();
      assertEquals(8L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[7][1];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = Double.NaN;
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray1;
      doubleArray0[3] = doubleArray1;
      doubleArray0[4] = doubleArray0[3];
      doubleArray0[5] = doubleArray1;
      doubleArray0[6] = doubleArray1;
      simpleRegression0.addData(doubleArray0);
      simpleRegression0.getSlope();
      assertEquals(7L, simpleRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[7][1];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      doubleArray0[2] = doubleArray0[0];
      doubleArray0[3] = doubleArray1;
      doubleArray0[4] = doubleArray0[2];
      doubleArray0[5] = doubleArray0[1];
      doubleArray0[6] = doubleArray0[0];
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getSlope();
      assertEquals(7L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getSlope();
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0L, simpleRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[8][1];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      doubleArray0[2] = doubleArray1;
      doubleArray0[3] = doubleArray1;
      doubleArray0[4] = doubleArray0[0];
      doubleArray0[5] = doubleArray1;
      doubleArray0[6] = doubleArray0[2];
      doubleArray0[7] = doubleArray0[3];
      simpleRegression0.addData(doubleArray0);
      simpleRegression0.addData((-968.4603129835), (-968.4603129835));
      assertEquals(833702.5580658657, simpleRegression0.getTotalSumSquares(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getSlopeStdErr();
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double double0 = simpleRegression0.getSumSquaredErrors();
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval(0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval(909.40891273);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.regression.SimpleRegression", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[8];
      doubleArray1[1] = 663.000092736518;
      simpleRegression0.addData(128.80567165176635, 0.0);
      doubleArray0[0] = doubleArray1;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getR();
      assertEquals(1.0000000000000002, simpleRegression0.getRSquare(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.getR();
      assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[8][9];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 3052.94544;
      doubleArray0[1] = doubleArray1;
      simpleRegression0.addData(doubleArray0);
      double double0 = simpleRegression0.getIntercept();
      assertEquals(8L, simpleRegression0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSlopeConfidenceInterval();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.TDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      double[][] doubleArray0 = new double[8][9];
      simpleRegression0.addData(doubleArray0);
      simpleRegression0.getSignificance();
      assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      long long0 = simpleRegression0.getN();
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      simpleRegression0.clear();
      assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
      assertEquals(0L, simpleRegression0.getN());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleRegression simpleRegression0 = new SimpleRegression();
      // Undeclared exception!
      try { 
        simpleRegression0.getSignificance();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.TDistributionImpl", e);
      }
  }
}
