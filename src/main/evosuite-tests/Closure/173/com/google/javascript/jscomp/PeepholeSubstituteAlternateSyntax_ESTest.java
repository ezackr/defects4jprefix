/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 00:08:32 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PeepholeSubstituteAlternateSyntax_ESTest extends PeepholeSubstituteAlternateSyntax_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
      Node node0 = new Node(47);
      node0.setType(85);
      Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertEquals(2, Node.FLAG_THIS_UNMODIFIED);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = Node.newString(4, "miss&ng goog.getCssName around literal ''{0}''");
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
      Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertEquals(49, Node.DIRECT_EVAL);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Node node0 = new Node(43, 43, 43);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
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
      Node node0 = new Node(44);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
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
  public void test04()  throws Throwable  {
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
      Node node0 = Node.newNumber(0.0);
      Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertEquals(39, Node.EMPTY_BLOCK);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Node node0 = new Node(30);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
      Compiler compiler0 = new Compiler();
      peepholeSubstituteAlternateSyntax0.beginTraversal(compiler0);
      Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertFalse(node1.isRegExp());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = new Node(37);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
      Compiler compiler0 = new Compiler();
      peepholeSubstituteAlternateSyntax0.beginTraversal(compiler0);
      // Undeclared exception!
      try { 
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = new Node(37);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
      node0.addChildToFront(node0);
      Compiler compiler0 = new Compiler();
      peepholeSubstituteAlternateSyntax0.beginTraversal(compiler0);
      // Undeclared exception!
      try { 
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
      Node node0 = new Node(47);
      node0.setType(85);
      Node node1 = new Node(29, node0, node0, node0, node0, 40, 30);
      Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertFalse(node2.hasOneChild());
      assertNotNull(node2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = new Node(38, 38, 38);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
      Compiler compiler0 = new Compiler();
      peepholeSubstituteAlternateSyntax0.beginTraversal(compiler0);
      Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertFalse(node1.isTypeOf());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Node node0 = new Node(37, 37, 37);
      Node node1 = new Node(4, node0, node0, node0, node0, 8, 15);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
      Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
      assertFalse(node2.isCall());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node node0 = new Node(43, 43, 43);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
      Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertEquals(43, node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Node node0 = new Node(63);
      node0.addChildToFront(node0);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
      Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertEquals(4, Node.FLAG_ARGUMENTS_UNMODIFIED);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node node0 = new Node(63);
      Node node1 = Node.newString("");
      node0.addChildToFront(node1);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
      Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertEquals(42, Node.SIDE_EFFECT_FLAGS);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Node node0 = new Node(63, 63, 63);
      PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
      Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
      assertFalse(node1.isAdd());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("s1}hD8y_MOh}oR[|,");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("tT;(< ,vN9~{TwrG");
      assertTrue(boolean0);
  }
}
