/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 20:57:33 GMT 2023
 */
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
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
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.runner.RunWith;

public class ElementTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        StringBuilder stringBuilder0 = new StringBuilder(0);
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Document document0 = new Document("NlK&=alfR,Eu90~w`");
        document0.outerHtmlTail(stringBuilder0, 10849, document_OutputSettings0);
        assertEquals("</#root>", stringBuilder0.toString());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Document document0 = new Document("");
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
    public void test022() throws Throwable {
        Document document0 = new Document("hr");
        String string0 = document0.toString();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Tag tag0 = Tag.valueOf("SPa");
        Element element0 = new Element(tag0, "tcaron");
        Tag tag1 = element0.tag();
        assertFalse(tag1.isKnownTag());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Tag tag0 = Tag.valueOf("QBne%]Q1w/%wI");
        TextNode textNode0 = new TextNode("QBne%]Q1w/%wI", "org.jsoup.nodes.Element");
        Attributes attributes0 = textNode0.attributes();
        Element element0 = new Element(tag0, "easter", attributes0);
        Element element1 = element0.prependText("QBne%]Q1w/%wI");
        String string0 = element1.ownText();
        assertEquals("QBne%]Q1w/%wI", string0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Document document0 = new Document("");
        String string0 = document0.nodeName();
        assertEquals("#document", string0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Tag tag0 = Tag.valueOf("trie");
        Attributes attributes0 = new Attributes();
        Element element0 = new Element(tag0, "", attributes0);
        Pattern pattern0 = Pattern.compile("-MNp3|VL]w<4^Fa");
        Elements elements0 = element0.getElementsMatchingText(pattern0);
        assertTrue(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Tag tag0 = Tag.valueOf("iukcy");
        Element element0 = new Element(tag0, "iukcy");
        Elements elements0 = element0.getElementsByTag("iukcy");
        assertEquals(1, elements0.size());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Tag tag0 = Tag.valueOf("SPa");
        Element element0 = new Element(tag0, "tcaron");
        Elements elements0 = element0.getElementsByAttributeValueMatching("m(@Tjv9`O/D'X?W*2", "id");
        assertTrue(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Document document0 = new Document("RightUpDownVector");
        Elements elements0 = document0.getElementsByAttributeValueContaining("3m", "RightUpDownVector");
        assertTrue(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Document document0 = new Document("|aZ`V;I`3");
        Element element0 = document0.getElementById("|aZ`V;I`3");
        assertNull(element0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Document document0 = new Document("acJyiG+${/");
        Elements elements0 = document0.children();
        assertEquals(0, elements0.size());
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Document document0 = new Document("HkC6OCWU");
        Element element0 = document0.appendElement("%>FX");
        Element element1 = element0.before((Node) document0);
        assertEquals("%>fx", element1.tagName());
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Tag tag0 = Tag.valueOf("8gl1S!s?i");
        Element element0 = new Element(tag0, "Z^Y`Y1goLE");
        Element element1 = element0.addClass("`!R66H]E90u[CgnQa");
        assertEquals("8gl1s!s?i", element1.nodeName());
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Document document0 = new Document(",\u0000Twq9");
        // Undeclared exception!
        try {
            document0.text("org.jsoup.nodes.Element");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Document document0 = new Document("");
        // Undeclared exception!
        try {
            document0.tagName((String) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Tag name must not be empty.
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Tag tag0 = Tag.valueOf("DEWkIMR");
        Element element0 = new Element(tag0, "DEWkIMR");
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
    public void test1717() throws Throwable {
        Document document0 = new Document("hr");
        // Undeclared exception!
        try {
            document0.nextElementSibling();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Tag tag0 = Tag.valueOf("8gl1S!s?i");
        Element element0 = new Element(tag0, "Z^Y`Y1goLE");
        // Undeclared exception!
        try {
            element0.lastElementSibling();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Document document0 = new Document("[%s=%s]");
        // Undeclared exception!
        try {
            document0.getElementsMatchingText("{P0ES?W,BkbuJ");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Pattern syntax error: {P0ES?W,BkbuJ
        }
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Document document0 = new Document("+j'&di~O|dH4_/)");
        // Undeclared exception!
        try {
            document0.getElementsByAttribute("");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // String must not be empty
        }
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        Document document0 = new Document("");
        // Undeclared exception!
        try {
            document0.getElementById("");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // String must not be empty
        }
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        Document document0 = new Document("%5VgL$X(0`T=riA");
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
    public void test2323() throws Throwable {
        Tag tag0 = Tag.valueOf("\"tMl%(\"jTc:_pQX^");
        Element element0 = new Element(tag0, "\"tMl%(\"jTc:_pQX^");
        // Undeclared exception!
        try {
            element0.before("\"tMl%(\"jTc:_pQX^");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        Document document0 = new Document("imagpart");
        // Undeclared exception!
        try {
            document0.appendChild((Node) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        Document document0 = new Document("COPY");
        document0.appendChild(document0);
        // Undeclared exception!
        try {
            document0.after((Node) document0);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 1, Size: 0
        }
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        Document document0 = new Document("KbT{e>Uq\"Zzv4T*tb");
        Comment comment0 = new Comment("#+/t~.lg\r_d", "ve Or/]@");
        // Undeclared exception!
        try {
            document0.after((Node) comment0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        Attributes attributes0 = new Attributes();
        Element element0 = null;
        try {
            element0 = new Element((Tag) null, ")QPdA'", attributes0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        Element element0 = null;
        try {
            element0 = new Element((Tag) null, "NotLeftTriangleEqual");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        Document document0 = new Document("");
        Element element0 = document0.val("#document");
        assertFalse(element0.isBlock());
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        Document document0 = new Document("");
        Element element0 = document0.toggleClass("\",>tv)7");
        assertEquals("", element0.baseUri());
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        Document document0 = new Document("");
        boolean boolean0 = document0.hasClass("");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        Document document0 = new Document("RightUpDownVector");
        Element element0 = document0.prependText("DiacriticalAcute");
        String string0 = element0.data();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        Document document0 = new Document("");
        List<DataNode> list0 = document0.dataNodes();
        assertEquals(0, list0.size());
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        Tag tag0 = Tag.valueOf("textarea");
        Attributes attributes0 = new Attributes();
        Element element0 = new Element(tag0, "", attributes0);
        Element element1 = element0.appendText("uring");
        List<TextNode> list0 = element1.textNodes();
        assertEquals(1, list0.size());
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        Document document0 = new Document("KbT{e>Uq\"Zzv4T*tb");
        Elements elements0 = document0.getElementsByAttribute("KbT{e>Uq\"Zzv4T*tb");
        assertTrue(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test3636() throws Throwable {
        Document document0 = new Document("");
        Element element0 = document0.empty();
        assertEquals(0, element0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test3737() throws Throwable {
        Document document0 = new Document("G3");
        Elements elements0 = document0.getElementsByIndexGreaterThan(1);
        assertTrue(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test3838() throws Throwable {
        Document document0 = new Document("RightUpDownVector");
        Elements elements0 = document0.getElementsByTag("mlxp(z");
        assertEquals(0, elements0.size());
    }

    @Test(timeout = 4000)
    public void test3939() throws Throwable {
        Document document0 = new Document("");
        Element element0 = document0.prependElement("ac");
        assertFalse(element0.isBlock());
    }

    @Test(timeout = 4000)
    public void test4040() throws Throwable {
        Document document0 = new Document("");
        Set<String> set0 = document0.classNames();
        Element element0 = document0.classNames(set0);
        assertFalse(element0.isBlock());
    }

    @Test(timeout = 4000)
    public void test4141() throws Throwable {
        Document document0 = new Document("");
        Element element0 = document0.removeClass("");
        assertEquals(0, element0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test4242() throws Throwable {
        Document document0 = new Document("RightUpDownVector");
        String string0 = document0.className();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test4343() throws Throwable {
        Document document0 = new Document("RightUpDownVector");
        Elements elements0 = document0.getElementsContainingOwnText("input");
        assertEquals(0, elements0.size());
    }

    @Test(timeout = 4000)
    public void test4444() throws Throwable {
        Document document0 = new Document("");
        Pattern pattern0 = Pattern.compile("#document", (-2900));
        Elements elements0 = document0.getElementsByAttributeValueMatching("", pattern0);
        assertEquals(0, elements0.size());
    }

    @Test(timeout = 4000)
    public void test4545() throws Throwable {
        Document document0 = new Document("HkC6OCWU");
        Elements elements0 = document0.getElementsMatchingText("%>FX");
        assertTrue(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test4646() throws Throwable {
        Document document0 = new Document("RightUpDownVector");
        Element element0 = document0.createElement("iLhVU");
        Element element1 = element0.clone();
        assertNotSame(element1, element0);
    }

    @Test(timeout = 4000)
    public void test4747() throws Throwable {
        Document document0 = new Document("");
        Elements elements0 = document0.getElementsByAttributeValueStarting("XfQvW;Fyaqx/i", "xH7\"*fp{k4YO)#");
        assertTrue(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test4848() throws Throwable {
        Document document0 = new Document("+j'&di~O|dH4_/)");
        boolean boolean0 = document0.isBlock();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4949() throws Throwable {
        Document document0 = new Document("");
        Elements elements0 = document0.getElementsByAttributeValueNot("tI9", "textarea");
        assertFalse(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test5050() throws Throwable {
        Document document0 = new Document("");
        Elements elements0 = document0.getElementsByIndexLessThan(834);
        assertEquals(1, elements0.size());
    }

    @Test(timeout = 4000)
    public void test5151() throws Throwable {
        Tag tag0 = Tag.valueOf("q|07W5");
        Attributes attributes0 = new Attributes();
        Element element0 = new Element(tag0, "q", attributes0);
        // Undeclared exception!
        try {
            element0.after("hmE01+LQDQlWRGp");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test5252() throws Throwable {
        Document document0 = new Document("");
        Element element0 = document0.toggleClass("");
        Set<String> set0 = element0.classNames();
        assertFalse(set0.contains(""));
    }

    @Test(timeout = 4000)
    public void test5353() throws Throwable {
        Tag tag0 = Tag.valueOf("s+");
        Element element0 = new Element(tag0, "DBGVp~r^g");
        boolean boolean0 = element0.hasClass("DBGVp~r^g");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test5454() throws Throwable {
        Tag tag0 = Tag.valueOf("vr}Hm%r0rXZ8h.m7{");
        Element element0 = new Element(tag0, "vr}Hm%r0rXZ8h.m7{");
        // Undeclared exception!
        try {
            element0.wrap("n[K<x<t(FQREdV%aa$l");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test5555() throws Throwable {
        Document document0 = new Document("G3");
        Element element0 = document0.prepend("");
        assertFalse(element0.isBlock());
    }

    @Test(timeout = 4000)
    public void test5656() throws Throwable {
        Document document0 = new Document("G3");
        // Undeclared exception!
        try {
            document0.addClass((String) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test5757() throws Throwable {
        Document document0 = new Document("");
        // Undeclared exception!
        try {
            document0.child(0);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
        }
    }

    @Test(timeout = 4000)
    public void test5858() throws Throwable {
        // Undeclared exception!
        try {
            Document.createShell("");
            //  fail("Expecting exception: NoSuchElementException");
            // Unstable assertion
        } catch (NoSuchElementException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }
}
