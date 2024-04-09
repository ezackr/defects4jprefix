/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 16:26:19 GMT 2024
 */

package org.apache.commons.math3.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.FractionField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Fraction_ESTest extends Fraction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      Fraction fraction1 = fraction0.ONE_THIRD.multiply((-1517));
      assertEquals((-505.6666666666667), fraction1.doubleValue(), 0.01);
      assertEquals((-1517), fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_QUARTER;
      int int0 = fraction0.getDenominator();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Fraction fraction0 = new Fraction(423, 423);
      Fraction fraction1 = fraction0.add(Integer.MAX_VALUE);
      // Undeclared exception!
      try { 
        fraction1.negate();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in fraction -2,147,483,648/1, cannot negate
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      Fraction fraction1 = fraction0.TWO_FIFTHS.divide(1399);
      assertEquals(6995, fraction1.getDenominator());
      assertEquals(2.859185132237312E-4, fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Fraction fraction0 = Fraction.MINUS_ONE;
      Fraction fraction1 = fraction0.subtract(fraction0);
      assertEquals(1, fraction1.getDenominator());
      assertEquals(0.0F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_QUARTERS;
      FractionField fractionField0 = fraction0.getField();
      assertNotNull(fractionField0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Fraction fraction0 = new Fraction((double) 102);
      assertEquals(10200.0, fraction0.percentageValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      long long0 = fraction0.longValue();
      assertEquals(0.5, fraction0.doubleValue(), 0.01);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      Fraction fraction1 = fraction0.TWO_THIRDS.subtract(4268);
      assertEquals((-426733.3333333333), fraction1.percentageValue(), 0.01);
      assertEquals(3, fraction1.getDenominator());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Fraction fraction0 = new Fraction(4);
      int int0 = fraction0.intValue();
      assertEquals(4, int0);
      assertEquals(1, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      fraction0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_QUARTERS;
      int int0 = fraction0.getNumerator();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      float float0 = fraction0.floatValue();
      assertEquals(0.5F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Fraction fraction0 = Fraction.THREE_QUARTERS;
      double double0 = fraction0.percentageValue();
      assertEquals(75.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Fraction fraction0 = null;
      try {
        fraction0 = new Fraction((double) 4, 4);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert 4 to fraction (-3/9,223,372,036,854,775,807)
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Fraction fraction0 = null;
      try {
        fraction0 = new Fraction((double) Integer.MIN_VALUE);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert -2,147,483,648 to fraction (-2,147,483,648/1)
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Fraction fraction0 = null;
      try {
        fraction0 = new Fraction((double) 9, 9);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Overflow trying to convert 9 to fraction (9,223,372,036,854,775,800/9,223,372,036,854,775,807)
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Fraction fraction0 = null;
      try {
        fraction0 = new Fraction(4.0221163999376586E-5, 4.0221163999376586E-5, (-171));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: Unable to convert 0 to fraction after -171 iterations
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Fraction fraction0 = new Fraction((-1044.2346729));
      assertEquals((-493923), fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Fraction fraction0 = new Fraction(425.11148473894536, 2288);
      assertEquals(425.1114848630466, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Fraction fraction0 = null;
      try {
        fraction0 = new Fraction(0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero denominator in fraction 0/0
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Fraction fraction0 = new Fraction((-2059), (-2059));
      assertEquals(1, fraction0.getNumerator());
      assertEquals(1.0, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Fraction fraction0 = null;
      try {
        fraction0 = new Fraction(Integer.MIN_VALUE, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in fraction -2,147,483,648/-2,147,483,648, cannot negate
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Fraction fraction0 = null;
      try {
        fraction0 = new Fraction(2, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in fraction 2/-2,147,483,648, cannot negate
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      Fraction fraction1 = fraction0.MINUS_ONE.abs();
      assertEquals(1, fraction1.getDenominator());
      assertEquals((short)1, fraction1.shortValue());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = fraction0.abs();
      assertEquals(0.2F, fraction1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      int int0 = fraction0.compareTo(fraction0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      Fraction fraction1 = fraction0.MINUS_ONE.add(2);
      int int0 = fraction0.compareTo(fraction1);
      assertEquals((-1), int0);
      assertEquals(1L, fraction1.longValue());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      Fraction fraction1 = fraction0.MINUS_ONE.add((-2682));
      int int0 = fraction0.compareTo(fraction1);
      assertEquals(1, int0);
      assertEquals((-2683), fraction1.intValue());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      Fraction fraction1 = Fraction.ONE_HALF;
      boolean boolean0 = fraction1.equals(fraction0);
      assertFalse(boolean0);
      assertFalse(fraction0.equals((Object)fraction1));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      boolean boolean0 = fraction0.equals(fraction0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      Object object0 = new Object();
      boolean boolean0 = fraction0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      Fraction fraction1 = Fraction.TWO_THIRDS;
      boolean boolean0 = fraction1.equals(fraction0);
      assertFalse(fraction0.equals((Object)fraction1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      Fraction fraction1 = Fraction.ONE_HALF;
      boolean boolean0 = fraction1.equals(fraction0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      // Undeclared exception!
      try { 
        fraction0.add((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_QUARTER;
      Fraction fraction1 = fraction0.ZERO.subtract(fraction0);
      assertEquals((-1), fraction1.getNumerator());
      assertEquals((-0.25), fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      Fraction fraction1 = fraction0.ZERO.add(fraction0);
      assertSame(fraction1, fraction0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      Fraction fraction1 = Fraction.ZERO;
      Fraction fraction2 = fraction0.TWO_FIFTHS.add(fraction1);
      assertEquals(40.0, fraction2.percentageValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_THIRD;
      Fraction fraction1 = fraction0.TWO_FIFTHS.add(fraction0);
      assertEquals(73.33333333333333, fraction1.percentageValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_THIRDS;
      Fraction fraction1 = fraction0.subtract(fraction0);
      assertEquals(0.0F, fraction1.floatValue(), 0.01F);
      assertEquals(1, fraction1.getDenominator());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_FIFTH;
      Fraction fraction1 = Fraction.getReducedFraction(Integer.MAX_VALUE, 2880);
      // Undeclared exception!
      try { 
        fraction1.add(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow, numerator too large after multiply: 2,147,484,223
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Fraction fraction0 = new Fraction(11, 11);
      Fraction fraction1 = fraction0.ZERO.divide(fraction0);
      assertEquals(0.0, fraction1.percentageValue(), 0.01);
      assertEquals(100.0, fraction0.percentageValue(), 0.01);
      assertEquals(1, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      // Undeclared exception!
      try { 
        fraction0.FOUR_FIFTHS.multiply((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Fraction fraction0 = Fraction.TWO_QUARTERS;
      Fraction fraction1 = fraction0.FOUR_FIFTHS.multiply(fraction0);
      assertEquals(40.0, fraction1.percentageValue(), 0.01);
      assertEquals(2, fraction1.getNumerator());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      Fraction fraction1 = fraction0.FOUR_FIFTHS.multiply(fraction0);
      assertEquals(0.0, fraction1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_QUARTER;
      // Undeclared exception!
      try { 
        fraction0.THREE_FIFTHS.divide((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fraction
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      // Undeclared exception!
      try { 
        fraction0.FOUR_FIFTHS.divide(fraction0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // the fraction to divide by must not be zero: 0/1
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // zero denominator in fraction 0/0
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(0, (-14612));
      assertEquals(0, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Fraction fraction0 = Fraction.getReducedFraction(Integer.MIN_VALUE, Integer.MIN_VALUE);
      assertEquals(1.0, fraction0.doubleValue(), 0.01);
      assertEquals(1, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(4507, Integer.MIN_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in fraction 4,507/-2,147,483,648, cannot negate
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        Fraction.getReducedFraction(Integer.MIN_VALUE, (-2212));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow in fraction -2,147,483,648/-2,212, cannot negate
         //
         verifyException("org.apache.commons.math3.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE_HALF;
      String string0 = fraction0.toString();
      assertEquals("1 / 2", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Fraction fraction0 = Fraction.MINUS_ONE;
      String string0 = fraction0.toString();
      assertEquals("-1", string0);
  }
}
