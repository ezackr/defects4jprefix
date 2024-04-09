/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 05:09:57 GMT 2024
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CheckGlobalThis;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CheckGlobalThis_ESTest extends CheckGlobalThis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Node node0 = new Node(105);
      Node node1 = new Node(40, node0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      Compiler compiler0 = new Compiler((PrintStream) null);
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = new Node(105);
      node0.addSuppression("X:}");
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Node node0 = new Node(105);
      node0.addSuppression("X:}");
      Compiler compiler0 = new Compiler();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
      Node node1 = compiler0.parseTestCode("X:}");
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(105, 105, 105);
      Node node1 = new Node(132, node0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse((NodeTraversal) null, node0, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(105, 105, 105);
      Node node1 = new Node(38, node0);
      node1.addSuppression("jZ@h|h7T");
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(105, 56, 56);
      Node node1 = new Node(86, node0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = new Node(105, 105, 105);
      node0.addSuppression("L");
      Compiler compiler0 = new Compiler();
      Node node1 = Node.newNumber((double) 1, 8, 1);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse((NodeTraversal) null, node0, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(2145, 2145, 2145);
      Node node1 = new Node(86, node0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node1, node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(2125, 2125, 2125);
      Node node1 = new Node(86, node0);
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
      boolean boolean1 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(30, 30, 30);
      Node node1 = new Node(42, node0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      checkGlobalThis0.visit((NodeTraversal) null, node1, node0);
      assertEquals(4, Node.DESCENDANTS_FLAG);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(30, 30, 30);
      Node node1 = new Node(33, node0, node0, 24, 2);
      Node node2 = new Node(42, node1);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      // Undeclared exception!
      try { 
        checkGlobalThis0.visit((NodeTraversal) null, node2, node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CheckGlobalThis", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("#.8uDSU\nhf>Y)h1", 2125, 2125);
      Node node1 = new Node(86, node0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
      nodeTraversal0.traverse(node1);
      assertEquals(12, Node.COLUMN_BITS);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(728);
      Node node1 = new Node(42, node0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      checkGlobalThis0.visit((NodeTraversal) null, node1, (Node) null);
      assertEquals(13, Node.CASES_PROP);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(105, 105, 105);
      Node node1 = new Node(38, node0);
      CheckLevel checkLevel0 = CheckLevel.OFF;
      CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0, checkLevel0);
      node0.addChildrenToBack(node1);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
      boolean boolean0 = checkGlobalThis0.shouldTraverse(nodeTraversal0, node0, node1);
      assertTrue(boolean0);
  }
}
