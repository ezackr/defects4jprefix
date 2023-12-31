/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 22:42:25 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
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
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.Normalize$PropogateConstantAnnotations");
      Node node1 = new Node(46, node0);
      Normalize normalize0 = new Normalize(compiler0, true);
      normalize0.process(node0, node0);
      assertEquals(3, Node.CONTINUE_PROP);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, false);
      Node node0 = Node.newString(0, "E1wKu0iW&PNp3Tz");
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
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("LYU ");
      Node node1 = new Node(32, node0, node0, 1, 43);
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, true);
      normalize_VerifyConstants0.process(node0, node0);
      assertEquals(4095, Node.COLUMN_MASK);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("LYU ");
      Node node1 = new Node(32, node0, node0, 1, 43);
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, false);
      normalize_VerifyConstants0.process(node0, node0);
      assertFalse(node0.isQuotedString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$12");
      Node node1 = new Node(44, node0, node0, node0, node0);
      Normalize.VerifyConstants normalize_VerifyConstants0 = new Normalize.VerifyConstants(compiler0, true);
      normalize_VerifyConstants0.process(node0, node0);
      assertEquals(26, Node.DIRECTCALL_PROP);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("C:Y%L ");
      Normalize normalize0 = new Normalize(compiler0, true);
      // Undeclared exception!
      try { 
        normalize0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // Normalize constraints violated:
         // LABEL normalization
         //   Node(LABEL):  [testcode] :1:0
         // [source unknown]
         //   Parent(SCRIPT):  [testcode] :1:0
         // [source unknown]
         //
         verifyException("com.google.javascript.jscomp.Normalize$NormalizeStatements", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter$12");
      Node node1 = new Node(113, node0);
      Normalize normalize0 = new Normalize(compiler0, true);
      // Undeclared exception!
      try { 
        normalize0.process(node0, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // Normalize constraints violated:
         // WHILE node
         //   Node(FOR):  [testcode] :-1:-1
         // [source unknown]
         //   Parent: NULL
         //
         verifyException("com.google.javascript.jscomp.Normalize$NormalizeStatements", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.gogle.javacript.jscomp.CosureReverseAbstractInterpeter$12");
      Node node1 = new Node(105, node0);
      node0.addChildrenToFront(node1);
      Normalize normalize0 = new Normalize(compiler0, false);
      // Undeclared exception!
      try { 
        normalize0.process(node0, node0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // SCRIPT [source name: null] [encoded source length: 0] [base line: -1] [end line: -1] 1 [sourcename: java.lang.String@0000000476] [synthetic: 1] is not a string node
         //
         verifyException("com.google.javascript.rhino.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("h name ");
      Node node1 = new Node(126, node0, node0, 21, (-3));
      Normalize normalize0 = new Normalize(compiler0, false);
      // Undeclared exception!
      try { 
        normalize0.process(node1, node1);
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
      Node node0 = new Node(126);
      Node node1 = new Node(126, node0, node0, 0, 6);
      Normalize normalize0 = new Normalize(compiler0, true);
      // Undeclared exception!
      try { 
        normalize0.process(node1, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.Normalize$PrpogateConstantAnnotations");
      Node node1 = new Node(115, node0);
      node0.addChildrenToFront(node1);
      Normalize normalize0 = new Normalize(compiler0, false);
      // Undeclared exception!
      try { 
        normalize0.process(node0, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("");
      Node node1 = new Node(118, node0);
      node0.addChildrenToFront(node1);
      Normalize normalize0 = new Normalize(compiler0, true);
      // Undeclared exception!
      try { 
        normalize0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.Normalize$PropogateConstantAnnotations");
      Node node1 = new Node(118, 46, 0);
      node0.addChildrenToFront(node1);
      Normalize normalize0 = new Normalize(compiler0, false);
      // Undeclared exception!
      try { 
        normalize0.process(node1, node0);
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
  public void test13()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.Normalize$PropogateConstantAnnotations");
      Node node1 = new Node(118, 46, 0);
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
         // Empty VAR node.
         //   Node(SCRIPT):  [testcode] :1:0
         // [source unknown]
         //   Parent: NULL
         //
         verifyException("com.google.javascript.jscomp.Normalize$NormalizeStatements", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = compiler0.parseTestCode("Empty VAR node.");
      Node node1 = new Node(105, node0);
      Normalize normalize0 = new Normalize(compiler0, false);
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
