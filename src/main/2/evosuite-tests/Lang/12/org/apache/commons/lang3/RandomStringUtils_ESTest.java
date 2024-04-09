/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 12:08:59 GMT 2024
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RandomStringUtils_ESTest extends RandomStringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = RandomStringUtils.randomAscii(12);
      assertEquals("            ", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        RandomStringUtils.random(1, 0, 138, true, true, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = RandomStringUtils.randomAlphabetic(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      RandomStringUtils.randomAlphanumeric(389);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = RandomStringUtils.random(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = RandomStringUtils.randomNumeric(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RandomStringUtils randomStringUtils0 = new RandomStringUtils();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        RandomStringUtils.random((-1), "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested random string length -1 is less than 0.
         //
         verifyException("org.apache.commons.lang3.RandomStringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      RandomStringUtils.random(774, false, true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-232L));
      String string0 = RandomStringUtils.random(1, 46336, 46347, true, true, (char[]) null, (Random) mockRandom0);
      assertEquals("\uB500", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '5';
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      RandomStringUtils.random(56320, 0, 806, true, true, charArray0, (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      String string0 = RandomStringUtils.random(1, (-5935), (-1134), false, false, (char[]) null, (Random) mockRandom0);
      assertEquals("\uE8D1", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      RandomStringUtils.random(7, 56191, 24, false, false, (char[]) null, (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      RandomStringUtils.random(36368, 56192, 1, false, false, (char[]) null, (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = RandomStringUtils.random(0, (String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      RandomStringUtils.random(46336, (char[]) null);
  }
}
