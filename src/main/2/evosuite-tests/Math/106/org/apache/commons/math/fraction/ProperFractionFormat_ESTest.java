/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 00:55:35 GMT 2024
 */

package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.AttributedCharacterIterator;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import org.apache.commons.math.fraction.Fraction;
import org.apache.commons.math.fraction.ProperFractionFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ProperFractionFormat_ESTest extends ProperFractionFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      Fraction fraction0 = (Fraction)properFractionFormat0.parseObject("9");
      assertEquals((short)9, fraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat(" / ");
      DecimalFormat decimalFormat0 = new DecimalFormat(" / ");
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0, choiceFormat0, decimalFormat0);
      try { 
        properFractionFormat0.parseObject(" / ");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Format.parseObject(String) failed
         //
         verifyException("java.text.Format", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      AttributedCharacterIterator attributedCharacterIterator0 = properFractionFormat0.formatToCharacterIterator(fraction0);
      assertEquals(5, attributedCharacterIterator0.getEndIndex());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      AttributedCharacterIterator attributedCharacterIterator0 = properFractionFormat0.formatToCharacterIterator(fraction0);
      assertEquals(7, attributedCharacterIterator0.getEndIndex());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      try { 
        properFractionFormat0.parseObject("Z'Y#3X_Hl`]E^An");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Format.parseObject(String) failed
         //
         verifyException("java.text.Format", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      try { 
        properFractionFormat0.parseObject("9+>~r/$e?C`@\"F{BZD");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Format.parseObject(String) failed
         //
         verifyException("java.text.Format", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("6~0&");
      DecimalFormat decimalFormat0 = new DecimalFormat("6~0&");
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(decimalFormat0, choiceFormat0, choiceFormat0);
      Fraction fraction0 = (Fraction)properFractionFormat0.parseObject("6~0&");
      assertEquals(1, fraction0.getDenominator());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat(")f");
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0, choiceFormat0, choiceFormat0);
      try { 
        properFractionFormat0.parseObject(")f");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Format.parseObject(String) failed
         //
         verifyException("java.text.Format", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat();
      ProperFractionFormat properFractionFormat0 = null;
      try {
        properFractionFormat0 = new ProperFractionFormat((NumberFormat) null, decimalFormat0, decimalFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // whole format can not be null.
         //
         verifyException("org.apache.commons.math.fraction.ProperFractionFormat", e);
      }
  }
}
