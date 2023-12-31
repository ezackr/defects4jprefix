/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 06:29:54 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AmbiguateProperties;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.io.PrintStream;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AmbiguateProperties_ESTest extends AmbiguateProperties_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      AmbiguateProperties ambiguateProperties0 = new AmbiguateProperties(compiler0, (char[]) null);
      ScriptOrFnNode scriptOrFnNode0 = (ScriptOrFnNode)compiler0.parseTestCode("com.google.javascript.jscomp.AmbiguateProperties$PropertyGraph");
      ambiguateProperties0.process(scriptOrFnNode0, scriptOrFnNode0);
      assertEquals(0, scriptOrFnNode0.getParamCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Compiler compiler0 = new Compiler((PrintStream) null);
      char[] charArray0 = new char[2];
      AmbiguateProperties ambiguateProperties0 = new AmbiguateProperties(compiler0, charArray0);
      Map<String, String> map0 = ambiguateProperties0.getRenamingMap();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      AmbiguateProperties ambiguateProperties0 = new AmbiguateProperties(compiler0, (char[]) null);
      Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.AmbiguateProperties$PropertyGraph");
      Node node1 = new Node(7);
      ambiguateProperties0.process(node1, node0);
      ambiguateProperties0.process(node1, node0);
      assertEquals(31, Node.INCRDECR_PROP);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      AmbiguateProperties ambiguateProperties0 = new AmbiguateProperties(compiler0, (char[]) null);
      Node node0 = Node.newString("msg.dstut.sign.no.init", 64, 64);
      Node node1 = new Node(64, node0);
      // Undeclared exception!
      try { 
        ambiguateProperties0.process(node1, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = new Node(64, 64, 64);
      AmbiguateProperties ambiguateProperties0 = new AmbiguateProperties(compiler0, (char[]) null);
      ambiguateProperties0.process(node0, node0);
      assertFalse(node0.isUnscopedQualifiedName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      AmbiguateProperties ambiguateProperties0 = new AmbiguateProperties(compiler0, (char[]) null);
      Node node0 = compiler0.parseTestCode("msg.destuct.assign.no.init");
      Node node1 = new Node(64, node0);
      // Undeclared exception!
      try { 
        ambiguateProperties0.process(node1, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      AmbiguateProperties ambiguateProperties0 = new AmbiguateProperties(compiler0, (char[]) null);
      Node node0 = Node.newNumber((double) 35, 35, 35);
      Node node1 = new Node(35, node0, node0, node0, node0, 22, 20);
      ambiguateProperties0.process(node1, node1);
      assertEquals(37, Node.SYNTHETIC_BLOCK_PROP);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString("JSAbstractCompilerAbiguateProerties$JSTypeBitSet");
      Node node1 = new Node(64, 11, 48);
      node1.addChildrenToBack(node0);
      AmbiguateProperties ambiguateProperties0 = new AmbiguateProperties(compiler0, (char[]) null);
      // Undeclared exception!
      try { 
        ambiguateProperties0.process(node0, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      AmbiguateProperties ambiguateProperties0 = new AmbiguateProperties(compiler0, (char[]) null);
      Node node0 = Node.newNumber((double) 64, 64, 64);
      Node node1 = new Node(64, node0, node0, node0, node0, 47, 2);
      // Undeclared exception!
      try { 
        ambiguateProperties0.process(node0, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      Node node0 = Node.newString(">{wrj, Rp18J4%)^q");
      Node node1 = new Node(64, 11, 48);
      node0.setQuotedString();
      node1.addChildrenToBack(node0);
      AmbiguateProperties ambiguateProperties0 = new AmbiguateProperties(compiler0, (char[]) null);
      // Undeclared exception!
      try { 
        ambiguateProperties0.process(node0, node1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      AmbiguateProperties ambiguateProperties0 = new AmbiguateProperties(compiler0, (char[]) null);
      Node node0 = Node.newNumber((double) 35, 35, 35);
      Node node1 = Node.newString("AmbiguateProperties1", (-535), 0);
      Node node2 = new Node(35, node0, node0, node0, node1, 22, 20);
      ambiguateProperties0.process(node2, node2);
      assertEquals(20, Node.FINALLY_PROP);
  }
}
