/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 05 22:00:12 GMT 2024
 */

package org.apache.commons.cli2.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.builder.PatternBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PatternBuilder_ESTest extends PatternBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PatternBuilder patternBuilder0 = new PatternBuilder();
      patternBuilder0.withPattern("_");
      Option option0 = patternBuilder0.create();
      assertEquals("-_", option0.getPreferredName());
      assertFalse(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PatternBuilder patternBuilder0 = new PatternBuilder();
      patternBuilder0.withPattern("u+B54O&?sj$}");
      Option option0 = patternBuilder0.create();
      assertNull(option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PatternBuilder patternBuilder0 = new PatternBuilder();
      patternBuilder0.withPattern("zy^?*!BxLN+>^&S\"@");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PatternBuilder patternBuilder0 = new PatternBuilder();
      patternBuilder0.withPattern("@kp+)3l#w");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PatternBuilder patternBuilder0 = new PatternBuilder();
      patternBuilder0.withPattern("-cW9xb-)%'HS`eL/");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PatternBuilder patternBuilder0 = new PatternBuilder();
      patternBuilder0.withPattern("T\"|0KFIn/-2(");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PatternBuilder patternBuilder0 = new PatternBuilder();
      patternBuilder0.withPattern("tT;(< ,vN9~{TwrG");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PatternBuilder patternBuilder0 = new PatternBuilder();
      patternBuilder0.withPattern("org.apache.commons.cli2.commandline.CommandLineImpl");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PatternBuilder patternBuilder0 = new PatternBuilder();
      patternBuilder0.withPattern("v6C#A]`q2A!I3>1Im3");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PatternBuilder patternBuilder0 = new PatternBuilder();
      // Undeclared exception!
      try { 
        patternBuilder0.withPattern("WX!E*''e:7l8 /%S'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot use null as a validator.
         //
         verifyException("org.apache.commons.cli2.builder.ArgumentBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PatternBuilder patternBuilder0 = new PatternBuilder();
      patternBuilder0.withPattern("zy^?*=BxLN+>^&S\"8");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PatternBuilder patternBuilder0 = new PatternBuilder();
      patternBuilder0.withPattern("");
  }
}
