/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 03 23:21:42 GMT 2023
 */
package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.JsDocInfoParser;
import com.google.javascript.jscomp.parsing.JsDocTokenStream;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.head.Token;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ErrorCollector;
import com.google.javascript.rhino.head.tools.ToolErrorReporter;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import org.junit.runner.RunWith;

public class JsDocInfoParserTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ErrorCollector errorCollector0 = new ErrorCollector();
        Node node0 = Node.newString("*/\n");
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*/\n");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, errorCollector0);
        boolean boolean0 = jsDocInfoParser0.parse();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Node node0 = Node.newString("O\n");
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("O\n", 31);
        TreeSet<String> treeSet0 = new TreeSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, errorCollector0);
        boolean boolean0 = jsDocInfoParser0.hasParsedJSDocInfo();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser((JsDocTokenStream) null, (Comment) null, (Node) null, config0, toolErrorReporter0);
        JSDocInfo jSDocInfo0 = jsDocInfoParser0.getFileOverviewJSDocInfo();
        assertNull(jSDocInfo0);
    }

    @Test(timeout = 4000)
    public void test053() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("@*A\"X2R.$]");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
        boolean boolean0 = jsDocInfoParser0.parse();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("[(qivbtXA|,y");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("{X\"S:");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test086() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(linkedHashSet0, linkedHashSet0, false, config_LanguageMode0, false);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser((JsDocTokenStream) null, (Comment) null, (Node) null, config0, toolErrorReporter0);
        JSDocInfo jSDocInfo0 = jsDocInfoParser0.retrieveAndResetParsedJSDocInfo();
        assertNull(jSDocInfo0);
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("'}");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("'}");
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("'}", 53);
        Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
        Comment comment0 = new Comment(36, 35, token_CommentType0, "'}");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        ErrorCollector errorCollector0 = new ErrorCollector();
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, errorCollector0);
        assertEquals(0, node0.getSourcePosition());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("'}");
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("'}", 53);
        Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
        Comment comment0 = new Comment(36, 35, token_CommentType0, "'}");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        ErrorCollector errorCollector0 = new ErrorCollector();
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, errorCollector0);
        assertEquals(40, node0.getType());
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("'}");
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("'}", 53);
        Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
        Comment comment0 = new Comment(36, 35, token_CommentType0, "'}");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        ErrorCollector errorCollector0 = new ErrorCollector();
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, errorCollector0);
        assertTrue(node0.isString());
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("!3@M1\"(/%");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        Node node0 = JsDocInfoParser.parseTypeString("!3@M1\"(/%");
        node0.setSourceFileForTesting("!3@M1\"(/%");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        ErrorCollector errorCollector0 = new ErrorCollector();
        Node node0 = Node.newString("*/\n");
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*/\n", 50, 45);
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, errorCollector0);
        boolean boolean0 = jsDocInfoParser0.parse();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("@a");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
        boolean boolean0 = jsDocInfoParser0.parse();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("*\n");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*\n", 1, 39);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("Y5");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
        boolean boolean0 = jsDocInfoParser0.parse();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*:}\n");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(">*nUY)Z");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("[(qiv3btXA|,y");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        TreeSet<String> treeSet0 = new TreeSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(" {\n");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("($J&W#1T2|Ny");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        TreeSet<String> treeSet0 = new TreeSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(".<");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        TreeSet<String> treeSet0 = new TreeSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("?|4DRPZ{ps");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2223() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("|1=");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
        boolean boolean0 = jsDocInfoParser0.parse();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2324() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("]");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        TreeSet<String> treeSet0 = new TreeSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Node node0 = JsDocInfoParser.parseTypeString("*}\n");
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*}\n", 50, 45);
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(")Ej {i");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        TreeSet<String> treeSet0 = new TreeSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("...", 50, 45);
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("=z3#R}#aJvyZe&O");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("*, \n");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*, \n", 15);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2930() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("Vx3| |LO(AySkBI2.0");
        assertEquals(301, node0.getType());
    }

    @Test(timeout = 4000)
    public void test2931() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("Vx3| |LO(AySkBI2.0");
        assertFalse(node0.hasOneChild());
    }

    @Test(timeout = 4000)
    public void test2932() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("Vx3| |LO(AySkBI2.0");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test3033() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("!2.<ft^,|/}T7");
        assertEquals(301, node0.getType());
    }

    @Test(timeout = 4000)
    public void test3034() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("!2.<ft^,|/}T7");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test3035() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("!2.<ft^,|/}T7");
        assertTrue(node0.hasMoreThanOneChild());
    }

    @Test(timeout = 4000)
    public void test3136() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("2.<");
        assertEquals(40, node0.getType());
    }

    @Test(timeout = 4000)
    public void test3137() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("2.<");
        assertEquals(0, node0.getSourcePosition());
    }

    @Test(timeout = 4000)
    public void test3138() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("2.<");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test3239() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("QTh.<q>(cnYiepnvi");
        assertEquals(0, node0.getSourcePosition());
    }

    @Test(timeout = 4000)
    public void test3240() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("QTh.<q>(cnYiepnvi");
        assertTrue(node0.hasChildren());
    }

    @Test(timeout = 4000)
    public void test3241() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("QTh.<q>(cnYiepnvi");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test3342() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString(".su5.<oaL/N,x_^C/");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test3443() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?}J4D Z{s");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test3444() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?}J4D Z{s");
        assertEquals(304, node0.getType());
    }

    @Test(timeout = 4000)
    public void test3545() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?,LmixF\"@%6O@m.");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test3546() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?,LmixF\"@%6O@m.");
        assertEquals(304, node0.getType());
    }

    @Test(timeout = 4000)
    public void test3647() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("ppg|?=");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test3648() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("ppg|?=");
        assertEquals(301, node0.getType());
    }

    @Test(timeout = 4000)
    public void test3649() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("ppg|?=");
        assertFalse(node0.hasOneChild());
    }

    @Test(timeout = 4000)
    public void test3750() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?]`p_(");
        assertEquals(304, node0.getType());
    }

    @Test(timeout = 4000)
    public void test3751() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?]`p_(");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test3852() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?|4DRP{sW");
        assertEquals(301, node0.getType());
    }

    @Test(timeout = 4000)
    public void test3853() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?|4DRP{sW");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test3854() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?|4DRP{sW");
        assertFalse(node0.hasOneChild());
    }

    @Test(timeout = 4000)
    public void test3955() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("(?)rt");
        assertEquals(301, node0.getType());
    }

    @Test(timeout = 4000)
    public void test3956() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("(?)rt");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test3957() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("(?)rt");
        assertEquals(1, node0.getChildCount());
    }

    @Test(timeout = 4000)
    public void test4058() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?RnpKfk#h");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test4059() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?RnpKfk#h");
        assertEquals(8, node0.getCharno());
    }

    @Test(timeout = 4000)
    public void test4060() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?RnpKfk#h");
        assertEquals(304, node0.getType());
    }

    @Test(timeout = 4000)
    public void test4161() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("XpS2e_t9Dfdk&<?|K");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test4162() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("XpS2e_t9Dfdk&<?|K");
        assertEquals(301, node0.getType());
    }

    @Test(timeout = 4000)
    public void test4163() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("XpS2e_t9Dfdk&<?|K");
        assertFalse(node0.hasOneChild());
    }

    @Test(timeout = 4000)
    public void test4264() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("s\"veX\"!");
        assertEquals(306, node0.getType());
    }

    @Test(timeout = 4000)
    public void test4265() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("s\"veX\"!");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test4366() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("function (");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test4467() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("null");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test4468() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("null");
        assertEquals(0, node0.getSourcePosition());
    }

    @Test(timeout = 4000)
    public void test4469() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("null");
        assertEquals(40, node0.getType());
    }

    @Test(timeout = 4000)
    public void test4570() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("undefined");
        assertEquals(0, node0.getSourcePosition());
    }

    @Test(timeout = 4000)
    public void test4571() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("undefined");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test4572() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("undefined");
        assertTrue(node0.isString());
    }

    @Test(timeout = 4000)
    public void test4673() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("2.\n");
        assertEquals(0, node0.getSourcePosition());
    }

    @Test(timeout = 4000)
    public void test4674() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("2.\n");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test4675() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("2.\n");
        assertEquals(2, node0.getLength());
    }

    @Test(timeout = 4000)
    public void test4776() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString(" O\n");
        assertEquals(1, node0.getSourcePosition());
    }

    @Test(timeout = 4000)
    public void test4777() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString(" O\n");
        assertEquals(40, node0.getType());
    }

    @Test(timeout = 4000)
    public void test4778() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString(" O\n");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test4879() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("function");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test4980() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("$|Uq,(}HD?");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test5081() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("  (~Or=K<");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test5182() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("[`AS;c,a5");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test5283() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("[#A;X]aa5");
        assertEquals(308, node0.getType());
    }

    @Test(timeout = 4000)
    public void test5284() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("[#A;X]aa5");
        assertTrue(node0.hasChildren());
    }

    @Test(timeout = 4000)
    public void test5285() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("[#A;X]aa5");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test5386() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("{yL~tLv}Qq@y;&.");
        assertEquals(309, node0.getType());
    }

    @Test(timeout = 4000)
    public void test5387() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("{yL~tLv}Qq@y;&.");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test5388() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("{yL~tLv}Qq@y;&.");
        assertTrue(node0.hasChildren());
    }

    @Test(timeout = 4000)
    public void test5489() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("{7&',oZc5Wm&fN:yz");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test5590() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString(" {\n");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test5691() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("!");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test5792() throws Throwable {
        Node node0 = Node.newString("O\n");
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("O\n", 4095, 53);
        TreeSet<String> treeSet0 = new TreeSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test5893() throws Throwable {
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        ErrorCollector errorCollector0 = new ErrorCollector();
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("{*/-:");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
        boolean boolean0 = jsDocInfoParser0.parse();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test5994() throws Throwable {
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ErrorCollector errorCollector0 = new ErrorCollector();
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*_\n");
        jsDocTokenStream0.ungetChar(10);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }
}
