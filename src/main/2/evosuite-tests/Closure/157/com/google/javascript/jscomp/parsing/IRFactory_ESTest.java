/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 10:01:48 GMT 2024
 */

package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.mozilla.rhino.Context;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.Token;
import com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.mozilla.rhino.ast.Block;
import com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.Comment;
import com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet;
import com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.ErrorCollector;
import com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.ForInLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.ForLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall;
import com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode;
import com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.Label;
import com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.Name;
import com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty;
import com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet;
import com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.Scope;
import com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase;
import com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer;
import com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.XmlLiteral;
import com.google.javascript.jscomp.mozilla.rhino.tools.ToolErrorReporter;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.IRFactory;
import com.google.javascript.rhino.Node;
import java.util.LinkedHashSet;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IRFactory_ESTest extends IRFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      EmptyExpression emptyExpression0 = new EmptyExpression();
      astRoot0.addChildToBack(emptyExpression0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, (Set<String>) null, false, config_LanguageMode0, true);
      Node node0 = IRFactory.transformTree(astRoot0, "language version", config0, errorCollector0);
      assertEquals(132, node0.getType());
      assertEquals(1, node0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      ObjectProperty objectProperty0 = new ObjectProperty();
      astRoot0.addChildrenToBack(objectProperty0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "Undefined", config0, errorCollector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>(10, 4);
      DoLoop doLoop0 = new DoLoop(16);
      astRoot0.addChildToBack(doLoop0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "(s%", config0, errorCollector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      SwitchCase switchCase0 = new SwitchCase(0, 123);
      ElementGet elementGet0 = new ElementGet(switchCase0, astRoot0);
      astRoot0.addChildToBack(elementGet0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "end label not defined", config0, errorCollector0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Block block0 = new Block(26);
      astRoot0.addChildToBack(block0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      Node node0 = IRFactory.transformTree(astRoot0, "error reporter", config0, errorCollector0);
      assertEquals(132, node0.getType());
      assertTrue(node0.hasChildren());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Context context0 = Context.enter();
      Name name0 = new Name(8);
      astRoot0.addChildToBack(name0);
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "language version", config0, errorReporter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // StringNode: str is null
         //
         verifyException("com.google.javascript.rhino.Node$StringNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      WhileLoop whileLoop0 = new WhileLoop(2);
      astRoot0.addChildToBack(whileLoop0);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "language version", config0, (ErrorReporter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      NumberLiteral numberLiteral0 = new NumberLiteral();
      astRoot0.addChildToBack(numberLiteral0);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Node node0 = IRFactory.transformTree(astRoot0, "error reporter", config0, errorCollector0);
      assertEquals(132, node0.getType());
      assertEquals(1, node0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(5, 2, astRoot0);
      astRoot0.addChildToBack(parenthesizedExpression0);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "(s%", config0, errorCollector0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      ThrowStatement throwStatement0 = new ThrowStatement();
      astRoot0.addChildToBack(throwStatement0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "language version", config0, errorCollector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      NewExpression newExpression0 = new NewExpression(13, 25);
      astRoot0.addChildToBack(newExpression0);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "", config0, errorCollector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      StringLiteral stringLiteral0 = new StringLiteral(4, (-234));
      astRoot0.addChildToBack(stringLiteral0);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "error reporter", config0, errorCollector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // StringNode: str is null
         //
         verifyException("com.google.javascript.rhino.Node$StringNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Scope scope0 = new Scope(139);
      astRoot0.addChildToBack(scope0);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, (String) null, config0, errorCollector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Label label0 = new Label();
      astRoot0.addChildrenToBack(label0);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "4", config0, toolErrorReporter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // StringNode: str is null
         //
         verifyException("com.google.javascript.rhino.Node$StringNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      ExpressionStatement expressionStatement0 = new ExpressionStatement(astRoot0, true);
      astRoot0.addChildToBack(expressionStatement0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "", config0, errorCollector0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      ErrorCollector errorCollector0 = new ErrorCollector();
      PropertyGet propertyGet0 = new PropertyGet(790, 2);
      astRoot0.addChildToBack(propertyGet0);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "language version", config0, errorCollector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      WithStatement withStatement0 = new WithStatement(18, 142);
      astRoot0.addChildrenToBack(withStatement0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "RrSf", config0, errorCollector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
      ForInLoop forInLoop0 = new ForInLoop();
      astRoot0.addChildToBack(forInLoop0);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "error reporter", config0, toolErrorReporter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      ForLoop forLoop0 = new ForLoop(6, 20);
      astRoot0.addChildToBack(forLoop0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "language version", config0, errorCollector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      Context context0 = new Context();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      ConditionalExpression conditionalExpression0 = new ConditionalExpression(11, 1);
      astRoot0.addChildToBack(conditionalExpression0);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "error reporter", config0, errorReporter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      XmlLiteral xmlLiteral0 = new XmlLiteral();
      astRoot0.addChildToBack(xmlLiteral0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "-NH_o[[UWT", config0, errorCollector0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.mozilla.rhino.ast.ErrorCollector", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      RegExpLiteral regExpLiteral0 = new RegExpLiteral(26);
      regExpLiteral0.setValue("private");
      astRoot0.addChildToBack(regExpLiteral0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      Node node0 = IRFactory.transformTree(astRoot0, "private", config0, errorCollector0);
      assertEquals(132, node0.getType());
      assertTrue(node0.hasOneChild());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      BreakStatement breakStatement0 = new BreakStatement(156);
      InfixExpression infixExpression0 = new InfixExpression(9, breakStatement0, breakStatement0, 21);
      astRoot0.addChildrenToBack(infixExpression0);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Node node0 = IRFactory.transformTree(astRoot0, "language version", config0, errorCollector0);
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(6, 2, token_CommentType0, "+Z@,m,0");
      astRoot0.addComment(comment0);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      Node node0 = IRFactory.transformTree(astRoot0, "+Z@,m,0", config0, toolErrorReporter0);
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Token.CommentType token_CommentType0 = Token.CommentType.LINE;
      Comment comment0 = new Comment(1, 1, token_CommentType0, "");
      astRoot0.addComment(comment0);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Node node0 = IRFactory.transformTree(astRoot0, "", config0, errorCollector0);
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
      Comment comment0 = new Comment(6, 2, token_CommentType0, "+Z@,m,0");
      astRoot0.addComment(comment0);
      astRoot0.setJsDocNode(comment0);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, true);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      Node node0 = IRFactory.transformTree(astRoot0, "+Z@,m,0", config0, toolErrorReporter0);
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      ArrayLiteral arrayLiteral0 = new ArrayLiteral();
      astRoot0.addChildrenToBack(arrayLiteral0);
      ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
      Node node0 = IRFactory.transformTree(astRoot0, "error reporter", config0, toolErrorReporter0);
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      ContinueStatement continueStatement0 = new ContinueStatement();
      astRoot0.addChildToBack(continueStatement0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      Node node0 = IRFactory.transformTree(astRoot0, ":@A", config0, errorCollector0);
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Name name0 = new Name();
      FunctionNode functionNode0 = new FunctionNode(156, name0);
      astRoot0.addChildToBack(functionNode0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "266Me_i", config0, errorCollector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // StringNode: str is null
         //
         verifyException("com.google.javascript.rhino.Node$StringNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      FunctionNode functionNode0 = new FunctionNode();
      astRoot0.addChildToBack(functionNode0);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      Context context0 = Context.getCurrentContext();
      ErrorReporter errorReporter0 = context0.getErrorReporter();
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "language version", config0, errorReporter0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unnamed function statement
         //
         verifyException("com.google.javascript.jscomp.mozilla.rhino.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      LabeledStatement labeledStatement0 = new LabeledStatement(22);
      astRoot0.addChildToBack(labeledStatement0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "error reporter", config0, errorCollector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      astRoot0.addChildToBack(objectLiteral0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      Node node0 = IRFactory.transformTree(astRoot0, "(s%", config0, errorCollector0);
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      ReturnStatement returnStatement0 = new ReturnStatement();
      astRoot0.addChildToBack(returnStatement0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, true);
      Node node0 = IRFactory.transformTree(astRoot0, "language version", config0, errorCollector0);
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      ReturnStatement returnStatement0 = new ReturnStatement(1, 15, astRoot0);
      astRoot0.addChildToBack(returnStatement0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, true);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "4Gj[D/7!;MfQ", config0, errorCollector0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(18, 3);
      astRoot0.addChildrenToBack(variableDeclaration0);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Node node0 = IRFactory.transformTree(astRoot0, "<6Kxd}{~#}OW/v|\"", config0, errorCollector0);
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(160, 4);
      astRoot0.addChildrenToBack(variableDeclaration0);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Node node0 = IRFactory.transformTree(astRoot0, "language version", config0, errorCollector0);
      assertEquals(132, node0.getType());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      VariableDeclaration variableDeclaration0 = new VariableDeclaration(160, 4);
      VariableInitializer variableInitializer0 = new VariableInitializer(11);
      variableDeclaration0.addVariable(variableInitializer0);
      astRoot0.addChildrenToBack(variableDeclaration0);
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      ErrorCollector errorCollector0 = new ErrorCollector();
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "language version", config0, errorCollector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      InfixExpression infixExpression0 = new InfixExpression(21, astRoot0, astRoot0, 716);
      astRoot0.addChildrenToBack(infixExpression0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, false);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "Undefined", config0, errorCollector0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      InfixExpression infixExpression0 = new InfixExpression(22, astRoot0, astRoot0, 9);
      astRoot0.addChildrenToBack(infixExpression0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "Undefined", config0, errorCollector0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      FunctionCall functionCall0 = new FunctionCall(17, 8);
      astRoot0.addChildToBack(functionCall0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "language version", config0, errorCollector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      ExpressionStatement expressionStatement0 = new ExpressionStatement(astRoot0, false);
      astRoot0.addChildToBack(expressionStatement0);
      ErrorCollector errorCollector0 = new ErrorCollector();
      Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
      Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
      // Undeclared exception!
      try { 
        IRFactory.transformTree(astRoot0, "language version", config0, errorCollector0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
