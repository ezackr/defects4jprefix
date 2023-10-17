/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 18:21:29 GMT 2023
 */

package com.fasterxml.jackson.core.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.io.NumberInput;
import java.math.BigDecimal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumberInput_ESTest extends NumberInput_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      long long0 = NumberInput.parseAsLong("9\"ba(", 9223372036854775807L);
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long long0 = NumberInput.parseAsLong("$)z)>r7$#$Gn^Nd\",", 730L);
      assertEquals(730L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = NumberInput.parseAsInt("0", 15);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = NumberInput.parseAsInt("9k&W%0apzCxj0zPGA", 44);
      assertEquals(44, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = NumberInput.parseAsInt("\"@DU4j 9[~t/j~6+", (-1870));
      assertEquals((-1870), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseLong("m5]._Gfgt");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"m5]._Gfgt\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseInt("793l7Ryo");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"793l7Ryo\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseInt("9K1[u8aeI");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"9K1[u8aeI\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseLong("*eX5A[");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"*eX5A[\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[3];
      int int0 = NumberInput.parseInt(charArray0, 1, 1);
      assertEquals((-48), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = NumberInput.parseAsDouble("w#c)d f}r[Td", 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      long long0 = NumberInput.parseLong("0");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      long long0 = NumberInput.parseLong("4");
      assertEquals(4L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = 'r';
      int int0 = NumberInput.parseInt(charArray0, 0, 0);
      assertEquals(66, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = NumberInput.parseInt("0");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '9';
      BigDecimal bigDecimal0 = NumberInput.parseBigDecimal(charArray0);
      assertEquals((short)9, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberInput.parseBigDecimal("2.2250738585072012e-308");
      assertEquals((byte)0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberInput.parseBigDecimal("6");
      assertEquals((byte)6, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      long long0 = NumberInput.parseAsLong("", (-1355L));
      assertEquals((-1355L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseLong((char[]) null, 1241, 1736);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.io.NumberInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseLong("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseLong((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.io.NumberInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseInt((char[]) null, (-406), (-406));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.io.NumberInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseInt("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseInt((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.io.NumberInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      try { 
        NumberInput.parseDouble("8B4fGkT`E+&!ht~*}");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseDouble((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseBigDecimal((char[]) null, 2028, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseBigDecimal((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.io.NumberInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseBigDecimal((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.inLongRange((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.io.NumberInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double double0 = NumberInput.parseDouble("2.2250738585072012e-308");
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double double0 = NumberInput.parseDouble("0");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseInt("75.|SH");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"75.|SH\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[1];
      try { 
        NumberInput.parseBigDecimal(charArray0, (-3510), (-3510));
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Bad offset or len arguments for char[] input.
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double double0 = NumberInput.parseAsDouble("", 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double double0 = NumberInput.parseAsDouble((String) null, (-3593.177975));
      assertEquals((-3593.177975), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double double0 = NumberInput.parseAsDouble("2.2250738585072012e-308", (-3593.177975));
      assertEquals(4.9E-324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      long long0 = NumberInput.parseAsLong("2.2250738585072012e-308", (-1355L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      long long0 = NumberInput.parseAsLong("-^d/ep]7s9T9];}!3h", 2017L);
      assertEquals(2017L, long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      long long0 = NumberInput.parseAsLong("+d", 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      long long0 = NumberInput.parseAsLong((String) null, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      long long0 = NumberInput.parseAsLong("0", 2017L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = NumberInput.parseAsInt("-^d/ep]7s9T9];}!3h", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int int0 = NumberInput.parseAsInt("+", 23);
      assertEquals(23, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      int int0 = NumberInput.parseAsInt("", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      int int0 = NumberInput.parseAsInt((String) null, 50);
      assertEquals(50, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = NumberInput.inLongRange("hmE%tkd0#,Z}M;zfFm4", true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      boolean boolean0 = NumberInput.inLongRange("com.fasterxml.jackson.core.io.NumberInput", false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      boolean boolean0 = NumberInput.inLongRange("-^d/ep]7s9T9];}!3h", true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      boolean boolean0 = NumberInput.inLongRange("u6!-dhq#Ryzo#vF;xN", true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'V';
      boolean boolean0 = NumberInput.inLongRange(charArray0, 0, 19, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[5];
      boolean boolean0 = NumberInput.inLongRange(charArray0, 0, 19, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      char[] charArray0 = new char[5];
      boolean boolean0 = NumberInput.inLongRange(charArray0, (-5137), 512, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      char[] charArray0 = new char[19];
      boolean boolean0 = NumberInput.inLongRange(charArray0, 0, 6, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseLong("-^d/ep]7s9T9];}!3h");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-^d/ep]7s9T9];}!3h\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseInt("73l7Ryo");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"73l7Ryo\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseInt("737#vQly");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"737#vQly\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseInt("2(F");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"2(F\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseInt("/ApglaL>]");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/ApglaL>]\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseInt("2.2250738585072012e-308");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"2.2250738585072012e-308\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseInt("-P");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-P\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberInput.parseInt("-^d/ep]7s9T9];}!3h");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-^d/ep]7s9T9];}!3h\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      int int0 = NumberInput.parseInt("6");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        NumberInput.parseInt(charArray0, 0, 43);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("com.fasterxml.jackson.core.io.NumberInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      char[] charArray0 = new char[8];
      int int0 = NumberInput.parseInt(charArray0, 5, 2);
      assertEquals((-528), int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      char[] charArray0 = new char[19];
      int int0 = NumberInput.parseInt(charArray0, 6, 6);
      assertEquals((-5333328), int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      NumberInput numberInput0 = new NumberInput();
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      try { 
        NumberInput.parseBigDecimal("w#c)d f}r[Td");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        NumberInput.parseLong(charArray0, 0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -10
         //
         verifyException("com.fasterxml.jackson.core.io.NumberInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      char[] charArray0 = new char[5];
      try { 
        NumberInput.parseBigDecimal(charArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }
}
