/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 23:07:43 GMT 2023
 */
package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.charset.Charset;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMException;

public class W3CDomTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        Document document0 = Document.createShell(":lt(%Cd)");
        document0.prependElement(":lt(%Cd)");
        // Undeclared exception!
        try {
            w3CDom0.fromJsoup(document0);
            fail("Expecting exception: DOMException");
        } catch (DOMException e) {
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        Document document0 = Document.createShell("[%s^=%s]");
        org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
        W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder(document1);
        DocumentType documentType0 = new DocumentType("[%s~=%s]", "[%s~=%s]", "|+q|07W5K~ FVX%q", "[%s~=%s]");
        w3CDom_W3CBuilder0.tail(documentType0, 3914);
        assertFalse(documentType0.hasParent());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        Document document0 = Document.createShell("F");
        org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
        W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder(document1);
        DataNode dataNode0 = new DataNode("org.jsoup.parser.TokeniserState", "F");
        // Undeclared exception!
        try {
            w3CDom_W3CBuilder0.head(dataNode0, 0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        Document document0 = Document.createShell("xmlns:bQ? uQNA!jS %5");
        w3CDom0.factory = null;
        // Undeclared exception!
        try {
            w3CDom0.fromJsoup(document0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        Document document0 = new Document("!K`B6$PV@?QsC8krC");
        // Undeclared exception!
        try {
            w3CDom0.fromJsoup(document0);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        // Undeclared exception!
        try {
            w3CDom0.fromJsoup((Document) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        Document document0 = new Document("q8P8NmW-y0<");
        // Undeclared exception!
        try {
            w3CDom0.convert(document0, (org.w3c.dom.Document) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        Document document0 = Document.createShell("xmlns:bQ uQNA!jS %5");
        org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
        Document document2 = new Document("xmlns:bQ uQNA!jS %5");
        // Undeclared exception!
        try {
            w3CDom0.convert(document2, document1);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        Document document0 = Document.createShell("");
        org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
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
        Document document0 = new Document("xlns:ahtml>\n<head>\n<MET2 http-equiv=\"Content-Type\" content=\"[ext/html; charsetY:T-8\">\n</head>\n<body></body>b</html>");
        document0.prependElement("xlns:ahtml>\n<head>\n<MET2 http-equiv=\"Content-Type\" content=\"[ext/html; charsetY:T-8\">\n</head>\n<body></body>b</html>");
        // Undeclared exception!
        try {
            w3CDom0.fromJsoup(document0);
            fail("Expecting exception: DOMException");
        } catch (DOMException e) {
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((org.w3c.dom.Document) null);
        Tag tag0 = Tag.valueOf("!&{`(r6rwWwT]'I\"");
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("xmlns:value", "!&{`(r6rwWwT]'I\"");
        FormElement formElement0 = new FormElement(tag0, "!&{`(r6rwWwT]'I\"", attributes1);
        // Undeclared exception!
        try {
            w3CDom_W3CBuilder0.head(formElement0, (-158368870));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        Document document0 = Document.createShell("dB@L!2wo8Pt^");
        org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
        W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder(document1);
        ParseSettings parseSettings0 = ParseSettings.htmlDefault;
        Tag tag0 = Tag.valueOf("Uxlnseale", parseSettings0);
        Attributes attributes0 = new Attributes();
        attributes0.put("6(c_'iY,B_uD]j=Es.", true);
        PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "Uxlnseale", attributes0);
        // Undeclared exception!
        try {
            w3CDom_W3CBuilder0.head(pseudoTextElement0, (-3816));
            fail("Expecting exception: DOMException");
        } catch (DOMException e) {
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        Document document0 = Document.createShell("dB@L!2wo8Pt^");
        Charset charset0 = document0.charset();
        document0.charset(charset0);
        org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
        assertNotNull(document1);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        DataNode dataNode0 = new DataNode("xmln:v");
        W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((org.w3c.dom.Document) null);
        // Undeclared exception!
        try {
            w3CDom_W3CBuilder0.head(dataNode0, (-1623));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        Document document0 = Document.createShell("{v?Mz+`o");
        org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
        W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder(document1);
        Comment comment0 = new Comment("{v?Mz+`o", "{v?Mz+`o");
        // Undeclared exception!
        try {
            w3CDom_W3CBuilder0.head(comment0, (-1344));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        Document document0 = Document.createShell(":lr(0d)");
        document0.text(":lr(0d)");
        org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
        assertNotNull(document1);
    }

    @Test(timeout = 4000)
    public void test1716() throws Throwable {
        W3CDom w3CDom0 = new W3CDom();
        Document document0 = Document.createShell("");
        org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
        String string0 = w3CDom0.asString(document1);
        assertEquals("<html>\n<head>\n<META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n</head>\n<body></body>\n</html>\n", string0);
    }

    @Test(timeout = 4000)
    public void test1817() throws Throwable {
        W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((org.w3c.dom.Document) null);
        Tag tag0 = Tag.valueOf("!&{`(r6rww]'I\"");
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("xmlns", "!&{`(r6rww]'I\"");
        FormElement formElement0 = new FormElement(tag0, "!&{`(r6rww]'I\"", attributes1);
        // Undeclared exception!
        try {
            w3CDom_W3CBuilder0.head(formElement0, (-158368870));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }
}
