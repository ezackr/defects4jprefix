/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 23:27:11 GMT 2023
 */
package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class W3CDom_ESTest extends W3CDom_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((Document) null);
        org.jsoup.nodes.Document document0 = Parser.parseBodyFragmentRelaxed("xmlns:class", ":nth-last-child(");
        Element element0 = document0.prependElement(":nth-last-child(");
        // Undeclared exception!
        try {
            w3CDom_W3CBuilder0.head(element0, (-158656234));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.helper.W3CDom$W3CBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((Document) null);
        w3CDom_W3CBuilder0.tail((Node) null, 108);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        DataNode dataNode0 = new DataNode(">-^m9ph'l[e]7");
        W3CDom w3CDom0 = new W3CDom();
        org.jsoup.nodes.Document document0 = Parser.parse(">-^m9ph'l[e]7", "async");
        Document document1 = w3CDom0.fromJsoup(document0);
        W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder(document1);
        // Undeclared exception!
        try {
            w3CDom_W3CBuilder0.head(dataNode0, (-180264522));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.helper.W3CDom$W3CBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        org.jsoup.nodes.Document document0 = Parser.parseBodyFragment("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>", ")VwiHR&N=");
        Document document1 = w3CDom0.fromJsoup(document0);
        assertNotNull(document1);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        org.jsoup.nodes.Document document0 = Parser.parseBodyFragmentRelaxed("xmlns", "xmlns");
        w3CDom0.factory = null;
        // Undeclared exception!
        try {
            w3CDom0.fromJsoup(document0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.helper.W3CDom", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        org.jsoup.nodes.Document document0 = new org.jsoup.nodes.Document("b.");
        // Undeclared exception!
        try {
            w3CDom0.fromJsoup(document0);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
            //
            verifyException("java.util.ArrayList", e);
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        // Undeclared exception!
        try {
            w3CDom0.fromJsoup((org.jsoup.nodes.Document) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        org.jsoup.nodes.Document document0 = org.jsoup.nodes.Document.createShell("xmlns");
        // Undeclared exception!
        try {
            w3CDom0.convert(document0, (Document) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.helper.W3CDom", e);
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        org.jsoup.nodes.Document document0 = org.jsoup.nodes.Document.createShell("");
        Document document1 = w3CDom0.fromJsoup(document0);
        // Undeclared exception!
        try {
            w3CDom0.convert(document0, document1);
            fail("Expecting exception: DOMException");
        } catch (DOMException e) {
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        org.jsoup.nodes.Document document0 = new org.jsoup.nodes.Document("22hE4)6o");
        org.jsoup.nodes.Document document1 = Parser.parseBodyFragment("22hE4)6o", "22hE4)6o");
        Document document2 = w3CDom0.fromJsoup(document1);
        // Undeclared exception!
        try {
            w3CDom0.convert(document0, document2);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
            //
            verifyException("java.util.ArrayList", e);
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        org.jsoup.nodes.Document document0 = Parser.parseBodyFragment("2%<WTBa", "2%<WTBa");
        document0.prependElement("xmlns:");
        // Undeclared exception!
        try {
            w3CDom0.fromJsoup(document0);
            fail("Expecting exception: DOMException");
        } catch (DOMException e) {
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((Document) null);
        org.jsoup.nodes.Document document0 = org.jsoup.nodes.Document.createShell("7$ZhU<Fos3D;");
        Tag tag0 = document0.tag();
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("xmlns:content", "7$ZhU<Fos3D;", attributes0);
        Attributes attributes1 = attributes0.put(attribute0);
        FormElement formElement0 = new FormElement(tag0, "7$ZhU<Fos3D;", attributes1);
        // Undeclared exception!
        try {
            w3CDom_W3CBuilder0.head(formElement0, 1698);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.helper.W3CDom$W3CBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        org.jsoup.nodes.Document document0 = org.jsoup.nodes.Document.createShell("5_");
        W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((Document) null);
        document0.attr("xmlns", "<html>\n <head></head>\n <body></body>\n</html>");
        // Undeclared exception!
        try {
            w3CDom_W3CBuilder0.head(document0, (-16));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.helper.W3CDom$W3CBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        org.jsoup.nodes.Document document0 = Parser.parseBodyFragmentRelaxed("~T5)[=2E+u!pZD+he", "~T5)[=2E+u!pZD+he");
        Charset charset0 = Charset.defaultCharset();
        document0.charset(charset0);
        Document document1 = w3CDom0.fromJsoup(document0);
        assertNotNull(document1);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((Document) null);
        w3CDom_W3CBuilder0.head((Node) null, (-6));
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        org.jsoup.nodes.Document document0 = org.jsoup.nodes.Document.createShell("[^-a-zA-Z0-9_:.]");
        Document document1 = w3CDom0.fromJsoup(document0);
        String string0 = w3CDom0.asString(document1);
        assertEquals("<html>\n<head>\n<META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n</head>\n<body></body>\n</html>\n", string0);
    }
}
