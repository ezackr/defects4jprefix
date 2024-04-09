/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 01:35:37 GMT 2024
 */
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Node_ESTest extends Node_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Comment comment0 = new Comment("Pi(b(oedG+|aW", "Pi(b(oedG+|aW");
        DocumentType documentType0 = new DocumentType("Pi(b(oedG+|aW", "Pi(b(oedG+|aW", "Pi(b(oedG+|aW", "Pi(b(oedG+|aW");
        // Undeclared exception!
        try {
            comment0.before((Node) documentType0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Document document0 = new Document("p8_<T7AGKO]H)W%");
        document0.setBaseUri("p8_<T7AGKO]H)W%");
        assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Document document0 = new Document("");
        // Undeclared exception!
        try {
            document0.after((Node) document0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Document document0 = Document.createShell("'6x\"4y/eJi");
        Node[] nodeArray0 = document0.childNodesAsArray();
        assertEquals(1, nodeArray0.length);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        TextNode textNode0 = new TextNode("|", "|");
        textNode0.toString();
        assertEquals(0, textNode0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Document document0 = Document.createShell("'6\"4yI/eJi");
        // Undeclared exception!
        try {
            document0.remove();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        StringBuilder stringBuilder0 = new StringBuilder(230);
        DocumentType documentType0 = new DocumentType("abs:'6\"4y/dji", "abs:'6\"4y/dji", "abs:'6\"4y/dji", "abs:'6\"4y/dji");
        stringBuilder0.append((Object) documentType0);
        assertEquals("<!DOCTYPE html PUBLIC \"abs:'6\"4y/dji\" abs:'6\"4y/dji\">", stringBuilder0.toString());
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded("WUO,RGq}!EsYl*", "WUO,RGq}!EsYl*");
        Node node0 = textNode0.removeAttr("WUO,RGq}!EsYl*");
        assertSame(textNode0, node0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Document document0 = Document.createShell("id");
        String string0 = document0.outerHtml();
        assertEquals(0, document0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        Document document0 = Document.createShell("id");
        String string0 = document0.outerHtml();
        assertEquals("<html>\n <head></head>\n <body></body>\n</html>", string0);
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded("WUO,RGq}!EsYl*", "WUO,RGq}!EsYl*");
        // Undeclared exception!
        try {
            textNode0.siblingNodes();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.nodes.Node", e);
        }
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded("WUO,RGq}!EsYl*", "WUO,RGq}!EsYl*");
        Attributes attributes0 = textNode0.attributes();
        assertNotNull(attributes0);
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        Document document0 = new Document("abs:\n");
        String string0 = document0.absUrl("abs:\n");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        Document document0 = Document.createShell("'6\"4yI/eJi");
        document0.attr("'6\"4yI/eJi", "'6\"4yI/eJi");
        String string0 = document0.absUrl("'6\"4yI/eJi");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        Document document0 = Document.createShell("org.jsoup.nodes.Node");
        XmlDeclaration xmlDeclaration0 = new XmlDeclaration("org.jsoup.nodes.Node", "org.jsoup.nodes.Node", true);
        Node[] nodeArray0 = new Node[6];
        nodeArray0[0] = (Node) xmlDeclaration0;
        nodeArray0[1] = (Node) document0;
        nodeArray0[2] = (Node) document0;
        nodeArray0[3] = (Node) xmlDeclaration0;
        nodeArray0[4] = (Node) document0;
        nodeArray0[5] = (Node) xmlDeclaration0;
        xmlDeclaration0.addChildren(nodeArray0);
        // Undeclared exception!
        try {
            xmlDeclaration0.before("org.jsoup.nodes.Node");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.parser.TreeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        Document document0 = Document.createShell("'6\"4yI/eJi");
        Element element0 = document0.head();
        assertNotNull(element0);
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        Document document0 = Document.createShell("'6\"4yI/eJi");
        Element element0 = document0.head();
        element0.after("'6\"4yI/eJi");
        assertEquals(0, element0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        Document document0 = Document.createShell("w8_<=T7AGGKO]H)W%");
        // Undeclared exception!
        try {
            document0.wrap("w8_<=T7AGGKO]H)W%");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.parser.TreeBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        Document document0 = Document.createShell("'6\"4yI/eJi");
        Element element0 = document0.attr("'6\"4yI/eJi", "'6\"4yI/eJi");
        element0.parentNode = (Node) document0;
        element0.wrap("<ew!>r} $aY=W22HM{v");
        assertEquals(1, element0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        Document document0 = Document.createShell("'6x\"4y/eJi");
        document0.setParentNode(document0);
        Node node0 = document0.wrap("'6x\"4y/eJi");
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        Document document0 = Document.createShell("org.");
        Element element0 = document0.body();
        assertEquals(1, element0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test1821() throws Throwable {
        Document document0 = Document.createShell("org.");
        Element element0 = document0.body();
        element0.wrap("org.");
        Document document1 = document0.clone();
        assertNotSame(document0, document1);
    }

    @Test(timeout = 4000)
    public void test1922() throws Throwable {
        Document document0 = Document.createShell("pi([");
        Element element0 = document0.body();
        element0.setParentNode(document0);
        assertEquals(1, element0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test2023() throws Throwable {
        Document document0 = Document.createShell("i([");
        // Undeclared exception!
        try {
            document0.replaceChild(document0, document0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Must be true
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test2124() throws Throwable {
        Document document0 = Document.createShell("u/|e!-&p)|:)");
        Element element0 = document0.body();
        element0.replaceWith(document0);
        assertEquals(1, document0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        Document document0 = Document.createShell("w8_<=T7|RGKO]H)WC");
        // Undeclared exception!
        try {
            document0.removeChild(document0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Must be true
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        Document document0 = new Document("'6x\"4y/eJi");
        document0.setParentNode(document0);
        Node node0 = document0.previousSibling();
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test2427() throws Throwable {
        Document document0 = Document.createShell("'6x\"4y/eJi");
        document0.appendChild(document0);
        document0.previousSibling();
        assertEquals(1, document0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test2528() throws Throwable {
        XmlDeclaration xmlDeclaration0 = new XmlDeclaration("w)TT7AGGKO]H)W%", "w)TT7AGGKO]H)W%", false);
        boolean boolean0 = xmlDeclaration0.equals("w)TT7AGGKO]H)W%");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2629() throws Throwable {
        XmlDeclaration xmlDeclaration0 = new XmlDeclaration("HZ,", "HZ,", true);
        boolean boolean0 = xmlDeclaration0.equals(xmlDeclaration0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2730() throws Throwable {
        Document document0 = Document.createShell("w8_<=T7|RGKO]H)WC");
        Element element0 = document0.head();
        element0.hashCode();
    }

    @Test(timeout = 4000)
    public void test2831() throws Throwable {
        TextNode textNode0 = new TextNode("org.jsoup.nodes.Node", "org.jsoup.nodes.Node");
        textNode0.hashCode();
    }
}
