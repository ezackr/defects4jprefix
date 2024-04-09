/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 07:51:47 GMT 2024
 */
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class XmlTreeBuilder_ESTest extends XmlTreeBuilder_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("3v6`<?l9bLvJ", "xGD>|");
        xmlTreeBuilder0.processEndTag("3v6`<?l9bLvJ");
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        ParseSettings parseSettings0 = ParseSettings.htmlDefault;
        // Undeclared exception!
        try {
            xmlTreeBuilder0.parseFragment((String) null, (String) null, (ParseErrorList) null, parseSettings0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.io.StringReader", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.Doctype token_Doctype0 = new Token.Doctype();
        // Undeclared exception!
        try {
            xmlTreeBuilder0.process(token_Doctype0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.parser.XmlTreeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        PipedReader pipedReader0 = new PipedReader();
        // Undeclared exception!
        try {
            xmlTreeBuilder0.parse(pipedReader0, "7U[d_O8cq|ac#(T|F");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Must be true
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("*U{<Y/>{~6ViRQOz=s5", "v']t2?pOgJf=[Oz");
        assertEquals(3, document0.childNodeSize());
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("*U{<Y/>{~6ViRQOz=s5", "v']t2?pOgJf=[Oz");
        assertEquals("v']t2?pOgJf=[Oz", document0.baseUri());
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("canvas", "canvas");
        Token.StartTag token_StartTag0 = new Token.StartTag();
        token_StartTag0.selfClosing = true;
        Attributes attributes0 = new Attributes();
        token_StartTag0.nameAttr("canvas", attributes0);
        boolean boolean0 = xmlTreeBuilder0.process(token_StartTag0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.Comment token_Comment0 = new Token.Comment();
        // Undeclared exception!
        try {
            xmlTreeBuilder0.process(token_Comment0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.parser.TreeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.Comment token_Comment0 = new Token.Comment();
        token_Comment0.bogus = true;
        // Undeclared exception!
        try {
            xmlTreeBuilder0.process(token_Comment0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.parser.TreeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.Comment token_Comment0 = new Token.Comment();
        token_Comment0.bogus = true;
        StringBuilder stringBuilder0 = token_Comment0.data;
        TextNode textNode0 = new TextNode("!\n<!--j-->-146", ".%s");
        stringBuilder0.append((Object) textNode0);
        // Undeclared exception!
        try {
            xmlTreeBuilder0.insert(token_Comment0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // BaseURI must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("pd9$bnF8<!enw;IeIM", "pd9$bnF8<!enw;IeIM");
        assertEquals("#document", document0.nodeName());
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.CData token_CData0 = new Token.CData("!");
        // Undeclared exception!
        try {
            xmlTreeBuilder0.process(token_CData0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.parser.TreeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("!\u0000\u0000>Q\u0000\u0000'\u0080v9012F981-", "!\u0000\u0000>Q\u0000\u0000'\u0080v9012F981-");
        xmlTreeBuilder0.processStartTag("!\u0000\u0000>Q\u0000\u0000'\u0080v9012F981-");
        boolean boolean0 = xmlTreeBuilder0.processEndTag("#document");
        assertTrue(boolean0);
    }
}
