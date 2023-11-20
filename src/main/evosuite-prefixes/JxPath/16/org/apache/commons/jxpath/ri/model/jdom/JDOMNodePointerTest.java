/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 07:34:15 GMT 2023
 */
package org.apache.commons.jxpath.ri.model.jdom;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer;
import org.jdom.Attribute;
import org.jdom.CDATA;
import org.jdom.Comment;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.ProcessingInstruction;
import org.junit.runner.RunWith;

public class JDOMNodePointerTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Locale locale0 = Locale.PRC;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(locale0, locale0);
        boolean boolean0 = jDOMNodePointer0.isCollection();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Locale locale0 = Locale.FRANCE;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(locale0, locale0);
        NodePointer nodePointer0 = jDOMNodePointer0.namespacePointer("java.util.Locale@0000000010");
        nodePointer0.isAttribute();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Locale locale0 = Locale.FRANCE;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer("t\"OsgdY|NnV", locale0, "t\"OsgdY|NnV");
        boolean boolean0 = jDOMNodePointer0.isLanguage("7)kg ?+");
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Locale locale0 = Locale.UK;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(locale0, locale0);
        int int0 = jDOMNodePointer0.getLength();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Locale locale0 = Locale.CANADA;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(locale0, locale0);
        NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
        boolean boolean0 = jDOMNodePointer0.testNode((NodeTest) nodeTypeTest0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Element element0 = new Element("L", "L", "L");
        Locale locale0 = Locale.SIMPLIFIED_CHINESE;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        QName qName0 = jDOMNodePointer0.getName();
        NodePointer nodePointer0 = jDOMNodePointer0.createAttribute((JXPathContext) null, qName0);
        int int0 = jDOMNodePointer0.compareChildNodePointers(jDOMNodePointer0, nodePointer0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        Element element0 = new Element("L", "L", "L");
        Locale locale0 = Locale.SIMPLIFIED_CHINESE;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        QName qName0 = jDOMNodePointer0.getName();
        NodePointer nodePointer0 = jDOMNodePointer0.createAttribute((JXPathContext) null, qName0);
        int int0 = jDOMNodePointer0.compareChildNodePointers(jDOMNodePointer0, nodePointer0);
        qName0.toString();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Locale locale0 = Locale.PRC;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(locale0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jDOMNodePointer0);
        QName qName0 = new QName("<<unknown namespace>>", "http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer0.createChild(jXPathContext0, qName0, 480, (Object) qName0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Locale locale0 = Locale.CANADA;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(locale0, locale0);
        String string0 = jDOMNodePointer0.getNamespaceURI();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Element element0 = new Element("g7gjdm.Ontent");
        QName qName0 = new QName("g7gjdm.Ontent");
        VariablePointer variablePointer0 = new VariablePointer(qName0);
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
        boolean boolean0 = JDOMNodePointer.testNode((NodePointer) variablePointer0, (Object) element0, (NodeTest) nodeNameTest0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Locale locale0 = Locale.CANADA_FRENCH;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(locale0, locale0);
        String string0 = jDOMNodePointer0.getNamespaceURI("xml");
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Locale locale0 = Locale.ROOT;
        Element element0 = new Element("rg.jdo.onteeGnt", "rg.jdo.onteeGnt");
        Document document0 = new Document(element0);
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(document0, locale0);
        String string0 = jDOMNodePointer0.getNamespaceURI("rg.jdo.onteeGnt");
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Locale locale0 = Locale.CHINA;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(locale0, locale0);
        String string0 = jDOMNodePointer0.getNamespaceURI("http://www.w3.org/2000/xmlns/");
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Element element0 = new Element("L", "L", "L");
        Locale locale0 = Locale.SIMPLIFIED_CHINESE;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        QName qName0 = jDOMNodePointer0.getName();
        NodePointer nodePointer0 = jDOMNodePointer0.createAttribute((JXPathContext) null, qName0);
        int int0 = jDOMNodePointer0.compareChildNodePointers(nodePointer0, nodePointer0);
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        Element element0 = new Element("L", "L", "L");
        Locale locale0 = Locale.SIMPLIFIED_CHINESE;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        QName qName0 = jDOMNodePointer0.getName();
        NodePointer nodePointer0 = jDOMNodePointer0.createAttribute((JXPathContext) null, qName0);
        int int0 = jDOMNodePointer0.compareChildNodePointers(nodePointer0, nodePointer0);
        qName0.toString();
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        Element element0 = new Element("XT", "XT");
        Locale locale0 = Locale.FRANCE;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        Object object0 = new Object();
        JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, object0);
        QName qName0 = jDOMNodePointer0.getName();
        qName0.toString();
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        Element element0 = new Element("XT", "XT");
        Locale locale0 = Locale.FRANCE;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        Object object0 = new Object();
        JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, object0);
        QName qName0 = jDOMNodePointer0.getName();
        NodePointer nodePointer0 = jDOMNodePointer0.createAttribute(jXPathContext0, qName0);
        int int0 = jDOMNodePointer0.compareChildNodePointers(nodePointer0, jDOMNodePointer0);
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        QName qName0 = new QName((String) null, (String) null);
        Locale locale0 = Locale.GERMANY;
        NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(nodePointer0, (Object) locale0);
        jDOMNodePointer0.compareChildNodePointers(nodePointer0, jDOMNodePointer0);
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        Element element0 = new Element("grgjdom.9Content");
        element0.setText("grgjdom.9Content");
        Locale locale0 = Locale.UK;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        QName qName0 = new QName("grgjdom.9Content", "http://www.w3.org/XML/1998/namespace");
        NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, "grgjdom.9Content", locale0);
        int int0 = jDOMNodePointer0.compareChildNodePointers(nodePointer0, jDOMNodePointer0);
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        Locale locale0 = Locale.ROOT;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(locale0, locale0, "Nu?JC/AhYdpR(@'AW%");
        boolean boolean0 = jDOMNodePointer0.isLeaf();
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        Element element0 = new Element("XT", "XT", "XT");
        Locale locale0 = Locale.CHINESE;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        boolean boolean0 = jDOMNodePointer0.isLeaf();
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        Element element0 = new Element("XT", "XT", "XT");
        Locale locale0 = Locale.CHINESE;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        jDOMNodePointer0.setValue("XT");
        boolean boolean0 = jDOMNodePointer0.isLeaf();
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        Locale locale0 = Locale.ROOT;
        Element element0 = new Element("rg.jdo.onteeGnt", "rg.jdo.onteeGnt");
        Document document0 = new Document(element0);
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(document0, locale0);
        boolean boolean0 = jDOMNodePointer0.isLeaf();
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        Locale locale0 = Locale.TRADITIONAL_CHINESE;
        ProcessingInstruction processingInstruction0 = new ProcessingInstruction("y", "y");
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(processingInstruction0, locale0);
        QName qName0 = jDOMNodePointer0.getName();
        qName0.toString();
    }

    @Test(timeout = 4000)
    public void test2224() throws Throwable {
        Locale locale0 = Locale.CANADA;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(locale0, locale0);
        QName qName0 = jDOMNodePointer0.getName();
        jDOMNodePointer0.createAttribute((JXPathContext) null, qName0);
    }

    @Test(timeout = 4000)
    public void test2325() throws Throwable {
        Element element0 = new Element("XT", "XT", "XT");
        Locale locale0 = Locale.CHINESE;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        jDOMNodePointer0.setValue("XT");
        Object object0 = jDOMNodePointer0.getValue();
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        Element element0 = new Element("XT", "XT", "XT");
        Locale locale0 = Locale.CHINESE;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        jDOMNodePointer0.setValue("XT");
        Object object0 = jDOMNodePointer0.getValue();
    }

    @Test(timeout = 4000)
    public void test2427() throws Throwable {
        Element element0 = new Element("k", "k");
        Locale locale0 = Locale.KOREAN;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        Document document0 = new Document(element0);
        jDOMNodePointer0.setValue(document0);
        jDOMNodePointer0.getValue();
        element0.getContentSize();
    }

    @Test(timeout = 4000)
    public void test2528() throws Throwable {
        Locale locale0 = Locale.ITALY;
        Element element0 = new Element("rg.jdo.ontent", "rg.jdo.ontent", "rg.jdo.ontent");
        NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, element0, locale0);
        Comment comment0 = new Comment("e)xJ~");
        nodePointer0.setValue(comment0);
        Object object0 = nodePointer0.getValue();
    }

    @Test(timeout = 4000)
    public void test2529() throws Throwable {
        Locale locale0 = Locale.ITALY;
        Element element0 = new Element("rg.jdo.ontent", "rg.jdo.ontent", "rg.jdo.ontent");
        NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, element0, locale0);
        Comment comment0 = new Comment("e)xJ~");
        nodePointer0.setValue(comment0);
        Object object0 = nodePointer0.getValue();
    }

    @Test(timeout = 4000)
    public void test2630() throws Throwable {
        Comment comment0 = new Comment("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Locale locale0 = Locale.GERMAN;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(comment0, locale0);
        Object object0 = jDOMNodePointer0.getValue();
    }

    @Test(timeout = 4000)
    public void test2731() throws Throwable {
        Locale locale0 = Locale.FRANCE;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(locale0, locale0);
        Object object0 = jDOMNodePointer0.getValue();
    }

    @Test(timeout = 4000)
    public void test2832() throws Throwable {
        Locale locale0 = Locale.PRC;
        ProcessingInstruction processingInstruction0 = new ProcessingInstruction("W-", "W-");
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(processingInstruction0, locale0);
        Object object0 = jDOMNodePointer0.getValue();
    }

    @Test(timeout = 4000)
    public void test2933() throws Throwable {
        CDATA cDATA0 = new CDATA("L");
        Locale locale0 = Locale.ROOT;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(cDATA0, locale0);
        jDOMNodePointer0.setValue((Object) null);
    }

    @Test(timeout = 4000)
    public void test3034() throws Throwable {
        CDATA cDATA0 = new CDATA("T");
        Locale locale0 = Locale.CANADA_FRENCH;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(cDATA0, locale0);
        jDOMNodePointer0.setValue(cDATA0);
        jDOMNodePointer0.isContainer();
    }

    @Test(timeout = 4000)
    public void test3135() throws Throwable {
        CDATA cDATA0 = new CDATA("");
        Locale locale0 = Locale.GERMAN;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(cDATA0, locale0);
        jDOMNodePointer0.setValue("");
    }

    @Test(timeout = 4000)
    public void test3236() throws Throwable {
        Element element0 = new Element("XT", "XT", "XT");
        Locale locale0 = Locale.ROOT;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        jDOMNodePointer0.setValue(element0);
        jDOMNodePointer0.getLength();
    }

    @Test(timeout = 4000)
    public void test3337() throws Throwable {
        Locale locale0 = Locale.ITALY;
        Element element0 = new Element("rg.jdo.ontent", "rg.jdo.ontent");
        NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, element0, locale0);
        CDATA cDATA0 = new CDATA("http://www.w3.org/XML/1998/namespace");
        nodePointer0.setValue(cDATA0);
        nodePointer0.isNode();
    }

    @Test(timeout = 4000)
    public void test3438() throws Throwable {
        Element element0 = new Element("grgjdom.9Content", "grgjdom.9Content");
        Locale locale0 = Locale.UK;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        ProcessingInstruction processingInstruction0 = new ProcessingInstruction("grgjdom.9Content", "http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer0.setValue(processingInstruction0);
        jDOMNodePointer0.isNode();
    }

    @Test(timeout = 4000)
    public void test3539() throws Throwable {
        Element element0 = new Element("XT", "XT");
        Locale locale0 = Locale.ROOT;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        jDOMNodePointer0.setValue((Object) null);
        jDOMNodePointer0.isCollection();
    }

    @Test(timeout = 4000)
    public void test3640() throws Throwable {
        Element element0 = new Element("T", "T", "T");
        Locale locale0 = Locale.US;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        jDOMNodePointer0.setValue(linkedList0);
        jDOMNodePointer0.getLength();
    }

    @Test(timeout = 4000)
    public void test3741() throws Throwable {
        NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
        boolean boolean0 = JDOMNodePointer.testNode((NodePointer) null, (Object) null, (NodeTest) nodeNameTest0);
    }

    @Test(timeout = 4000)
    public void test3842() throws Throwable {
        Element element0 = new Element("XT", "XT");
        Locale locale0 = Locale.FRANCE;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        QName qName0 = new QName("<<unknown namespace>>");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        boolean boolean0 = JDOMNodePointer.testNode((NodePointer) jDOMNodePointer0, (Object) element0, (NodeTest) nodeNameTest0);
    }

    @Test(timeout = 4000)
    public void test3943() throws Throwable {
        Element element0 = new Element("L", "L");
        QName qName0 = new QName("L", "L");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "L");
        boolean boolean0 = JDOMNodePointer.testNode((NodePointer) null, (Object) element0, (NodeTest) nodeNameTest0);
    }

    @Test(timeout = 4000)
    public void test4044() throws Throwable {
        Element element0 = new Element("grg.jdm.Coyntent", "grg.jdm.Coyntent", "grg.jdm.Coyntent");
        QName qName0 = new QName("grg.jdm.Coyntent", "grg.jdm.Coyntent");
        VariablePointer variablePointer0 = new VariablePointer(qName0);
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        boolean boolean0 = JDOMNodePointer.testNode((NodePointer) variablePointer0, (Object) element0, (NodeTest) nodeNameTest0);
    }

    @Test(timeout = 4000)
    public void test4145() throws Throwable {
        Element element0 = new Element("g7gjdm.Ontent");
        QName qName0 = new QName("g7gjdm.Ontent", "g7gjdm.Ontent");
        VariablePointer variablePointer0 = new VariablePointer(qName0);
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
        boolean boolean0 = JDOMNodePointer.testNode((NodePointer) variablePointer0, (Object) element0, (NodeTest) nodeNameTest0);
    }

    @Test(timeout = 4000)
    public void test4246() throws Throwable {
        Locale locale0 = Locale.TRADITIONAL_CHINESE;
        ProcessingInstruction processingInstruction0 = new ProcessingInstruction("y", "y");
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(processingInstruction0, locale0);
        ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
        boolean boolean0 = JDOMNodePointer.testNode((NodePointer) jDOMNodePointer0, (Object) processingInstruction0, (NodeTest) processingInstructionTest0);
    }

    @Test(timeout = 4000)
    public void test4347() throws Throwable {
        LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
        Document document0 = new Document(linkedList0);
        NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
        boolean boolean0 = JDOMNodePointer.testNode((NodePointer) null, (Object) document0, (NodeTest) nodeTypeTest0);
    }

    @Test(timeout = 4000)
    public void test4448() throws Throwable {
        NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
        CDATA cDATA0 = new CDATA("java.util.Locale@0000000008");
        boolean boolean0 = JDOMNodePointer.testNode((NodePointer) null, (Object) cDATA0, (NodeTest) nodeTypeTest0);
    }

    @Test(timeout = 4000)
    public void test4549() throws Throwable {
        NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3);
        boolean boolean0 = JDOMNodePointer.testNode((NodePointer) null, (Object) nodeTypeTest0, (NodeTest) nodeTypeTest0);
    }

    @Test(timeout = 4000)
    public void test4650() throws Throwable {
        NodeTypeTest nodeTypeTest0 = new NodeTypeTest(4);
        boolean boolean0 = JDOMNodePointer.testNode((NodePointer) null, (Object) nodeTypeTest0, (NodeTest) nodeTypeTest0);
    }

    @Test(timeout = 4000)
    public void test4751() throws Throwable {
        Element element0 = new Element("L", "L");
        NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
        boolean boolean0 = JDOMNodePointer.testNode((NodePointer) null, (Object) element0, (NodeTest) nodeTypeTest0);
    }

    @Test(timeout = 4000)
    public void test4852() throws Throwable {
        NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
        boolean boolean0 = JDOMNodePointer.testNode((NodePointer) null, (Object) null, (NodeTest) nodeTypeTest0);
    }

    @Test(timeout = 4000)
    public void test4953() throws Throwable {
        NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
        boolean boolean0 = JDOMNodePointer.testNode((NodePointer) null, (Object) nodeTypeTest0, (NodeTest) nodeTypeTest0);
    }

    @Test(timeout = 4000)
    public void test5054() throws Throwable {
        Locale locale0 = Locale.CANADA;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(locale0, locale0);
        ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
        boolean boolean0 = JDOMNodePointer.testNode((NodePointer) jDOMNodePointer0, (Object) locale0, (NodeTest) processingInstructionTest0);
    }

    @Test(timeout = 4000)
    public void test5155() throws Throwable {
        Attribute attribute0 = new Attribute("L", "L");
        String string0 = JDOMNodePointer.getPrefix(attribute0);
    }

    @Test(timeout = 4000)
    public void test5256() throws Throwable {
        Element element0 = new Element("grg.jdom.Content", "grg.jdom.Content", "grg.jdom.Content");
        String string0 = JDOMNodePointer.getPrefix(element0);
    }

    @Test(timeout = 4000)
    public void test5257() throws Throwable {
        Element element0 = new Element("grg.jdom.Content", "grg.jdom.Content", "grg.jdom.Content");
        String string0 = JDOMNodePointer.getPrefix(element0);
    }

    @Test(timeout = 4000)
    public void test5358() throws Throwable {
        CDATA cDATA0 = new CDATA(",pL");
        String string0 = JDOMNodePointer.getPrefix(cDATA0);
    }

    @Test(timeout = 4000)
    public void test5459() throws Throwable {
        Namespace namespace0 = Namespace.XML_NAMESPACE;
        Attribute attribute0 = new Attribute("k", "k", namespace0);
        String string0 = JDOMNodePointer.getPrefix(attribute0);
    }

    @Test(timeout = 4000)
    public void test5460() throws Throwable {
        Namespace namespace0 = Namespace.XML_NAMESPACE;
        Attribute attribute0 = new Attribute("k", "k", namespace0);
        String string0 = JDOMNodePointer.getPrefix(attribute0);
    }

    @Test(timeout = 4000)
    public void test5561() throws Throwable {
        Attribute attribute0 = new Attribute("FBLa", "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        String string0 = JDOMNodePointer.getLocalName(attribute0);
    }

    @Test(timeout = 4000)
    public void test5662() throws Throwable {
        String string0 = JDOMNodePointer.getLocalName("T");
    }

    @Test(timeout = 4000)
    public void test5763() throws Throwable {
        Element element0 = new Element("grjdom.9Cotent", "grjdom.9Cotent");
        element0.setAttribute("grjdom.9Cotent", "grjdom.9Cotent");
        Namespace namespace0 = Namespace.NO_NAMESPACE;
        String string0 = JDOMNodePointer.findEnclosingAttribute(element0, "grjdom.9Cotent", namespace0);
    }

    @Test(timeout = 4000)
    public void test5764() throws Throwable {
        Element element0 = new Element("grjdom.9Cotent", "grjdom.9Cotent");
        element0.setAttribute("grjdom.9Cotent", "grjdom.9Cotent");
        Namespace namespace0 = Namespace.NO_NAMESPACE;
        String string0 = JDOMNodePointer.findEnclosingAttribute(element0, "grjdom.9Cotent", namespace0);
    }

    @Test(timeout = 4000)
    public void test5865() throws Throwable {
        Comment comment0 = new Comment("*rZ!,/_0;+w_");
        Namespace namespace0 = Namespace.NO_NAMESPACE;
        String string0 = JDOMNodePointer.findEnclosingAttribute(comment0, "*rZ!,/_0;+w_", namespace0);
    }

    @Test(timeout = 4000)
    public void test5966() throws Throwable {
        Locale locale0 = Locale.CANADA;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(locale0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) jDOMNodePointer0);
        QName qName0 = new QName("http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
    }

    @Test(timeout = 4000)
    public void test6067() throws Throwable {
        Namespace namespace0 = Namespace.NO_NAMESPACE;
        Element element0 = new Element("T", namespace0);
        Locale locale0 = Locale.UK;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        QName qName0 = new QName("<<unknown namespace>>", "T");
        jDOMNodePointer0.createAttribute((JXPathContext) null, qName0);
    }

    @Test(timeout = 4000)
    public void test6168() throws Throwable {
        Element element0 = new Element("T", "T", "T");
        Locale locale0 = Locale.UK;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        Object object0 = new Object();
        JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, object0);
        QName qName0 = new QName("T", "T");
        jDOMNodePointer0.createAttribute(jXPathContext0, qName0);
        NodePointer nodePointer0 = jDOMNodePointer0.createAttribute(jXPathContext0, qName0);
        nodePointer0.getIndex();
    }

    @Test(timeout = 4000)
    public void test6269() throws Throwable {
        Element element0 = new Element("T", "T", "T");
        Locale locale0 = new Locale("T");
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(element0, locale0);
        Object object0 = new Object();
        JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, object0);
        QName qName0 = new QName((String) null, "T");
        jDOMNodePointer0.createAttribute(jXPathContext0, qName0);
        NodePointer nodePointer0 = jDOMNodePointer0.createAttribute(jXPathContext0, qName0);
        nodePointer0.isLeaf();
    }

    @Test(timeout = 4000)
    public void test6370() throws Throwable {
        Locale locale0 = Locale.ROOT;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(locale0, locale0);
        jDOMNodePointer0.remove();
    }

    @Test(timeout = 4000)
    public void test6471() throws Throwable {
        Locale locale0 = Locale.FRANCE;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer("t\"OsgdY|NnV", locale0, "t\"OsgdY|NnV");
        String string0 = jDOMNodePointer0.asPath();
    }

    @Test(timeout = 4000)
    public void test6572() throws Throwable {
        Locale locale0 = Locale.UK;
        Element element0 = new Element("rg.jdo.onteeGnt", "rg.jdo.onteeGnt", "rg.jdo.onteeGnt");
        NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, element0, locale0);
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(nodePointer0, element0);
        jDOMNodePointer0.getNamespaceURI();
    }

    @Test(timeout = 4000)
    public void test6573() throws Throwable {
        Locale locale0 = Locale.UK;
        Element element0 = new Element("rg.jdo.onteeGnt", "rg.jdo.onteeGnt", "rg.jdo.onteeGnt");
        NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, element0, locale0);
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(nodePointer0, element0);
        String string0 = jDOMNodePointer0.toString();
    }

    @Test(timeout = 4000)
    public void test6674() throws Throwable {
        Element element0 = new Element("grg.jdm.Content");
        CDATA cDATA0 = new CDATA("grg.jdm.Content");
        Locale locale0 = new Locale("grg.jdm.Content", "grg.jdm.Content");
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(cDATA0, locale0);
        JDOMNodePointer jDOMNodePointer1 = new JDOMNodePointer(jDOMNodePointer0, element0);
        String string0 = jDOMNodePointer1.asPath();
    }

    @Test(timeout = 4000)
    public void test6775() throws Throwable {
        Locale locale0 = Locale.PRC;
        ProcessingInstruction processingInstruction0 = new ProcessingInstruction("W-", "W-");
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(processingInstruction0, locale0);
        String string0 = jDOMNodePointer0.asPath();
    }

    @Test(timeout = 4000)
    public void test6876() throws Throwable {
        Locale locale0 = Locale.ROOT;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(locale0, locale0, "Nu?JC/AhYdpR(@'AW%");
        String string0 = jDOMNodePointer0.asPath();
    }

    @Test(timeout = 4000)
    public void test6977() throws Throwable {
        Locale locale0 = Locale.CANADA;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(locale0, locale0);
        JDOMNodePointer jDOMNodePointer1 = new JDOMNodePointer((NodePointer) jDOMNodePointer0, (Object) locale0);
        boolean boolean0 = jDOMNodePointer1.equals(jDOMNodePointer0);
    }

    @Test(timeout = 4000)
    public void test7078() throws Throwable {
        Locale locale0 = Locale.FRANCE;
        Object object0 = new Object();
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(object0, locale0);
        boolean boolean0 = jDOMNodePointer0.equals(jDOMNodePointer0);
    }

    @Test(timeout = 4000)
    public void test7179() throws Throwable {
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer((Object) null, (Locale) null);
        boolean boolean0 = jDOMNodePointer0.equals((Object) null);
    }

    @Test(timeout = 4000)
    public void test7280() throws Throwable {
        Locale locale0 = Locale.CANADA;
        JDOMNodePointer jDOMNodePointer0 = new JDOMNodePointer(locale0, locale0);
        JDOMNodePointer jDOMNodePointer1 = new JDOMNodePointer(jDOMNodePointer0, (Object) null);
        boolean boolean0 = jDOMNodePointer1.equals(jDOMNodePointer0);
    }
}
