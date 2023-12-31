/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:12:53 GMT 2023
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RandomStringUtils_ESTest extends RandomStringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 123;
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        RandomStringUtils.random(123, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 250;
      boolean boolean0 = false;
      RandomStringUtils.random(250, false, false);
      int int1 = 0;
      RandomStringUtils.randomAlphanumeric(0);
      RandomStringUtils.random(0, false, false);
      char[] charArray0 = new char[6];
      charArray0[0] = '0';
      charArray0[1] = 'V';
      charArray0[2] = '5';
      charArray0[3] = 'T';
      charArray0[4] = 'f';
      charArray0[5] = '=';
      MockRandom mockRandom0 = new MockRandom(0L);
      mockRandom0.nextInt(123);
      mockRandom0.ints();
      // Undeclared exception!
      RandomStringUtils.random(123, 0, (-914), true, false, charArray0, (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RandomStringUtils.randomAscii(0);
      RandomStringUtils.randomAlphanumeric(0);
      RandomStringUtils.randomAlphabetic(0);
      RandomStringUtils.randomAscii(0);
      char[] charArray0 = new char[6];
      charArray0[0] = '@';
      charArray0[1] = 't';
      charArray0[2] = 'l';
      charArray0[3] = 'f';
      charArray0[4] = '$';
      charArray0[5] = '1';
      RandomStringUtils.random(1, charArray0);
      RandomStringUtils.randomAlphanumeric(0);
      RandomStringUtils.random(0, (-1), 0, false, false, charArray0, (Random) null);
      // Undeclared exception!
      try { 
        RandomStringUtils.random(1, 0, 3375, false, true, charArray0, (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = 822;
      int int1 = 1;
      int int2 = (-943);
      boolean boolean0 = true;
      char[] charArray0 = new char[6];
      charArray0[0] = 'a';
      charArray0[1] = '3';
      charArray0[2] = 'i';
      charArray0[3] = '%';
      charArray0[4] = 'l';
      charArray0[5] = 'C';
      RandomStringUtils.random(822, 1, (-943), true, true, charArray0);
      int int3 = (-222);
      // Undeclared exception!
      try { 
        RandomStringUtils.randomAscii((-222));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -222 is less than 0.
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RandomStringUtils randomStringUtils0 = new RandomStringUtils();
      char[] charArray0 = new char[8];
      charArray0[0] = ' ';
      charArray0[1] = 'i';
      charArray0[2] = 'I';
      charArray0[3] = '\'';
      charArray0[4] = '(';
      charArray0[5] = 'B';
      charArray0[6] = ')';
      charArray0[7] = 'E';
      // Undeclared exception!
      try { 
        RandomStringUtils.random(128, (-1745), 0, true, true, charArray0, (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RandomStringUtils.random(21, "pf1?dV6");
      RandomStringUtils.randomAscii(0);
      // Undeclared exception!
      try { 
        RandomStringUtils.random(21, "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = 1059;
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        RandomStringUtils.random(1059, 1059, 1059, false, false);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = '2';
      charArray0[1] = '&';
      charArray0[2] = '}';
      charArray0[3] = 'j';
      charArray0[4] = '>';
      charArray0[5] = '4';
      MockRandom mockRandom0 = new MockRandom((-4759));
      // Undeclared exception!
      try { 
        RandomStringUtils.random((-4759), 937, 0, true, true, charArray0, (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -4759 is less than 0.
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = 0;
      boolean boolean0 = false;
      char[] charArray0 = new char[1];
      charArray0[0] = '\"';
      MockRandom mockRandom0 = new MockRandom(0);
      mockRandom0.doubles((double) 0, 1.0);
      RandomStringUtils.random(0, 0, 0, true, false, charArray0, (Random) mockRandom0);
      int int1 = 128;
      // Undeclared exception!
      RandomStringUtils.random(128, 0, 0, true, true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        RandomStringUtils.random(57343, 57343, 57343, false, false, (char[]) null, (Random) mockRandom0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RandomStringUtils.random(0, 0, (-66), true, false);
      RandomStringUtils.random(0, "");
      // Undeclared exception!
      RandomStringUtils.random(32, true, true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 3269;
      int int1 = 0;
      boolean boolean0 = true;
      char[] charArray0 = new char[4];
      charArray0[0] = '`';
      charArray0[1] = '~';
      char char0 = 'H';
      charArray0[2] = 'H';
      char char1 = 'S';
      charArray0[3] = 'S';
      // Undeclared exception!
      RandomStringUtils.random(3269, 0, (-1198), true, true, charArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RandomStringUtils randomStringUtils0 = new RandomStringUtils();
      RandomStringUtils.randomAscii(326);
      int int0 = 1;
      // Undeclared exception!
      RandomStringUtils.randomAlphanumeric(1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RandomStringUtils.random(3785);
      RandomStringUtils.random(3785, (char[]) null);
      RandomStringUtils.random(32, (char[]) null);
      RandomStringUtils.random(32, 0, 0, false, false, (char[]) null);
      RandomStringUtils.random(0, (char[]) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = 'j';
      charArray0[1] = 'd';
      charArray0[2] = '5';
      MockRandom mockRandom0 = new MockRandom(0);
      RandomStringUtils.random(0, (-2585), (-2585), false, false, charArray0, (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = (-2531);
      // Undeclared exception!
      try { 
        RandomStringUtils.randomNumeric((-2531));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -2531 is less than 0.
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = 0;
      RandomStringUtils.random(0, 2528, (-266), false, false);
      // Undeclared exception!
      try { 
        RandomStringUtils.random(2528, "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        RandomStringUtils.random((-190), "-o'u91%9~:ny|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -190 is less than 0.
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '6';
      // Undeclared exception!
      try { 
        RandomStringUtils.random(1935, 1935, 0, true, true, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RandomStringUtils.randomAscii(0);
      RandomStringUtils.randomAlphabetic(0);
      char[] charArray0 = new char[2];
      charArray0[0] = '_';
      charArray0[1] = 'I';
      RandomStringUtils.random(0, charArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = 56320;
      // Undeclared exception!
      RandomStringUtils.random(56320, "org.apache.commons.lang3.RandomStringUtils");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '6';
      charArray0[1] = 'u';
      charArray0[2] = 'j';
      charArray0[3] = 'e';
      // Undeclared exception!
      try { 
        RandomStringUtils.random(1, 1, 1, false, true, charArray0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = 0;
      boolean boolean0 = false;
      char[] charArray0 = new char[5];
      charArray0[0] = '(';
      charArray0[1] = '3';
      charArray0[2] = '9';
      charArray0[3] = '*';
      charArray0[4] = 'u';
      // Undeclared exception!
      try { 
        RandomStringUtils.random((-2237), 0, (-2237), false, false, charArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -2237 is less than 0.
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RandomStringUtils randomStringUtils0 = new RandomStringUtils();
      RandomStringUtils.random(0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 0;
      // Undeclared exception!
      try { 
        RandomStringUtils.random((-938), 0, (-938), true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -938 is less than 0.
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = (-1);
      // Undeclared exception!
      try { 
        RandomStringUtils.random((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -1 is less than 0.
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = '~';
      charArray0[1] = '.';
      charArray0[2] = 'E';
      charArray0[3] = 's';
      charArray0[4] = 'J';
      charArray0[5] = '~';
      charArray0[6] = 'k';
      charArray0[7] = '[';
      charArray0[8] = 'q';
      // Undeclared exception!
      try { 
        RandomStringUtils.random((-4002), charArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -4002 is less than 0.
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RandomStringUtils.random(0, false, false);
      RandomStringUtils.randomNumeric(0);
      RandomStringUtils.random(0, "");
      RandomStringUtils.randomNumeric(0);
      char[] charArray0 = new char[3];
      charArray0[0] = 'D';
      charArray0[1] = '%';
      charArray0[2] = 'x';
      // Undeclared exception!
      RandomStringUtils.random(56320, charArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      RandomStringUtils.randomAlphanumeric(1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = 0;
      RandomStringUtils.randomAlphanumeric(0);
      RandomStringUtils randomStringUtils0 = new RandomStringUtils();
      // Undeclared exception!
      try { 
        RandomStringUtils.randomAscii((-1207));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -1207 is less than 0.
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RandomStringUtils.random(0, (char[]) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      RandomStringUtils.random(55296);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '{';
      charArray0[1] = 'c';
      charArray0[2] = ' ';
      charArray0[3] = 'f';
      charArray0[4] = '7';
      charArray0[5] = '1';
      charArray0[6] = 'I';
      MockRandom mockRandom0 = new MockRandom(2807L);
      // Undeclared exception!
      try { 
        RandomStringUtils.random(713, 713, 254, false, false, charArray0, (Random) mockRandom0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = (-1134);
      // Undeclared exception!
      try { 
        RandomStringUtils.randomAlphanumeric((-1134));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -1134 is less than 0.
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      RandomStringUtils.randomNumeric(885);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = (-563);
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        RandomStringUtils.random((-563), false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -563 is less than 0.
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = 381;
      // Undeclared exception!
      RandomStringUtils.randomAlphabetic(381);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        RandomStringUtils.randomAlphabetic((-417));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -417 is less than 0.
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'e';
      charArray0[1] = 'C';
      charArray0[2] = ',';
      charArray0[3] = '7';
      charArray0[4] = 'T';
      charArray0[5] = 'V';
      RandomStringUtils.random(0, charArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = 'R';
      charArray0[1] = 'J';
      charArray0[2] = 'n';
      charArray0[3] = 'M';
      RandomStringUtils.random(1, charArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        RandomStringUtils.random((-738), (-738), (-738), true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -738 is less than 0.
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'f';
      MockRandom mockRandom0 = new MockRandom((-1L));
      // Undeclared exception!
      try { 
        RandomStringUtils.random(1, 1, 1, true, false, charArray0, (Random) mockRandom0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RandomStringUtils randomStringUtils0 = new RandomStringUtils();
      // Undeclared exception!
      RandomStringUtils.randomAlphabetic(1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        RandomStringUtils.random((-1333), (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -1333 is less than 0.
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int int0 = 0;
      RandomStringUtils.random(0, (String) null);
      boolean boolean0 = true;
      RandomStringUtils.random(0, true, true);
      int int1 = 1;
      // Undeclared exception!
      RandomStringUtils.randomAlphabetic(1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      char[] charArray0 = new char[0];
      RandomStringUtils.random(0, charArray0);
      RandomStringUtils randomStringUtils0 = new RandomStringUtils();
      RandomStringUtils.random(0, "");
      RandomStringUtils.random(903, 301, 0, true, true);
      RandomStringUtils.random(337, false, false);
      RandomStringUtils.random(0, "A+*zJ9ODEQ)FF96g");
      RandomStringUtils.random(0, 0, 337, false, true, charArray0);
      RandomStringUtils.randomAlphanumeric(0);
      // Undeclared exception!
      RandomStringUtils.random(903, 903, 0, true, true);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      int int0 = 0;
      boolean boolean0 = false;
      RandomStringUtils.random(0, (-2681), (-2426), false, false);
      int int1 = (-3004);
      // Undeclared exception!
      try { 
        RandomStringUtils.randomNumeric((-3004));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -3004 is less than 0.
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      int int0 = 55296;
      // Undeclared exception!
      RandomStringUtils.randomNumeric(55296);
  }
}
