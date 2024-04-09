/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 11:01:36 GMT 2024
 */
package org.apache.commons.jxpath.ri.model.jdom;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jdom.Element;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class JDOMAttributeIterator_ESTest extends JDOMAttributeIterator_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Locale locale0 = Locale.JAPAN;
        NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
        JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, (QName) null);
        int int0 = jDOMAttributeIterator0.getPosition();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Locale locale0 = Locale.CHINESE;
        Element element0 = new Element("rhbkO", "rhbkO", "rhbkO");
        QName qName0 = new QName("rhbkO");
        NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, element0, locale0);
        JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, qName0);
        boolean boolean0 = jDOMAttributeIterator0.setPosition(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, jDOMAttributeIterator0.getPosition());
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        Locale locale0 = Locale.CHINESE;
        Element element0 = new Element("rhbkO", "rhbkO", "rhbkO");
        QName qName0 = new QName("rhbkO");
        NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, element0, locale0);
        JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, qName0);
        boolean boolean0 = jDOMAttributeIterator0.setPosition(Integer.MIN_VALUE);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        Locale locale0 = Locale.JAPANESE;
        Element element0 = new Element("xml");
        QName qName0 = new QName("xml", "xml");
        NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, element0, locale0);
        JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, qName0);
        assertEquals(0, jDOMAttributeIterator0.getPosition());
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        Locale locale0 = Locale.CHINESE;
        Element element0 = new Element("rhbkO", "rhbkO");
        QName qName0 = new QName("rhbkO", "rhbkO");
        NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, element0, locale0);
        JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, qName0);
        assertEquals(0, jDOMAttributeIterator0.getPosition());
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        Locale locale0 = Locale.CHINA;
        Element element0 = new Element("rhbkO");
        NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, element0, locale0);
        QName qName0 = new QName("rhbkO");
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
        NodePointer nodePointer1 = nodePointer0.createAttribute(jXPathContext0, qName0);
        assertEquals(Integer.MIN_VALUE, nodePointer1.getIndex());
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        Locale locale0 = Locale.US;
        Element element0 = new Element("E0O", "E0O");
        NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, element0, locale0);
        element0.setAttribute("E0O", "<<unknown namespace>>");
        QName qName0 = new QName(":*");
        JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, qName0);
        assertEquals(0, jDOMAttributeIterator0.getPosition());
    }

    @Test(timeout = 4000)
    public void test67() throws Throwable {
        Locale locale0 = Locale.US;
        Element element0 = new Element("E0O", "E0O");
        NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, element0, locale0);
        element0.setAttribute("E0O", "<<unknown namespace>>");
        QName qName0 = new QName("*");
        JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, qName0);
        assertEquals(0, jDOMAttributeIterator0.getPosition());
    }

    @Test(timeout = 4000)
    public void test78() throws Throwable {
        Locale locale0 = Locale.US;
        Element element0 = new Element("E0O", "E0O");
        NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, element0, locale0);
        QName qName0 = new QName("E0O");
        JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, qName0);
        assertEquals(0, jDOMAttributeIterator0.getPosition());
    }

    @Test(timeout = 4000)
    public void test79() throws Throwable {
        Locale locale0 = Locale.US;
        Element element0 = new Element("E0O", "E0O");
        NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, element0, locale0);
        QName qName0 = new QName("E0O");
        JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, qName0);
        jDOMAttributeIterator0.getNodePointer();
        assertEquals(1, jDOMAttributeIterator0.getPosition());
    }

    @Test(timeout = 4000)
    public void test810() throws Throwable {
        Locale locale0 = Locale.US;
        Element element0 = new Element("E0O", "E0O");
        NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, element0, locale0);
        element0.setAttribute("E0O", "<<unknown namespace>>");
        QName qName0 = new QName("E0O");
        JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, qName0);
        NodePointer nodePointer1 = jDOMAttributeIterator0.getNodePointer();
        assertNotNull(nodePointer1);
    }

    @Test(timeout = 4000)
    public void test811() throws Throwable {
        Locale locale0 = Locale.US;
        Element element0 = new Element("E0O", "E0O");
        NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, element0, locale0);
        element0.setAttribute("E0O", "<<unknown namespace>>");
        QName qName0 = new QName("E0O");
        JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, qName0);
        NodePointer nodePointer1 = jDOMAttributeIterator0.getNodePointer();
        assertEquals(0, jDOMAttributeIterator0.getPosition());
    }

    @Test(timeout = 4000)
    public void test912() throws Throwable {
        Locale locale0 = Locale.ROOT;
        NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
        JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, (QName) null);
        NodePointer nodePointer1 = jDOMAttributeIterator0.getNodePointer();
        assertNull(nodePointer1);
    }
}
