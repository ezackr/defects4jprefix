/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 07:23:49 GMT 2024
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.InlineVariables;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InlineVariables_ESTest extends InlineVariables_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.ALL;
      InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, true);
      // Undeclared exception!
      try { 
        inlineVariables0.process((Node) null, (Node) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.CONSTANTS_ONLY;
      InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, false);
      // Undeclared exception!
      try { 
        inlineVariables0.process((Node) null, (Node) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.LOCALS_ONLY;
      InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, false);
      // Undeclared exception!
      try { 
        inlineVariables0.process((Node) null, (Node) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }
}
