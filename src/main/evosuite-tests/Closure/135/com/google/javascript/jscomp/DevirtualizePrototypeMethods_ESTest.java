/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 06:32:37 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DevirtualizePrototypeMethods;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DevirtualizePrototypeMethods_ESTest extends DevirtualizePrototypeMethods_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      DevirtualizePrototypeMethods devirtualizePrototypeMethods0 = new DevirtualizePrototypeMethods(compiler0);
      Node node0 = compiler0.parseTestCode("msg.prop.defined");
      // Undeclared exception!
      try { 
        devirtualizePrototypeMethods0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // Unexpected lValue type GETPROP
         //   Node(GETPROP):  [testcode] :1:0
         // [source unknown]
         //   Parent(EXPR_RESULT):  [testcode] :1:0
         // [source unknown]
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("$=3");
      DevirtualizePrototypeMethods devirtualizePrototypeMethods0 = new DevirtualizePrototypeMethods(compiler0);
      devirtualizePrototypeMethods0.process(node0, node0);
      assertEquals(4, Node.DESCENDANTS_FLAG);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("J$=4/r");
      DevirtualizePrototypeMethods devirtualizePrototypeMethods0 = new DevirtualizePrototypeMethods(compiler0);
      // Undeclared exception!
      try { 
        devirtualizePrototypeMethods0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // Unexpected lValue type NAME
         //   Node(NAME J$):  [testcode] :1:0
         // [source unknown]
         //   Parent(ASSIGN):  [testcode] :1:2
         // [source unknown]
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
