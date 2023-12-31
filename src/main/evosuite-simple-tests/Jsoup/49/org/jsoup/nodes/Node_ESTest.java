/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 21:53:19 GMT 2023
 */
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeVisitor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Node_ESTest extends Node_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test030() throws Throwable {
        XmlDeclaration xmlDeclaration0 = new XmlDeclaration("s=Tjx%\"", "s=Tjx%\"", true);
        // Undeclared exception!
        try {
            xmlDeclaration0.replaceWith((Node) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test281() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded("", " F,,%C3muSk&bx!K8VG");
        // Undeclared exception!
        try {
            textNode0.wrap("");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // String must not be empty
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test292() throws Throwable {
        DataNode dataNode0 = new DataNode("tq?:bUCasT<", "");
        // Undeclared exception!
        try {
            dataNode0.unwrap();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test313() throws Throwable {
        Document document0 = Document.createShell("=*>cz@9R#W8%Q&d");
        Tag tag0 = document0.tag();
        Attributes attributes0 = new Attributes();
        FormElement formElement0 = new FormElement(tag0, "=*>cz@9R#W8%Q&d", attributes0);
        // Undeclared exception!
        try {
            formElement0.replaceChild((Node) null, document0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.nodes.Node", e);
        }
    }

    @Test(timeout = 4000)
    public void test324() throws Throwable {
        Document document0 = Document.createShell("(s>xIjA]71~Jy");
        // Undeclared exception!
        try {
            document0.reparentChild((Node) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.nodes.Node", e);
        }
    }

    @Test(timeout = 4000)
    public void test335() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded("1-EQ:+\"ti!L3bRU&F", "1-EQ:+\"ti!L3bRU&F");
        TextNode textNode1 = textNode0.text("1-EQ:+\"ti!L3bRU&F");
        textNode1.parentNode = (Node) textNode0;
        // Undeclared exception!
        try {
            textNode1.parentNode.remove();
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.AbstractList", e);
        }
    }

    @Test(timeout = 4000)
    public void test346() throws Throwable {
        Document document0 = Document.createShell("TagOpen");
        // Undeclared exception!
        try {
            document0.outerHtml((StringBuilder) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test357() throws Throwable {
        Document document0 = Document.createShell(" version=\"");
        StringBuilder stringBuilder0 = new StringBuilder((CharSequence) " version=\"");
        // Undeclared exception!
        try {
            document0.indent(stringBuilder0, (-2984), (Document.OutputSettings) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test368() throws Throwable {
        Comment comment0 = new Comment("eQ>", "$ 3[Z~zTxi");
        // Undeclared exception!
        try {
            comment0.hasAttr((String) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test379() throws Throwable {
        Document document0 = new Document("tic!");
        document0.appendText("tic!");
        // Undeclared exception!
        try {
            document0.childNode((-106223338));
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test3810() throws Throwable {
        Document document0 = new Document(";48HOnOd#ch0<},u^[");
        // Undeclared exception!
        try {
            document0.attr((String) null, ";48HOnOd#ch0<},u^[");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // String must not be empty
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test3911() throws Throwable {
        Document document0 = Document.createShell("F`R^h& qTEYfB{");
        // Undeclared exception!
        try {
            document0.attr((String) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test4012() throws Throwable {
        TextNode textNode0 = new TextNode("", ";b^!-.");
        // Undeclared exception!
        try {
            textNode0.after(";b^!-.");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test4113() throws Throwable {
        Document document0 = Document.createShell("F`R^h& qTEYfB{");
        // Undeclared exception!
        try {
            document0.addChildren((Node[]) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.nodes.Node", e);
        }
    }

    @Test(timeout = 4000)
    public void test4214() throws Throwable {
        Document document0 = Document.createShell("");
        // Undeclared exception!
        try {
            document0.addChildren(0, (Node[]) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test4315() throws Throwable {
        Document document0 = new Document("");
        Node[] nodeArray0 = new Node[8];
        nodeArray0[0] = (Node) document0;
        nodeArray0[1] = (Node) document0;
        nodeArray0[2] = (Node) document0;
        nodeArray0[3] = (Node) document0;
        nodeArray0[4] = (Node) document0;
        nodeArray0[5] = (Node) document0;
        nodeArray0[6] = (Node) document0;
        nodeArray0[7] = (Node) document0;
        // Undeclared exception!
        try {
            document0.addChildren((-2368), nodeArray0);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: -2368, Size: 0
            //
            verifyException("java.util.ArrayList", e);
        }
    }

    @Test(timeout = 4000)
    public void test4416() throws Throwable {
        XmlDeclaration xmlDeclaration0 = new XmlDeclaration("", "", false);
        // Undeclared exception!
        try {
            xmlDeclaration0.absUrl("");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // String must not be empty
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test4517() throws Throwable {
        Comment comment0 = new Comment("", "`V;I`35Rf");
        Node node0 = comment0.nextSibling();
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test4618() throws Throwable {
        Document document0 = new Document("K.i52T");
        // Undeclared exception!
        try {
            document0.wrap("option");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.nodes.Node", e);
        }
    }

    @Test(timeout = 4000)
    public void test4719() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded(".Ly+Cw;O", "org.jsoup.nodes.Node$1");
        // Undeclared exception!
        try {
            textNode0.wrap(".Ly+Cw;O");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.nodes.Node", e);
        }
    }

    @Test(timeout = 4000)
    public void test4820() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded("7Jsq@*k[Yk", "7Jsq@*k[Yk");
        Document document0 = textNode0.ownerDocument();
        assertNull(document0);
    }

    @Test(timeout = 4000)
    public void test4921() throws Throwable {
        Document document0 = Document.createShell("");
        Element element0 = document0.body();
        element0.ownerDocument();
        assertEquals(1, element0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test5022() throws Throwable {
        Document document0 = Document.createShell("6UG3");
        boolean boolean0 = document0.hasAttr("6UG3");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test5123() throws Throwable {
        Document document0 = new Document("");
        String string0 = document0.attr("#document");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test5224() throws Throwable {
        TextNode textNode0 = new TextNode("org.jsoup.nodes.Node", "cg5J<");
        Document document0 = new Document("@wFn#Teo$gd)");
        // Undeclared exception!
        try {
            textNode0.after((Node) document0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test5325() throws Throwable {
        Document document0 = Document.createShell("");
        Node node0 = document0.parentNode();
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test5426() throws Throwable {
        DataNode dataNode0 = new DataNode("abs:", "abs:");
        int int0 = dataNode0.childNodeSize();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test5527() throws Throwable {
        Document document0 = new Document("");
        NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
        Document document1 = (Document) document0.traverse(nodeVisitor0);
        assertFalse(document1.isBlock());
    }

    @Test(timeout = 4000)
    public void test5628() throws Throwable {
        DocumentType documentType0 = new DocumentType(")Li-p;e\"^JD!w d3S", "v/hxrdc", "1wi|)69inibTwJvLT", "{5FDsD$u");
        Document document0 = new Document("v/hxrdc");
        // Undeclared exception!
        try {
            documentType0.before((Node) document0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test5729() throws Throwable {
        DataNode dataNode0 = new DataNode("", "");
        // Undeclared exception!
        try {
            dataNode0.before("sP`u+I ,=U*");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test5830() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded("1-EQ:+\"ti!L3bRU&F", "1-EQ:+\"ti!L3bRU&F");
        List<Node> list0 = textNode0.childNodes();
        assertTrue(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test5931() throws Throwable {
        Document document0 = Document.createShell("thead");
        int int0 = document0.siblingIndex();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test6032() throws Throwable {
        Document document0 = Document.createShell("org.jsoup.select.Evaluator$Attribute");
        String string0 = document0.baseUri();
        assertEquals("org.jsoup.select.Evaluator$Attribute", string0);
    }

    @Test(timeout = 4000)
    public void test6133() throws Throwable {
        Comment comment0 = new Comment("eQ>", "$ 38]~zTxx$i");
        Node node0 = comment0.parent();
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test6234() throws Throwable {
        Comment comment0 = new Comment("eQ>", " 38]~zTx$i");
        // Undeclared exception!
        try {
            comment0.childNode(4);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 4
            //
            verifyException("java.util.Collections$EmptyList", e);
        }
    }

    @Test(timeout = 4000)
    public void test6335() throws Throwable {
        Comment comment0 = new Comment("eQ>", "eQ>");
        Node node0 = comment0.attr("\n", "?gL");
        assertEquals(0, node0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test6436() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded(",sCr%h", ",sCr%h");
        Node node0 = textNode0.clone();
        assertNotSame(node0, textNode0);
    }

    @Test(timeout = 4000)
    public void test6437() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded(",sCr%h", ",sCr%h");
        Node node0 = textNode0.clone();
        assertNotNull(node0);
    }

    @Test(timeout = 4000)
    public void test6438() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded(",sCr%h", ",sCr%h");
        Node node0 = textNode0.clone();
        assertEquals(0, node0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test6639() throws Throwable {
        DataNode dataNode0 = DataNode.createFromEncoded("2$\"4\"!NJW,?j f;", "2$\"4\"!NJW,?j f;");
        Node node0 = dataNode0.previousSibling();
        assertNull(node0);
    }

    @Test(timeout = 4000)
    public void test6740() throws Throwable {
        Comment comment0 = new Comment("eQ>", " 38]~zTx$i");
        List<Node> list0 = comment0.siblingNodes();
        assertEquals(0, list0.size());
    }

    @Test(timeout = 4000)
    public void test6841() throws Throwable {
        Comment comment0 = new Comment("eQ>", "$ 3[Z~zTxi");
        XmlDeclaration xmlDeclaration0 = new XmlDeclaration("7NS %8!(", "$ 3[Z~zTxi", false);
        // Undeclared exception!
        try {
            comment0.removeChild(xmlDeclaration0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Must be true
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test6942() throws Throwable {
        Document document0 = new Document("6,FWe48IGtmGTkXj<");
        DocumentType documentType0 = new DocumentType("", "6,FWe48IGtmGTkXj<", "", "6,FWe48IGtmGTkXj<");
        // Undeclared exception!
        try {
            documentType0.replaceChild(document0, document0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Must be true
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test7043() throws Throwable {
        Document document0 = Document.createShell("TagOpen");
        document0.setParentNode(document0);
        Element element0 = document0.wrap("TagOpen");
        assertNull(element0);
    }

    @Test(timeout = 4000)
    public void test7144() throws Throwable {
        Document document0 = new Document("i:)K%Q`1L1fTx1k0l");
        document0.prependChild(document0);
        assertEquals(1, document0.childNodeSize());
    }

    @Test(timeout = 4000)
    public void test7145() throws Throwable {
        Document document0 = new Document("i:)K%Q`1L1fTx1k0l");
        document0.prependChild(document0);
        document0.after("clas");
        assertEquals(0, document0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test7246() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded(",sCr%h", ",sCr%h");
        TextNode textNode1 = TextNode.createFromEncoded(",sCr%h", ",sCr%h");
        textNode1.parentNode = (Node) textNode0;
        // Undeclared exception!
        try {
            textNode1.after(",sCr%h");
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 1, Size: 0
            //
            verifyException("java.util.ArrayList", e);
        }
    }

    @Test(timeout = 4000)
    public void test7347() throws Throwable {
        Document document0 = Document.createShell("F`R^h& qTEYfB{");
        List<Node> list0 = document0.childNodesCopy();
        assertEquals(1, list0.size());
    }

    @Test(timeout = 4000)
    public void test7448() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded("", " F,,%C3muSk&bx!K8VG");
        List<Node> list0 = textNode0.childNodesCopy();
        assertEquals(0, list0.size());
    }

    @Test(timeout = 4000)
    public void test7549() throws Throwable {
        Document document0 = Document.createShell("cB");
        String string0 = document0.absUrl("abs:declaration");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test7650() throws Throwable {
        TextNode textNode0 = new TextNode("abs:publicid", "abs:publicid");
        String string0 = textNode0.attr("abs:publicid");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test7751() throws Throwable {
        Document document0 = Document.createShell("");
        document0.removeClass("#emJ^bQ? uQNA!");
        Element element0 = document0.addClass("`");
        assertSame(element0, document0);
    }

    @Test(timeout = 4000)
    public void test7852() throws Throwable {
        XmlDeclaration xmlDeclaration0 = new XmlDeclaration("vI+", "", false);
        Attributes attributes0 = xmlDeclaration0.attributes();
        assertNotNull(attributes0);
    }

    @Test(timeout = 4000)
    public void test7953() throws Throwable {
        TextNode textNode0 = new TextNode("", "");
        // Undeclared exception!
        try {
            textNode0.replaceWith(textNode0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test8054() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded(",sCr%h", ",sCr%h");
        textNode0.outerHtml();
        assertEquals(0, textNode0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test8155() throws Throwable {
        Document document0 = Document.createShell("Xs*@5EX");
        Node node0 = document0.removeAttr("abs:systemid");
        assertEquals(0, node0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test8256() throws Throwable {
        Tag tag0 = Tag.valueOf("~b");
        Attributes attributes0 = new Attributes();
        FormElement formElement0 = new FormElement(tag0, "", attributes0);
        // Undeclared exception!
        try {
            formElement0.remove();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test8357() throws Throwable {
        Comment comment0 = new Comment("eQ>", "$ 3[Z~zTxi");
        Node[] nodeArray0 = comment0.childNodesAsArray();
        assertEquals(0, nodeArray0.length);
    }

    @Test(timeout = 4000)
    public void test8458() throws Throwable {
        Comment comment0 = new Comment("eQ>", "$ 3[Z~zTxi");
        comment0.setBaseUri("$ 3[Z~zTxi");
        assertEquals(0, comment0.childNodeSize());
    }
}
