/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 23:14:04 GMT 2023
 */
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.select.Elements;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class XmlTreeBuilder_ESTest extends XmlTreeBuilder_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("org.jsoup.parser.XmlTreeBuilder$1", "org.jsoup.parser.XmlTreeBuilder$1");
        xmlTreeBuilder0.processStartTag("org.jsoup.parser.XmlTreeBuilder$1");
        Elements elements0 = document0.getElementsByTag("org.jsoup.parser.XmlTreeBuilder$1");
        xmlTreeBuilder0.stack = (ArrayList<Element>) elements0;
        boolean boolean0 = xmlTreeBuilder0.processEndTag("org.jsoup.parser.XmlTreeBuilder$1");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("", "");
        Tokeniser tokeniser0 = xmlTreeBuilder0.tokeniser;
        Token.Doctype token_Doctype0 = tokeniser0.doctypePending;
        xmlTreeBuilder0.insert(token_Doctype0);
        assertFalse(token_Doctype0.isForceQuirks());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("", "");
        Token.CData token_CData0 = new Token.CData("");
        xmlTreeBuilder0.insert(token_CData0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        StringReader stringReader0 = new StringReader("header");
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(56);
        ParseSettings parseSettings0 = xmlTreeBuilder0.defaultSettings();
        xmlTreeBuilder0.initialiseParse(stringReader0, "C;N;h5ISxE`Zur`0X0?", parseErrorList0, parseSettings0);
        assertTrue(parseErrorList0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("org.jsoup.parser.XmlTreeBuilder$1", "org.jsoup.parser.XmlTreeBuilder$1");
        Tokeniser tokeniser0 = xmlTreeBuilder0.tokeniser;
        Token.Comment token_Comment0 = tokeniser0.commentPending;
        boolean boolean0 = xmlTreeBuilder0.process(token_Comment0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("o<g.jsoup.parser.XmlTreeBuilder$1", "o<g.jsoup.parser.XmlTreeBuilder$1");
        Token.Doctype token_Doctype0 = new Token.Doctype();
        boolean boolean0 = xmlTreeBuilder0.process(token_Doctype0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("org.jsoup.parser.XmlTreeBuilder$1", "org.jsoup.parser.XmlTreeBuilder$1");
        Tokeniser tokeniser0 = xmlTreeBuilder0.tokeniser;
        Token.Comment token_Comment0 = tokeniser0.commentPending;
        xmlTreeBuilder0.insert(token_Comment0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        StringReader stringReader0 = new StringReader("");
        Document document0 = xmlTreeBuilder0.parse(stringReader0, "");
        assertEquals("", document0.baseUri());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        StringReader stringReader0 = new StringReader("uD,vU#Vq9&Cl(W(s4[");
        Document document0 = xmlTreeBuilder0.parse(stringReader0, "uD,vU#Vq9&Cl(W(s4[");
        assertEquals(1, document0.childNodeSize());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.StartTag token_StartTag0 = new Token.StartTag();
        // Undeclared exception!
        try {
            xmlTreeBuilder0.process(token_StartTag0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Must be false
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        ParseErrorList parseErrorList0 = xmlTreeBuilder0.errors;
        ParseSettings parseSettings0 = ParseSettings.preserveCase;
        // Undeclared exception!
        try {
            xmlTreeBuilder0.parseFragment((String) null, (String) null, parseErrorList0, parseSettings0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.io.StringReader", e);
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        // Undeclared exception!
        try {
            xmlTreeBuilder0.parse((String) null, "tbody");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.io.StringReader", e);
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        // Undeclared exception!
        try {
            xmlTreeBuilder0.parse("", (String) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // BaseURI must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        StringReader stringReader0 = new StringReader("uD,vU#Vq9&Cl(W(s4[");
        stringReader0.close();
        // Undeclared exception!
        try {
            xmlTreeBuilder0.parse(stringReader0, "uD,vU#Vq9&Cl(W(s4[");
            fail("Expecting exception: Error");
        } catch (Error e) {
            //
            // java.io.IOException: Stream closed
            //
            verifyException("org.jsoup.parser.CharacterReader", e);
        }
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.StartTag token_StartTag0 = new Token.StartTag();
        CDataNode cDataNode0 = new CDataNode("i#IWVpcB''hy7");
        Attributes attributes0 = cDataNode0.attributes();
        Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("i#IWVpcB''hy7", attributes0);
        // Undeclared exception!
        try {
            xmlTreeBuilder0.insert(token_StartTag1);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.parser.Tag", e);
        }
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.StartTag token_StartTag0 = new Token.StartTag();
        // Undeclared exception!
        try {
            xmlTreeBuilder0.insert(token_StartTag0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Must be false
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        // Undeclared exception!
        try {
            xmlTreeBuilder0.insert((Token.Doctype) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.parser.XmlTreeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.CData token_CData0 = new Token.CData("");
        // Undeclared exception!
        try {
            xmlTreeBuilder0.insert(token_CData0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.parser.TreeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        PipedReader pipedReader0 = new PipedReader();
        ParseErrorList parseErrorList0 = ParseErrorList.tracking(0);
        // Undeclared exception!
        try {
            xmlTreeBuilder0.initialiseParse(pipedReader0, "org.jsoup.parser.XmlTreeBuilder", parseErrorList0, (ParseSettings) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Must be true
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("org.jsoup.parser.XmlTreeBuilder$1", "org.jsoup.parser.XmlTreeBuilder$1");
        xmlTreeBuilder0.processStartTag("org.jsoup.parser.XmlTreeBuilder$1");
        Token.StartTag token_StartTag0 = new Token.StartTag();
        Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("AfterDoctypeName", (Attributes) null);
        Element element0 = xmlTreeBuilder0.insert(token_StartTag1);
        assertEquals(0, element0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("org.jsoup.parser.XmlTreeBuilder$1", "org.jsoup.parser.XmlTreeBuilder$1");
        xmlTreeBuilder0.processStartTag("org.jsoup.parser.XmlTreeBuilder$1");
        Token.StartTag token_StartTag0 = new Token.StartTag();
        Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("AfterDoctypeName", (Attributes) null);
        Element element0 = xmlTreeBuilder0.insert(token_StartTag1);
        boolean boolean0 = xmlTreeBuilder0.processEndTag("org.jsoup.parser.XmlTreeBuilder$1");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parseFragment("wGr+4Cn,Y", "wGr+4Cn,Y", (ParseErrorList) null, (ParseSettings) null);
        boolean boolean0 = xmlTreeBuilder0.processEndTag("wGr+4Cn,Y");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.CData token_CData0 = new Token.CData("");
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
    public void test2223() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.Comment token_Comment0 = new Token.Comment();
        token_Comment0.bogus = true;
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
    public void test2324() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("VG[P1*NJN", "VG[P1*NJN");
        Token.StartTag token_StartTag0 = new Token.StartTag();
        token_StartTag0.selfClosing = true;
        Attributes attributes0 = new Attributes();
        Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("VG[P1*NJN", attributes0);
        Element element0 = xmlTreeBuilder0.insert(token_StartTag1);
        assertEquals(1, element0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.Comment token_Comment0 = new Token.Comment();
        Token.TokenType token_TokenType0 = Token.TokenType.StartTag;
        token_Comment0.type = token_TokenType0;
        // Undeclared exception!
        try {
            xmlTreeBuilder0.process(token_Comment0);
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // org.jsoup.parser.Token$Comment cannot be cast to org.jsoup.parser.Token$StartTag
            //
            verifyException("org.jsoup.parser.Token", e);
        }
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        PipedWriter pipedWriter0 = new PipedWriter();
        PipedReader pipedReader0 = new PipedReader(pipedWriter0, 1);
        // Undeclared exception!
        try {
            xmlTreeBuilder0.parse(pipedReader0, "Iq9jc'\"'IE=#n.2jS3d");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Must be true
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        ParseErrorList parseErrorList0 = ParseErrorList.tracking((-1097));
        List<Node> list0 = xmlTreeBuilder0.parseFragment("", "", parseErrorList0, (ParseSettings) null);
        assertTrue(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        ParseSettings parseSettings0 = xmlTreeBuilder0.defaultSettings();
        // Undeclared exception!
        try {
            xmlTreeBuilder0.parseFragment("uc]U&&@?mjUgx_,e;", (String) null, (ParseErrorList) null, parseSettings0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // BaseURI must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }
}
