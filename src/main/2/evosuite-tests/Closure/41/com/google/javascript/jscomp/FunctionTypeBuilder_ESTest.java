/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 01:55:57 GMT 2024
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.FunctionTypeBuilder;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FunctionTypeBuilder_ESTest extends FunctionTypeBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.google.jvasrpt.jcomp.FunctionTypeBuilder$AsFunqtionCntents");
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      JSTypeNative jSTypeNative0 = JSTypeNative.ERROR_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("Not declared as a constructor", compiler0, node0, "Not declared as a type name", (Scope) null);
      JSType[] jSTypeArray0 = new JSType[3];
      Node node1 = jSTypeRegistry0.createParameters(jSTypeArray0);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node0);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      functionTypeBuilder1.inferParameterTypes(node1, jSDocInfo0);
      assertEquals(1, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "JSC_IMPLEMENTS_WIHOUT_ONSTRUCTOR", "JSC_IMPLEMENTS_WIHOUT_ONSTRUCTOR");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSC_IMPLEMENTS_WIHOUT_ONSTRUCTOR", compiler0, node0, "JSC_IMPLEMENTS_WIHOUT_ONSTRUCTOR", (Scope) null);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes(jSDocInfo0);
      FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents(node0);
      functionTypeBuilder1.setContents(functionTypeBuilder_AstFunctionContents0);
      // Undeclared exception!
      try { 
        functionTypeBuilder0.buildAndRegister();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents((Node) null);
      assertFalse(functionTypeBuilder_AstFunctionContents0.mayHaveNonEmptyReturns());
      
      functionTypeBuilder_AstFunctionContents0.recordNonEmptyReturn();
      assertTrue(functionTypeBuilder_AstFunctionContents0.mayHaveNonEmptyReturns());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FunctionTypeBuilder.UnknownFunctionContents functionTypeBuilder_UnknownFunctionContents0 = new FunctionTypeBuilder.UnknownFunctionContents();
      Iterable<String> iterable0 = functionTypeBuilder_UnknownFunctionContents0.getEscapedVarNames();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FunctionTypeBuilder.UnknownFunctionContents functionTypeBuilder_UnknownFunctionContents0 = (FunctionTypeBuilder.UnknownFunctionContents)FunctionTypeBuilder.UnknownFunctionContents.get();
      boolean boolean0 = functionTypeBuilder_UnknownFunctionContents0.mayBeFromExterns();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "JSC_IMPLEMENTS_WITHOUT_ONSTRUCTOR", "JSC_IMPLEMENTS_WITHOUT_ONSTRUCTOR");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder((String) null, compiler0, node0, "JSC_IMPLEMENTS_WITHOUT_ONSTRUCTOR", (Scope) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "", "");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("", compiler0, node0, "", (Scope) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.setContents((FunctionTypeBuilder.FunctionContents) null);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR", "JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR");
      Scope scope0 = new Scope(node0, compiler0);
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR", compiler0, node0, "JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR", scope0);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction((FunctionType) null, node0);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "JSC_IMPLEMENTS_WITHOUT_CONSTRUCTOR", "JSC_IMPLEMENTS_WITHOUT_CONSTRUCTOR");
      Scope scope0 = new Scope(node0, compiler0);
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSC_IMPLEMENTS_WITHOUT_CONSTRUCTOR", compiler0, node0, "JSC_IMPLEMENTS_WITHOUT_CONSTRUCTOR", scope0);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      functionTypeBuilder0.inferParameterTypes(jSDocInfo0);
      FunctionType functionType0 = functionTypeBuilder0.buildAndRegister();
      functionTypeBuilder0.inferFromOverriddenFunction(functionType0, (Node) null);
      assertFalse(functionType0.isReturnTypeInferred());
      assertFalse(functionType0.hasInstanceType());
      assertFalse(functionType0.isInterface());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "JSCIMPLEMENTS_WITHOUT_CONSTRUCTOR", "JSCIMPLEMENTS_WITHOUT_CONSTRUCTOR");
      node0.addChildrenToBack(node0);
      Scope scope0 = new Scope(node0, compiler0);
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSCIMPLEMENTS_WITHOUT_CONSTRUCTOR", compiler0, node0, "JSCIMPLEMENTS_WITHOUT_CONSTRUCTOR", scope0);
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      JSTypeNative jSTypeNative0 = JSTypeNative.REGEXP_FUNCTION_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node0);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "e;06=k", "e;06=k");
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      JSTypeNative jSTypeNative0 = JSTypeNative.U2U_CONSTRUCTOR_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("e;06=k", compiler0, node0, "Not declared as a constructor", (Scope) null);
      JSType[] jSTypeArray0 = new JSType[3];
      Node node1 = jSTypeRegistry0.createParameters(jSTypeArray0);
      functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node1);
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "", "");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("", compiler0, node0, "", (Scope) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferReturnType((JSDocInfo) null);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "M", "M");
      Scope scope0 = new Scope(node0, compiler0);
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("M", compiler0, node0, "M", scope0);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferReturnType(jSDocInfo0);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR", "JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR");
      Scope scope0 = new Scope(node0, compiler0);
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR", compiler0, node0, "JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR", scope0);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferInheritance((JSDocInfo) null);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR", "JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR");
      Scope scope0 = new Scope(node0, compiler0);
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR", compiler0, node0, "JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR", scope0);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      functionTypeBuilder0.inferInheritance(jSDocInfo0);
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "JSC_IMPLEMENTS_WIHOUT_ONSTRUCTOR", "JSC_IMPLEMENTS_WIHOUT_ONSTRUCTOR");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSC_IMPLEMENTS_WIHOUT_ONSTRUCTOR", compiler0, node0, "JSC_IMPLEMENTS_WIHOUT_ONSTRUCTOR", (Scope) null);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      functionTypeBuilder0.inferParameterTypes(jSDocInfo0);
      FunctionType functionType0 = functionTypeBuilder0.buildAndRegister();
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferThisType(jSDocInfo0, functionType0);
      functionTypeBuilder1.inferThisType(jSDocInfo0, functionType0);
      assertFalse(functionType0.isReturnTypeInferred());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "JSCKIdPLEMENTS_WITHO*T_ONSTRpCTOR", "JSCKIdPLEMENTS_WITHO*T_ONSTRpCTOR");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSCKIdPLEMENTS_WITHO*T_ONSTRpCTOR", compiler0, node0, "JSCKIdPLEMENTS_WITHO*T_ONSTRpCTOR", (Scope) null);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferThisType(jSDocInfo0, (JSType) null);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "SFwhvQQa'", "SFwhvQQa'");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("SFwhvQQa'", compiler0, node0, "SFwhvQQa'", (Scope) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes(node0, (JSDocInfo) null);
      FunctionType functionType0 = functionTypeBuilder1.buildAndRegister();
      functionTypeBuilder1.inferThisType((JSDocInfo) null, functionType0);
      assertFalse(functionType0.isReturnTypeInferred());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "JSC_IMPLEMENTS_WIHOUT_ONSTRUCTOR", "JSC_IMPLEMENTS_WIHOUT_ONSTRUCTOR");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSC_IMPLEMENTS_WIHOUT_ONSTRUCTOR", compiler0, node0, "JSC_IMPLEMENTS_WIHOUT_ONSTRUCTOR", (Scope) null);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes((Node) null, jSDocInfo0);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "JSC_IMPLEMENTS_WIHOUT_ONSTRUCTOR", "JSC_IMPLEMENTS_WIHOUT_ONSTRUCTOR");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSC_IMPLEMENTS_WIHOUT_ONSTRUCTOR", compiler0, node0, "JSC_IMPLEMENTS_WIHOUT_ONSTRUCTOR", (Scope) null);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes((Node) null, (JSDocInfo) null);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "a", "a");
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      JSTypeNative jSTypeNative0 = JSTypeNative.U2U_CONSTRUCTOR_TYPE;
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("Not declared as a type name", compiler0, node0, "Named type with empty name component", (Scope) null);
      JSType[] jSTypeArray0 = new JSType[3];
      Node node1 = jSTypeRegistry0.createParameters(jSTypeArray0);
      FunctionType functionType1 = jSTypeRegistry0.createFunctionType((JSType) functionType0, node0);
      functionTypeBuilder0.inferFromOverriddenFunction(functionType1, node1);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      functionTypeBuilder0.inferParameterTypes(node1, jSDocInfo0);
      assertEquals(0, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR", "JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR");
      Scope scope0 = new Scope(node0, compiler0);
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR", compiler0, node0, "JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR", scope0);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferTemplateTypeName((JSDocInfo) null);
      assertSame(functionTypeBuilder0, functionTypeBuilder1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR", "JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR");
      Scope scope0 = new Scope(node0, compiler0);
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR", compiler0, node0, "JSC_IMPLEMETS_WITHOUT_CONSTRUCTOR", scope0);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferTemplateTypeName(jSDocInfo0);
      assertSame(functionTypeBuilder1, functionTypeBuilder0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("JSC_IMPL:MTSWITHOT_OjSTICTOR");
      JSTypeNative jSTypeNative0 = JSTypeNative.U2U_CONSTRUCTOR_TYPE;
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      FunctionType functionType0 = jSTypeRegistry0.getNativeFunctionType(jSTypeNative0);
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("Unknown class name", compiler0, node0, "Named type with empty name component", (Scope) null);
      JSType[] jSTypeArray0 = new JSType[11];
      Node node1 = jSTypeRegistry0.createParameters(jSTypeArray0);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferFromOverriddenFunction(functionType0, node0);
      functionTypeBuilder1.inferParameterTypes(node1, (JSDocInfo) null);
      assertEquals(1, compiler0.getWarningCount());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "JSC_IMPLEMENTS_WITHOUT_ONSTRUCTOR", "JSC_IMPLEMENTS_WITHOUT_ONSTRUCTOR");
      Scope scope0 = new Scope(node0, compiler0);
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("JSC_IMPLEMENTS_WITHOUT_ONSTRUCTOR", compiler0, node0, "JSC_IMPLEMENTS_WITHOUT_ONSTRUCTOR", scope0);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.inferParameterTypes(jSDocInfo0);
      functionTypeBuilder0.buildAndRegister();
      FunctionType functionType0 = functionTypeBuilder1.buildAndRegister();
      assertFalse(functionType0.isReturnTypeInferred());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("J");
      FunctionTypeBuilder functionTypeBuilder0 = new FunctionTypeBuilder("J", compiler0, node0, "J", (Scope) null);
      SyntheticAst syntheticAst0 = new SyntheticAst("J");
      InputId inputId0 = new InputId("J");
      CompilerInput compilerInput0 = new CompilerInput(syntheticAst0, inputId0, true);
      Node node1 = compilerInput0.getAstRoot(compiler0);
      FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents(node1);
      FunctionTypeBuilder functionTypeBuilder1 = functionTypeBuilder0.setContents(functionTypeBuilder_AstFunctionContents0);
      // Undeclared exception!
      try { 
        functionTypeBuilder1.buildAndRegister();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // All Function types must have params and a return type
         //
         verifyException("com.google.javascript.jscomp.FunctionTypeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      boolean boolean0 = FunctionTypeBuilder.isFunctionTypeDeclaration(jSDocInfo0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents((Node) null);
      functionTypeBuilder_AstFunctionContents0.recordEscapedVarName("Cu2@N>Le[jL/Po.");
      Iterable<String> iterable0 = functionTypeBuilder_AstFunctionContents0.getEscapedVarNames();
      assertTrue(iterable0.contains("Cu2@N>Le[jL/Po."));
      assertFalse(functionTypeBuilder_AstFunctionContents0.mayHaveNonEmptyReturns());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents((Node) null);
      Iterable<String> iterable0 = functionTypeBuilder_AstFunctionContents0.getEscapedVarNames();
      assertFalse(functionTypeBuilder_AstFunctionContents0.mayHaveNonEmptyReturns());
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FunctionTypeBuilder.AstFunctionContents functionTypeBuilder_AstFunctionContents0 = new FunctionTypeBuilder.AstFunctionContents((Node) null);
      functionTypeBuilder_AstFunctionContents0.recordEscapedVarName("com.google.javascript.jscomp.CoalesceVariableNames$LiveRangeChecker");
      functionTypeBuilder_AstFunctionContents0.recordEscapedVarName("com.google.javascript.jscomp.CoalesceVariableNames$LiveRangeChecker");
      assertFalse(functionTypeBuilder_AstFunctionContents0.mayHaveNonEmptyReturns());
  }
}
