/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 10:24:18 GMT 2024
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.PreprocessorSymbolTable;
import com.google.javascript.jscomp.ScopedAliases;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ScopedAliases_ESTest extends ScopedAliases_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, (PreprocessorSymbolTable) null, compilerOptions_AliasTransformationHandler0);
      // Undeclared exception!
      try { 
        scopedAliases0.process((Node) null, (Node) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
      Node node0 = new Node(105, 105, 105);
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, (PreprocessorSymbolTable) null, compilerOptions_AliasTransformationHandler0);
      scopedAliases0.hotSwapScript(node0, node0);
      assertFalse(node0.wasEmptyNode());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
      Node node0 = new Node(105, 105, 105);
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, (PreprocessorSymbolTable) null, compilerOptions_AliasTransformationHandler0);
      Node node1 = new Node(37, node0, node0, node0, node0, 32, 18);
      scopedAliases0.hotSwapScript(node1, node0);
      assertFalse(node1.hasMoreThanOneChild());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, (PreprocessorSymbolTable) null, compilerOptions_AliasTransformationHandler0);
      Node node0 = compiler0.parseTestCode("");
      Node node1 = new Node(1, node0, node0, node0, node0);
      scopedAliases0.hotSwapScript(node0, node1);
      assertEquals(12, Node.REGEXP_PROP);
  }
}
