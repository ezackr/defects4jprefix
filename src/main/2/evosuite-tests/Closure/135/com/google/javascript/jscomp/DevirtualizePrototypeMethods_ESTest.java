/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 08:06:43 GMT 2024
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
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
      Node node0 = compiler0.parseTestCode("o6=5");
      DevirtualizePrototypeMethods devirtualizePrototypeMethods0 = new DevirtualizePrototypeMethods(compiler0);
      devirtualizePrototypeMethods0.process(node0, node0);
      assertEquals(39, Node.EMPTY_BLOCK);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher");
      DevirtualizePrototypeMethods devirtualizePrototypeMethods0 = new DevirtualizePrototypeMethods(compiler0);
      devirtualizePrototypeMethods0.process(node0, node0);
      assertEquals(21, Node.LOCALCOUNT_PROP);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("zH=M7;qM5yP/LtA");
      DevirtualizePrototypeMethods devirtualizePrototypeMethods0 = new DevirtualizePrototypeMethods(compiler0);
      devirtualizePrototypeMethods0.process(node0, node0);
      assertEquals(19, Node.LABEL_PROP);
  }
}
