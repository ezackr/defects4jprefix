/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 06:49:21 GMT 2023
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ParseSettings_ESTest extends ParseSettings_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(false, false);
      boolean boolean0 = parseSettings0.preserveTagCase();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      String string0 = parseSettings0.normalizeTag("]");
      assertEquals("]", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      String string0 = parseSettings0.normalizeTag("7+~bW5x4vSf I\"NPSZE");
      assertEquals("7+~bw5x4vsf i\"npsze", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      String string0 = parseSettings0.normalizeAttribute("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      String string0 = parseSettings0.htmlDefault.normalizeAttribute("open");
      assertEquals("open", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = parseSettings0.normalizeAttributes(attributes0);
      assertEquals(0, attributes1.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = parseSettings0.normalizeAttributes(attributes0);
      assertSame(attributes0, attributes1);
  }
}
