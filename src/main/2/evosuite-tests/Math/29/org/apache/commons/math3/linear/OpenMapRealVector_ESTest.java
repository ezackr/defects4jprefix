/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 18:30:53 GMT 2024
 */

package org.apache.commons.math3.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.function.Sigmoid;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OpenMapRealVector_ESTest extends OpenMapRealVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      double[] doubleArray0 = new double[4];
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append((RealVector) arrayRealVector0);
      assertEquals(0, openMapRealVector0.getDimension());
      assertEquals(4, openMapRealVector1.getDimension());
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Double[] doubleArray0 = new Double[7];
      Double double0 = new Double(1.7331720051707087E-70);
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = doubleArray0[0];
      doubleArray0[5] = double0;
      doubleArray0[6] = doubleArray0[5];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append(1536.053604913);
      assertEquals(0.125, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double((-485.839665468756));
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double1 = openMapRealVector0.getSparsity();
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.6136291254115313));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.unitVector();
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(2, openMapRealVector1.getDimension());
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.7977712032439707));
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)openMapRealVector0.projection(openMapRealVector0);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.7977712032439707));
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      RealVector realVector0 = openMapRealVector0.subtract((RealVector) arrayRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertTrue(realVector0.equals((Object)arrayRealVector0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Double[] doubleArray0 = new Double[7];
      Double double0 = new Double(1.7331720051707087E-70);
      doubleArray0[0] = double0;
      Double double1 = new Double(2320.9);
      doubleArray0[1] = double1;
      doubleArray0[2] = double1;
      doubleArray0[3] = double1;
      doubleArray0[4] = double1;
      doubleArray0[5] = double1;
      doubleArray0[6] = double1;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)openMapRealVector0.mapDivide(3406.86949);
      assertEquals(0.8571428571428571, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double((-485.839665468756));
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector.OpenMapSparseIterator openMapRealVector_OpenMapSparseIterator0 = openMapRealVector0.new OpenMapSparseIterator();
      // Undeclared exception!
      try { 
        openMapRealVector_OpenMapSparseIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not supported
         //
         verifyException("org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double((-485.839665468756));
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((RealVector) openMapRealVector0);
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-5.891224504334214));
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0);
      RealVector realVector0 = openMapRealVector0.add((RealVector) arrayRealVector0);
      assertTrue(realVector0.equals((Object)arrayRealVector0));
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double((-485.839665468756));
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)openMapRealVector0.add((RealVector) openMapRealVector0);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Double[] doubleArray0 = new Double[4];
      Double double0 = new Double(4.877896909021073E7);
      doubleArray0[0] = double0;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[0];
      Double double1 = new Double(5.6656680900216754E-52);
      doubleArray0[3] = double1;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double[] doubleArray1 = new double[4];
      doubleArray1[3] = (double) doubleArray0[0];
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1, 867.7953931);
      OpenMapRealVector openMapRealVector2 = openMapRealVector0.add(openMapRealVector1);
      assertEquals(0.25, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(1.0, openMapRealVector2.getSparsity(), 0.01);
      assertEquals(0.75, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[13];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.7978));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.append((RealVector) openMapRealVector0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(26, openMapRealVector1.getDimension());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.7978));
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector((RealVector) openMapRealVector0);
      double double0 = openMapRealVector1.dotProduct((RealVector) openMapRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-5.891224504334214));
      // Undeclared exception!
      try { 
        openMapRealVector0.dotProduct((RealVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.linear.RealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 3.141592653589793;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeDivide(openMapRealVector0);
      assertEquals(0.25, openMapRealVector1.getSparsity(), 0.01);
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.7977712032439707));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.ebeMultiply(openMapRealVector0);
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertTrue(openMapRealVector1.equals((Object)openMapRealVector0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.7977712032439707));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(7, 0);
      assertEquals(Double.NaN, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.7977712032439707));
      // Undeclared exception!
      try { 
        openMapRealVector0.getSubVector(0, (-434));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of elements should be positive (-434)
         //
         verifyException("org.apache.commons.math3.linear.OpenMapRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.7977712032439707));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.getSubVector(0, 7);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(7, openMapRealVector1.getDimension());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.7977712032439707));
      double double0 = openMapRealVector0.getDistance((RealVector) openMapRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(1281, 1281);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) (-1);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0, 1.0E-12);
      double double0 = openMapRealVector0.getDistance(openMapRealVector1);
      assertEquals(1.0, double0, 0.01);
      assertEquals(1281, openMapRealVector0.getDimension());
      assertEquals(0.2, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-5.653341802734235));
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(openMapRealVector0);
      openMapRealVector0.getDistance((RealVector) arrayRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-5.5685265971484466));
      Double[] doubleArray1 = new Double[2];
      doubleArray1[0] = (Double) 1.0E-12;
      doubleArray1[1] = (Double) 1.0E-12;
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1, (double) doubleArray1[1]);
      double double0 = openMapRealVector0.getL1Distance(openMapRealVector1);
      assertEquals(2.0E-12, double0, 0.01);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.7977712032439707));
      ArrayRealVector arrayRealVector0 = new ArrayRealVector(doubleArray0, true);
      double double0 = openMapRealVector0.getL1Distance((RealVector) arrayRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double((-485.839665468756));
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double1 = openMapRealVector0.getL1Distance((RealVector) openMapRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double((-485.839665468756));
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double1 = openMapRealVector0.getLInfDistance(openMapRealVector0);
      assertEquals(0.0, double1, 0.01);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double((-485.839665468756));
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.add(openMapRealVector0);
      double double1 = openMapRealVector1.getLInfDistance(openMapRealVector0);
      assertEquals(485.839665468756, double1, 0.01);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Double[] doubleArray0 = new Double[7];
      Double double0 = new Double(1.7331720051707087E-70);
      doubleArray0[0] = double0;
      Double double1 = new Double(2320.9);
      doubleArray0[1] = double1;
      doubleArray0[2] = double1;
      doubleArray0[3] = doubleArray0[1];
      doubleArray0[4] = double1;
      doubleArray0[5] = doubleArray0[0];
      doubleArray0[6] = doubleArray0[3];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray0, 2735.6535);
      double double2 = openMapRealVector1.getLInfDistance(openMapRealVector0);
      assertEquals(0.7142857142857143, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(2320.9, double2, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-1721.282));
      RealVector realVector0 = RealVector.unmodifiableRealVector(openMapRealVector0);
      openMapRealVector0.getLInfDistance(realVector0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double((-485.839665468756));
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      boolean boolean0 = openMapRealVector0.isInfinite();
      assertFalse(boolean0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-485.839665468756);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      openMapRealVector0.mapDivideToSelf(0.0);
      boolean boolean0 = openMapRealVector0.isInfinite();
      assertFalse(boolean0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double((-485.839665468756));
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      boolean boolean0 = openMapRealVector0.isNaN();
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 0.0);
      openMapRealVector0.mapDivideToSelf(0.0);
      boolean boolean0 = openMapRealVector0.isNaN();
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double((-485.839665468756));
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)openMapRealVector0.subtract((RealVector) openMapRealVector0);
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertFalse(boolean0);
      assertEquals(0.0, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Double[] doubleArray0 = new Double[2];
      Double double0 = new Double((-485.839665468756));
      doubleArray0[0] = double0;
      doubleArray0[1] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.setSubVector(0, openMapRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double((-485.839665468756));
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      openMapRealVector0.set(465167.470981406);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 2659.09925;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 795.7);
      Sigmoid sigmoid0 = new Sigmoid();
      RealVector realVector0 = openMapRealVector0.map(sigmoid0);
      OpenMapRealVector openMapRealVector1 = (OpenMapRealVector)realVector0.subtract((RealVector) openMapRealVector0);
      assertFalse(openMapRealVector1.equals((Object)openMapRealVector0));
      assertNotSame(openMapRealVector1, openMapRealVector0);
      assertEquals(0.25, openMapRealVector0.getSparsity(), 0.01);
      assertEquals(0.25, openMapRealVector1.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
      // Undeclared exception!
      try { 
        openMapRealVector0.unitize();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math3.linear.OpenMapRealVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-106.268);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double[] doubleArray1 = openMapRealVector0.toArray();
      assertEquals(0.5, openMapRealVector0.getSparsity(), 0.01);
      assertArrayEquals(new double[] {(-106.268), 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.613629125412));
      openMapRealVector0.hashCode();
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.7977712032439707));
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double((-485.839665468756));
      doubleArray0[0] = double0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      Object object0 = new Object();
      boolean boolean0 = openMapRealVector0.equals(object0);
      assertFalse(boolean0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, 782.6019756);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector();
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertEquals(0, openMapRealVector1.getDimension());
      assertEquals(0.0, openMapRealVector0.getSparsity(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-1440.7574083));
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(1, 1, 235333.92254279272);
      boolean boolean0 = openMapRealVector1.equals(openMapRealVector0);
      assertFalse(boolean0);
      assertFalse(openMapRealVector0.equals((Object)openMapRealVector1));
      assertEquals(1, openMapRealVector1.getDimension());
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0, (-0.7977712032439707));
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapAdd(1235.88304);
      boolean boolean0 = openMapRealVector0.equals(openMapRealVector1);
      assertEquals(1.0, openMapRealVector1.getSparsity(), 0.01);
      assertFalse(boolean0);
      assertEquals(1.0, openMapRealVector0.getSparsity(), 0.01);
  }
}
