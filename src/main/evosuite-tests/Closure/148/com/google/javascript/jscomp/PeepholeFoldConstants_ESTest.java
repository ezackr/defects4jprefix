/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 05:21:51 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.PeepholeFoldConstants;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PeepholeFoldConstants_ESTest extends PeepholeFoldConstants_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(0, 0, 86);
      node0.setWasEmptyNode(true);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(44, Node.IS_OPTIONAL_PARAM);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(266, 266, 266);
      node0.setVarArgs(true);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(1, Node.DECR_FLAG);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node((-2118));
      node0.setIsSyntheticBlock(true);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(36, Node.OPT_ARG_NAME);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Node node0 = new Node(38, 38, 38);
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertFalse(node1.isOptionalArg());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(30);
      node0.setOptionalArg(true);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(5, Node.FUNCTION_PROP);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(0, (-2533), 0);
      node0.setLineno(0);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(48, Node.DIRECTIVES);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = new Node(37, 37, 37);
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(36, "JSC_DIVIDE_BY_0_ERROR", 0, 21);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(1, Node.SPECIALCALL_EVAL);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(35, 28, 35);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(2, Node.ATTRIBUTE_FLAG);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(34, 28, 34);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertFalse(node1.isOptionalArg());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(33);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(7, Node.LOCAL_PROP);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(32, "", 2, 45);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node node0 = new Node(31);
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(36, Node.OPT_ARG_NAME);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(29, 28, 29);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(28);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertFalse(node1.isUnscopedQualifiedName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(27, "");
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Node node0 = new Node(26, 26, 26);
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }
}
