/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 02:21:30 GMT 2024
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.ClosureCodingConvention;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TypedScopeCreator_ESTest extends TypedScopeCreator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "s.nledertr", "s.nledertr");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
      assertEquals(33, scope0.getVarCount());
      
      typedScopeCreator0.patchGlobalScope(scope0, node0);
      assertEquals(32, scope0.getVarCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("unde+ine");
      Node node1 = new Node(37, node0, node0, node0);
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      Scope scope0 = typedScopeCreator0.createScope(node1, (Scope) null);
      assertFalse(scope0.isLocal());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("IAK0d}c^w@;}W|)}wE");
      Node node1 = new Node(120, node0, node0, node0);
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node1, (Scope) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //   Node(CATCH):  [testcode] :-1:-1
         // [source unknown]
         //   Parent: NULL
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("function JSCompiler_returnArg(JSCompiler_returnArg_value) {  return function() {return JSCompiler_returnArg_value}}");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(33, scope0.getVarCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.google.janascript.jscomp.SideEffectsAnalysis$4");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, (CodingConvention) null);
      Scope scope0 = typedScopeCreator0.createInitialScope(node0);
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.janascript.jscomp.SideEffectsAnalysis$4", "com.google.janascript.jscomp.SideEffectsAnalysis$4");
      Scope scope1 = typedScopeCreator0.createScope(node1, scope0);
      assertEquals(1, scope1.getVarCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "d7=-M%JOhU9", "d7=-M%JOhU9");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
      assertTrue(scope0.isGlobal());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("unde+ine");
      Node node1 = new Node(41, node0, node0, node0);
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      Scope scope0 = typedScopeCreator0.createScope(node1, (Scope) null);
      assertEquals(32, scope0.getVarCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("IAK0d}c^w@;}W|)}wE", "IAK0d}c^w@;}W|)}wE");
      Node node1 = new Node(44, node0, node0, node0, node0);
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      Scope scope0 = typedScopeCreator0.createScope(node1, (Scope) null);
      assertTrue(scope0.isGlobal());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("undefine", "undefine");
      Node node1 = new Node(47, node0, node0, node0);
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      Scope scope0 = typedScopeCreator0.createScope(node1, (Scope) null);
      assertTrue(scope0.isGlobal());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("undefined", "undefined");
      Node node0 = compiler0.parse(jSSourceFile0);
      Node node1 = new Node(122, node0, node0, node0);
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, closureCodingConvention0);
      Scope scope0 = typedScopeCreator0.createScope(node1, (Scope) null);
      assertEquals(32, scope0.getVarCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("j4bR7{u{B5+)", "j4bR7{u{B5+)");
      Node node0 = Node.newString("j4bR7{u{B5+)");
      compiler0.parse(jSSourceFile0);
      Node node1 = new Node(64, node0, node0, node0);
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node1, (Scope) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode(" gsynthttc:13", " gsynthttc:13");
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, closureCodingConvention0);
      Node node1 = new Node(64, node0, node0, node0);
      Node node2 = new Node(50, node1, node1, node1);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node2, (Scope) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 50
         //
         verifyException("com.google.javascript.rhino.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("undefine");
      Node node1 = new Node(118, node0, node0, node0);
      node1.addSuppression("undefine");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node1, (Scope) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //   Node(VAR):  [testcode] :-1:-1
         // [source unknown]
         //   Parent: NULL
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("#j4Kb@27{u+)M");
      Node node0 = Node.newString("#j4Kb@27{u+)M");
      compiler0.parse(jSSourceFile0);
      Node node1 = new Node(118, node0, node0, node0);
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node1, (Scope) null);
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
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("comgoogle.javascrt.jcomp.NoeUtil");
      Node node0 = compiler0.parse(jSSourceFile0);
      Node node1 = compiler0.parse(jSSourceFile0);
      Node node2 = new Node(118, node0, node0, node1);
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node2, (Scope) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //   Node(VAR): comgoogle.javascrt.jcomp.NoeUtil:-1:-1
         // [source unknown]
         //   Parent: NULL
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("comgoogle.javascrt.jcomp.NoeUtil");
      Node node0 = compiler0.parse(jSSourceFile0);
      Node node1 = compiler0.parse(jSSourceFile0);
      Node node2 = new Node(118, node0, node0, node1);
      node2.addSuppression("Error \"{1}\" writing name reference graph to \"{0}\".");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node2, (Scope) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //   Node(VAR): comgoogle.javascrt.jcomp.NoeUtil:-1:-1
         // [source unknown]
         //   Parent: NULL
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("undefined", "undefined");
      Node node0 = compiler0.parse(jSSourceFile0);
      Node node1 = new Node(118, node0, node0, node0);
      ClosureCodingConvention closureCodingConvention0 = new ClosureCodingConvention();
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, closureCodingConvention0);
      jSSourceFile0.setIsExtern(true);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node1, (Scope) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //   Node(VAR): undefined:-1:-1
         // [source unknown]
         //   Parent: NULL
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("-");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, (CodingConvention) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      JSType[] jSTypeArray0 = new JSType[0];
      Node node1 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
      Node node2 = Node.newString(42, "-", 53, 2);
      Node node3 = new Node(43, node2, node2, node2, node1);
      Scope scope0 = new Scope(node0, compiler0);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node3, scope0);
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
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("function JSCompiler_returnArg(JSCompiler_returnArg_value) {  return function() {return JSCompiler_returnArg_value}}");
      Node node1 = new Node((-2920), node0, node0, node0);
      CodingConvention codingConvention0 = compiler0.getCodingConvention();
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, codingConvention0);
      Scope scope0 = typedScopeCreator0.createInitialScope(node0);
      Scope scope1 = typedScopeCreator0.createScope(node1, scope0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(1, scope1.getVarCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("com.google.javascript.jscomp.NodeUtil", "com.google.javascript.jscomp.NodeUtil");
      Node node0 = compiler0.parse(jSSourceFile0);
      CompilerOptions compilerOptions0 = compiler0.options;
      JSSourceFile[] jSSourceFileArray0 = new JSSourceFile[2];
      jSSourceFileArray0[0] = jSSourceFile0;
      jSSourceFileArray0[1] = jSSourceFile0;
      compiler0.init(jSSourceFileArray0, jSSourceFileArray0, compilerOptions0);
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      Scope scope0 = typedScopeCreator0.createScope(node0, (Scope) null);
      assertEquals(33, scope0.getVarCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("omgoogle.avascript.jscomp.NeUtil", "omgoogle.avascript.jscomp.NeUtil");
      Node node0 = compiler0.parse(jSSourceFile0);
      ClosureCodingConvention closureCodingConvention0 = (ClosureCodingConvention)compiler0.defaultCodingConvention;
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, closureCodingConvention0);
      Node node1 = compiler0.parseTestCode("omgoogle.avascript.jscomp.NeUtil");
      Node node2 = new Node(16, node0, node1, node1);
      Scope scope0 = typedScopeCreator0.createScope(node2, (Scope) null);
      assertEquals(33, scope0.getVarCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, (CodingConvention) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      JSType[] jSTypeArray0 = new JSType[0];
      Node node1 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
      Node node2 = new Node(43, node0, node0, node0, node1);
      Scope scope0 = typedScopeCreator0.createInitialScope(node1);
      Node node3 = new Node(49, node2, 41, 29);
      Scope scope1 = typedScopeCreator0.createScope(node3, scope0);
      assertFalse(scope1.isGlobal());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      compiler0.parseTestCode("");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, (CodingConvention) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      JSType[] jSTypeArray0 = new JSType[0];
      Node node0 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
      Node node1 = Node.newString(42, "", 53, 2);
      Node node2 = new Node(43, node1, node1, node1, node0);
      Scope scope0 = typedScopeCreator0.createInitialScope(node1);
      Scope scope1 = typedScopeCreator0.createScope(node2, scope0);
      assertTrue(scope1.isLocal());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("l");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0, (CodingConvention) null);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      JSType[] jSTypeArray0 = new JSType[0];
      Node node1 = jSTypeRegistry0.createOptionalParameters(jSTypeArray0);
      Node node2 = Node.newString(42, "l", 53, 2);
      Node node3 = new Node(43, node2, node2, node2, node1);
      Scope scope0 = typedScopeCreator0.createInitialScope(node1);
      FunctionType functionType0 = jSTypeRegistry0.createFunctionType((JSType) null, node3);
      InputId inputId0 = node0.getInputId();
      CompilerInput compilerInput0 = compiler0.getInput(inputId0);
      scope0.declare("l", node0, functionType0, compilerInput0);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node3, scope0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }
}
