/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 01:46:32 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.GroupVariableDeclarations;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Normalize_ESTest extends Normalize_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements((AbstractCompiler) null, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, normalize_NormalizeStatements0);
      SyntheticAst syntheticAst0 = new SyntheticAst("");
      Node node0 = syntheticAst0.getAstRoot((AbstractCompiler) null);
      // Undeclared exception!
      try { 
        normalize_NormalizeStatements0.shouldTraverse(nodeTraversal0, node0, node0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Predicate
         //
         verifyException("com.google.javascript.jscomp.Normalize$NormalizeStatements", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Normalize.PropagateConstantAnnotationsOverVars normalize_PropagateConstantAnnotationsOverVars0 = new Normalize.PropagateConstantAnnotationsOverVars((AbstractCompiler) null, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, normalize_PropagateConstantAnnotationsOverVars0);
      Node node0 = Node.newString("E5'M7#");
      Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements((AbstractCompiler) null, false);
      // Undeclared exception!
      try { 
        normalize_NormalizeStatements0.visit(nodeTraversal0, (Node) null, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Normalize$NormalizeStatements", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements((AbstractCompiler) null, true);
      Node node0 = Node.newString(" should not be annotated as constant.");
      // Undeclared exception!
      try { 
        normalize_NormalizeStatements0.shouldTraverse((NodeTraversal) null, node0, (Node) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Predicate
         //
         verifyException("com.google.javascript.jscomp.Normalize$NormalizeStatements", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GroupVariableDeclarations groupVariableDeclarations0 = new GroupVariableDeclarations((AbstractCompiler) null);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator((AbstractCompiler) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, groupVariableDeclarations0, syntacticScopeCreator0);
      Normalize.PropagateConstantAnnotationsOverVars normalize_PropagateConstantAnnotationsOverVars0 = new Normalize.PropagateConstantAnnotationsOverVars((AbstractCompiler) null, true);
      Node node0 = new Node((-113), (-113), (-113));
      normalize_PropagateConstantAnnotationsOverVars0.visit(nodeTraversal0, node0, node0);
      assertFalse(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Normalize.PropagateConstantAnnotationsOverVars normalize_PropagateConstantAnnotationsOverVars0 = new Normalize.PropagateConstantAnnotationsOverVars((AbstractCompiler) null, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, normalize_PropagateConstantAnnotationsOverVars0);
      Node node0 = Node.newString("E5'M7#");
      normalize_PropagateConstantAnnotationsOverVars0.visit(nodeTraversal0, node0, (Node) null);
      assertEquals(0, Node.NON_SPECIALCALL);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Normalize.PropagateConstantAnnotationsOverVars normalize_PropagateConstantAnnotationsOverVars0 = new Normalize.PropagateConstantAnnotationsOverVars((AbstractCompiler) null, false);
      SyntheticAst syntheticAst0 = new SyntheticAst("'1?5G");
      Node node0 = syntheticAst0.getAstRoot((AbstractCompiler) null);
      Node node1 = new Node((-3));
      // Undeclared exception!
      try { 
        normalize_PropagateConstantAnnotationsOverVars0.process(node0, node1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Lists
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Normalize normalize0 = new Normalize((AbstractCompiler) null, true);
      Node node0 = new Node(27, (-1490), 31);
      // Undeclared exception!
      try { 
        normalize0.process((Node) null, node0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Normalize normalize0 = new Normalize((AbstractCompiler) null, false);
      Node node0 = Node.newString((-1140), ",s<ZP_5.`A1tl{d");
      // Undeclared exception!
      try { 
        normalize0.process(node0, node0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.google.javascript.jscomp.NodeTraversal", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeSyntheticCode((AbstractCompiler) null, "uB#imW[+9rx}gk>U", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Normalize", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements((AbstractCompiler) null, false);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, normalize_NormalizeStatements0);
      Node node0 = new Node(126);
      // Undeclared exception!
      try { 
        normalize_NormalizeStatements0.shouldTraverse(nodeTraversal0, node0, node0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Preconditions
         //
         verifyException("com.google.javascript.jscomp.Normalize$NormalizeStatements", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements((AbstractCompiler) null, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, normalize_NormalizeStatements0);
      Node node0 = Node.newString("R'");
      // Undeclared exception!
      try { 
        normalize_NormalizeStatements0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Normalize$NormalizeStatements", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Normalize.PropagateConstantAnnotationsOverVars normalize_PropagateConstantAnnotationsOverVars0 = new Normalize.PropagateConstantAnnotationsOverVars((AbstractCompiler) null, true);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, normalize_PropagateConstantAnnotationsOverVars0);
      Node node0 = Node.newString((-2258), "local");
      Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements((AbstractCompiler) null, true);
      normalize_NormalizeStatements0.visit(nodeTraversal0, node0, node0);
      assertEquals(1, Node.FLAG_GLOBAL_STATE_UNMODIFIED);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements((AbstractCompiler) null, false);
      Normalize.PropagateConstantAnnotationsOverVars normalize_PropagateConstantAnnotationsOverVars0 = new Normalize.PropagateConstantAnnotationsOverVars((AbstractCompiler) null, true);
      SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator((AbstractCompiler) null);
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, normalize_NormalizeStatements0, syntacticScopeCreator0);
      Node node0 = Node.newString(38, "Function declaration");
      // Undeclared exception!
      try { 
        normalize_PropagateConstantAnnotationsOverVars0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Normalize$PropagateConstantAnnotationsOverVars", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Normalize.VerifyConstants normalize_VerifyConstants0 = null;
      try {
        normalize_VerifyConstants0 = new Normalize.VerifyConstants((AbstractCompiler) null, true);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/Maps
         //
         verifyException("com.google.javascript.jscomp.Normalize$VerifyConstants", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Normalize.parseAndNormalizeTestCode((AbstractCompiler) null, ")CCY],<-DU#:@<Az", "|c");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.Normalize", e);
      }
  }
}
