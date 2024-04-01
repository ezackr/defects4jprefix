/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 05:59:36 GMT 2023
 */
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
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
        xmlTreeBuilder0.parse("PK<!!F/EC", "PK<!!F/EC");
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        ParseSettings parseSettings0 = ParseSettings.htmlDefault;
        List<Node> list0 = xmlTreeBuilder0.parseFragment("CdataSection", "CdataSection", (ParseErrorList) null, parseSettings0);
        assertEquals(1, list0.size());
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
        xmlTreeBuilder0.parse("colgroup", "colgroup");
        Token.StartTag token_StartTag0 = new Token.StartTag();
        Token.Tag token_Tag0 = token_StartTag0.name("colgroup");
        token_Tag0.selfClosing = true;
        boolean boolean0 = xmlTreeBuilder0.process(token_StartTag0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("<P% a$ne?tFiy/>d", "<P% a$ne?tFiy/>d");
        assertEquals(2, document0.childNodeSize());
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("<!--", "<!--");
        assertFalse(document0.isBlock());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("<!", "<!");
        assertEquals("<!", document0.baseUri());
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("jT: <?n&F$mcbjfk", "jT: <?n&F$mcbjfk");
        assertEquals("#document", document0.nodeName());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("r<!YXKBj", "r<!YXKBj");
        assertFalse(document0.isBlock());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("colgroup", "colgroup");
        boolean boolean0 = xmlTreeBuilder0.processEndTag("colgroup");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("b<sefomn>", "b<sefomn>");
        boolean boolean0 = xmlTreeBuilder0.processEndTag("#document");
        assertTrue(boolean0);
    }
}
