/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 05:43:23 GMT 2024
 */
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class XmlTreeBuilder_ESTest extends XmlTreeBuilder_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.Doctype token_Doctype0 = new Token.Doctype();
        // Undeclared exception!
        try {
            xmlTreeBuilder0.process(token_Doctype0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parseFragment("#document", "#document", (ParseErrorList) null);
        Token.StartTag token_StartTag0 = new Token.StartTag();
        Attributes attributes0 = new Attributes();
        Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("samp", attributes0);
        token_StartTag0.selfClosing = true;
        Element element0 = xmlTreeBuilder0.insert(token_StartTag1);
        assertEquals("#document", element0.baseUri());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("~zO'iOa<h>v;U=EMt?u", "#document");
        assertEquals("#document", document0.location());
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("~zO'iOa<h>v;U=EMt?u", "#document");
        assertEquals(2, document0.childNodeSize());
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("~zO'iOa<h>v;U=EMt?u", "#document");
        boolean boolean0 = xmlTreeBuilder0.processEndTag("#document");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        List<Node> list0 = xmlTreeBuilder0.parseFragment(">Y23qFE7<?Wg+3+ED*", ">Y23qFE7<?Wg+3+ED*", (ParseErrorList) null);
        assertEquals(2, list0.size());
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("+<L,&6^/>-A", "#document");
        assertEquals("#document", document0.location());
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("+<L,&6^/>-A", "#document");
        assertEquals(3, document0.childNodeSize());
    }

    @Test(timeout = 4000)
    public void test58() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("#document", "#document");
        Token.Comment token_Comment0 = new Token.Comment();
        boolean boolean0 = xmlTreeBuilder0.process(token_Comment0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test69() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("w` R#yB<?", "w` R#yB<?");
        assertEquals("#root", document0.tagName());
    }

    @Test(timeout = 4000)
    public void test710() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        List<Node> list0 = xmlTreeBuilder0.parseFragment("n%zOJ/<!!q$L", "n%zOJ/<!!q$L", parseErrorList0);
        assertFalse(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test811() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        List<Node> list0 = xmlTreeBuilder0.parseFragment("Qn%zOJ/<!xq$L", "Qn%zOJ/<!xq$L", parseErrorList0);
        assertEquals(2, list0.size());
    }

    @Test(timeout = 4000)
    public void test912() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("9voe2B3_!", "9voe2B3_!");
        boolean boolean0 = xmlTreeBuilder0.processEndTag("9voe2B3_!");
        assertTrue(boolean0);
    }
}
