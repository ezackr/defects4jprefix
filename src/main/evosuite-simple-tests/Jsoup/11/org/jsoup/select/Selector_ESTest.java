/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 20:38:49 GMT 2023
 */
package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Selector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Selector_ESTest extends Selector_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Tag tag0 = Tag.valueOf("DotEqual");
        Element element0 = new Element(tag0, "DotEqual");
        Elements elements0 = Selector.select("DotEqual", element0);
        Elements elements1 = Selector.select("DotEqual", (Iterable<Element>) elements0);
        assertTrue(elements1.equals((Object) elements0));
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Document document0 = Document.createShell(":matches(regex) query must not be empty");
        // Undeclared exception!
        try {
            Selector.select("k3o:.uD}B", (Element) document0);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Could not parse query 'k3o:.uD}B': unexpected token at ':.uD}B'
            //
            verifyException("org.jsoup.select.Selector", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Document document0 = Document.createShell(":matches(regex) query must not be empty");
        document0.appendChild(document0);
        // Undeclared exception!
        Selector.select(":matches(regex) query must not be empty", (Element) document0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Comparator<Element> comparator0 = (Comparator<Element>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0).when(comparator0).compare(any(org.jsoup.nodes.Element.class), any(org.jsoup.nodes.Element.class));
        TreeSet<Element> treeSet0 = new TreeSet<Element>(comparator0);
        Tag tag0 = Tag.valueOf("B^");
        Element element0 = new Element(tag0, "B^");
        Element element1 = element0.prependChild(element0);
        treeSet0.add(element1);
        // Undeclared exception!
        Selector.select("org.jsoup.select.Selector$SelectorParseException", (Iterable<Element>) treeSet0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Document document0 = Document.createShell("9");
        PriorityQueue<Element> priorityQueue0 = new PriorityQueue<Element>();
        priorityQueue0.add(document0);
        // Undeclared exception!
        try {
            Selector.select(",", (Iterable<Element>) priorityQueue0);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Unknown combinator: ,
            //
            verifyException("org.jsoup.select.Selector", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Document document0 = Document.createShell("");
        Elements elements0 = document0.getElementsByAttributeValueMatching("", "");
        // Undeclared exception!
        try {
            Selector.select("", (Iterable<Element>) elements0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // String must not be empty
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Document document0 = Document.createShell("#document");
        Elements elements0 = Selector.select("#document", (Element) document0);
        assertEquals(0, elements0.size());
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Selector.SelectorParseException selector_SelectorParseException0 = new Selector.SelectorParseException("a E!VIPqv^n? *", (Object[]) null);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Document document0 = new Document("a E!VIPqv^n? *");
        Elements elements0 = Selector.select("DI+9", (Element) document0);
        assertTrue(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Document document0 = Document.createShell("~NJ|Fun");
        Elements elements0 = Selector.select("~NJ|Fun", (Element) document0);
        assertEquals(0, elements0.size());
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Document document0 = Document.createShell(":matchesOwn(");
        // Undeclared exception!
        try {
            Selector.select(":matchesOwn(", (Element) document0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // :matches(regex) query must not be empty
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Document document0 = Document.createShell(":matches(regex) query must not be empty");
        Elements elements0 = Selector.select(":matches(regex) query must not be empty", (Element) document0);
        assertTrue(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Document document0 = Document.createShell("9");
        Elements elements0 = Selector.select(":contains(text) query must not be empty", (Element) document0);
        assertEquals(0, elements0.size());
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Stack<Element> stack0 = new Stack<Element>();
        Tag tag0 = Tag.valueOf("G[;'e\"9(GQMW*");
        Attributes attributes0 = new Attributes();
        Element element0 = new Element(tag0, "", attributes0);
        stack0.add(element0);
        Elements elements0 = Selector.select("q~KnljVP6[2_:vBJ_", (Iterable<Element>) stack0);
        assertTrue(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Document document0 = new Document("7>O.?=f~#_ ?g");
        Elements elements0 = Selector.select("7>O.?=f~#_ ?g", (Element) document0);
        assertTrue(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Document document0 = Document.createShell(":contains(text) query must not be empty");
        // Undeclared exception!
        try {
            Selector.select(",", (Element) document0);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Unknown combinator: ,
            //
            verifyException("org.jsoup.select.Selector", e);
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Document document0 = Document.createShell("");
        // Undeclared exception!
        try {
            Selector.select(":gt(", (Element) document0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Index must be numeric
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Document document0 = new Document(":lt(");
        // Undeclared exception!
        try {
            Selector.select(":lt(", (Element) document0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Index must be numeric
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Document document0 = Document.createShell(";p%NHpo40W+k;$J4L");
        Elements elements0 = Selector.select(":has(el) subselect must not be empty", (Element) document0);
        assertEquals(0, elements0.size());
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Document document0 = Document.createShell("#document");
        Elements elements0 = Selector.select("e-*4,Zz", (Element) document0);
        assertEquals(0, elements0.size());
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Document document0 = Document.createShell("k[z3~.y6V@Ai4");
        // Undeclared exception!
        try {
            Selector.select(":eq(", (Element) document0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Index must be numeric
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        Comparator<Element> comparator0 = (Comparator<Element>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        doReturn(0).when(comparator0).compare(any(org.jsoup.nodes.Element.class), any(org.jsoup.nodes.Element.class));
        TreeSet<Element> treeSet0 = new TreeSet<Element>(comparator0);
        Tag tag0 = Tag.valueOf("B^");
        Element element0 = new Element(tag0, "B^");
        treeSet0.add(element0);
        // Undeclared exception!
        try {
            Selector.select("org.jsoup.select.Selector$SelectorParseException", (Iterable<Element>) treeSet0);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Could not parse query 'org.jsoup.select.Selector$SelectorParseException': unexpected token at '$SelectorParseException'
            //
            verifyException("org.jsoup.select.Selector", e);
        }
    }
}
