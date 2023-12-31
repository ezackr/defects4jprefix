/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 07:23:41 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Normalize_ESTest extends Normalize_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize normalize0 = new Normalize(compiler0, false);
      Node node0 = compiler0.parseSyntheticCode("com.google.common.collect.Sets$3", "com.google.common.collect.Sets$3");
      Node node1 = new Node(23, node0, (-1), 3798);
      normalize0.process(node0, node0);
      assertEquals(2, Node.RIGHT);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "UH+B", "UH+B");
      assertEquals(4, Node.DESCENDANTS_FLAG);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeSyntheticCode(compiler0, "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("f");
      Normalize normalize0 = new Normalize(compiler0, false);
      Node node1 = compiler0.parseSyntheticCode("f", "JSC_CATCH_LOCK_VAR_ERMOR");
      node0.addChildrenToFront(node1);
      normalize0.process(node1, node1);
      assertEquals(0, Node.BOTH);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newNumber((double) 1249, 1249, 1249);
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, false);
      // Undeclared exception!
      try { 
        normalize_VerifyConstants0.process(node0, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("com.google.common.collect.Sets$3", "com.google.common.collect.Sets$3");
      Node node1 = new Node(23, node0, (-1), 3798);
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, false);
      // Undeclared exception!
      try { 
        normalize_VerifyConstants0.process(node1, node0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "_E5[$84", "_E5[$84");
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, normalize_VerifyConstants0);
      normalize_VerifyConstants0.visit(nodeTraversal0, node0, node0);
      assertEquals(29, Node.JSDOC_INFO_PROP);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(126);
      Node node1 = new Node(15, node0, node0, node0);
      node0.addChildrenToFront(node1);
      Normalize normalize0 = new Normalize(compiler0, false);
      // Undeclared exception!
      try { 
        normalize0.process(node1, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(126);
      Node node1 = new Node(15, node0, node0, node0);
      node0.addChildrenToFront(node1);
      Normalize normalize0 = new Normalize(compiler0, true);
      // Undeclared exception!
      try { 
        normalize0.process(node1, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // Normalize constraints violated:
         // LABEL normalization
         //
         verifyException("com.google.javascript.jscomp.Normalize$NormalizeStatements", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize normalize0 = new Normalize(compiler0, true);
      Node node0 = Node.newString(113, "");
      // Undeclared exception!
      try { 
        normalize0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // The existing child node of the parent should not be null.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("");
      Normalize normalize0 = new Normalize(compiler0, false);
      Node node1 = compiler0.parseSyntheticCode("", "");
      node1.addChildrenToFront(node0);
      // Undeclared exception!
      try { 
        normalize0.process(node0, node1);
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
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize normalize0 = new Normalize(compiler0, true);
      Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "U2U_FUNCTION_TYPE", "  parent:");
      // Undeclared exception!
      try { 
        normalize0.process(node0, node0);
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
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("JSC_CATCH_BLOCK_VAR_ERROR");
      Normalize normalize0 = new Normalize(compiler0, true);
      Node node1 = compiler0.parseSyntheticCode("JSC_CATCH_BLOCK_VAR_ERROR", "JSC_CATCH_BLOCK_VAR_ERROR");
      node0.addChildrenToFront(node1);
      // Undeclared exception!
      try { 
        normalize0.process(node1, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(105);
      node0.addChildrenToFront(node0);
      Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements(compiler0, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, normalize_NormalizeStatements0);
      normalize_NormalizeStatements0.visit(nodeTraversal0, node0, node0);
      assertEquals(5, Node.FUNCTION_PROP);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(105);
      Node node1 = new Node(132, node0, node0, node0, node0);
      Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements(compiler0, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, normalize_NormalizeStatements0);
      normalize_NormalizeStatements0.visit(nodeTraversal0, node0, node0);
      assertEquals(1, Node.DECR_FLAG);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(126);
      node0.addChildrenToFront(node0);
      Normalize normalize0 = new Normalize(compiler0, false);
      // Undeclared exception!
      try { 
        normalize0.process(node0, node0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseSyntheticCode("com.google.common.collect.Sets$3", "com.google.common.collect.Sets$3");
      Normalize normalize0 = new Normalize(compiler0, false);
      Node node1 = new Node(115, node0, node0, node0);
      node0.addChildrenToFront(node1);
      // Undeclared exception!
      try { 
        normalize0.process(node1, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(105);
      Normalize normalize0 = new Normalize(compiler0, true);
      node0.addChildrenToFront(node0);
      // Undeclared exception!
      try { 
        normalize0.process(node0, node0);
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
      Node node0 = new Node(105);
      Node node1 = new Node(132, node0, node0, node0, node0);
      Normalize normalize0 = new Normalize(compiler0, true);
      node0.addChildrenToFront(node1);
      // Undeclared exception!
      try { 
        normalize0.process(node0, node1);
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
