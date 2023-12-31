/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 21:39:42 GMT 2023
 */
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.Connection;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class FormElement_ESTest extends FormElement_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Tag tag0 = Tag.valueOf("http:/");
        Attributes attributes0 = new Attributes();
        FormElement formElement0 = new FormElement(tag0, "http:/", attributes0);
        Connection connection0 = formElement0.submit();
        assertNotNull(connection0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Tag tag0 = Tag.valueOf("Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
        TextNode textNode0 = TextNode.createFromEncoded(")aD/-", ")aD/-");
        Attributes attributes0 = textNode0.attributes();
        FormElement formElement0 = new FormElement(tag0, "-^vMGVN['dp[8", attributes0);
        boolean boolean0 = formElement0.equals(formElement0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Tag tag0 = Tag.valueOf("#af<!=,@-");
        Attributes attributes0 = new Attributes();
        FormElement formElement0 = new FormElement(tag0, "#af<!=,@-", attributes0);
        FormElement formElement1 = formElement0.addElement(formElement0);
        Elements elements0 = formElement1.elements();
        assertFalse(elements0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Tag tag0 = Tag.valueOf("#af<!=,@-");
        Attributes attributes0 = new Attributes();
        FormElement formElement0 = new FormElement(tag0, "#af<!=,@-", attributes0);
        FormElement formElement1 = (FormElement) formElement0.append("#af<!=,@-");
        Node[] nodeArray0 = new Node[1];
        nodeArray0[0] = (Node) formElement1;
        formElement1.addChildren(nodeArray0);
        FormElement formElement2 = formElement0.addElement(formElement1);
        assertSame(formElement0, formElement2);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Tag tag0 = Tag.valueOf("select");
        TextNode textNode0 = new TextNode("", "checked");
        Attributes attributes0 = textNode0.attributes();
        FormElement formElement0 = new FormElement(tag0, "checked", attributes0);
        Document document0 = new Document("select");
        formElement0.setSiblingIndex((-1));
        FormElement formElement1 = formElement0.addElement(document0);
        assertFalse(formElement1.isBlock());
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Tag tag0 = Tag.valueOf("aside");
        TextNode textNode0 = TextNode.createFromEncoded("Twzz%y<+s,,Q)F/'-[", "aside");
        Attributes attributes0 = textNode0.attributes();
        FormElement formElement0 = new FormElement(tag0, "aside", attributes0);
        Document document0 = new Document("Twzz%y<+s,,Q)F/'-[");
        FormElement formElement1 = formElement0.addElement(document0);
        assertEquals(0, formElement1.siblingIndex());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Tag tag0 = Tag.valueOf("tHS B Z'&;V0%");
        FormElement formElement0 = null;
        try {
            formElement0 = new FormElement(tag0, "tHS B Z'&;V0%", (Attributes) null);
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
        Tag tag0 = Tag.valueOf("selecT");
        Attributes attributes0 = new Attributes();
        FormElement formElement0 = new FormElement(tag0, "selecT", attributes0);
        FormElement formElement1 = formElement0.addElement(formElement0);
        List<Connection.KeyVal> list0 = formElement1.formData();
        assertTrue(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Tag tag0 = Tag.valueOf("POST");
        Attributes attributes0 = new Attributes();
        FormElement formElement0 = new FormElement(tag0, "POST", attributes0);
        FormElement formElement1 = formElement0.addElement(formElement0);
        List<Connection.KeyVal> list0 = formElement1.formData();
        assertEquals(0, list0.size());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Tag tag0 = Tag.valueOf("POST");
        Attributes attributes0 = new Attributes();
        FormElement formElement0 = new FormElement(tag0, "POST", attributes0);
        Attribute attribute0 = new Attribute("METHOD", "POST");
        attributes0.put(attribute0);
        // Undeclared exception!
        try {
            formElement0.submit();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Malformed URL: POST
            //
            verifyException("org.jsoup.helper.HttpConnection", e);
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = Attribute.createFromEncoded("action", "action");
        attributes0.put(attribute0);
        Tag tag0 = Tag.valueOf("action");
        FormElement formElement0 = new FormElement(tag0, "action", attributes0);
        // Undeclared exception!
        try {
            formElement0.submit();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Could not determine a form action URL for submit. Ensure you set a base URI when parsing.
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Tag tag0 = Tag.valueOf("selecT");
        Attributes attributes0 = new Attributes();
        FormElement formElement0 = new FormElement(tag0, "selecT", attributes0);
        Object object0 = new Object();
        boolean boolean0 = formElement0.equals(object0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Tag tag0 = Tag.valueOf("selecT");
        Attributes attributes0 = new Attributes();
        FormElement formElement0 = new FormElement(tag0, "selecT", attributes0);
        Elements elements0 = formElement0.elements();
        assertEquals(0, elements0.size());
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Tag tag0 = Tag.valueOf("8");
        TextNode textNode0 = TextNode.createFromEncoded("8", "8");
        Attributes attributes0 = textNode0.attributes();
        FormElement formElement0 = new FormElement(tag0, "8", attributes0);
        formElement0.addElement((Element) null);
        // Undeclared exception!
        try {
            formElement0.formData();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.nodes.FormElement", e);
        }
    }
}
