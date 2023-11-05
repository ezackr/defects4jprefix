/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 09:03:50 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodeConsumer;
import com.google.javascript.jscomp.CodeGenerator;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.rhino.Node;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CodeGenerator_ESTest extends CodeGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.regexpEscape(" *k3(]>z;s<<qjWC<Af");
      assertEquals("/ *k3(]>z;s<<qjWC<Af/", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      // Undeclared exception!
      try { 
        codeGenerator0.tagAsStrict();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("\u0001\u0000\u00A0\u0000\u0000\u0000\u0000\u0000\u0000\t\n\u000B\f\r\u0000\u0000\u2028\u2029\u0000\u0000\u0000\u0000\u0000\u202F\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \u0000\u0000\u0000j\u0000\u0000\u0000\u0000\u0000\u0000\u3000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0085\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u0000\u0000\u0000\u0000\u0000\u205F\u1680\u0000\u0000\u180E\u0000\u0000\u0000");
      assertEquals("\"\\u0001\\x00\\u00a0\\x00\\x00\\x00\\x00\\x00\\x00\\t\\n\\x0B\\f\\r\\x00\\x00\\u2028\\u2029\\x00\\x00\\x00\\x00\\x00\\u202f\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00 \\x00\\x00\\x00j\\x00\\x00\\x00\\x00\\x00\\x00\\u3000\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\u0085\\u2000\\u2001\\u2002\\u2003\\u2004\\u2005\\u2006\\u2007\\u2008\\u2009\\u200a\\x00\\x00\\x00\\x00\\x00\\u205f\\u1680\\x00\\x00\\u180e\\x00\\x00\\x00\"", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Node node0 = new Node(105);
      // Undeclared exception!
      try { 
        codeGenerator0.addCaseBody(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      codeGenerator0.addList((Node) null, true);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.regexpEscape("`&<!--");
      assertEquals("/`&\\x3c!--/", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("42");
      assertEquals(42.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = CodeGenerator.isSimpleNumber("*S6@ruG+&Rz");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("6");
      assertEquals(6.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = CodeGenerator.getSimpleNumber("agudmj*");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Node node0 = new Node(85);
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      // Undeclared exception!
      try { 
        codeGenerator0.addArrayList(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      Node node0 = Node.newString("");
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.STATEMENT;
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0, false, codeGenerator_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Node node0 = new Node(9);
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0, false, codeGenerator_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Node node0 = new Node(51, 31, 31);
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0, false, codeGenerator_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Node node0 = new Node(110);
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      // Undeclared exception!
      try { 
        codeGenerator0.addList(node0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unknown precedence for SWITCH (type 110)
         //
         verifyException("com.google.javascript.jscomp.NodeUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      codeGenerator0.addAllSiblings((Node) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Node node0 = new Node(93);
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      // Undeclared exception!
      try { 
        codeGenerator0.addAllSiblings(node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.CodeGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("e(X\"U<2BR4XIiz^P!");
      assertEquals("\"e(X\\\"U<2BR4XIiz^P!\"", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.regexpEscape("<{GI'y|AhulvKHc'TE");
      assertEquals("/<{GI'y|AhulvKHc'TE\\u007f/", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("fPntNfatm|e=R");
      assertEquals("\"fPntNfatm|e\\x3dR\"", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("lmmMyy)xT=->%lR");
      assertEquals("\"lmmMyy)xT=->%lR\"", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.regexpEscape("=AGa+");
      assertEquals("/=AGa+/", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.regexpEscape("`&<!--");
      assertEquals("/`&\\x3c!--/", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("5i30$do&</scriptz.u");
      assertEquals("\"5i30$do\\x26\\x3c/scriptz.u\"", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.escapeToDoubleQuotedJsString("}K2Oq>y");
      assertEquals("\"}K2Oq\\x3ey\"", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.regexpEscape("Of4}0{Q>");
      assertEquals("/Of4}0{Q>/", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.regexpEscape(">)4o@J)vS J");
      assertEquals("/>)4o@J)vS J/", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      String string0 = codeGenerator0.regexpEscape("CH[<!-->wSR;");
      assertEquals("/CH[\\x3c!--\\x3ewSR;/", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
      String string0 = codeGenerator0.regexpEscape("</script|?3r^0@");
      assertEquals("/\\x3c/script|?3r^0@/", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      String string0 = codeGenerator0.regexpEscape("!--b~vx", charsetEncoder0);
      assertEquals("/!--b~vx/", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape("\u0001\u0000\u00A0\u0000\u0000\u0000\u0000\u0000\u0000\t\n\u000B\f\r\u0000\u0000\u2028\u2029\u0000\u0000\u0000\u0000\u202F=\u0000\u0000]\u0000\u0000 \u0000\u0000j\u0000\u0000\u0000\u0000\u0000?\u0000\u0000a\u0000\u0000\u0000\u0000\u0085\u2000\u2001\u2002\u2004\u2005\u2006\u2007\u2008\u2009,\u0000\u0000\u0000\u0000\u0000\u205F\u1680\u0000\u0000\u180E\u0000CV");
      assertEquals("\\u0001\\u0000\\u00a0\\u0000\\u0000\\u0000\\u0000\\u0000\\u0000\\u0009\\u000a\\u000b\\u000c\\u000d\\u0000\\u0000\\u2028\\u2029\\u0000\\u0000\\u0000\\u0000\\u202f=\\u0000\\u0000]\\u0000\\u0000 \\u0000\\u0000j\\u0000\\u0000\\u0000\\u0000\\u0000?\\u0000\\u0000a\\u0000\\u0000\\u0000\\u0000\\u0085\\u2000\\u2001\\u2002\\u2004\\u2005\\u2006\\u2007\\u2008\\u2009,\\u0000\\u0000\\u0000\\u0000\\u0000\\u205f\\u1680\\u0000\\u0000\\u180e\\u0000CV", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = CodeGenerator.identifierEscape("CE?zqfV.lLj");
      assertEquals("CE?zqfV.lLj", string0);
  }
}
