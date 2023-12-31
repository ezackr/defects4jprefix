/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 07:49:02 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.DefaultPassConfig;
import com.google.javascript.jscomp.LinkedFlowScope;
import com.google.javascript.jscomp.ReferenceCollectingCallback;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StaticSlot;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Scope_ESTest extends Scope_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Scope.Arguments scope_Arguments0 = new Scope.Arguments((Scope) null);
      // Undeclared exception!
      try { 
        scope_Arguments0.getSourceFile();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Scope$Var", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Scope.Arguments scope_Arguments0 = new Scope.Arguments((Scope) null);
      // Undeclared exception!
      try { 
        scope_Arguments0.isLocal();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Scope$Var", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Scope.Arguments scope_Arguments0 = new Scope.Arguments((Scope) null);
      // Undeclared exception!
      try { 
        scope_Arguments0.isGlobal();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Scope$Var", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Scope.Arguments scope_Arguments0 = new Scope.Arguments((Scope) null);
      scope_Arguments0.getJSDocInfo();
      assertFalse(scope_Arguments0.isDefine());
      assertFalse(scope_Arguments0.isTypeInferred());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      Scope.Arguments scope_Arguments0 = new Scope.Arguments(scope0);
      String string0 = scope_Arguments0.getName();
      assertFalse(scope_Arguments0.isTypeInferred());
      assertFalse(scope_Arguments0.isDefine());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Scope.Arguments scope_Arguments0 = new Scope.Arguments((Scope) null);
      Scope.Var scope_Var0 = scope_Arguments0.getSymbol();
      assertFalse(scope_Var0.isDefine());
      assertFalse(scope_Var0.isTypeInferred());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Stack<JSType> stack0 = new Stack<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) stack0);
      Scope.Var scope_Var0 = scope0.declare("Scope.Var ", node0, (JSType) null, (CompilerInput) null, false);
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
      referenceCollectingCallback0.getReferences(scope_Var0);
      assertFalse(scope_Var0.isTypeInferred());
      assertFalse(scope_Var0.isDefine());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Scope.Arguments scope_Arguments0 = new Scope.Arguments((Scope) null);
      scope_Arguments0.getNameNode();
      assertFalse(scope_Arguments0.isDefine());
      assertFalse(scope_Arguments0.isTypeInferred());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Scope.Arguments scope_Arguments0 = new Scope.Arguments((Scope) null);
      scope_Arguments0.getScope();
      assertFalse(scope_Arguments0.isDefine());
      assertFalse(scope_Arguments0.isTypeInferred());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = new Node(11, 11, 11);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      Scope.Arguments scope_Arguments0 = new Scope.Arguments(scope0);
      scope_Arguments0.getInput();
      assertFalse(scope_Arguments0.isTypeInferred());
      assertFalse(scope_Arguments0.isDefine());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Scope.Arguments scope_Arguments0 = new Scope.Arguments((Scope) null);
      scope_Arguments0.getType();
      assertFalse(scope_Arguments0.isTypeInferred());
      assertFalse(scope_Arguments0.isDefine());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Scope.Arguments scope_Arguments0 = new Scope.Arguments((Scope) null);
      scope_Arguments0.getNode();
      assertFalse(scope_Arguments0.isTypeInferred());
      assertFalse(scope_Arguments0.isDefine());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      SyntheticAst syntheticAst0 = new SyntheticAst("Cn%KNk7lZ$*8n@\"6");
      CompilerInput compilerInput0 = new CompilerInput(syntheticAst0, "Cn%KNk7lZ$*8n@\"6", true);
      Scope.Var scope_Var0 = scope0.declare("Cn%KNk7lZ$*8n@\"6", (Node) null, (JSType) null, compilerInput0);
      assertTrue(scope_Var0.isTypeInferred());
      
      scope_Var0.setType((JSType) null);
      assertFalse(scope_Var0.isDefine());
      assertEquals("Cn%KNk7lZ$*8n@\"6", scope_Var0.getInputName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Scope.Arguments scope_Arguments0 = new Scope.Arguments((Scope) null);
      boolean boolean0 = scope_Arguments0.isDefine();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Scope.Arguments scope_Arguments0 = new Scope.Arguments((Scope) null);
      // Undeclared exception!
      try { 
        scope_Arguments0.isBleedingFunction();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Node node0 = new Node((-20));
      Scope scope0 = new Scope(node0, (ObjectType) null);
      Scope.Arguments scope_Arguments0 = new Scope.Arguments(scope0);
      String string0 = scope_Arguments0.toString();
      assertFalse(scope_Arguments0.isDefine());
      assertEquals("Scope.Var arguments{null}", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      Scope.Arguments scope_Arguments0 = new Scope.Arguments(scope0);
      Compiler compiler0 = new Compiler();
      ReferenceCollectingCallback.Behavior referenceCollectingCallback_Behavior0 = ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
      ReferenceCollectingCallback referenceCollectingCallback0 = new ReferenceCollectingCallback(compiler0, referenceCollectingCallback_Behavior0);
      referenceCollectingCallback0.getReferences((Scope.Var) scope_Arguments0);
      assertFalse(scope_Arguments0.isDefine());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      DefaultPassConfig defaultPassConfig0 = new DefaultPassConfig((CompilerOptions) null);
      Node node0 = compiler0.parseTestCode("[native code]\n");
      defaultPassConfig0.regenerateGlobalTypedScope(compiler0, node0);
      assertEquals(41, Node.BRACELESS_TYPE);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      Iterable<Scope.Var> iterable0 = scope0.getAllSymbols();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Node node0 = new Node((-60));
      Scope scope0 = new Scope(node0, (ObjectType) null);
      Iterator<Scope.Var> iterator0 = scope0.getDeclarativelyUnboundVarsWithoutTypes();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      boolean boolean0 = scope0.isBottom();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      Scope.Arguments scope_Arguments0 = new Scope.Arguments(scope0);
      scope0.getReferences((Scope.Var) scope_Arguments0);
      assertFalse(scope_Arguments0.isDefine());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      StaticSlot<JSType> staticSlot0 = scope0.getSlot((String) null);
      assertNull(staticSlot0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      Scope.Arguments scope_Arguments0 = new Scope.Arguments(scope0);
      StaticScope<JSType> staticScope0 = scope0.getScope((Scope.Var) scope_Arguments0);
      assertNotNull(staticScope0);
      assertFalse(scope_Arguments0.isDefine());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Node node0 = new Node((-20));
      Scope scope0 = new Scope(node0, (ObjectType) null);
      Scope.Arguments scope_Arguments0 = new Scope.Arguments(scope0);
      boolean boolean0 = scope_Arguments0.equals(scope_Arguments0);
      assertTrue(boolean0);
      assertFalse(scope_Arguments0.isDefine());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      int int0 = scope0.getDepth();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      int int0 = scope0.getVarCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      LinkedFlowScope linkedFlowScope0 = LinkedFlowScope.createEntryLattice(scope0);
      JSType jSType0 = linkedFlowScope0.getTypeOfThis();
      assertNull(jSType0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      StaticSlot<JSType> staticSlot0 = scope0.getOwnSlot((String) null);
      assertNull(staticSlot0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      Node node0 = Node.newString("Cn%KNk7lZ$*8n@\"6");
      Scope.Var scope_Var0 = scope0.declare("Cn%KNk7lZ$*8n@\"6", node0, (JSType) null, (CompilerInput) null);
      Scope.Var scope_Var1 = scope_Var0.getDeclaration();
      assertFalse(scope_Var1.isDefine());
      assertNotNull(scope_Var1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Scope.Arguments scope_Arguments0 = new Scope.Arguments((Scope) null);
      Scope.Var scope_Var0 = scope_Arguments0.getDeclaration();
      assertFalse(scope_Arguments0.isDefine());
      assertNull(scope_Var0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Scope.Arguments scope_Arguments0 = new Scope.Arguments((Scope) null);
      boolean boolean0 = scope_Arguments0.isExtern();
      assertFalse(scope_Arguments0.isDefine());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      SyntheticAst syntheticAst0 = new SyntheticAst("Cn%KNk7lZ$*8n@\"6");
      CompilerInput compilerInput0 = new CompilerInput(syntheticAst0, "Cn%KNk7lZ$*8n@\"6", false);
      Scope.Var scope_Var0 = scope0.declare("Cn%KNk7lZ$*8n@\"6", (Node) null, (JSType) null, compilerInput0);
      boolean boolean0 = scope_Var0.isExtern();
      assertFalse(scope_Var0.isDefine());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      SyntheticAst syntheticAst0 = new SyntheticAst("Cn%KNk7lZ$*8n@\"6");
      CompilerInput compilerInput0 = new CompilerInput(syntheticAst0, "Cn%KNk7lZ$*8n@\"6", true);
      Scope.Var scope_Var0 = scope0.declare("Cn%KNk7lZ$*8n@\"6", (Node) null, (JSType) null, compilerInput0);
      boolean boolean0 = scope_Var0.isExtern();
      assertTrue(boolean0);
      assertEquals("Cn%KNk7lZ$*8n@\"6", scope_Var0.getInputName());
      assertFalse(scope_Var0.isDefine());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Scope.Arguments scope_Arguments0 = new Scope.Arguments((Scope) null);
      boolean boolean0 = scope_Arguments0.isConst();
      assertFalse(scope_Arguments0.isDefine());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Node node0 = new Node(11, 11, 11);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      Scope.Var scope_Var0 = scope0.declare("Not declared as a type name", node0, (JSType) null, (CompilerInput) null);
      boolean boolean0 = scope_Var0.isConst();
      assertFalse(scope_Var0.isDefine());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Node node0 = new Node((-1), (-1), (-1));
      Node node1 = new Node(118, node0, node0, node0);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      Scope.Var scope_Var0 = scope0.declare("Not declared as a type name", node0, (JSType) null, (CompilerInput) null);
      Node node2 = scope_Var0.getInitialValue();
      assertNull(node2);
      assertFalse(scope_Var0.isDefine());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Node node0 = new Node(11, 11, 11);
      Node node1 = new Node(105, node0, node0, node0);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      Scope.Var scope_Var0 = scope0.declare("Not declared as a type name", node0, (JSType) null, (CompilerInput) null);
      Node node2 = scope_Var0.getInitialValue();
      assertNotNull(node2);
      assertFalse(scope_Var0.isDefine());
      assertTrue(node2.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Node node0 = new Node(11, 11, 1245);
      Node node1 = new Node(86, node0, node0, node0);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      Scope.Var scope_Var0 = scope0.declare("Not declared as a type name", node0, (JSType) null, (CompilerInput) null);
      Node node2 = scope_Var0.getInitialValue();
      assertNotNull(node2);
      assertFalse(scope_Var0.isDefine());
      assertFalse(node2.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Node node0 = new Node((-15), (-15), (-15));
      Node node1 = new Node(36, node0, node0, (-2), 2);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      Scope.Var scope_Var0 = scope0.declare("Not declared as a type name", node0, (JSType) null, (CompilerInput) null);
      Node node2 = scope_Var0.getInitialValue();
      assertFalse(scope_Var0.isDefine());
      assertNull(node2);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Scope.Arguments scope_Arguments0 = new Scope.Arguments((Scope) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      scope_Arguments0.resolveType(simpleErrorReporter0);
      assertFalse(scope_Arguments0.isDefine());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      SyntheticAst syntheticAst0 = new SyntheticAst("Cn%KNk7lZ$*8n@\"6");
      CompilerInput compilerInput0 = new CompilerInput(syntheticAst0, "Cn%KNk7lZ$*8n@\"6", false);
      Scope.Var scope_Var0 = scope0.declare("Cn%KNk7lZ$*8n@\"6", (Node) null, (JSType) null, compilerInput0);
      String string0 = scope_Var0.getInputName();
      assertEquals("Cn%KNk7lZ$*8n@\"6", string0);
      assertFalse(scope_Var0.isDefine());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Scope.Arguments scope_Arguments0 = new Scope.Arguments((Scope) null);
      String string0 = scope_Arguments0.getInputName();
      assertEquals("<non-file>", string0);
      assertFalse(scope_Arguments0.isDefine());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Node node0 = new Node(11, 11, 11);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      Scope.Arguments scope_Arguments0 = new Scope.Arguments(scope0);
      boolean boolean0 = scope_Arguments0.isNoShadow();
      assertFalse(scope_Arguments0.isDefine());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Node node0 = Node.newString(0, "Not declared as a type name");
      Scope scope0 = new Scope(node0, (ObjectType) null);
      node0.addSuppression("Unknown class name");
      Scope.Var scope_Var0 = scope0.declare("Not declared as a constructor", node0, (JSType) null, (CompilerInput) null);
      boolean boolean0 = scope_Var0.isNoShadow();
      assertFalse(scope_Var0.isDefine());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Node node0 = new Node((-42));
      Scope scope0 = new Scope(node0, (ObjectType) null);
      Scope.Arguments scope_Arguments0 = new Scope.Arguments(scope0);
      Scope.Var scope_Var0 = scope0.declare("Not declared as a type name", node0, (JSType) null, (CompilerInput) null);
      boolean boolean0 = scope_Var0.equals(scope_Arguments0);
      assertFalse(scope_Var0.isDefine());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(simpleErrorReporter0);
      Stack<JSType> stack0 = new Stack<JSType>();
      Node node0 = jSTypeRegistry0.createParameters((List<JSType>) stack0);
      Scope.Var scope_Var0 = scope0.declare("Scope.Var ", node0, (JSType) null, (CompilerInput) null, false);
      boolean boolean0 = scope_Var0.equals((Object) null);
      assertFalse(scope_Var0.isDefine());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      SyntheticAst syntheticAst0 = new SyntheticAst("Cn%KNk7lZ$*8n@\"6");
      CompilerInput compilerInput0 = new CompilerInput(syntheticAst0, "Cn%KNk7lZ$*8n@\"6", true);
      Scope.Var scope_Var0 = scope0.declare("Cn%KNk7lZ$*8n@\"6", (Node) null, (JSType) null, compilerInput0);
      Scope.Arguments scope_Arguments0 = new Scope.Arguments(scope0);
      boolean boolean0 = scope_Var0.equals(scope_Arguments0);
      assertFalse(scope_Var0.isDefine());
      assertTrue(boolean0);
      assertEquals("Cn%KNk7lZ$*8n@\"6", scope_Var0.getInputName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Scope.Arguments scope_Arguments0 = new Scope.Arguments((Scope) null);
      boolean boolean0 = scope_Arguments0.equals((Object) null);
      assertFalse(scope_Arguments0.isDefine());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Node node0 = new Node((-20));
      Node node1 = new Node((-60), node0);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      Scope scope1 = new Scope(scope0, node1);
      Scope.Arguments scope_Arguments0 = new Scope.Arguments(scope1);
      Scope.Arguments scope_Arguments1 = new Scope.Arguments(scope0);
      boolean boolean0 = scope_Arguments1.equals(scope_Arguments0);
      assertFalse(scope_Arguments1.isDefine());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      Scope scope1 = null;
      try {
        scope1 = new Scope(scope0, (Node) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Node node0 = new Node((-60));
      Node node1 = new Node((-60), node0);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      Scope scope1 = new Scope(scope0, node1);
      Scope scope2 = scope1.getGlobalScope();
      assertFalse(scope2.isLocal());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      // Undeclared exception!
      try { 
        scope0.declare((String) null, (Node) null, (JSType) null, (CompilerInput) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      // Undeclared exception!
      try { 
        scope0.declare("", (Node) null, (JSType) null, (CompilerInput) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Node node0 = new Node(0);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      scope0.declare("Unknown class name", node0, (JSType) null, (CompilerInput) null);
      // Undeclared exception!
      try { 
        scope0.declare("Unknown class name", node0, (JSType) null, (CompilerInput) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Node node0 = new Node((-15), (-15), (-15));
      Node node1 = new Node(48, node0, node0, node0);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      Scope scope1 = new Scope(scope0, node1);
      Scope.Arguments scope_Arguments0 = new Scope.Arguments(scope1);
      // Undeclared exception!
      try { 
        scope0.undeclare(scope_Arguments0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      Scope.Var scope_Var0 = scope0.declare("HJ8Yd\"_IoRofb/Mb", (Node) null, (JSType) null, (CompilerInput) null);
      scope0.undeclare(scope_Var0);
      assertFalse(scope_Var0.isDefine());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      Scope.Arguments scope_Arguments0 = new Scope.Arguments(scope0);
      // Undeclared exception!
      try { 
        scope0.undeclare(scope_Arguments0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      scope0.declare("`A", (Node) null, (JSType) null, (CompilerInput) null);
      Scope.Var scope_Var0 = scope0.getVar("`A");
      assertFalse(scope_Var0.isDefine());
      assertNotNull(scope_Var0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Node node0 = new Node((-60));
      Node node1 = new Node((-60), node0);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      Scope scope1 = new Scope(scope0, node1);
      Scope.Var scope_Var0 = scope1.getVar("Not declared as a constructor");
      assertNull(scope_Var0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      scope0.getArgumentsVar();
      Scope.Var scope_Var0 = scope0.getArgumentsVar();
      assertNotNull(scope_Var0);
      assertFalse(scope_Var0.isDefine());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      Scope.Var scope_Var0 = scope0.declare("HJ8Yd\"_IoRofb/Mb", (Node) null, (JSType) null, (CompilerInput) null);
      assertFalse(scope_Var0.isDefine());
      
      boolean boolean0 = scope0.isDeclared("HJ8Yd\"_IoRofb/Mb", false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Node node0 = new Node((-20));
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      Scope scope1 = new Scope(scope0, node0);
      boolean boolean0 = scope1.isDeclared("Not declared as a type name", false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Node node0 = new Node((-20));
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      Scope scope1 = new Scope(scope0, node0);
      boolean boolean0 = scope1.isDeclared("Not declared as a type name", true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Node node0 = new Node((-20));
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      Scope scope1 = new Scope(scope0, node0);
      boolean boolean0 = scope1.isLocal();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Scope scope0 = new Scope((Node) null, (ObjectType) null);
      boolean boolean0 = scope0.isLocal();
      assertFalse(boolean0);
  }
}
