/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 01:09:17 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CheckSideEffects;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckSideEffects_ESTest extends CheckSideEffects_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Node node0 = new Node(1556, 1556, 1556);
      CheckSideEffects.StripProtection checkSideEffects_StripProtection0 = new CheckSideEffects.StripProtection((AbstractCompiler) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, checkSideEffects_StripProtection0);
      Node node1 = new Node(0);
      checkSideEffects_StripProtection0.visit(nodeTraversal0, node0, node1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Node node0 = new Node(74);
      CheckSideEffects.StripProtection checkSideEffects_StripProtection0 = new CheckSideEffects.StripProtection((AbstractCompiler) null);
      // Undeclared exception!
      try { 
        checkSideEffects_StripProtection0.process(node0, node0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Predicate
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CheckSideEffects.StripProtection checkSideEffects_StripProtection0 = new CheckSideEffects.StripProtection((AbstractCompiler) null);
      Node node0 = new Node(0);
      Node node1 = new Node((-605), 1, 1133);
      // Undeclared exception!
      try { 
        checkSideEffects_StripProtection0.process(node0, node1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Predicate
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckSideEffects checkSideEffects0 = null;
      try {
        checkSideEffects0 = new CheckSideEffects((AbstractCompiler) null, checkLevel0, true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("com.google.javascript.jscomp.CheckSideEffects", e);
      }
  }
}
