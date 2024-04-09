/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 03:41:50 GMT 2024
 */

package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.mozilla.rhino.Context;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.Token;
import com.google.javascript.jscomp.mozilla.rhino.ast.Comment;
import com.google.javascript.jscomp.mozilla.rhino.ast.ErrorCollector;
import com.google.javascript.jscomp.mozilla.rhino.tools.ToolErrorReporter;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.JsDocInfoParser;
import com.google.javascript.jscomp.parsing.JsDocTokenStream;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JsDocInfoParser_ESTest extends JsDocInfoParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Context context0 = new Context();
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK;
      Comment comment0 = new Comment(170, 100, token_CommentType0, "error reporter");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("N*/", 26, 1);
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, "language version", config0, errorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("?|l9S_nv` 2");
      assertTrue(node0.hasMoreThanOneChild());
      assertEquals(301, node0.getType());
      assertNotNull(node0);
      assertEquals(2, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("error reporter", 140);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, "error reporter", config0, errorCollector0);
      boolean boolean0 = jsDocInfoParser0.hasParsedJSDocInfo();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("error reporter", 4, 170);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, "error reporter", config0, errorCollector0);
      JSDocInfo jSDocInfo0 = jsDocInfoParser0.getFileOverviewJSDocInfo();
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("error reporter", (-1));
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, "error reporter", config0, errorCollector0);
      jsDocInfoParser0.setFileLevelJsDocBuilder((Node.FileLevelJsDocBuilder) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("error reporter", 4, 170);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, "error reporter", config0, errorCollector0);
      jsDocInfoParser0.setFileOverviewJSDocInfo((JSDocInfo) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("function (");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("(Ljava/lang/Object;)Ljava/lang/String;");
      assertNotNull(node0);
      assertTrue(node0.hasChildren());
      assertEquals(301, node0.getType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("error reporter", 4, 170);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, "error reporter", config0, errorCollector0);
      JSDocInfo jSDocInfo0 = jsDocInfoParser0.retrieveAndResetParsedJSDocInfo();
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, true);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("...", (-2934), (-2934));
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, "this", config0, errorCollector0);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parse();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.mozilla.rhino.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK;
      Comment comment0 = new Comment(3, 100, token_CommentType0, "error reporter");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("@*f;vS/\n", 100);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, "error reporter", config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(3, 100, token_CommentType0, "error reporter");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*/\n", 0);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, "language version", config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("@yM@9Q`#H;");
      Token.CommentType token_CommentType0 = Token.CommentType.BLOCK;
      Comment comment0 = new Comment(20, 44, token_CommentType0, "@yM@9Q`#H;");
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      Set<String> set0 = jSDocInfo0.getSuppressions();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(set0, set0, true, config_LanguageMode0, false);
      Context context0 = new Context();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, "?o9+]z]DP", config0, errorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(3, 100, token_CommentType0, "error reporter");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*f/\n", 0);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, "*f/\n", config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(">o\"x`yU9Adc'");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, ">o\"x`yU9Adc'", config0, (ErrorReporter) null);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parse();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("?78WR+|FT9TZN9||sB");
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      ErrorCollector errorCollector0 = new ErrorCollector();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, "?78WR+|FT9TZN9||sB", config0, errorCollector0);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parse();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.mozilla.rhino.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString(";#k$B_d.<?+fH96XCl`");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString(";k$q_d.<[+tH96@l`");
      assertNotNull(node0);
      assertEquals(6, node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("?=dzVY>,=H1");
      assertEquals(304, node0.getType());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("?}[5");
      assertEquals(304, node0.getType());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("!W(h4X(oh.5q");
      assertNotNull(node0);
      assertEquals(2, node0.getCharno());
      assertEquals(306, node0.getType());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("{.0by`:^?");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("otHZD^!zBKo");
      assertNotNull(node0);
      assertEquals(306, node0.getType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("[*[GrEe{*4~");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("null");
      assertNotNull(node0);
      assertEquals(0, node0.getCharno());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("undefined");
      assertNotNull(node0);
      assertEquals(0, node0.getSourcePosition());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString(";\n");
      assertEquals(1, node0.getCharno());
      assertNotNull(node0);
      assertEquals(0, node0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("function");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("?78WR+|FT9TZN9 ||sB");
      assertEquals(301, node0.getType());
      assertEquals(3, node0.getChildCount());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("X|x,d{S_5j'Tt");
      assertNotNull(node0);
      assertEquals(301, node0.getType());
      assertEquals(3, node0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("U|[@CdN");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("('`E[Q;K?c.l<l");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString(" [JkFRWxG,6GAKJr3U");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("{.oy`:?");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("{tnb`,y}^6");
      assertNotNull(node0);
      assertEquals(81, node0.getType());
      assertTrue(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("{");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(3, 100, token_CommentType0, "error reporter");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*f/\n", 4, 2);
      jsDocTokenStream0.ungetChar(10);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, "*f/\n", config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("[\n\r]+");
      assertNull(node0);
  }
}
