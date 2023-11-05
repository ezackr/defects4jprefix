/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 04:51:17 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckGlobalThis;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CheckGlobalThis_ESTest extends CheckGlobalThis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString(42, "}}`83}", 42, 42);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      NodeTraversal.traverse((AbstractCompiler) compiler0, node0, (NodeTraversal.Callback) checkGlobalThis0);
      assertEquals(20, Node.FINALLY_PROP);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      Node node0 = Node.newString(105, "com.google.javascript.jscomp.ChecklobalThis", 30, 20);
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = node0;
      Node node1 = new Node(118, nodeArray0);
      // Undeclared exception!
      try { 
        NodeTraversal.traverse((AbstractCompiler) compiler0, node1, (NodeTraversal.Callback) checkGlobalThis0);
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
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      Node node0 = Node.newString(105, "com.google.javascript.jscomp.ChecklobalThis", 30, 20);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      node0.setJSDocInfo(jSDocInfo0);
      // Undeclared exception!
      try { 
        NodeTraversal.traverse((AbstractCompiler) compiler0, node0, (NodeTraversal.Callback) checkGlobalThis0);
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
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString(42, "}}`83}", 42, 42);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      Node node1 = new Node(86, node0, node0);
      // Undeclared exception!
      try { 
        NodeTraversal.traverse((AbstractCompiler) compiler0, node1, (NodeTraversal.Callback) checkGlobalThis0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("", "");
      Node node1 = new Node(38, 0, 47);
      Node node2 = new Node(86, node0, node1);
      node2.removeChild(node0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      Node node0 = Node.newString("1ZV{'a<pu@+:");
      Node node1 = new Node(86, node0, node0);
      checkGlobalThis0.shouldTraverse((NodeTraversal) null, node0, node1);
      NodeTraversal.traverse((AbstractCompiler) compiler0, node1, (NodeTraversal.Callback) checkGlobalThis0);
      assertEquals(1, Node.DECR_FLAG);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("", "");
      Node node1 = new Node(38, 0, 47);
      Node node2 = new Node(86, node0, node1);
      node2.removeChild(node0);
      node1.setType(33);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
      // Undeclared exception!
      try { 
        checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CheckGlobalThis", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      Node node0 = compiler0.parseSyntheticCode("0$VP62)*-GCdvh", "0$VP62)*-GCdvh");
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      Node node1 = Node.newString(105, "0$VP62)*-GCdvh", 30, 20);
      Node node2 = new Node(86, node0, node1);
      // Undeclared exception!
      try { 
        NodeTraversal.traverse((AbstractCompiler) compiler0, node1, (NodeTraversal.Callback) checkGlobalThis0);
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
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      Node node0 = Node.newString(105, "com.google.javascript.jscomp.ChecklobalThis", 30, 20);
      Node node1 = new Node(38, node0, node0);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      node1.setJSDocInfo(jSDocInfo0);
      // Undeclared exception!
      try { 
        NodeTraversal.traverse((AbstractCompiler) compiler0, node0, (NodeTraversal.Callback) checkGlobalThis0);
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
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      Node node0 = Node.newString(105, "com.google.javascript.jscomp.ChecklobalThis", 30, 20);
      Node node1 = new Node(38, node0, node0);
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = node1;
      Node node2 = new Node(50, nodeArray0);
      // Undeclared exception!
      try { 
        NodeTraversal.traverse((AbstractCompiler) compiler0, node2, (NodeTraversal.Callback) checkGlobalThis0);
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
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      Node node0 = Node.newString(105, "com.google.javascript.jscomp.ChecklobalThis", 30, 20);
      Node node1 = new Node(38, node0, node0);
      Node[] nodeArray0 = new Node[1];
      nodeArray0[0] = node1;
      Node node2 = new Node(118, nodeArray0);
      // Undeclared exception!
      try { 
        NodeTraversal.traverse((AbstractCompiler) compiler0, node2, (NodeTraversal.Callback) checkGlobalThis0);
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
}
