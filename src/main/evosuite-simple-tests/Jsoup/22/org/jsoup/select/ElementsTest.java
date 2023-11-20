/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 05:34:55 GMT 2023
 */
package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeVisitor;
import org.junit.runner.RunWith;

public class ElementsTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        String[] stringArray0 = new String[0];
        // Undeclared exception!
        try {
            elements0.toArray(stringArray0);
            fail("Expecting exception: ArrayStoreException");
        } catch (ArrayStoreException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Element[] elementArray0 = new Element[0];
        Elements elements0 = new Elements(elementArray0);
        // Undeclared exception!
        try {
            elements0.remove(61);
            fail("Expecting exception: UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals((-510));
        LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
        boolean boolean0 = elements0.removeAll(linkedHashSet0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Document document0 = new Document("0G-A!x@ol");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        elements0.add(1, (Element) document0);
        assertEquals(0, document0.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Tag tag0 = Tag.valueOf("w");
        Element element0 = new Element(tag0, "div");
        Elements elements0 = element0.getAllElements();
        UnaryOperator<Element> unaryOperator0 = UnaryOperator.identity();
        boolean boolean0 = elements0.equals(unaryOperator0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Document document0 = Document.createShell("n4lT/^x");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        // Undeclared exception!
        try {
            elements0.listIterator((-2302));
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: -2302
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        boolean boolean0 = elements0.remove((Object) document0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        Elements elements1 = elements0.parents();
        assertFalse(elements1.isEmpty());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        elements0.clear();
        assertEquals(0, elements0.size());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        int int0 = elements0.indexOf(document0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Document document0 = new Document("0G-A!x@ol");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        int int0 = elements0.lastIndexOf("0G-A!x@ol");
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Document document0 = Document.createShell(" ");
        Elements elements0 = document0.getElementsByAttributeValue("r2XR!Z;Hi~d<1vDg?0?", "`/KB`");
        Elements elements1 = elements0.not("`/KB`");
        assertEquals(0, elements1.size());
    }

    @Test(timeout = 4000)
    public void test1312() throws Throwable {
        Document document0 = new Document("0G-A!x@ol");
        Elements elements0 = document0.getElementsByIndexEquals(3);
        String string0 = elements0.toString();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1413() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        boolean boolean0 = elements0.addAll(0, (Collection<? extends Element>) elements0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1514() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3{z");
        Elements elements0 = document0.getElementsByIndexEquals((-1615));
        ListIterator<Element> listIterator0 = elements0.listIterator();
        assertFalse(listIterator0.hasNext());
    }

    @Test(timeout = 4000)
    public void test1615() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        List<Element> list0 = elements0.subList(0, 0);
        assertTrue(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test1716() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        boolean boolean0 = elements0.addAll((Collection<? extends Element>) elements0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1817() throws Throwable {
        Tag tag0 = Tag.valueOf("w");
        Element element0 = new Element(tag0, "div");
        Elements elements0 = element0.getAllElements();
        boolean boolean0 = elements0.is("w");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1918() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexLessThan(923);
        // Undeclared exception!
        try {
            elements0.set(923, (Element) document0);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 923, Size: 4
        }
    }

    @Test(timeout = 4000)
    public void test2019() throws Throwable {
        Tag tag0 = Tag.valueOf("w");
        Element element0 = new Element(tag0, "div");
        Elements elements0 = element0.getAllElements();
        boolean boolean0 = elements0.retainAll(elements0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2120() throws Throwable {
        Document document0 = new Document("0G-A!x@ol");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        String string0 = elements0.attr("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test2221() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        document0.attr("T]bUjnNE,o[*.xh3", "Rp!\"hV(`sa ");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        String string0 = elements0.attr("T]bUjnNE,o[*.xh3");
        assertEquals("Rp!\"hV(`sa ", string0);
    }

    @Test(timeout = 4000)
    public void test2322() throws Throwable {
        Document document0 = new Document("0G-A!x@ol");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        boolean boolean0 = elements0.hasAttr("");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2423() throws Throwable {
        Document document0 = Document.createShell("N");
        document0.attr("N", "N");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        boolean boolean0 = elements0.hasAttr("N");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2524() throws Throwable {
        Document document0 = Document.createShell("w");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        Elements elements1 = elements0.attr("w", "boxHd");
        assertEquals(3, elements1.size());
    }

    @Test(timeout = 4000)
    public void test2625() throws Throwable {
        Elements elements0 = new Elements();
        Elements elements1 = elements0.removeAttr("w");
        assertSame(elements1, elements0);
    }

    @Test(timeout = 4000)
    public void test2726() throws Throwable {
        Document document0 = Document.createShell("\n");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        // Undeclared exception!
        try {
            elements0.removeAttr((String) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test2827() throws Throwable {
        Document document0 = Document.createShell("n4lT/^x");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        Elements elements1 = elements0.addClass("n4lT/^x");
        assertEquals(3, elements1.size());
    }

    @Test(timeout = 4000)
    public void test2928() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        Elements elements1 = elements0.removeClass("k^R{f*!ws4rlD");
        assertEquals(3, elements1.size());
    }

    @Test(timeout = 4000)
    public void test3029() throws Throwable {
        Tag tag0 = Tag.valueOf("w");
        Element element0 = new Element(tag0, "div");
        Elements elements0 = element0.getAllElements();
        Elements elements1 = elements0.toggleClass("div");
        assertFalse(elements1.isEmpty());
    }

    @Test(timeout = 4000)
    public void test3130() throws Throwable {
        Document document0 = new Document("0G-A!x@ol");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        boolean boolean0 = elements0.hasClass("0G-A!x@ol");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3231() throws Throwable {
        Document document0 = Document.createShell("T]bUjnDNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        boolean boolean0 = elements0.hasClass("");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3332() throws Throwable {
        Document document0 = new Document("w");
        Elements elements0 = document0.getElementsByClass("div");
        String string0 = elements0.val();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test3433() throws Throwable {
        Document document0 = new Document("0G-A!x@ol");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        String string0 = elements0.val();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test3534() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        Elements elements1 = elements0.val("'DgO6![}VK]5#a-w:_");
        assertFalse(elements1.isEmpty());
    }

    @Test(timeout = 4000)
    public void test3635() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        Elements elements1 = elements0.append("T]bUjnNE,o[*.xh3");
        String string0 = elements1.text();
        assertEquals("T]bUjnNE,o[*.xh3 T]bUjnNE,o[*.xh3T]bUjnNE,o[*.xh3 T]bUjnNE,o[*.xh3 T]bUjnNE,o[*.xh3 T]bUjnNE,o[*.xh3", string0);
    }

    @Test(timeout = 4000)
    public void test3736() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        boolean boolean0 = elements0.hasText();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3837() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        elements0.html("@0umsm_P");
        boolean boolean0 = elements0.hasText();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3938() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        String string0 = elements0.html();
        assertEquals("<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>\n", string0);
    }

    @Test(timeout = 4000)
    public void test4039() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        String string0 = elements0.outerHtml();
        assertEquals("<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>", string0);
    }

    @Test(timeout = 4000)
    public void test4140() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        Elements elements1 = elements0.tagName("'DgO6![}VK]5#a-w:_");
        assertSame(elements0, elements1);
    }

    @Test(timeout = 4000)
    public void test4241() throws Throwable {
        Document document0 = Document.createShell("N");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        Elements elements1 = elements0.prepend("4OGvEnqCUS19|hlSy7");
        assertEquals(3, elements1.size());
    }

    @Test(timeout = 4000)
    public void test4342() throws Throwable {
        Elements elements0 = new Elements();
        Elements elements1 = elements0.before("");
        assertEquals(0, elements1.size());
    }

    @Test(timeout = 4000)
    public void test4443() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        // Undeclared exception!
        try {
            elements0.before("T]bUjnNE,o[*.xh3");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test4544() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsMatchingText("G]s49A7");
        Elements elements1 = elements0.after("T]bUjnNE,o[*.xh3");
        assertSame(elements1, elements0);
    }

    @Test(timeout = 4000)
    public void test4645() throws Throwable {
        Document document0 = new Document("-g0+epi,;G,");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        // Undeclared exception!
        try {
            elements0.after("-g0+epi,;G,");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test4746() throws Throwable {
        Document document0 = new Document("T]bUnE,o[*.xh");
        Elements elements0 = document0.getElementsContainingText("precapprox");
        Elements elements1 = elements0.wrap("T]bUnE,o[*.xh");
        assertEquals(0, elements1.size());
    }

    @Test(timeout = 4000)
    public void test4847() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        // Undeclared exception!
        try {
            elements0.wrap("T]bUjnNE,o[*.xh3");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test4948() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsMatchingText("\n");
        Elements elements1 = elements0.unwrap();
        assertTrue(elements1.isEmpty());
    }

    @Test(timeout = 4000)
    public void test5049() throws Throwable {
        Document document0 = Document.createShell("");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        // Undeclared exception!
        try {
            elements0.unwrap();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test5150() throws Throwable {
        Document document0 = new Document("0G-A!x@ol");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        Elements elements1 = elements0.empty();
        assertSame(elements0, elements1);
    }

    @Test(timeout = 4000)
    public void test5251() throws Throwable {
        Elements elements0 = new Elements();
        Elements elements1 = elements0.remove();
        assertEquals(0, elements1.size());
    }

    @Test(timeout = 4000)
    public void test5352() throws Throwable {
        Document document0 = Document.createShell("w");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        // Undeclared exception!
        try {
            elements0.remove();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test5453() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsContainingText("T]bUjnNE,o[*.xh3");
        Elements elements1 = elements0.eq(1);
        assertEquals(0, elements1.size());
    }

    @Test(timeout = 4000)
    public void test5554() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        Elements elements1 = elements0.eq(0);
        assertEquals(1, elements1.size());
    }

    @Test(timeout = 4000)
    public void test5655() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsMatchingText("\n");
        boolean boolean0 = elements0.is("\n");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test5756() throws Throwable {
        Document document0 = Document.createShell("h$G@H!&{`(r");
        Elements elements0 = document0.getElementsByAttributeValueContaining("'I\"Bbb]/YzOf9", "'I\"Bbb]/YzOf9");
        Element element0 = elements0.first();
        assertNull(element0);
    }

    @Test(timeout = 4000)
    public void test5857() throws Throwable {
        Document document0 = new Document("0G-A!x@ol");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        Element element0 = elements0.last();
        assertFalse(element0.isBlock());
    }

    @Test(timeout = 4000)
    public void test5958() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(878);
        Element element0 = elements0.last();
        assertNull(element0);
    }

    @Test(timeout = 4000)
    public void test6059() throws Throwable {
        Document document0 = Document.createShell("T]bUjnNE,o[*.xh3");
        Elements elements0 = document0.getElementsByIndexEquals(0);
        NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
        Elements elements1 = elements0.traverse(nodeVisitor0);
        assertSame(elements1, elements0);
    }

    @Test(timeout = 4000)
    public void test6160() throws Throwable {
        Tag tag0 = Tag.valueOf("w");
        Element element0 = new Element(tag0, "div");
        Elements elements0 = element0.getAllElements();
        Elements elements1 = elements0.clone();
        boolean boolean0 = elements1.retainAll(elements0);
        assertEquals(0, elements1.size());
    }

    @Test(timeout = 4000)
    public void test6161() throws Throwable {
        Tag tag0 = Tag.valueOf("w");
        Element element0 = new Element(tag0, "div");
        Elements elements0 = element0.getAllElements();
        Elements elements1 = elements0.clone();
        boolean boolean0 = elements1.retainAll(elements0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test6262() throws Throwable {
        Document document0 = new Document("[Euail03_c535m!");
        Elements elements0 = document0.getAllElements();
        LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
        Integer integer0 = new Integer((-2785));
        linkedHashSet0.add(integer0);
        boolean boolean0 = elements0.containsAll(linkedHashSet0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test6363() throws Throwable {
        Tag tag0 = Tag.valueOf("w");
        Element element0 = new Element(tag0, "div");
        Elements elements0 = element0.getAllElements();
        boolean boolean0 = elements0.containsAll(elements0);
        assertTrue(boolean0);
    }
}
