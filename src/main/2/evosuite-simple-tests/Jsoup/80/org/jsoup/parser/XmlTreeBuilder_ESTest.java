/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 08:03:01 GMT 2024
 */
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
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
        xmlTreeBuilder0.parse("h{cbf<!?a~Hz", "h{cbf<!?a~Hz");
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        ParseSettings parseSettings0 = xmlTreeBuilder0.defaultSettings();
        List<Node> list0 = xmlTreeBuilder0.parseFragment("", "", (ParseErrorList) null, parseSettings0);
        assertTrue(list0.isEmpty());
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
        StringReader stringReader0 = new StringReader("");
        Document document0 = xmlTreeBuilder0.parse(stringReader0, "");
        assertFalse(document0.isBlock());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("h{cbf<!/|~Hz", "=y<(iU q");
        assertEquals("=y<(iU q", document0.baseUri());
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("h{cbf<!/|~Hz", "=y<(iU q");
        Token.StartTag token_StartTag0 = new Token.StartTag();
        token_StartTag0.selfClosing = true;
        Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("basefont", (Attributes) null);
        boolean boolean0 = xmlTreeBuilder0.process(token_StartTag1);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("=y<(iU q", "=y<(iU q");
        Token.StartTag token_StartTag0 = new Token.StartTag();
        token_StartTag0.selfClosing = true;
        Attributes attributes0 = new Attributes();
        Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("/g) ", attributes0);
        Element element0 = xmlTreeBuilder0.insert(token_StartTag1);
        assertEquals("=y<(iU q", element0.baseUri());
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        Token.Comment token_Comment0 = new Token.Comment();
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
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
        Token.Comment token_Comment0 = new Token.Comment();
        token_Comment0.bogus = true;
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        // Undeclared exception!
        try {
            xmlTreeBuilder0.insert(token_Comment0);
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
        Token.CData token_CData0 = new Token.CData("base");
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
    public void test0910() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("h{cbf<!/|~Hz", "=y<(iU q");
        assertEquals("=y<(iU q", document0.location());
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("h{cbf<!/|~Hz", "=y<(iU q");
        boolean boolean0 = xmlTreeBuilder0.processEndTag("h{cbf<!/|~Hz");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("#document", "<");
        assertEquals("<", document0.baseUri());
    }

    @Test(timeout = 4000)
    public void test1013() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("#document", "<");
        xmlTreeBuilder0.processStartTag("<");
        boolean boolean0 = xmlTreeBuilder0.processEndTag("#document");
        assertTrue(boolean0);
    }
}
