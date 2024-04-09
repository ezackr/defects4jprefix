/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 09:24:40 GMT 2024
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
import org.jsoup.nodes.Element;
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
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Parser parser0 = new Parser(xmlTreeBuilder0);
        xmlTreeBuilder0.parseFragment(",2K[Qe", (Element) null, ",2K[Qe", parser0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.Doctype token_Doctype0 = new Token.Doctype();
        xmlTreeBuilder0.process(token_Doctype0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        PipedReader pipedReader0 = new PipedReader();
        xmlTreeBuilder0.parse(pipedReader0, "JX],\"h[H|3Hk<G^");
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("W*N>M<CcC<r", "W*N>M<CcC<r");
        boolean boolean0 = xmlTreeBuilder0.processEndTag("#document");
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("F}/gq=F<?fSq_[", "F}/gq=F<?fSq_[");
        document0.tagName();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("D<v7+/>])/", "D<v7+/>])/");
        document0.childNodeSize();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("pDMZiSI^[", "pDMZiSI^[");
        Tokeniser tokeniser0 = xmlTreeBuilder0.tokeniser;
        Token.StartTag token_StartTag0 = tokeniser0.startPending;
        Attributes attributes0 = new Attributes();
        Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("pDMZiSI^[", attributes0);
        token_StartTag1.selfClosing = true;
        Token.StartTag token_StartTag2 = token_StartTag1.nameAttr("button", attributes0);
        Element element0 = xmlTreeBuilder0.insert(token_StartTag2);
        element0.isBlock();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.Comment token_Comment0 = new Token.Comment();
        xmlTreeBuilder0.process(token_Comment0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("hyfe$%3Fh<!w", "hyfe$%3Fh<!w");
        document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Document document0 = xmlTreeBuilder0.parse("}F}/>q=F<?\"_[", "}F}/>q=F<?\"_[");
        document0.normalName();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        Token.CData token_CData0 = new Token.CData("8G;PIzNkjR%$lXeBi>s");
        xmlTreeBuilder0.process(token_CData0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
        xmlTreeBuilder0.parse("pDMZiSI^[", "pDMZiSI^[");
        boolean boolean0 = xmlTreeBuilder0.processEndTag("pDMZiSI^[");
    }
}
