/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 05 23:39:11 GMT 2024
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FlowSensitiveInlineVariables;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FlowSensitiveInlineVariables_ESTest extends FlowSensitiveInlineVariables_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(compiler0);
      // Undeclared exception!
      try { 
        flowSensitiveInlineVariables0.process((Node) null, (Node) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(compiler0);
      Node node0 = new Node((-2201));
      NodeTraversal.traverse((AbstractCompiler) compiler0, node0, (NodeTraversal.Callback) flowSensitiveInlineVariables0);
      assertEquals(4095, Node.COLUMN_MASK);
  }
}
