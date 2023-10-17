/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 03:25:18 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckGlobalThis;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckGlobalThis_ESTest extends CheckGlobalThis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator((AbstractCompiler) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, checkGlobalThis0, syntacticScopeCreator0);
      Node node0 = Node.newString(42, "");
      checkGlobalThis0.visit(nodeTraversal0, node0, (Node) null);
      assertEquals(1, Node.SPECIALCALL_EVAL);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, checkGlobalThis0);
      Node node0 = new Node((-1285));
      checkGlobalThis0.visit(nodeTraversal0, node0, node0);
      assertFalse(node0.isNoSideEffectsCall());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      Node node0 = Node.newNumber(3313.0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse((NodeTraversal) null, node0, node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, checkGlobalThis0);
      Node node0 = new Node(86);
      Node node1 = Node.newNumber((-412.9));
      // Undeclared exception!
      try { 
        checkGlobalThis0.shouldTraverse(nodeTraversal0, node1, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CheckGlobalThis", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      Node node0 = Node.newString(105, "", (-485), (-148));
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator((AbstractCompiler) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, checkGlobalThis0, syntacticScopeCreator0);
      // Undeclared exception!
      try { 
        checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, (Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CheckGlobalThis", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, checkGlobalThis0);
      Node node0 = new Node(118, 118, 0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, checkGlobalThis0);
      Node node0 = Node.newString(105, "%", 105, 105);
      checkGlobalThis0.visit(nodeTraversal0, node0, node0);
      assertFalse(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, checkGlobalThis0);
      Node node0 = Node.newString(105, "%", 105, 105);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      node0.setJSDocInfo(jSDocInfo0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      Node node0 = Node.newNumber(1089.5084517522125);
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse((NodeTraversal) null, node0, (Node) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis((AbstractCompiler) null, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, checkGlobalThis0);
      Node node0 = Node.newString("/YzOf96##");
      // Undeclared exception!
      try { 
        checkGlobalThis0.visit(nodeTraversal0, (Node) null, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CheckGlobalThis", e);
      }
  }
}
