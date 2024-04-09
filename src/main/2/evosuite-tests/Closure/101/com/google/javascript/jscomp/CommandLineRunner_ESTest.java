/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 05:57:56 GMT 2024
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CommandLineRunner;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CommandLineRunner_ESTest extends CommandLineRunner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      CommandLineRunner commandLineRunner0 = null;
      try {
        commandLineRunner0 = new CommandLineRunner(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      commandLineRunner0.createCompiler();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "com.google.javascript.jscomp.CommandLineRunner$FormattingOption";
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0, (PrintStream) null, (PrintStream) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        CommandLineRunner.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "--A=";
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      commandLineRunner0.createOptions();
  }
}
