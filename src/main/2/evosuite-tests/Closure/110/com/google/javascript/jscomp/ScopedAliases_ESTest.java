/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 06:45:02 GMT 2024
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.Normalize;
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
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, (PreprocessorSymbolTable) null, (CompilerOptions.AliasTransformationHandler) null);
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
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "Zdlk");
      Node node1 = new Node(37, node0, 16, 2);
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, (PreprocessorSymbolTable) null, compilerOptions_AliasTransformationHandler0);
      scopedAliases0.hotSwapScript(node1, node1);
      assertEquals(2, Node.POST_FLAG);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
      Node node0 = Node.newNumber(0.0);
      PreprocessorSymbolTable preprocessorSymbolTable0 = new PreprocessorSymbolTable(node0);
      Node node1 = new Node(16, node0, node0);
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, preprocessorSymbolTable0, compilerOptions_AliasTransformationHandler0);
      scopedAliases0.hotSwapScript(node0, node0);
      assertEquals(1, Node.DECR_FLAG);
  }
}
