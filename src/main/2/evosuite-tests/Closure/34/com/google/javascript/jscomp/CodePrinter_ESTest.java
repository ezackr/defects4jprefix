/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 01:32:46 GMT 2024
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodePrinter;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.rhino.Node;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CodePrinter_ESTest extends CodePrinter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Node node0 = Node.newString("]J_");
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      codePrinter_Builder0.setTagAsStrict(true);
      String string0 = codePrinter_Builder0.build();
      assertEquals("'use strict';\"]J_\"", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = Node.newString("");
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      codePrinter_Builder0.setPrettyPrint(true);
      String string0 = codePrinter_Builder0.build();
      assertEquals("\"\"", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Node node0 = Node.newString("");
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      CodePrinter.Builder codePrinter_Builder1 = codePrinter_Builder0.setPreferLineBreakAtEndOfFile(true);
      String string0 = codePrinter_Builder1.build();
      assertEquals("\"\"", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Node node0 = Node.newString("");
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      Charset charset0 = Charset.defaultCharset();
      CodePrinter.Builder codePrinter_Builder1 = codePrinter_Builder0.setOutputCharset(charset0);
      assertSame(codePrinter_Builder1, codePrinter_Builder0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Node node0 = Node.newString("");
      Node node1 = new Node(112, node0, 39, 108);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node1);
      CodePrinter.Builder codePrinter_Builder1 = codePrinter_Builder0.setOutputTypes(true);
      String string0 = codePrinter_Builder1.build();
      assertEquals("default:\n  \"\";\n", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CodePrinter codePrinter0 = new CodePrinter();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = Node.newString("");
      Node node1 = new Node(132, node0, 8, 0);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node1);
      String string0 = codePrinter_Builder0.build();
      assertEquals("\"\"", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = Node.newString("l");
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      codePrinter_Builder0.setLineLengthThreshold(0);
      String string0 = codePrinter_Builder0.build();
      assertEquals("\"l\"", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Node node0 = Node.newString("");
      node0.setSourceFileForTesting("");
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      SourceMap sourceMap0 = mock(SourceMap.class, new ViolatedAssumptionAnswer());
      codePrinter_Builder0.setSourceMap(sourceMap0);
      String string0 = codePrinter_Builder0.build();
      assertEquals("\"\"", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = Node.newString("com.gogle.javascript.jscomp.CodePrinter$MappedCodePrinter");
      Node node1 = new Node(32, node0, node0, node0, node0, 39, 0);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node1);
      node1.setSourceFileForTesting("com.gogle.javascript.jscomp.CodePrinter$MappedCodePrinter");
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      codePrinter_Builder0.setSourceMapDetailLevel(sourceMap_DetailLevel0);
      SourceMap sourceMap0 = mock(SourceMap.class, new ViolatedAssumptionAnswer());
      codePrinter_Builder0.setSourceMap(sourceMap0);
      String string0 = codePrinter_Builder0.build();
      assertEquals("typeof\"com.gogle.javascript.jscomp.CodePrinter$MappedCodePrinter\"", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Node node0 = Node.newString("");
      Node node1 = new Node(49, node0, 12, 54);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node1);
      codePrinter_Builder0.setPreferLineBreakAtEndOfFile(true);
      codePrinter_Builder0.setLineLengthThreshold(1);
      String string0 = codePrinter_Builder0.build();
      assertEquals("throw\"\"; ;\n", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node node0 = Node.newString("");
      Node node1 = new Node(49, node0, 12, 54);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node1);
      CodePrinter.Builder codePrinter_Builder1 = codePrinter_Builder0.setLineLengthThreshold(2);
      SourceMap sourceMap0 = mock(SourceMap.class, new ViolatedAssumptionAnswer());
      codePrinter_Builder1.setSourceMap(sourceMap0);
      codePrinter_Builder1.setPreferLineBreakAtEndOfFile(true);
      String string0 = codePrinter_Builder0.build();
      assertEquals("throw\"\"; ;\n", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Node node0 = Node.newString("");
      Node node1 = new Node(49, node0, 12, 54);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node1);
      CodePrinter.Builder codePrinter_Builder1 = codePrinter_Builder0.setLineLengthThreshold(2);
      SourceMap sourceMap0 = mock(SourceMap.class, new ViolatedAssumptionAnswer());
      node1.setSourceFileForTesting("");
      codePrinter_Builder1.setSourceMap(sourceMap0);
      codePrinter_Builder1.setPreferLineBreakAtEndOfFile(true);
      String string0 = codePrinter_Builder0.build();
      assertEquals("throw\"\"; ;\n", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node node0 = Node.newString(4, "com.go/gle.javascript.jscomY.CodePrinter$MappedCodePrinter");
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      CodePrinter.Builder codePrinter_Builder1 = codePrinter_Builder0.setLineLengthThreshold(2);
      codePrinter_Builder0.setOutputTypes(true);
      String string0 = codePrinter_Builder1.build();
      assertEquals("return;\n", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Node node0 = Node.newString("com.google.javascript.jscomp.CodePrinter$MappedCodePrinter");
      Node node1 = new Node(32, node0, node0, node0, node0, 39, 0);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node1);
      codePrinter_Builder0.setOutputTypes(true);
      String string0 = codePrinter_Builder0.build();
      assertEquals("typeof\"com.google.javascript.jscomp.CodePrinter$MappedCodePrinter\"", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Node node0 = Node.newString("");
      Node node1 = Node.newString("");
      Node node2 = new Node(32, node1, node0, node0, node0, 30, 47);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node2);
      CodePrinter.Builder codePrinter_Builder1 = codePrinter_Builder0.setOutputTypes(true);
      String string0 = codePrinter_Builder1.build();
      assertEquals("\"\" typeof \"\"", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Node node0 = Node.newString("");
      Node node1 = new Node(41, 29, 51);
      Node node2 = new Node(32, node1, node0, node0, node0, 30, 47);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node2);
      CodePrinter.Builder codePrinter_Builder1 = codePrinter_Builder0.setOutputTypes(true);
      String string0 = codePrinter_Builder1.build();
      assertEquals("null typeof \"\"", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Node node0 = Node.newString("");
      Node node1 = new Node(49, node0, 12, 54);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node1);
      codePrinter_Builder0.setLineBreak(true);
      String string0 = codePrinter_Builder0.build();
      assertEquals("throw\"\";", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Node node0 = Node.newString("CATCH");
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      codePrinter_Builder0.setLineLengthThreshold(4);
      CodePrinter.Builder codePrinter_Builder1 = codePrinter_Builder0.setPreferLineBreakAtEndOfFile(true);
      String string0 = codePrinter_Builder1.build();
      assertEquals("\"CATCH\";\n", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Node node0 = new Node(0);
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder(node0);
      // Undeclared exception!
      try { 
        codePrinter_Builder0.setSourceMapDetailLevel((SourceMap.DetailLevel) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CodePrinter.Builder codePrinter_Builder0 = new CodePrinter.Builder((Node) null);
      // Undeclared exception!
      try { 
        codePrinter_Builder0.build();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot build without root node being specified
         //
         verifyException("com.google.javascript.jscomp.CodePrinter$Builder", e);
      }
  }
}
