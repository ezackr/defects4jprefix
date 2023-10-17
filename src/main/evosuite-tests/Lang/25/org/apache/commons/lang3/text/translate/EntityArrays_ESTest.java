/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:41:21 GMT 2023
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.text.translate.EntityArrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EntityArrays_ESTest extends EntityArrays_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[][] stringArray0 = new String[0][0];
      String[][] stringArray1 = EntityArrays.invert(stringArray0);
      assertNotSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        EntityArrays.invert((String[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.EntityArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[][] stringArray0 = new String[8][1];
      // Undeclared exception!
      try { 
        EntityArrays.invert(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.lang3.text.translate.EntityArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.HTML40_EXTENDED_ESCAPE();
      assertEquals(151, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.ISO8859_1_UNESCAPE();
      assertEquals(96, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.APOS_ESCAPE();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EntityArrays entityArrays0 = new EntityArrays();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.HTML40_EXTENDED_UNESCAPE();
      String[][] stringArray1 = EntityArrays.invert(stringArray0);
      assertNotSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.ISO8859_1_ESCAPE();
      assertEquals(96, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.APOS_UNESCAPE();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.BASIC_UNESCAPE();
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[][] stringArray0 = EntityArrays.BASIC_ESCAPE();
      assertEquals(4, stringArray0.length);
  }
}
