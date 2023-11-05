/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 04:08:58 GMT 2023
 */
package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.mozilla.rhino.Context;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.Token;
import com.google.javascript.jscomp.mozilla.rhino.ast.Assignment;
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
import com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer;
import com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.XmlPropRef;
import com.google.javascript.jscomp.mozilla.rhino.tools.ToolErrorReporter;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.IRFactory;
import com.google.javascript.rhino.Node;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import org.junit.runner.RunWith;

public class IRFactoryTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        EmptyExpression emptyExpression0 = new EmptyExpression(16);
        astRoot0.addChildrenToFront(emptyExpression0);
        Node node0 = IRFactory.transformTree(astRoot0, "com. oogle.javascript.rhino.testing.EmptyScope", (Config) null, (ErrorReporter) null);
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        EmptyExpression emptyExpression0 = new EmptyExpression(16);
        astRoot0.addChildrenToFront(emptyExpression0);
        Node node0 = IRFactory.transformTree(astRoot0, "com. oogle.javascript.rhino.testing.EmptyScope", (Config) null, (ErrorReporter) null);
        node0.hasOneChild();
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ObjectProperty objectProperty0 = new ObjectProperty();
        astRoot0.addChildToBack(objectProperty0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, "", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        DoLoop doLoop0 = new DoLoop(93, 54);
        astRoot0.addChildToBack(doLoop0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, "`n2i/", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ElementGet elementGet0 = new ElementGet();
        astRoot0.addChildToBack(elementGet0);
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config config0 = new Config(treeSet0, treeSet0, true, true);
        IRFactory.transformTree(astRoot0, "", config0, (ErrorReporter) null);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        Block block0 = new Block();
        astRoot0.addChildToBack(block0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        Node node0 = IRFactory.transformTree(astRoot0, "J;+,(%0{", (Config) null, errorCollector0);
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        Block block0 = new Block();
        astRoot0.addChildToBack(block0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        Node node0 = IRFactory.transformTree(astRoot0, "J;+,(%0{", (Config) null, errorCollector0);
        node0.hasChildren();
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        WhileLoop whileLoop0 = new WhileLoop(4);
        astRoot0.addChildToBack(whileLoop0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        Locale locale0 = Locale.forLanguageTag("Tfl");
        Set<String> set0 = locale0.getUnicodeLocaleKeys();
        Config config0 = new Config(set0, set0, false, false);
        IRFactory.transformTree(astRoot0, "[{Wsas", config0, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        NumberLiteral numberLiteral0 = new NumberLiteral(1, 2);
        astRoot0.addChildrenToFront(numberLiteral0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        Node node0 = IRFactory.transformTree(astRoot0, "N}jcm=nzW/+5D", (Config) null, errorCollector0);
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        NumberLiteral numberLiteral0 = new NumberLiteral(1, 2);
        astRoot0.addChildrenToFront(numberLiteral0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        Node node0 = IRFactory.transformTree(astRoot0, "N}jcm=nzW/+5D", (Config) null, errorCollector0);
        node0.hasOneChild();
    }

    @Test(timeout = 4000)
    public void test0710() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ParenthesizedExpression parenthesizedExpression0 = new ParenthesizedExpression(1);
        astRoot0.addChildrenToFront(parenthesizedExpression0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, "com.google.javascript.jscomp.mozilla.rhino.Function", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test0811() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ThrowStatement throwStatement0 = new ThrowStatement(0, astRoot0);
        astRoot0.addChildrenToFront(throwStatement0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, (String) null, (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test0912() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        NewExpression newExpression0 = new NewExpression(8);
        astRoot0.addChildrenToFront(newExpression0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, "", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test1013() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        StringLiteral stringLiteral0 = new StringLiteral();
        astRoot0.addChildrenToFront(stringLiteral0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, ";1x.yKpWa1vFubqN9Of", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test1114() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        Scope scope0 = new Scope(2);
        astRoot0.addChildToBack(scope0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        Node node0 = IRFactory.transformTree(astRoot0, "Catch clauses are not supported", (Config) null, errorCollector0);
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test1115() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        Scope scope0 = new Scope(2);
        astRoot0.addChildToBack(scope0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        Node node0 = IRFactory.transformTree(astRoot0, "Catch clauses are not supported", (Config) null, errorCollector0);
        node0.hasChildren();
    }

    @Test(timeout = 4000)
    public void test1216() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        SwitchCase switchCase0 = new SwitchCase();
        ExpressionStatement expressionStatement0 = new ExpressionStatement(switchCase0);
        astRoot0.addChildToBack(expressionStatement0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        Node node0 = IRFactory.transformTree(astRoot0, "com.google.javascript.jscomp.parsing.IRFactory", (Config) null, errorCollector0);
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test1317() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        PropertyGet propertyGet0 = new PropertyGet(4, 151);
        astRoot0.addChildrenToFront(propertyGet0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, "com.google.javascript.jscomp.parsing.IRFactory", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test1418() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        WithStatement withStatement0 = new WithStatement();
        astRoot0.addChildToBack(withStatement0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, "ea", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test1519() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ForInLoop forInLoop0 = new ForInLoop(1, 9);
        astRoot0.addChildToBack(forInLoop0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, "0Oy`%d_", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test1620() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ForLoop forLoop0 = new ForLoop();
        astRoot0.addChildrenToFront(forLoop0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, "", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test1721() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ConditionalExpression conditionalExpression0 = new ConditionalExpression(1404, 214);
        astRoot0.addChildrenToFront(conditionalExpression0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, "com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test1822() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ErrorCollector errorCollector0 = new ErrorCollector();
        XmlPropRef xmlPropRef0 = new XmlPropRef();
        astRoot0.addChildrenToFront(xmlPropRef0);
        IRFactory.transformTree(astRoot0, "5", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test1923() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ErrorCollector errorCollector0 = new ErrorCollector();
        RegExpLiteral regExpLiteral0 = new RegExpLiteral(8);
        InfixExpression infixExpression0 = new InfixExpression(21, regExpLiteral0, regExpLiteral0, 1);
        astRoot0.addChildToBack(infixExpression0);
        regExpLiteral0.setValue("Unsupported sytax;: ");
        Node node0 = IRFactory.transformTree(astRoot0, "Unsupported sytax;: ", (Config) null, errorCollector0);
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test2024() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        Token.CommentType token_CommentType0 = Token.CommentType.JSDOC;
        Comment comment0 = new Comment(11, 8, token_CommentType0, "0Z2Xz9{HR\"49");
        astRoot0.addComment(comment0);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
        Locale locale0 = Locale.SIMPLIFIED_CHINESE;
        Set<String> set0 = locale0.getUnicodeLocaleAttributes();
        Config config0 = new Config(set0, set0, false, true);
        IRFactory.transformTree(astRoot0, "", config0, toolErrorReporter0);
        Node node0 = IRFactory.transformTree(astRoot0, "", config0, toolErrorReporter0);
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test2125() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        Token.CommentType token_CommentType0 = Token.CommentType.BLOCK;
        Comment comment0 = new Comment(26, 127, token_CommentType0, "");
        astRoot0.addComment(comment0);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
        Node node0 = IRFactory.transformTree(astRoot0, "org.mozilla.classfile.ClassFileMethod", (Config) null, toolErrorReporter0);
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test2226() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        Token.CommentType token_CommentType0 = Token.CommentType.HTML;
        Comment comment0 = new Comment(12, 2, token_CommentType0, "T=Z");
        astRoot0.setJsDocNode(comment0);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config config0 = new Config(treeSet0, treeSet0, true, true);
        Node node0 = IRFactory.transformTree(astRoot0, "T=Z", config0, toolErrorReporter0);
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test2327() throws Throwable {
        ErrorCollector errorCollector0 = new ErrorCollector();
        AstRoot astRoot0 = new AstRoot(15);
        Node node0 = IRFactory.transformTree(astRoot0, "() {\n\t[native code]\n}\n", (Config) null, errorCollector0);
        node0.getCharno();
    }

    @Test(timeout = 4000)
    public void test2328() throws Throwable {
        ErrorCollector errorCollector0 = new ErrorCollector();
        AstRoot astRoot0 = new AstRoot(15);
        Node node0 = IRFactory.transformTree(astRoot0, "() {\n\t[native code]\n}\n", (Config) null, errorCollector0);
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test2429() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        Scope scope0 = new Scope(2);
        scope0.addChildrenToBack(astRoot0);
        astRoot0.addChildToBack(scope0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, "Catch clauses are not supported", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test2530() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        BreakStatement breakStatement0 = new BreakStatement(23);
        SwitchStatement switchStatement0 = new SwitchStatement();
        switchStatement0.setExpression(breakStatement0);
        astRoot0.addChildToBack(switchStatement0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        Node node0 = IRFactory.transformTree(astRoot0, "com.google.javascript.jscomp.mozilla.rhino.tools.resources.Messages", (Config) null, errorCollector0);
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test2631() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ContinueStatement continueStatement0 = new ContinueStatement(154, 5);
        astRoot0.addChildrenToFront(continueStatement0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        Node node0 = IRFactory.transformTree(astRoot0, "msg.only.one.super", (Config) null, errorCollector0);
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test2832() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        Name name0 = new Name(14, 155, "i!kB1E");
        FunctionNode functionNode0 = new FunctionNode(26, name0);
        astRoot0.addChildToBack(functionNode0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, "", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test2933() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        FunctionNode functionNode0 = new FunctionNode(189, (Name) null);
        functionNode0.addParam(astRoot0);
        astRoot0.addChildToBack(functionNode0);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
        IRFactory.transformTree(astRoot0, "error reporter", (Config) null, toolErrorReporter0);
    }

    @Test(timeout = 4000)
    public void test3034() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        LabeledStatement labeledStatement0 = new LabeledStatement(1, 13);
        astRoot0.addChildToBack(labeledStatement0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, "", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test3135() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        LabeledStatement labeledStatement0 = new LabeledStatement(16);
        Label label0 = new Label(2);
        labeledStatement0.addLabel(label0);
        astRoot0.addChildToBack(labeledStatement0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, "+)~s", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test3236() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ObjectLiteral objectLiteral0 = new ObjectLiteral(21, 2);
        astRoot0.addChildrenToFront(objectLiteral0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config config0 = new Config(treeSet0, treeSet0, false, false);
        Node node0 = IRFactory.transformTree(astRoot0, "", config0, errorCollector0);
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test3337() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ObjectLiteral objectLiteral0 = new ObjectLiteral(21, 2);
        ObjectProperty objectProperty0 = new ObjectProperty();
        objectLiteral0.addElement(objectProperty0);
        astRoot0.addChildrenToFront(objectLiteral0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config config0 = new Config(treeSet0, treeSet0, false, false);
        IRFactory.transformTree(astRoot0, "", config0, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test3438() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ObjectLiteral objectLiteral0 = new ObjectLiteral(21, 2);
        ObjectProperty objectProperty0 = new ObjectProperty();
        objectLiteral0.addElement(objectProperty0);
        astRoot0.addChildrenToFront(objectLiteral0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config config0 = new Config(treeSet0, treeSet0, false, true);
        IRFactory.transformTree(astRoot0, "com.google.javascript.jscomp.parsing.IRFactory$1", config0, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test3539() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ReturnStatement returnStatement0 = new ReturnStatement(23);
        astRoot0.addChildToBack(returnStatement0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        Node node0 = IRFactory.transformTree(astRoot0, "", (Config) null, errorCollector0);
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test3640() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ReturnStatement returnStatement0 = new ReturnStatement(2, 155, astRoot0);
        astRoot0.addChildToBack(returnStatement0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, "", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test3741() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        AstRoot astRoot1 = new AstRoot(3);
        SwitchCase switchCase0 = new SwitchCase(23);
        switchCase0.addStatement(astRoot1);
        astRoot0.addChildToBack(switchCase0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        Node node0 = IRFactory.transformTree(astRoot0, ">[#JYDY_(9Cm5", (Config) null, errorCollector0);
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test3842() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        VariableDeclaration variableDeclaration0 = new VariableDeclaration(12, 0);
        astRoot0.addChildToBack(variableDeclaration0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        Node node0 = IRFactory.transformTree(astRoot0, "I-eV3SF*(BQU-<[>", (Config) null, errorCollector0);
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test3943() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        VariableDeclaration variableDeclaration0 = new VariableDeclaration(12, 0);
        VariableInitializer variableInitializer0 = new VariableInitializer(24, 2);
        variableDeclaration0.addVariable(variableInitializer0);
        astRoot0.addChildToBack(variableDeclaration0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, "N8EXDyOBzG#s;bQ", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test4044() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        Assignment assignment0 = new Assignment(18, astRoot0, astRoot0, 1);
        assignment0.setOperator(10);
        astRoot0.addChildrenToFront(assignment0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, "}l?", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test4145() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ErrorCollector errorCollector0 = new ErrorCollector();
        RegExpLiteral regExpLiteral0 = new RegExpLiteral(96);
        InfixExpression infixExpression0 = new InfixExpression(12, regExpLiteral0, regExpLiteral0, 842);
        astRoot0.addChildToBack(infixExpression0);
        IRFactory.transformTree(astRoot0, "Unsupported sytax;: ", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test4246() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        Assignment assignment0 = new Assignment(14, astRoot0, astRoot0, 1);
        astRoot0.addChildrenToFront(assignment0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, "`di5^Pb(X-dG|py", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test4347() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ErrorCollector errorCollector0 = new ErrorCollector();
        InfixExpression infixExpression0 = new InfixExpression(15, astRoot0, astRoot0, 10);
        astRoot0.addChildToBack(infixExpression0);
        IRFactory.transformTree(astRoot0, "\"\bCG~$OkX(^OoT", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test4448() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        Assignment assignment0 = new Assignment(18, astRoot0, astRoot0, 1);
        astRoot0.addChildToBack(assignment0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, ">5fR5((", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test4549() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ErrorCollector errorCollector0 = new ErrorCollector();
        RegExpLiteral regExpLiteral0 = new RegExpLiteral();
        InfixExpression infixExpression0 = new InfixExpression(19, regExpLiteral0, astRoot0, (-102));
        astRoot0.addChildToBack(infixExpression0);
        IRFactory.transformTree(astRoot0, "newChild had siblings in addChildBefore", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test4650() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        VariableInitializer variableInitializer0 = new VariableInitializer(11, 9);
        ErrorCollector errorCollector0 = new ErrorCollector();
        InfixExpression infixExpression0 = new InfixExpression(23, variableInitializer0, variableInitializer0, 139);
        astRoot0.addChildToBack(infixExpression0);
        IRFactory.transformTree(astRoot0, "", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test4751() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        FunctionCall functionCall0 = new FunctionCall(2, 1);
        astRoot0.addChildrenToFront(functionCall0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        IRFactory.transformTree(astRoot0, "S@OA0#", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test4852() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        ErrorCollector errorCollector0 = new ErrorCollector();
        RegExpLiteral regExpLiteral0 = new RegExpLiteral(1);
        InfixExpression infixExpression0 = new InfixExpression(105, regExpLiteral0, astRoot0, 8);
        astRoot0.addChildToBack(infixExpression0);
        IRFactory.transformTree(astRoot0, "Unsupported sytax;: ", (Config) null, errorCollector0);
    }

    @Test(timeout = 4000)
    public void test4953() throws Throwable {
        AstRoot astRoot0 = new AstRoot();
        SwitchCase switchCase0 = new SwitchCase();
        ExpressionStatement expressionStatement0 = new ExpressionStatement(switchCase0);
        expressionStatement0.setHasResult();
        astRoot0.addChildToBack(expressionStatement0);
        ErrorCollector errorCollector0 = new ErrorCollector();
        Node node0 = IRFactory.transformTree(astRoot0, "com.google.javascript.jscomp.parsing.IRFactory", (Config) null, errorCollector0);
        node0.getType();
    }
}
