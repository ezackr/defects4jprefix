/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 05:51:28 GMT 2023
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
        ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
        List<Node> list0 = xmlTreeBuilder0.parseFragment("O</!i+R", "O</!i+R", parseErrorList0);
        assertFalse(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse(" wZJ<D[x>@%c/mV", " wZJ<D[x>@%c/mV");
        assertEquals(2, document0.childNodeSize());
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse(" wZJ<D[x>@%c/mV", " wZJ<D[x>@%c/mV");
        boolean boolean0 = xmlTreeBuilder0.processEndTag("#document");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("D:tHN<<wl@i/>-x((", "#doc,meGt");
        assertEquals(3, document0.childNodeSize());
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("D:tHN<<wl@i/>-x((", "#doc,meGt");
        assertEquals("#doc,meGt", document0.baseUri());
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parseFragment("u.DPmaXvo'P", "u.DPmaXvo'P", (ParseErrorList) null);
        Attributes attributes0 = new Attributes();
        Token.StartTag token_StartTag0 = new Token.StartTag();
        Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("u.DPmaXvo'P", attributes0);
        token_StartTag1.selfClosing = true;
        token_StartTag1.nameAttr("form", attributes0);
        boolean boolean0 = xmlTreeBuilder0.process(token_StartTag1);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("<!--", "<!--");
        assertEquals("#root", document0.tagName());
    }

    @Test(timeout = 4000)
    public void test68() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("<!-", "<!-");
        assertFalse(document0.updateMetaCharsetElement());
    }

    @Test(timeout = 4000)
    public void test79() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("@</&DR", "@</&DR");
        boolean boolean0 = xmlTreeBuilder0.processEndTag("@</&DR");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test810() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("Q+:H|<?9;", "Q+:H|<?9;");
        assertEquals(2, document0.childNodeSize());
    }
}
