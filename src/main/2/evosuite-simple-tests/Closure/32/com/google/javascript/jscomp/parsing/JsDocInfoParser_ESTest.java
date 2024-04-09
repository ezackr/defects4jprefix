/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 01:24:23 GMT 2024
 */
package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.JsDocInfoParser;
import com.google.javascript.jscomp.parsing.JsDocTokenStream;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.Token;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ErrorCollector;
import com.google.javascript.rhino.head.tools.ToolErrorReporter;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class JsDocInfoParser_ESTest extends JsDocInfoParser_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("0\n");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("0\n");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("1P*/?yg;");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
        jsDocInfoParser0.parse();
        assertTrue(node0.isString());
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("0\n");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("1P*/?yg;");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
        jsDocInfoParser0.parse();
        assertEquals(0, node0.getSourcePosition());
    }

    @Test(timeout = 4000)
    public void test003() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("0\n");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("1P*/?yg;");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
        jsDocInfoParser0.parse();
        assertFalse(node0.hasOneChild());
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("|\n");
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
        boolean boolean0 = jsDocInfoParser0.hasParsedJSDocInfo();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("*yS>atDta!7  ");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test026() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("*yS>atDta!7  ");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*yS>atDta!7  ");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
        jsDocInfoParser0.parse();
        assertEquals(302, node0.getType());
    }

    @Test(timeout = 4000)
    public void test027() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("*yS>atDta!7  ");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*yS>atDta!7  ");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
        jsDocInfoParser0.parse();
        assertEquals(0, node0.getChildCount());
    }

    @Test(timeout = 4000)
    public void test038() throws Throwable {
        Node node0 = Node.newString("*yS>at|Dta!7 @");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*yS>at|Dta!7 @");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
        JSDocInfo jSDocInfo0 = jsDocInfoParser0.getFileOverviewJSDocInfo();
        assertNull(jSDocInfo0);
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        Node node0 = Node.newString("*yS>at|Dta!7 @");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*yS>at|Dta!7 @", 36, 49);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
        Node.FileLevelJsDocBuilder node_FileLevelJsDocBuilder0 = node0.getJsDocBuilderForNode();
        jsDocInfoParser0.setFileLevelJsDocBuilder(node_FileLevelJsDocBuilder0);
    }

    @Test(timeout = 4000)
    public void test0510() throws Throwable {
        Node node0 = Node.newString("*yS>at|Dta!7 @");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*yS>at|Dta!7 @", 36, 49);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
        jsDocInfoParser0.setFileOverviewJSDocInfo((JSDocInfo) null);
    }

    @Test(timeout = 4000)
    public void test0611() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("@)9>_dF.>&2B$hKZ* (");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
        boolean boolean0 = jsDocInfoParser0.parse();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test0712() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("(fEO");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test0813() throws Throwable {
        Node node0 = Node.newString("*yS>at|Dta!7 @");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*yS>at|Dta!7 @");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
        JSDocInfo jSDocInfo0 = jsDocInfoParser0.retrieveAndResetParsedJSDocInfo();
        assertNull(jSDocInfo0);
    }

    @Test(timeout = 4000)
    public void test0914() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("*yS>at|Dta!7  @");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test0915() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("*yS>at|Dta!7  @");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*yS>at|Dta!7  @");
        Token.CommentType token_CommentType0 = Token.CommentType.BLOCK_COMMENT;
        Comment comment0 = new Comment(16, 45, token_CommentType0, "*yS>at|Dta!7  @");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, toolErrorReporter0);
        jsDocInfoParser0.parse();
        assertEquals(302, node0.getType());
    }

    @Test(timeout = 4000)
    public void test1016() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString(".\n");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test1017() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString(".\n");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        node0.setSourceFileForTesting(".\n");
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(".\n", 45, 32);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
        jsDocInfoParser0.parse();
        assertEquals(1, node0.getLength());
    }

    @Test(timeout = 4000)
    public void test1018() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString(".\n");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        node0.setSourceFileForTesting(".\n");
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(".\n", 45, 32);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
        jsDocInfoParser0.parse();
        assertEquals(0, node0.getSourcePosition());
    }

    @Test(timeout = 4000)
    public void test1119() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("@)9>_dF.>&2B$hKZ* (");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
        boolean boolean0 = jsDocInfoParser0.parse();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1220() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("tyS>at|Dtak7  @");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("1HP*/yg;", 37, 36);
        jsDocTokenStream0.getJsDocToken();
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
        jsDocInfoParser0.parse();
        assertTrue(node0.isString());
    }

    @Test(timeout = 4000)
    public void test1221() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("tyS>at|Dtak7  @");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("1HP*/yg;", 37, 36);
        jsDocTokenStream0.getJsDocToken();
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
        jsDocInfoParser0.parse();
        assertEquals(0, node0.getSourcePosition());
    }

    @Test(timeout = 4000)
    public void test1222() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("tyS>at|Dtak7  @");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
        Config config0 = new Config(treeSet0, treeSet0, false, config_LanguageMode0, false);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("1HP*/yg;", 37, 36);
        jsDocTokenStream0.getJsDocToken();
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
        jsDocInfoParser0.parse();
        assertEquals(0, node0.getLineno());
    }

    @Test(timeout = 4000)
    public void test1323() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("!AV1.T^_^]@");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
        boolean boolean0 = jsDocInfoParser0.parse();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1424() throws Throwable {
        Node node0 = Node.newString("D16");
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(",wl;<LQ1E(jPK");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
        }
    }

    @Test(timeout = 4000)
    public void test1525() throws Throwable {
        Node node0 = Node.newString(":*yS>atDta!7  ");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(":*yS>atDta!7  ");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
        boolean boolean0 = jsDocInfoParser0.parse();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1626() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(">)9");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, false);
        ErrorCollector errorCollector0 = new ErrorCollector();
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
        }
    }

    @Test(timeout = 4000)
    public void test1727() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("[;^aPm$");
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
            //
            verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
        }
    }

    @Test(timeout = 4000)
    public void test1828() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("{0z", 4095, 51);
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
        boolean boolean0 = jsDocInfoParser0.parse();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1929() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("(X1m\n");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
        boolean boolean0 = jsDocInfoParser0.parse();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2030() throws Throwable {
        ErrorCollector errorCollector0 = new ErrorCollector();
        Node node0 = Node.newString(" [");
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(".<", 4095, 42);
        Token.CommentType token_CommentType0 = Token.CommentType.LINE;
        Comment comment0 = new Comment((-2524), 36, token_CommentType0, " [");
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
        Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, comment0, node0, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
        }
    }

    @Test(timeout = 4000)
    public void test2131() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?.\n");
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("?.\n");
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
        Config config0 = new Config(linkedHashSet0, linkedHashSet0, true, config_LanguageMode0, true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, (ErrorReporter) null);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test2232() throws Throwable {
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("|\n");
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, toolErrorReporter0);
        boolean boolean0 = jsDocInfoParser0.parse();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2333() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("]");
        Locale locale0 = Locale.ITALY;
        Set<String> set0 = locale0.getUnicodeLocaleAttributes();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
        Config config0 = new Config(set0, set0, true, config_LanguageMode0, true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, (ErrorReporter) null);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test2434() throws Throwable {
        Node node0 = Node.newString("}-A#\"&XJ2Y");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("}-A#\"&XJ2Y", 8, 53);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, node0, config0, toolErrorReporter0);
        boolean boolean0 = jsDocInfoParser0.parse();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2535() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(") must be less than the number of elements that remained (");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5_STRICT;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ErrorCollector errorCollector0 = new ErrorCollector();
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
        }
    }

    @Test(timeout = 4000)
    public void test2636() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("...", 169, 169);
        JSDocInfo jSDocInfo0 = new JSDocInfo();
        Set<String> set0 = jSDocInfo0.getSuppressions();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT5;
        Config config0 = new Config(set0, set0, true, config_LanguageMode0, false);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, (ErrorReporter) null);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test2737() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("=hO=");
        TreeSet<String> treeSet0 = new TreeSet<String>();
        Config.LanguageMode config_LanguageMode0 = Config.LanguageMode.ECMASCRIPT3;
        Config config0 = new Config(treeSet0, treeSet0, true, config_LanguageMode0, true);
        ErrorCollector errorCollector0 = new ErrorCollector();
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, (Comment) null, (Node) null, config0, errorCollector0);
        // Undeclared exception!
        try {
            jsDocInfoParser0.parse();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.rhino.head.ast.ErrorCollector", e);
        }
    }

    @Test(timeout = 4000)
    public void test2838() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("DZ2|?,v?^)Klpjb Cp");
        assertEquals(301, node0.getType());
    }

    @Test(timeout = 4000)
    public void test2839() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("DZ2|?,v?^)Klpjb Cp");
        assertEquals(3, node0.getChildCount());
    }

    @Test(timeout = 4000)
    public void test2840() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("DZ2|?,v?^)Klpjb Cp");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test2941() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("6.<8,.a");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test3042() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("Q.<,4Un#jH+x'8");
        assertEquals(40, node0.getType());
    }

    @Test(timeout = 4000)
    public void test3043() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("Q.<,4Un#jH+x'8");
        assertEquals(0, node0.getSourcePosition());
    }

    @Test(timeout = 4000)
    public void test3144() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?]t");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test3145() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?]t");
        assertEquals(304, node0.getType());
    }

    @Test(timeout = 4000)
    public void test3246() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?}Zh\n");
        assertEquals(304, node0.getType());
    }

    @Test(timeout = 4000)
    public void test3247() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?}Zh\n");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test3348() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?|{V`r");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test3449() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("x$M|!*,FyT3");
        assertEquals(4, node0.getSourcePosition());
    }

    @Test(timeout = 4000)
    public void test3450() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("x$M|!*,FyT3");
        assertEquals(301, node0.getType());
    }

    @Test(timeout = 4000)
    public void test3451() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("x$M|!*,FyT3");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test3452() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("x$M|!*,FyT3");
        assertEquals(3, node0.getChildCount());
    }

    @Test(timeout = 4000)
    public void test3553() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("x!M|!*,zyT3");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test3554() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("x!M|!*,zyT3");
        assertEquals(306, node0.getType());
    }

    @Test(timeout = 4000)
    public void test3655() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("[eU;my]M{KrTYfe");
        assertEquals(308, node0.getType());
    }

    @Test(timeout = 4000)
    public void test3656() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("[eU;my]M{KrTYfe");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test3657() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("[eU;my]M{KrTYfe");
        assertTrue(node0.hasOneChild());
    }

    @Test(timeout = 4000)
    public void test3758() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("function (");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test3859() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("null");
        assertEquals(0, node0.getSourcePosition());
    }

    @Test(timeout = 4000)
    public void test3860() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("null");
        assertTrue(node0.isString());
    }

    @Test(timeout = 4000)
    public void test3961() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("undefined");
        assertEquals(0, node0.getSourcePosition());
    }

    @Test(timeout = 4000)
    public void test3962() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("undefined");
        assertEquals(9, node0.getLength());
    }

    @Test(timeout = 4000)
    public void test4063() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString(" w.<.>OJIW9");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test4064() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString(" w.<.>OJIW9");
        assertEquals(1, node0.getSourcePosition());
    }

    @Test(timeout = 4000)
    public void test4065() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString(" w.<.>OJIW9");
        assertTrue(node0.hasOneChild());
    }

    @Test(timeout = 4000)
    public void test4166() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("function");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test4267() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("K&|$'Q\"o%CB|8))pC");
        assertEquals(3, node0.getChildCount());
    }

    @Test(timeout = 4000)
    public void test4268() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("K&|$'Q\"o%CB|8))pC");
        assertEquals(301, node0.getType());
    }

    @Test(timeout = 4000)
    public void test4269() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("K&|$'Q\"o%CB|8))pC");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test4370() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("(c6vME)2L^*vYZn3");
        assertEquals(301, node0.getType());
    }

    @Test(timeout = 4000)
    public void test4371() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("(c6vME)2L^*vYZn3");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test4372() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("(c6vME)2L^*vYZn3");
        assertTrue(node0.hasChildren());
    }

    @Test(timeout = 4000)
    public void test4473() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("[^a97,HgB2>oAQa>");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test4574() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("[");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test4675() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("{");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test4776() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("{R6}MwZw,p");
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test4777() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("{R6}MwZw,p");
        assertEquals(309, node0.getType());
    }

    @Test(timeout = 4000)
    public void test4778() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("{R6}MwZw,p");
        assertTrue(node0.hasChildren());
    }

    @Test(timeout = 4000)
    public void test4879() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("{s,OT");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test4980() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("{KKZ:W");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test5081() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString(".~gs<.|{jI:");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test5182() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?");
        assertNull(node0);
    }
}
