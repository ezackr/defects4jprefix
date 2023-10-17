/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 21:24:27 GMT 2023
 */
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.regex.Pattern;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.runner.RunWith;

public class ElementTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Tag tag0 = Tag.valueOf("i5BtR6IA[g?Gz];(j#4");
        Element element0 = new Element(tag0, "");
        Elements elements0 = element0.getElementsByAttributeValueMatching(".h?T2z*^,Pl%KuX'", "");
        assertTrue(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Tag tag0 = Tag.valueOf("{sT*zNV");
        Attributes attributes0 = new Attributes();
        Element element0 = new Element(tag0, "{sT*zNV", attributes0);
        Elements elements0 = element0.getElementsByTag("~Ob6,y4V$z_5+E<<W x");
        assertTrue(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Document document0 = new Document("Z\"x%iJ&`M[0Y_* ");
        String string0 = document0.toString();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Document document0 = new Document("");
        Element element0 = document0.prependText("=OM");
        assertEquals("", element0.baseUri());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Document document0 = new Document("s+");
        Element element0 = document0.prepend("");
        assertEquals(0, element0.childNodeSize());
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Document document0 = new Document("s+");
        String string0 = document0.nodeName();
        assertEquals("#document", string0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Tag tag0 = Tag.valueOf("MqLI;\"");
        Element element0 = new Element(tag0, "MqLI;\"");
        Element element1 = element0.prependElement("MqLI;\"");
        assertEquals(0, element1.childNodeSize());
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        Tag tag0 = Tag.valueOf("MqLI;\"");
        Element element0 = new Element(tag0, "MqLI;\"");
        Element element1 = element0.prependElement("MqLI;\"");
        Element element2 = element1.after((Node) element0);
        Element element3 = element2.nextElementSibling();
        assertNotNull(element3);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        Tag tag0 = Tag.valueOf("MqLI;\"");
        Element element0 = new Element(tag0, "MqLI;\"");
        Element element1 = element0.prependElement("MqLI;\"");
        Element element2 = element1.after((Node) element0);
        Element element3 = element2.nextElementSibling();
        assertEquals(2, element3.childNodeSize());
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        Document document0 = new Document("textarea");
        LinkedHashSet<XmlDeclaration> linkedHashSet0 = new LinkedHashSet<XmlDeclaration>();
        Element element0 = document0.insertChildren((-1), linkedHashSet0);
        assertFalse(element0.isBlock());
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        Tag tag0 = Tag.valueOf("u.DPmaXvo'P");
        Attributes attributes0 = new Attributes();
        Element element0 = new Element(tag0, "yu/]", attributes0);
        String string0 = element0.id();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        Document document0 = new Document("o");
        String string0 = document0.html();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        Document document0 = new Document("kbd");
        Elements elements0 = document0.getElementsMatchingText("kbd");
        assertTrue(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        Document document0 = new Document("#-^vIDi/");
        Elements elements0 = document0.getElementsMatchingText("");
        assertFalse(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        Document document0 = new Document("#-^vIDi/");
        Pattern pattern0 = Pattern.compile("", (-1));
        Elements elements0 = document0.getElementsMatchingOwnText(pattern0);
        assertEquals(1, elements0.size());
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        Document document0 = new Document("p^X8qT");
        Element element0 = document0.appendText("p^X8qT");
        Elements elements0 = element0.getElementsContainingOwnText("p^X8qT");
        assertEquals(1, elements0.size());
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        Tag tag0 = Tag.valueOf("P>");
        Attributes attributes0 = new Attributes();
        Element element0 = new Element(tag0, "z@9R#W8%Q&dA}l\"", attributes0);
        Elements elements0 = element0.getElementsByIndexLessThan(41);
        assertEquals(1, elements0.size());
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        Document document0 = new Document("");
        Pattern pattern0 = Pattern.compile("br");
        Elements elements0 = document0.getElementsByAttributeValueMatching("=_~59Q4Y6Kv", pattern0);
        assertEquals(0, elements0.size());
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        Tag tag0 = Tag.valueOf("9");
        Element element0 = new Element(tag0, "");
        Elements elements0 = element0.getElementsByAttribute("9");
        assertEquals(0, elements0.size());
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        Document document0 = new Document("s>");
        boolean boolean0 = document0.equals("s>");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        Document document0 = new Document("@sNz]");
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        Element element0 = document0.classNames((Set<String>) linkedHashSet0);
        assertEquals(0, element0.childNodeSize());
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        Document document0 = new Document("=6+\"|M&Us4");
        String string0 = document0.className();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        Document document0 = new Document("#-^vIDi/");
        Elements elements0 = document0.children();
        assertTrue(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        Tag tag0 = Tag.valueOf("[");
        Element element0 = new Element(tag0, "[");
        Element element1 = element0.appendText("[");
        Element element2 = element1.appendElement("Children collection to be inserted must not be null.");
        assertEquals("children collection to be inserted must not be null.", element2.nodeName());
    }

    @Test(timeout = 4000)
    public void test2124() throws Throwable {
        Tag tag0 = Tag.valueOf("[");
        Element element0 = new Element(tag0, "[");
        Element element1 = element0.appendText("[");
        Element element2 = element1.appendElement("Children collection to be inserted must not be null.");
        assertEquals(1, element2.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        Document document0 = new Document("@sNz]");
        Element element0 = document0.appendElement("id");
        assertEquals("id", element0.nodeName());
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        Document document0 = new Document("#-^vIDi/");
        Document document1 = (Document) document0.addClass("");
        assertEquals(Document.QuirksMode.noQuirks, document1.quirksMode());
    }

    @Test(timeout = 4000)
    public void test2427() throws Throwable {
        Tag tag0 = Tag.valueOf("R}&RQ^\"rV");
        Element element0 = new Element(tag0, "R}&RQ^\"rV");
        // Undeclared exception!
        try {
            element0.wrap("");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // String must not be empty
        }
    }

    @Test(timeout = 4000)
    public void test2528() throws Throwable {
        Tag tag0 = Tag.valueOf("org.jsoup.select.Elements");
        Element element0 = new Element(tag0, "Object must not be null");
        // Undeclared exception!
        try {
            element0.removeClass((String) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test2629() throws Throwable {
        Tag tag0 = Tag.valueOf("pattern syntax error: ");
        Element element0 = new Element(tag0, "pattern syntax error: ");
        // Undeclared exception!
        try {
            element0.prependChild((Node) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test2730() throws Throwable {
        Document document0 = new Document("org.jsoup.nodes.Attributes$Dataset$EntrySet");
        // Undeclared exception!
        try {
            document0.prepend((String) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test2831() throws Throwable {
        Document document0 = new Document("s+");
        StringBuilder stringBuilder0 = new StringBuilder("&5f5''UE");
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        // Undeclared exception!
        try {
            document0.outerHtmlHead(stringBuilder0, (-1433506051), document_OutputSettings0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // width must be > 0
        }
    }

    @Test(timeout = 4000)
    public void test2932() throws Throwable {
        Document document0 = new Document("F>f9~V");
        // Undeclared exception!
        try {
            document0.lastElementSibling();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test3033() throws Throwable {
        Tag tag0 = Tag.valueOf("P>");
        Attributes attributes0 = new Attributes();
        Element element0 = new Element(tag0, "z@9R#W8%Q&dA}l\"", attributes0);
        // Undeclared exception!
        try {
            element0.getElementsMatchingText((Pattern) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test3134() throws Throwable {
        Document document0 = new Document("");
        // Undeclared exception!
        try {
            document0.getElementsByClass("");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // String must not be empty
        }
    }

    @Test(timeout = 4000)
    public void test3235() throws Throwable {
        Tag tag0 = Tag.valueOf("i5BtR6IA[g?Gz];(j#4");
        Element element0 = new Element(tag0, "");
        // Undeclared exception!
        try {
            element0.getElementsByAttributeValueNot("", "");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // String must not be empty
        }
    }

    @Test(timeout = 4000)
    public void test3336() throws Throwable {
        Document document0 = new Document("k0D>");
        // Undeclared exception!
        try {
            document0.getElementsByAttributeValueMatching("VW1@_W)gAFiG68", (String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test3437() throws Throwable {
        Document document0 = new Document("$");
        // Undeclared exception!
        try {
            document0.getElementsByAttributeValueMatching("%(\"jTc:_pQX^", "%(\"jTc:_pQX^");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Pattern syntax error: %(\"jTc:_pQX^
        }
    }

    @Test(timeout = 4000)
    public void test3538() throws Throwable {
        Tag tag0 = Tag.valueOf("00}nq%<");
        Element element0 = new Element(tag0, "m~");
        // Undeclared exception!
        try {
            element0.getElementsByAttributeValueEnding((String) null, (String) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // String must not be empty
        }
    }

    @Test(timeout = 4000)
    public void test3639() throws Throwable {
        Document document0 = new Document("");
        // Undeclared exception!
        try {
            document0.firstElementSibling();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test3740() throws Throwable {
        Document document0 = new Document("");
        // Undeclared exception!
        try {
            document0.classNames((Set<String>) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test3841() throws Throwable {
        Document document0 = new Document("p>");
        // Undeclared exception!
        try {
            document0.child(1);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 1, Size: 0
        }
    }

    @Test(timeout = 4000)
    public void test3942() throws Throwable {
        Document document0 = new Document("#-^vIDi/");
        // Undeclared exception!
        try {
            document0.before((Node) document0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test4043() throws Throwable {
        Tag tag0 = Tag.valueOf("}&6?W3q");
        Attributes attributes0 = new Attributes();
        Element element0 = new Element(tag0, "}&6?W3q", attributes0);
        Element element1 = element0.prependChild(element0);
        // Undeclared exception!
        try {
            element1.after((Node) element0);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 1, Size: 0
        }
    }

    @Test(timeout = 4000)
    public void test4144() throws Throwable {
        Tag tag0 = Tag.valueOf("k^$vCI(V,^=m,v\"6@");
        Attributes attributes0 = new Attributes();
        Element element0 = new Element(tag0, "k^$vCI(V,^=m,v\"6@", attributes0);
        DataNode dataNode0 = new DataNode("*W", "*W");
        // Undeclared exception!
        try {
            element0.after((Node) dataNode0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test4245() throws Throwable {
        Document document0 = new Document("");
        // Undeclared exception!
        try {
            document0.after("org.jsoup.select.Evaluator$Matches");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test4346() throws Throwable {
        Attributes attributes0 = new Attributes();
        Element element0 = null;
        try {
            element0 = new Element((Tag) null, (String) null, attributes0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test4447() throws Throwable {
        Element element0 = null;
        try {
            element0 = new Element((Tag) null, "g0*hk7HSCqb");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test4548() throws Throwable {
        Tag tag0 = Tag.valueOf("00}nq%<");
        Element element0 = new Element(tag0, "m~");
        boolean boolean0 = element0.hasClass("w9Bg@h*?}=2|L");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4649() throws Throwable {
        Tag tag0 = Tag.valueOf("}3ad\"bN(x]");
        Element element0 = new Element(tag0, "}3ad\"bN(x]");
        Set<String> set0 = element0.classNames();
        assertFalse(set0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test4750() throws Throwable {
        Document document0 = new Document("");
        boolean boolean0 = document0.hasText();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4851() throws Throwable {
        Tag tag0 = Tag.valueOf("R}&RQ^\"rV");
        Element element0 = new Element(tag0, "R}&RQ^\"rV");
        Element element1 = element0.getElementById("R}&RQ^\"rV");
        assertNull(element1);
    }

    @Test(timeout = 4000)
    public void test4952() throws Throwable {
        Document document0 = new Document("kbd");
        Integer integer0 = document0.elementSiblingIndex();
        assertEquals(0, (int) integer0);
    }

    @Test(timeout = 4000)
    public void test5053() throws Throwable {
        Document document0 = new Document("p^X8qT");
        Element element0 = document0.previousElementSibling();
        assertNull(element0);
    }

    @Test(timeout = 4000)
    public void test5154() throws Throwable {
        Document document0 = new Document("p^X8qT");
        document0.appendText("p^X8qT");
        List<TextNode> list0 = document0.textNodes();
        assertFalse(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test5255() throws Throwable {
        Document document0 = new Document("p>");
        Elements elements0 = document0.getElementsByAttributeStarting("p>");
        assertEquals(0, elements0.size());
    }

    @Test(timeout = 4000)
    public void test5356() throws Throwable {
        Document document0 = new Document("");
        Elements elements0 = document0.getElementsContainingText("=_~59Q4Y6Kv");
        assertTrue(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test5457() throws Throwable {
        Document document0 = new Document("form");
        // Undeclared exception!
        try {
            document0.getElementsByTag("");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // String must not be empty
        }
    }

    @Test(timeout = 4000)
    public void test5558() throws Throwable {
        Document document0 = new Document("form");
        Elements elements0 = document0.getElementsByAttributeValueEnding("org.jsoup.select.Collector$Accumulator", "form");
        assertEquals(0, elements0.size());
    }

    @Test(timeout = 4000)
    public void test5659() throws Throwable {
        Document document0 = new Document("");
        Elements elements0 = document0.getElementsByIndexLessThan((-1070));
        assertTrue(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test5760() throws Throwable {
        Document document0 = new Document("#-^vIDi/");
        Elements elements0 = document0.parents();
        assertEquals(0, elements0.size());
    }

    @Test(timeout = 4000)
    public void test5961() throws Throwable {
        Document document0 = new Document("p^X8qT");
        Elements elements0 = document0.getElementsContainingOwnText("p^X8qT");
        assertEquals(0, elements0.size());
    }

    @Test(timeout = 4000)
    public void test6062() throws Throwable {
        Tag tag0 = Tag.valueOf("{sT*zNV");
        Attributes attributes0 = new Attributes();
        Element element0 = new Element(tag0, "{sT*zNV", attributes0);
        Tag tag1 = element0.tag();
        assertSame(tag1, tag0);
    }

    @Test(timeout = 4000)
    public void test6163() throws Throwable {
        Tag tag0 = Tag.valueOf("[");
        Element element0 = new Element(tag0, "[");
        Element element1 = element0.clone();
        assertNotSame(element1, element0);
    }

    @Test(timeout = 4000)
    public void test6264() throws Throwable {
        Document document0 = new Document("=6+\"|M&Us4");
        Elements elements0 = document0.getElementsByAttributeValueStarting("=6+\"|M&Us4", "=6+\"|M&Us4");
        assertTrue(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test6365() throws Throwable {
        Document document0 = new Document("|W.V'qlW*S");
        // Undeclared exception!
        try {
            document0.before((String) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test6566() throws Throwable {
        Document document0 = new Document("Pattern syntax error: ");
        Element element0 = document0.prependElement("Pattern syntax error: ");
        Element element1 = element0.nextElementSibling();
        assertNull(element1);
    }

    @Test(timeout = 4000)
    public void test6667() throws Throwable {
        Tag tag0 = Tag.valueOf("00}nq%<");
        Element element0 = new Element(tag0, "m~");
        Element element1 = element0.nextElementSibling();
        assertNull(element1);
    }

    @Test(timeout = 4000)
    public void test6768() throws Throwable {
        Document document0 = new Document("p^X8qT");
        List<TextNode> list0 = document0.textNodes();
        // Undeclared exception!
        try {
            document0.insertChildren((-1535), list0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Insert position out of bounds.
        }
    }

    @Test(timeout = 4000)
    public void test6869() throws Throwable {
        Tag tag0 = Tag.valueOf("Tf?<%");
        Element element0 = new Element(tag0, "Tf?<%");
        LinkedList<Comment> linkedList0 = new LinkedList<Comment>();
        // Undeclared exception!
        try {
            element0.insertChildren(51, linkedList0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Insert position out of bounds.
        }
    }

    @Test(timeout = 4000)
    public void test6970() throws Throwable {
        Tag tag0 = Tag.valueOf("9");
        Element element0 = new Element(tag0, "");
        // Undeclared exception!
        try {
            element0.wrap("uVq7c!VhQ ");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test7071() throws Throwable {
        Document document0 = new Document("J<");
        // Undeclared exception!
        try {
            document0.normalise();
            //  fail("Expecting exception: NoSuchElementException");
            // Unstable assertion
        } catch (NoSuchElementException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test7172() throws Throwable {
        Tag tag0 = Tag.valueOf("oJf>2G,`c=WEV p");
        Element element0 = new Element(tag0, "u=XqjtMlP-[");
        // Undeclared exception!
        try {
            element0.html("oJf>2G,`c=WEV p");
            //  fail("Expecting exception: NoSuchElementException");
            // Unstable assertion
        } catch (NoSuchElementException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test7273() throws Throwable {
        // Undeclared exception!
        try {
            Document.createShell(" />");
            //  fail("Expecting exception: NoSuchElementException");
            // Unstable assertion
        } catch (NoSuchElementException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }
}
