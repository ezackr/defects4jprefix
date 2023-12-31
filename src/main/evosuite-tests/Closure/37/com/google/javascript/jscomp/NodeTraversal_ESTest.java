/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 01:54:29 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckDebuggerStatement;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CoalesceVariableNames;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.Denormalize;
import com.google.javascript.jscomp.FieldCleanupPass;
import com.google.javascript.jscomp.FlowSensitiveInlineVariables;
import com.google.javascript.jscomp.GatherRawExports;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique;
import com.google.javascript.jscomp.MoveFunctionDeclarations;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.StrictModeCheck;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.jscomp.TypedScopeCreator;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NodeTraversal_ESTest extends NodeTraversal_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("(function(t){})(y.prototype);");
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(compiler0);
      // Undeclared exception!
      try { 
        flowSensitiveInlineVariables0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("[source unknown]", "[source unknown]");
      Denormalize.StripConstantAnnotations denormalize_StripConstantAnnotations0 = new Denormalize.StripConstantAnnotations(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, denormalize_StripConstantAnnotations0);
      Scope scope0 = new Scope(node0, compiler0);
      nodeTraversal0.traverseAtScope(scope0);
      assertEquals("[source unknown]", nodeTraversal0.getSourceName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      GatherRawExports gatherRawExports0 = new GatherRawExports(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, gatherRawExports0);
      InputId inputId0 = nodeTraversal0.getInputId();
      assertNull(inputId0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MoveFunctionDeclarations moveFunctionDeclarations0 = new MoveFunctionDeclarations(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, moveFunctionDeclarations0);
      Node node0 = Node.newString("iu[a\"+.Z<v)");
      JSError jSError0 = nodeTraversal0.makeError(node0, compiler0.OPTIMIZE_LOOP_ERROR, (String[]) null);
      assertEquals((-1), jSError0.getCharno());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MoveFunctionDeclarations moveFunctionDeclarations0 = new MoveFunctionDeclarations(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, moveFunctionDeclarations0);
      Node node0 = nodeTraversal0.getCurrentNode();
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      StrictModeCheck strictModeCheck0 = new StrictModeCheck(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, strictModeCheck0);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.NodeTraversal$AbstractPostOrderCallback");
      nodeTraversal0.traverse(node0);
      assertEquals(1, nodeTraversal0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckDebuggerStatement checkDebuggerStatement0 = new CheckDebuggerStatement(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkDebuggerStatement0);
      Compiler compiler1 = nodeTraversal0.getCompiler();
      assertEquals(0.0, compiler1.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, (NodeTraversal.Callback) null);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      // Undeclared exception!
      try { 
        nodeTraversal0.makeError((Node) null, checkLevel0, compiler0.OPTIMIZE_LOOP_ERROR, (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.JSError", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("u:Kc", "u:Kc");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createInitialScope(node0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("t");
      TypedScopeCreator typedScopeCreator0 = new TypedScopeCreator(compiler0);
      // Undeclared exception!
      try { 
        typedScopeCreator0.createScope(node0, (Scope) null);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckDebuggerStatement checkDebuggerStatement0 = new CheckDebuggerStatement(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkDebuggerStatement0);
      Node node0 = Node.newString(105, "DpQYM-p");
      FieldCleanupPass.QualifiedNameSearchTraversal fieldCleanupPass_QualifiedNameSearchTraversal0 = new FieldCleanupPass.QualifiedNameSearchTraversal((JSTypeRegistry) null, "DpQYM-p");
      boolean boolean0 = fieldCleanupPass_QualifiedNameSearchTraversal0.shouldTraverse(nodeTraversal0, (Node) null, node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("3%y");
      JSTypeRegistry jSTypeRegistry0 = compiler0.getTypeRegistry();
      FieldCleanupPass.QualifiedNameSearchTraversal fieldCleanupPass_QualifiedNameSearchTraversal0 = new FieldCleanupPass.QualifiedNameSearchTraversal(jSTypeRegistry0, "3%y");
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, fieldCleanupPass_QualifiedNameSearchTraversal0, syntacticScopeCreator0);
      boolean boolean0 = fieldCleanupPass_QualifiedNameSearchTraversal0.shouldTraverse(nodeTraversal0, node0, node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckDebuggerStatement checkDebuggerStatement0 = new CheckDebuggerStatement(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkDebuggerStatement0);
      Node node0 = Node.newString(105, "DpQYM-p");
      FieldCleanupPass.QualifiedNameSearchTraversal fieldCleanupPass_QualifiedNameSearchTraversal0 = new FieldCleanupPass.QualifiedNameSearchTraversal((JSTypeRegistry) null, "DpQYM-p");
      boolean boolean0 = fieldCleanupPass_QualifiedNameSearchTraversal0.shouldTraverse(nodeTraversal0, node0, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("");
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, (NodeTraversal.Callback) null);
      // Undeclared exception!
      try { 
        nodeTraversal0.traverse(node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MoveFunctionDeclarations moveFunctionDeclarations0 = new MoveFunctionDeclarations(compiler0);
      Vector<Node> vector0 = new Vector<Node>();
      NodeTraversal.traverseRoots((AbstractCompiler) compiler0, (List<Node>) vector0, (NodeTraversal.Callback) moveFunctionDeclarations0);
      assertEquals(0, vector0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("GPC(bbmyFZ:]-G", "GPC(bbmyFZ:]-G");
      StrictModeCheck strictModeCheck0 = new StrictModeCheck(compiler0);
      // Undeclared exception!
      try { 
        strictModeCheck0.process(node0, node0);
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
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MoveFunctionDeclarations moveFunctionDeclarations0 = new MoveFunctionDeclarations(compiler0);
      Node node0 = compiler0.parseTestCode("t");
      Node[] nodeArray0 = new Node[6];
      nodeArray0[0] = node0;
      Node node1 = new Node(45, node0);
      nodeArray0[1] = node1;
      // Undeclared exception!
      try { 
        NodeTraversal.traverseRoots((AbstractCompiler) compiler0, (NodeTraversal.Callback) moveFunctionDeclarations0, nodeArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //   Node(SCRIPT):  [testcode] :1:0
         // t
         //   Parent(SHEQ):  [testcode] :-1:-1
         // [source unknown]
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MoveFunctionDeclarations moveFunctionDeclarations0 = new MoveFunctionDeclarations(compiler0);
      Node node0 = compiler0.parseSyntheticCode("t", "t");
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, moveFunctionDeclarations0);
      nodeTraversal0.traverseInnerNode(node0, node0, (Scope) null);
      assertEquals("t", nodeTraversal0.getSourceName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("7tq!!x`d*%KCgqtY", "7tq!!x`d*%KCgqtY");
      Scope scope0 = new Scope(node0, compiler0);
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique();
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, makeDeclaredNamesUnique0);
      nodeTraversal0.traverseInnerNode(node0, node0, scope0);
      assertEquals("7tq!!x`d*%KCgqtY", nodeTraversal0.getSourceName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MoveFunctionDeclarations moveFunctionDeclarations0 = new MoveFunctionDeclarations(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, moveFunctionDeclarations0);
      Node node0 = Node.newString(12, "Z", 12, 12);
      Scope scope0 = new Scope(node0, (ObjectType) null);
      nodeTraversal0.traverseInnerNode(node0, node0, scope0);
      int int0 = nodeTraversal0.getLineNumber();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MoveFunctionDeclarations moveFunctionDeclarations0 = new MoveFunctionDeclarations(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, moveFunctionDeclarations0);
      Node node0 = Node.newString(2, "");
      Scope scope0 = new Scope(node0, (ObjectType) null);
      nodeTraversal0.traverseInnerNode(node0, node0, scope0);
      int int0 = nodeTraversal0.getLineNumber();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("t");
      MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique();
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, makeDeclaredNamesUnique0);
      nodeTraversal0.traverse(node0);
      nodeTraversal0.getModule();
      assertEquals(1, nodeTraversal0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MoveFunctionDeclarations moveFunctionDeclarations0 = new MoveFunctionDeclarations(compiler0);
      compiler0.parseTestCode("could not determine the type of this expression");
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, moveFunctionDeclarations0);
      JSModule jSModule0 = nodeTraversal0.getModule();
      assertNull(jSModule0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(105);
      Denormalize.StripConstantAnnotations denormalize_StripConstantAnnotations0 = new Denormalize.StripConstantAnnotations(compiler0);
      // Undeclared exception!
      try { 
        denormalize_StripConstantAnnotations0.process(node0, node0);
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
  public void test24()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("(function(){})(y.protCtype);");
      CoalesceVariableNames coalesceVariableNames0 = new CoalesceVariableNames(compiler0, false);
      // Undeclared exception!
      try { 
        coalesceVariableNames0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("@TV(q`[Qqq4'uz)<", "var JSCompiler_stubMap = [];function JSCompiler_stubMethod(JSCompiler_stubMethod_id) {  return function() {    return JSCompiler_stubMap[JSCompiler_stubMethod_id].apply(        this, arguments);  };}function JSCompiler_unstubMethod(    JSCompiler_unstubMethod_id, JSCompiler_unstubMethod_body) {  return JSCompiler_stubMap[JSCompiler_unstubMethod_id] =       JSCompiler_unstubMethod_body;}");
      assertEquals(0, node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MoveFunctionDeclarations moveFunctionDeclarations0 = new MoveFunctionDeclarations(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, moveFunctionDeclarations0);
      Node node0 = nodeTraversal0.getEnclosingFunction();
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MoveFunctionDeclarations moveFunctionDeclarations0 = new MoveFunctionDeclarations(compiler0);
      // Undeclared exception!
      try { 
        compiler0.process(moveFunctionDeclarations0);
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
  public void test28()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("[source unknown]", "[source unknown]");
      Scope scope0 = new Scope(node0, compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, (NodeTraversal.Callback) null);
      // Undeclared exception!
      try { 
        nodeTraversal0.traverseInnerNode((Node) null, node0, scope0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      MoveFunctionDeclarations moveFunctionDeclarations0 = new MoveFunctionDeclarations(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, moveFunctionDeclarations0);
      boolean boolean0 = nodeTraversal0.hasScope();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(132);
      Denormalize.StripConstantAnnotations denormalize_StripConstantAnnotations0 = new Denormalize.StripConstantAnnotations(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, denormalize_StripConstantAnnotations0);
      nodeTraversal0.traverse(node0);
      assertEquals(44, Node.IS_OPTIONAL_PARAM);
  }
}
