/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 05:56:07 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.PeepholeFoldConstants;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PeepholeFoldConstants_ESTest extends PeepholeFoldConstants_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      SyntheticAst syntheticAst0 = new SyntheticAst("8(sqX?`&&");
      Node node0 = syntheticAst0.getAstRoot((AbstractCompiler) null);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(4095, Node.MAX_COLUMN_NUMBER);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node((-1327), (-1327), 101);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(1, Node.LEFT);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(0, 0, 0);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(44, Node.IS_OPTIONAL_PARAM);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(97, "vS65J", 86, 35);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(96);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(95, "AH", 95, (-29));
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(92, "vS65J", 86, 35);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
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
      Node node0 = new Node(91);
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(90);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(87);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(86, "");
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(31, Node.SIDE_EFFECTS_FLAGS_MASK);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(85, "\n\nSubtree1: ", 85, 85);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(32, Node.INCRDECR_PROP);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(77, 78, (-2634));
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(39, Node.EMPTY_BLOCK);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(74);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(37, Node.OPT_ARG_NAME);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(73, "\n\nSubtree1: ", 73, 73);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(31, Node.SIDE_EFFECTS_FLAGS_MASK);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(72);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(13, Node.CASES_PROP);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(67);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(1, Node.LEFT);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(64, "", 64, 64);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(0, Node.NON_SPECIALCALL);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(63);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(0, node1.getLength());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(62, 62, 62);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(15, Node.CASEARRAY_PROP);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(61, "com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(36, Node.QUOTED_PROP);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(59, "lzI", 52, 120);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals((-2), Node.OBJECT_IDS_PROP);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(57, "\n\nSubtree1: ", 57, 57);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(8, Node.CODEOFFSET_PROP);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(56, 56, 56);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals((-2), Node.OBJECT_IDS_PROP);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(55, 55, 55);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(25, Node.ISNUMBER_PROP);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(54);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(51, Node.STATIC_SOURCE_FILE);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString("");
      node0.setType(52);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(20, Node.FINALLY_PROP);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(50);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals((-1), Node.CATCH_SCOPE_PROP);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(46, 12, 30);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertFalse(node1.wasEmptyNode());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(41, "", 41, 41);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals((-2), Node.OBJECT_IDS_PROP);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString("");
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(39, Node.EMPTY_BLOCK);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(35, "com.google.javascript.jscomp.Scope$Var", 35, 35);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(1, Node.FLAG_GLOBAL_STATE_UNMODIFIED);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(34, "", 34, 34);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(30, Node.VAR_ARGS_NAME);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(25);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(6, Node.TEMP_PROP);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(21, 140, 21);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Predicate
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(16, 30, 37);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(44, Node.IS_OPTIONAL_PARAM);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(15);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(40, Node.ORIGINALNAME_PROP);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(14);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(34, Node.NAME_PROP);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = new Node(13);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(16, Node.SOURCENAME_PROP);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newString(122, "AH", 122, 0);
      // Undeclared exception!
      try { 
        peepholeFoldConstants0.optimizeSubtree(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.PeepholeFoldConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants();
      Node node0 = Node.newNumber(0.0);
      Node node1 = peepholeFoldConstants0.optimizeSubtree(node0);
      assertEquals(17, Node.TYPE_PROP);
  }
}
