/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 07:17:08 GMT 2023
 */
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class XmlTreeBuilder_ESTest extends XmlTreeBuilder_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Token.Comment token_Comment0 = new Token.Comment();
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
    public void test011() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("b2", "b2");
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Parser parser0 = new Parser(xmlTreeBuilder0);
        xmlTreeBuilder0.parseFragment("I{75.", "I{75.", parser0);
        xmlTreeBuilder0.processStartTag("I{75.");
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.processEndTag("O h,");
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.Comment token_Comment0 = new Token.Comment();
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
    public void test055() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        PipedReader pipedReader0 = new PipedReader();
        xmlTreeBuilder0.parse(pipedReader0, "JX],\"h[H|3Hk<G^");
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.processStartTag("ESeT");
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        String string0 = "vM`Gh5";
        HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
        htmlTreeBuilder0.getDocument();
        xmlTreeBuilder0.parseFragment("#docBument", (Element) null, "vM`Gh5", (Parser) null);
        xmlTreeBuilder0.parse(string0, string0);
        Token.Doctype token_Doctype0 = null;
        try {
            token_Doctype0 = new Token.Doctype();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.parser.TreeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.CData token_CData0 = new Token.CData("8G;PIzNkjR%$lXeBi>s");
        xmlTreeBuilder0.process(token_CData0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("vM`gi}5", "vM`gi}5");
        xmlTreeBuilder0.processEndTag("vM`gi}5");
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("F}/gq=F<?fSq_[", "F}/gq=F<?fSq_[");
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
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
    public void test1212() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.Comment token_Comment0 = new Token.Comment();
        token_Comment0.bogus = true;
        xmlTreeBuilder0.process(token_Comment0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("vM`Gh5", "vM`Gh5");
        xmlTreeBuilder0.processEndTag("#document");
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("vM`G?<h", "vM`G?<h");
        xmlTreeBuilder0.processStartTag("vM`G?<h");
        Tokeniser tokeniser0 = xmlTreeBuilder0.tokeniser;
        Token.StartTag token_StartTag0 = tokeniser0.startPending;
        xmlTreeBuilder0.processEndTag("#document");
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("vM`G?<h", "vM`G?<h");
        xmlTreeBuilder0.processStartTag("vM`G?<h");
        Tokeniser tokeniser0 = xmlTreeBuilder0.tokeniser;
        Token.StartTag token_StartTag0 = tokeniser0.startPending;
        Attributes attributes0 = new Attributes();
        Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("vM`G?<h", attributes0);
        token_StartTag1.selfClosing = true;
        xmlTreeBuilder0.insert(token_StartTag1);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("pDMZiSI^[", "pDMZiSI^[");
        xmlTreeBuilder0.processEndTag("pDMZiSI^[");
        Tokeniser tokeniser0 = xmlTreeBuilder0.tokeniser;
        Token.StartTag token_StartTag0 = tokeniser0.startPending;
        tokeniser0.tagPending = (Token.Tag) token_StartTag0;
        Attributes attributes0 = new Attributes();
        Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("pDMZiSI^[", attributes0);
        token_StartTag1.selfClosing = true;
        xmlTreeBuilder0.process(token_StartTag1);
        Token.Comment token_Comment0 = new Token.Comment();
        Attributes attributes1 = new Attributes();
        Token.StartTag token_StartTag2 = token_StartTag1.nameAttr("button", attributes1);
        xmlTreeBuilder0.insert(token_StartTag2);
    }
}
