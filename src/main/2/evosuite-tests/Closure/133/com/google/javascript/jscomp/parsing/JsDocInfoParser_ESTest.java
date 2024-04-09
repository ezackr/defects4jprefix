/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 07:58:36 GMT 2024
 */

package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.JsDocInfoParser;
import com.google.javascript.jscomp.parsing.JsDocToken;
import com.google.javascript.jscomp.parsing.JsDocTokenStream;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.head.Token;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ErrorCollector;
import com.google.javascript.rhino.head.tools.ToolErrorReporter;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JsDocInfoParser_ESTest extends JsDocInfoParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("K!oX!:%k*/RUk");
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      Node node0 = JsDocInfoParser.parseTypeString("K!oX!:%k*/RUk");
      assertNotNull(node0);
      
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, errorCollector0);
      jsDocInfoParser0.parse();
      assertEquals(306, node0.getType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Node node0 = Node.newString("*3");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*3");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.hasParsedJSDocInfo();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("[mvPWc$%'~.;9O];aq");
      assertNotNull(node0);
      
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("[mvPWc$%'~.;9O];aq");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      jsDocInfoParser0.parse();
      assertEquals(308, node0.getType());
      assertTrue(node0.hasOneChild());
      assertEquals(1, node0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Node node0 = Node.newString(".");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(".");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JSDocInfo jSDocInfo0 = jsDocInfoParser0.getFileOverviewJSDocInfo();
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Node node0 = Node.newString("*3");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*3", 36);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.ANNOTATION;
      jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Node node0 = Node.newString("!");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("!");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      Node.FileLevelJsDocBuilder node_FileLevelJsDocBuilder0 = node0.getJsDocBuilderForNode();
      jsDocInfoParser0.setFileLevelJsDocBuilder(node_FileLevelJsDocBuilder0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("*3");
      assertNotNull(node0);
      
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*3");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JSDocInfo jSDocInfo0 = new JSDocInfo();
      jsDocInfoParser0.setFileOverviewJSDocInfo(jSDocInfo0);
      assertEquals(302, node0.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("{l:B1?");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("CD|`m1,cX{qcB", 2238);
      Token.CommentType token_CommentType0 = Token.CommentType.LINE;
      Comment comment0 = new Comment(2238, 2238, token_CommentType0, "CD|`m1,cX{qcB");
      Node node0 = Node.newNumber(1406.852925625619, 4, 12);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, toolErrorReporter0);
      JSDocInfo jSDocInfo0 = jsDocInfoParser0.parseInlineTypeDoc();
      assertNotNull(jSDocInfo0);
      
      JsDocToken jsDocToken0 = JsDocToken.QMARK;
      Node node1 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertEquals(304, node1.getType());
      assertNotNull(node1);
      assertEquals(0, node1.getChildCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Node node0 = Node.newString("!");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      node0.setSourceFileForTesting("!");
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("!", 46);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("!");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
      JSDocInfo jSDocInfo0 = jsDocInfoParser0.parseInlineTypeDoc();
      assertNull(jSDocInfo0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("@");
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parse();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("'SilPItNH\n");
      assertNotNull(node0);
      
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("'SilPItNH\n", 54);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      jsDocInfoParser0.parse();
      assertTrue(node0.isString());
      assertEquals(0, node0.getSourcePosition());
      assertEquals(40, node0.getType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Node node0 = Node.newString("*3");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*3");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.EOC;
      jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("*3");
      assertNotNull(node0);
      
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*3");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      jsDocInfoParser0.parse();
      assertEquals(302, node0.getType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("!");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.LC;
      Node node0 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("*3");
      assertNotNull(node0);
      
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*3");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.COMMA;
      Node node1 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertNull(node1);
      
      jsDocInfoParser0.parse();
      assertEquals(302, node0.getType());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(":");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(">");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Node node0 = Node.newString("{E");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("{E");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("(", 55, 12);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("*3");
      assertNotNull(node0);
      
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*3");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.LT;
      Node node1 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertNull(node1);
      
      jsDocInfoParser0.parse();
      assertEquals(302, node0.getType());
      assertEquals(0, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("?");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("|970e", 50);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("F}H1i.Ea9*Mns");
      assertNotNull(node0);
      
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("]m*");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      jsDocInfoParser0.parse();
      assertEquals(0, node0.getSourcePosition());
      assertEquals(1, node0.getLength());
      assertEquals(0, node0.getCharno());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(")]");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("...");
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      Node node0 = Node.newString("...");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, errorCollector0);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parse();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("=", 53);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Node node0 = Node.newString("'SilPItNH\n");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("'SilPItNH\n", 1);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("*3");
      assertNotNull(node0);
      
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*3");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      jsDocInfoParser0.parse();
      assertEquals(302, node0.getType());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("}. ");
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
      // Undeclared exception!
      try { 
        jsDocInfoParser0.parse();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("FH1i].a9ns");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("FH1i].a9ns", 54);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.LC;
      Node node1 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertEquals(221184, node1.getSourcePosition());
      assertNotNull(node1);
      assertEquals(40, node1.getType());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Node node0 = Node.newString("F}H1i].Ea9nYs");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("F}H1i].Ea9nYs", 54);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.LC;
      Node node1 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertEquals(221184, node1.getSourcePosition());
      assertNotNull(node1);
      assertEquals(40, node1.getType());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("CrJ|[b1,fqc|iF:\"");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("-N.<#");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("-N.<");
      assertEquals(40, node0.getType());
      assertNotNull(node0);
      assertEquals(0, node0.getSourcePosition());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("CD|`m1,cX{qcB", 2238);
      Token.CommentType token_CommentType0 = Token.CommentType.LINE;
      Comment comment0 = new Comment(2238, 2238, token_CommentType0, "CD|`m1,cX{qcB");
      Node node0 = Node.newNumber(1406.852925625619, 4, 12);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.QMARK;
      Node node1 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertNotNull(node1);
      assertEquals(304, node1.getType());
      assertEquals(2, node1.getCharno());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("5Jbs|?,*e#=ncO-");
      assertEquals(3, node0.getChildCount());
      assertNotNull(node0);
      assertEquals(301, node0.getType());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Node node0 = Node.newString("*3");
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("=EfV4{@u", 55);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.QMARK;
      Node node1 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertNotNull(node1);
      assertEquals(304, node1.getType());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("[?]1G");
      assertEquals(308, node0.getType());
      assertNotNull(node0);
      assertTrue(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("?}");
      assertEquals(304, node0.getType());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("D");
      assertNotNull(node0);
      
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(")8HxuwTO", 38);
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.QMARK;
      Node node1 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertEquals(304, node1.getType());
      assertNotNull(node1);
      assertEquals(0, node0.getSourcePosition());
      assertEquals(1, node0.getLength());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("?>M>2kmFSUL?8d-j");
      assertEquals(304, node0.getType());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("function");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("null");
      assertNotNull(node0);
      assertEquals(0, node0.getSourcePosition());
      assertEquals(4, node0.getLength());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("undefined");
      assertEquals(0, node0.getSourcePosition());
      assertEquals(9, node0.getLength());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("r|1q|F:");
      assertEquals(3, node0.getChildCount());
      assertNotNull(node0);
      assertEquals(301, node0.getType());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("(I)Ljava/lang/Integer;");
      assertNotNull(node0);
      assertTrue(node0.hasChildren());
      assertEquals(301, node0.getType());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("(trEMNN%oC[S;7");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("[");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("{l:>YB?");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("{ryK,u%rKB*eZk%9");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("{");
      assertNull(node0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("K!oX!:%k*/RUk");
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
      Node node0 = Node.newString("K!oX!:%k*/RUk");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, errorCollector0);
      boolean boolean0 = jsDocInfoParser0.parse();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("*3");
      assertNotNull(node0);
      
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*3");
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      JsDocToken jsDocToken0 = JsDocToken.EOL;
      Node node1 = jsDocInfoParser0.parseAndRecordTypeNode(jsDocToken0);
      assertNull(node1);
      
      jsDocInfoParser0.parse();
      assertEquals(302, node0.getType());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Node node0 = JsDocInfoParser.parseTypeString("'SilPItNH\n");
      assertNotNull(node0);
      
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("'SilPItNH\n", 54);
      jsDocTokenStream0.getRemainingJSDocLine();
      JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
      jsDocInfoParser0.parse();
      assertEquals(0, node0.getSourcePosition());
      assertTrue(node0.isString());
  }
}
