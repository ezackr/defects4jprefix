/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 04:53:21 GMT 2024
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FlowSensitiveInlineVariables;
import com.google.javascript.jscomp.GatherRawExports;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PeepholeSubstituteAlternateSyntax_ESTest extends PeepholeSubstituteAlternateSyntax_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Node node0 = new Node((-2148));
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertEquals(4095, Node.MAX_COLUMN_NUMBER);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = new Node(115, 115, 115);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      // Undeclared exception!
      try { 
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // malformed 'for' statement FOR 115
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      Node node0 = new Node(130);
      // Undeclared exception!
      try { 
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Node node0 = new Node(30);
      Compiler compiler0 = new Compiler();
      GatherRawExports gatherRawExports0 = new GatherRawExports(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, gatherRawExports0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      peepholeSubstituteAlternateSyntax0.beginTraversal(nodeTraversal0);
      Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertEquals(1, Node.LEFT);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Node node0 = new Node(30);
      Node node1 = new Node(4, node0, node0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      // Undeclared exception!
      try { 
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Node node0 = new Node(4, 4, 4);
      Node node1 = new Node(115, node0, node0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      // Undeclared exception!
      try { 
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = new Node(4, 4, 4);
      Node node1 = new Node(105, node0, node0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertEquals(44, Node.IS_VAR_ARGS_PARAM);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = new Node(4);
      Node node1 = new Node(132, node0, node0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertEquals(38, Node.EMPTY_BLOCK);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Node node0 = new Node(4, 4, 4);
      Node node1 = new Node(110, node0, node0);
      node0.addChildAfter(node1, node1);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertEquals(5, Node.FUNCTION_PROP);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = new Node(4, 4, 4);
      Node node1 = Node.newNumber((double) 49);
      node0.addChildToBack(node1);
      Node node2 = new Node(115, node0, node0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      Node node3 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertEquals((-2), Node.OBJECT_IDS_PROP);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Node node0 = new Node(4, 4, 4);
      Node node1 = new Node(114, node0, node0);
      node0.addChildAfter(node1, node1);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      // Undeclared exception!
      try { 
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node node0 = new Node(12, 12, 12);
      Node node1 = new Node(26, node0, node0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      // Undeclared exception!
      try { 
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Node node0 = new Node(13);
      Node node1 = new Node(26, node0, node0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      // Undeclared exception!
      try { 
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node node0 = new Node(45, 45, 45);
      Node node1 = new Node(26, node0, node0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      // Undeclared exception!
      try { 
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Node node0 = new Node(46, 46, 46);
      Node node1 = new Node(26, node0, node0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      // Undeclared exception!
      try { 
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Node node0 = new Node(105, 100, 100);
      Node node1 = new Node(108, node0, node0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
      assertNotNull(node2);
      assertTrue(node2.hasChildren());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Node node0 = new Node(125, 125, 125);
      Node node1 = new Node(31, 48, 0);
      Node node2 = new Node(108, node1, node0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      Node node3 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node2);
      assertEquals(29, Node.VAR_ARGS_NAME);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Node node0 = new Node((-2148));
      Node node1 = new Node((-2148));
      Node node2 = new Node(108, node1, node0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      Node node3 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node2);
      assertFalse(node3.isUnscopedQualifiedName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Node node0 = new Node(125, 125, 125);
      Node node1 = new Node(31, 48, 0);
      Node node2 = new Node(108, node1, node0);
      node0.addChildToFront(node2);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      Node node3 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node2);
      assertEquals(30, Node.SKIP_INDEXES_PROP);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Node node0 = new Node(101);
      Node node1 = new Node(26, node0, node0, 7, 44);
      node0.addChildToFront(node1);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      // Undeclared exception!
      try { 
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Node node0 = new Node(98);
      node0.addChildToFront(node0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      // Undeclared exception!
      try { 
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Node node0 = new Node(100, 100, 100);
      Node node1 = new Node(108, node0, node0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      // Undeclared exception!
      try { 
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Node node0 = new Node(70, 70, 70);
      Node node1 = new Node(26, node0, node0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      node1.replaceChild(node0, node1);
      // Undeclared exception!
      try { 
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Node node0 = new Node(98);
      Node node1 = new Node(26, node0, node0, 7, 44);
      node0.addChildToFront(node1);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertEquals((-2), Node.OBJECT_IDS_PROP);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Node node0 = new Node(101, 101, 101);
      Node node1 = new Node(26, node0, node0);
      Node node2 = new Node(113, node1, node1);
      node0.addChildToFront(node2);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      Node node3 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node2);
      assertEquals(27, Node.SPECIALCALL_PROP);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Node node0 = new Node(101);
      Node node1 = Node.newNumber((double) 27);
      node0.addChildToBack(node1);
      Node node2 = new Node(26, node0, node0, 7, 44);
      node0.addChildToFront(node2);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      // Undeclared exception!
      try { 
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Node node0 = new Node(101);
      Node node1 = new Node(114, node0, node0);
      node0.addChildToFront(node1);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
      assertEquals(15, Node.CASEARRAY_PROP);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Node node0 = new Node(101);
      Node node1 = Node.newNumber(0.0);
      node0.addChildToBack(node1);
      Node node2 = new Node(26, node0, node0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      Compiler compiler0 = new Compiler();
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, flowSensitiveInlineVariables0);
      peepholeSubstituteAlternateSyntax0.beginTraversal(nodeTraversal0);
      peepholeSubstituteAlternateSyntax0.optimizeSubtree(node2);
      assertFalse(node0.hasOneChild());
      assertEquals(0, node0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Node node0 = new Node(30);
      Compiler compiler0 = new Compiler();
      compiler0.setNormalized();
      GatherRawExports gatherRawExports0 = new GatherRawExports(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, gatherRawExports0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      node0.addChildToFront(node0);
      peepholeSubstituteAlternateSyntax0.beginTraversal(nodeTraversal0);
      Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertEquals(17, Node.TYPE_PROP);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Node node0 = new Node(37, 37, 37);
      Compiler compiler0 = new Compiler();
      GatherRawExports gatherRawExports0 = new GatherRawExports(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, gatherRawExports0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      peepholeSubstituteAlternateSyntax0.beginTraversal(nodeTraversal0);
      Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertEquals(34, Node.PARENTHESIZED_PROP);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Node node0 = new Node(37);
      Compiler compiler0 = new Compiler();
      compiler0.setNormalized();
      GatherRawExports gatherRawExports0 = new GatherRawExports(compiler0);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, gatherRawExports0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax();
      node0.addChildToFront(node0);
      peepholeSubstituteAlternateSyntax0.beginTraversal(nodeTraversal0);
      Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertEquals(43, Node.IS_OPTIONAL_PARAM);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\\u");
      assertTrue(boolean0);
  }
}
