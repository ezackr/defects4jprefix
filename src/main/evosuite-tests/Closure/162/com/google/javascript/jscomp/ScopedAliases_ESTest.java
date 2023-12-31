/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 23:31:23 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
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
      Node node0 = new Node(105, 105, 105);
      PreprocessorSymbolTable preprocessorSymbolTable0 = new PreprocessorSymbolTable(node0);
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, preprocessorSymbolTable0, compilerOptions_AliasTransformationHandler0);
      scopedAliases0.hotSwapScript(node0, node0);
      assertEquals(1, Node.DECR_FLAG);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Node node0 = Node.newNumber(9.007199254740992E15);
      Compiler compiler0 = new Compiler();
      PreprocessorSymbolTable preprocessorSymbolTable0 = new PreprocessorSymbolTable(node0);
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, preprocessorSymbolTable0, compilerOptions_AliasTransformationHandler0);
      scopedAliases0.process(node0, node0);
      assertEquals(51, Node.STATIC_SOURCE_FILE);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(132, 132, 132);
      PreprocessorSymbolTable preprocessorSymbolTable0 = new PreprocessorSymbolTable(node0);
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
      Node node1 = new Node(37, node0, node0, node0, node0, 16, 39);
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, preprocessorSymbolTable0, compilerOptions_AliasTransformationHandler0);
      scopedAliases0.hotSwapScript(node0, node1);
      assertEquals(1, node1.getChildCount());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(105, 105, 105);
      PreprocessorSymbolTable preprocessorSymbolTable0 = new PreprocessorSymbolTable(node0);
      CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;
      ScopedAliases scopedAliases0 = new ScopedAliases(compiler0, preprocessorSymbolTable0, compilerOptions_AliasTransformationHandler0);
      Node node1 = new Node(42, node0, node0, node0, node0, 22, 2);
      scopedAliases0.hotSwapScript(node1, node0);
      assertEquals(50, Node.FREE_CALL);
  }
}
