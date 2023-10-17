/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 00:41:42 GMT 2023
 */
package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.Locale;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.runner.RunWith;
import org.w3c.dom.Node;

public class DOMNodePointerTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("Unknown namespace prefix: ");
        IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode("Unknown namespace prefix: ");
        Locale locale0 = Locale.GERMANY;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode1, locale0, "\"?&-3B");
        Node node0 = iIOMetadataNode0.appendChild(iIOMetadataNode1);
        DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, node0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) dOMNodePointer1);
        QName qName0 = new QName("s6hI*W");
        dOMNodePointer1.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Locale locale0 = Locale.ENGLISH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "");
        boolean boolean0 = dOMNodePointer0.testNode((NodeTest) null);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        Locale locale0 = Locale.FRANCE;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "preserve");
        ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.JXPathContext");
        boolean boolean0 = dOMNodePointer0.testNode((NodeTest) processingInstructionTest0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Locale locale0 = Locale.ITALIAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
        boolean boolean0 = dOMNodePointer0.isLanguage("");
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
        String string0 = DOMNodePointer.getLocalName(iIOMetadataNode0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("/processing-instruction('");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null, "sT*zNV,K&ro'K[4");
        String string0 = dOMNodePointer0.getLanguage();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        Locale locale0 = Locale.JAPAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "$Sf*6,Y| I_r`_v");
        Object object0 = dOMNodePointer0.getImmediateNode();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode(")QPdA'");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null, ")QPdA'");
        Object object0 = dOMNodePointer0.getBaseValue();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        String string0 = DOMNodePointer.findEnclosingAttribute(iIOMetadataNode0, "7mm1B&E)LzE");
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode((String) null);
        NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "http://www.w3.org/XML/1998/namespace");
        DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        QName qName0 = new QName("id('", "id('");
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("id('");
        VariablePointer variablePointer0 = new VariablePointer(qName0);
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, iIOMetadataNode0);
        dOMNodePointer0.setValue(variablePointer0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName("id('", "id('");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, iIOMetadataNode0);
        dOMNodePointer0.setValue(variablePointer0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Locale locale0 = Locale.CHINESE;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "preserve");
        dOMNodePointer0.remove();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Locale locale0 = Locale.UK;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "K Hwz3~N )[|1jA+0X");
        dOMNodePointer0.namespaceIterator();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Locale locale0 = Locale.TAIWAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
        dOMNodePointer0.isLeaf();
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, (Node) null);
        dOMNodePointer0.isLanguage("");
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Locale locale0 = Locale.forLanguageTag("");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "c`r&5L/ FL>gc");
        dOMNodePointer0.getValue();
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode((String) null);
        DOMNodePointer.getPrefix(iIOMetadataNode0);
    }

    @Test(timeout = 4000)
    public void test1918() throws Throwable {
        Locale locale0 = Locale.TAIWAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "");
        dOMNodePointer0.getNamespaceURI();
    }

    @Test(timeout = 4000)
    public void test2019() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        Locale locale0 = Locale.KOREAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        dOMNodePointer0.getName();
    }

    @Test(timeout = 4000)
    public void test2120() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("JXPath: found system property");
        Locale locale0 = Locale.PRC;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
        QName qName0 = new QName("xmlns", "j|c");
        dOMNodePointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE, (Object) locale0);
    }

    @Test(timeout = 4000)
    public void test2321() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, iIOMetadataNode0);
        QName qName0 = new QName("http://www.w3.org/XML/1998/namespace", "<<unknown namespace>>");
        dOMNodePointer0.createChild((JXPathContext) null, qName0, (-94));
    }

    @Test(timeout = 4000)
    public void test2422() throws Throwable {
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName("", "{[");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("b&`n\"K&gHsATfMT<");
        Locale locale0 = Locale.JAPANESE;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, dOMNodePointer0);
        DOMNodePointer dOMNodePointer1 = new DOMNodePointer(nodePointer0, (Node) null);
        dOMNodePointer1.createAttribute(jXPathContext0, qName0);
    }

    @Test(timeout = 4000)
    public void test2523() throws Throwable {
        QName qName0 = new QName("g27on $", "g27on $");
        VariablePointer variablePointer0 = new VariablePointer(qName0);
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, (Node) null);
        dOMNodePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
    }

    @Test(timeout = 4000)
    public void test2624() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        Locale locale0 = Locale.TRADITIONAL_CHINESE;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
        Variables variables0 = jXPathContext0.getVariables();
        VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
        dOMNodePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
    }

    @Test(timeout = 4000)
    public void test2725() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        QName qName0 = dOMNodePointer0.getName();
        BasicVariables basicVariables0 = new BasicVariables();
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        dOMNodePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
    }

    @Test(timeout = 4000)
    public void test2826() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        QName qName0 = dOMNodePointer0.getName();
        NodePointer nodePointer0 = NodePointer.newChildNodePointer(dOMNodePointer0, qName0, dOMNodePointer0);
        dOMNodePointer0.compareChildNodePointers(dOMNodePointer0, nodePointer0);
    }

    @Test(timeout = 4000)
    public void test2927() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("M+}n7{>J#A%Cur");
        Locale locale0 = new Locale("org.apache.commons.jxpath.ri.model.dom.NamespacePointer");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "xml:spacI");
        ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("xml:spacI");
        VariablePointer variablePointer0 = new VariablePointer((QName) null);
        dOMNodePointer0.childIterator(processingInstructionTest0, false, variablePointer0);
    }

    @Test(timeout = 4000)
    public void test3028() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        Locale locale0 = new Locale("", "Factory did not assign a collection to variable '");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "");
        ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("Factory did not assign a collection to variable '");
        QName qName0 = new QName("}T%KMfQE_FltNP");
        NodePointer nodePointer0 = NodePointer.newChildNodePointer(dOMNodePointer0, qName0, processingInstructionTest0);
        dOMNodePointer0.childIterator(processingInstructionTest0, false, nodePointer0);
    }

    @Test(timeout = 4000)
    public void test3129() throws Throwable {
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, (Locale) null);
        QName qName0 = new QName("<<unknown namespace>>", "http://www.w3.org/2000/xmlns/");
        dOMNodePointer0.attributeIterator(qName0);
    }

    @Test(timeout = 4000)
    public void test3230() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("`M[0Y_* xx");
        String string0 = DOMNodePointer.getNamespaceURI((Node) iIOMetadataNode0);
    }

    @Test(timeout = 4000)
    public void test3331() throws Throwable {
        DOMNodePointer.getNamespaceURI((Node) null);
    }

    @Test(timeout = 4000)
    public void test3432() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("Unknown namespace prefix: ");
        String string0 = DOMNodePointer.getLocalName(iIOMetadataNode0);
    }

    @Test(timeout = 4000)
    public void test3533() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMNodePointer.getLocalName(iIOMetadataNode0);
    }

    @Test(timeout = 4000)
    public void test3634() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode("Cannot set undefined variable: ");
        Node node0 = iIOMetadataNode0.insertBefore(iIOMetadataNode1, iIOMetadataNode1);
        String string0 = DOMNodePointer.getPrefix(node0);
    }

    @Test(timeout = 4000)
    public void test3635() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        IIOMetadataNode iIOMetadataNode1 = new IIOMetadataNode("Cannot set undefined variable: ");
        Node node0 = iIOMetadataNode0.insertBefore(iIOMetadataNode1, iIOMetadataNode1);
        String string0 = DOMNodePointer.getPrefix(node0);
    }

    @Test(timeout = 4000)
    public void test3736() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("w*.H86Xri");
        String string0 = DOMNodePointer.getPrefix(iIOMetadataNode0);
    }

    @Test(timeout = 4000)
    public void test3837() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("Unknown namespace prefix: ");
        Locale locale0 = Locale.GERMANY;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "\"?&-3B");
        DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, iIOMetadataNode0);
        String string0 = dOMNodePointer1.asPath();
    }

    @Test(timeout = 4000)
    public void test3938() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        String string0 = dOMNodePointer0.asPath();
    }

    @Test(timeout = 4000)
    public void test4039() throws Throwable {
        Locale locale0 = Locale.ENGLISH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
        dOMNodePointer0.asPath();
    }

    @Test(timeout = 4000)
    public void test4140() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
        Locale locale0 = Locale.forLanguageTag("");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "preserve");
        String string0 = dOMNodePointer0.asPath();
    }

    @Test(timeout = 4000)
    public void test4241() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        Locale locale0 = Locale.forLanguageTag("");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "preserve");
        dOMNodePointer0.getNamespaceURI("<<unknown namespace>>");
        String string0 = dOMNodePointer0.getNamespaceURI("~@U/nxaLU:1G&H52!");
    }

    @Test(timeout = 4000)
    public void test4342() throws Throwable {
        Locale locale0 = Locale.ENGLISH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
        Object object0 = dOMNodePointer0.getImmediateNode();
    }

    @Test(timeout = 4000)
    public void test4443() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("2%]1%\"-");
        Locale locale0 = Locale.SIMPLIFIED_CHINESE;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        String string0 = dOMNodePointer0.getNamespaceURI();
    }

    @Test(timeout = 4000)
    public void test4544() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        QName qName0 = dOMNodePointer0.getName();
        dOMNodePointer0.attributeIterator(qName0);
        qName0.getName();
    }

    @Test(timeout = 4000)
    public void test4545() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        QName qName0 = dOMNodePointer0.getName();
        dOMNodePointer0.attributeIterator(qName0);
        qName0.toString();
    }

    @Test(timeout = 4000)
    public void test4646() throws Throwable {
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, (Locale) null, (String) null);
        Object object0 = dOMNodePointer0.getBaseValue();
    }

    @Test(timeout = 4000)
    public void test4747() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
        QName qName0 = dOMNodePointer0.getName();
        NodePointer nodePointer0 = dOMNodePointer0.createAttribute(jXPathContext0, qName0);
        int int0 = dOMNodePointer0.compareChildNodePointers(nodePointer0, nodePointer0);
    }

    @Test(timeout = 4000)
    public void test4748() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
        QName qName0 = dOMNodePointer0.getName();
        NodePointer nodePointer0 = dOMNodePointer0.createAttribute(jXPathContext0, qName0);
        int int0 = dOMNodePointer0.compareChildNodePointers(nodePointer0, nodePointer0);
        qName0.toString();
    }

    @Test(timeout = 4000)
    public void test4849() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
        Locale locale0 = Locale.forLanguageTag("");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "preserve");
        ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.JXPathContext");
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) processingInstructionTest0);
        dOMNodePointer0.getPointerByID(jXPathContext0, "/text()");
    }

    @Test(timeout = 4000)
    public void test4950() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("b7E");
        Locale locale0 = Locale.KOREAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        Object object0 = dOMNodePointer0.getValue();
    }

    @Test(timeout = 4000)
    public void test5051() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        iIOMetadataNode0.setAttribute("http://www.w3.org/2000/xmlns/", "http://www.w3.org/XML/1998/namespace");
        NodeIterator nodeIterator0 = dOMNodePointer0.namespaceIterator();
        nodeIterator0.getPosition();
    }

    @Test(timeout = 4000)
    public void test5152() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
        QName qName0 = dOMNodePointer0.getName();
        dOMNodePointer0.createAttribute(jXPathContext0, qName0);
        NodeIterator nodeIterator0 = dOMNodePointer0.namespaceIterator();
        nodeIterator0.getPosition();
    }

    @Test(timeout = 4000)
    public void test5253() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Node node0 = iIOMetadataNode0.cloneNode(true);
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, node0);
        boolean boolean0 = dOMNodePointer1.equals(dOMNodePointer0);
    }

    @Test(timeout = 4000)
    public void test5354() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, iIOMetadataNode0);
        boolean boolean0 = dOMNodePointer1.equals(dOMNodePointer0);
    }

    @Test(timeout = 4000)
    public void test5455() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        Locale locale0 = Locale.forLanguageTag("");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "preserve");
        boolean boolean0 = dOMNodePointer0.equals(iIOMetadataNode0);
    }

    @Test(timeout = 4000)
    public void test5556() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        dOMNodePointer0.remove();
    }

    @Test(timeout = 4000)
    public void test5657() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("Unknown namespace prefix: ");
        Locale locale0 = Locale.GERMANY;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "\"?&-3B");
        iIOMetadataNode0.appendChild(iIOMetadataNode0);
        dOMNodePointer0.remove();
        dOMNodePointer0.isContainer();
    }

    @Test(timeout = 4000)
    public void test5758() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
        QName qName0 = dOMNodePointer0.getName();
        dOMNodePointer0.createAttribute(jXPathContext0, qName0);
        dOMNodePointer0.createAttribute(jXPathContext0, qName0);
        qName0.getName();
    }

    @Test(timeout = 4000)
    public void test5759() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
        QName qName0 = dOMNodePointer0.getName();
        dOMNodePointer0.createAttribute(jXPathContext0, qName0);
        dOMNodePointer0.createAttribute(jXPathContext0, qName0);
        qName0.toString();
    }

    @Test(timeout = 4000)
    public void test5860() throws Throwable {
        Locale locale0 = Locale.UK;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "\"boolean\"");
        dOMNodePointer0.createAttribute((JXPathContext) null, (QName) null);
    }

    @Test(timeout = 4000)
    public void test5961() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
        dOMNodePointer0.setValue(linkedList0);
        dOMNodePointer0.isNode();
    }

    @Test(timeout = 4000)
    public void test6062() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("mtmiHL");
        Locale locale0 = Locale.GERMAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "<<unknown namespace>>");
        dOMNodePointer0.setValue((Object) null);
        dOMNodePointer0.isActual();
    }

    @Test(timeout = 4000)
    public void test6163() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("mtmiHL");
        Locale locale0 = Locale.JAPANESE;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "<<unknown namespace>>");
        dOMNodePointer0.setValue(iIOMetadataNode0);
        dOMNodePointer0.isNode();
    }

    @Test(timeout = 4000)
    public void test6264() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("Q");
        Locale locale0 = Locale.JAPAN;
        iIOMetadataNode0.appendChild(iIOMetadataNode0);
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        NamespaceResolver namespaceResolver0 = dOMNodePointer0.getNamespaceResolver();
        dOMNodePointer0.setValue(namespaceResolver0);
    }

    @Test(timeout = 4000)
    public void test6365() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        boolean boolean0 = dOMNodePointer0.isLeaf();
    }

    @Test(timeout = 4000)
    public void test6466() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("tiTmwTq`A");
        Locale locale0 = Locale.SIMPLIFIED_CHINESE;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "<<unknown namespace>>");
        dOMNodePointer0.getDefaultNamespaceURI();
        String string0 = dOMNodePointer0.getDefaultNamespaceURI();
    }

    @Test(timeout = 4000)
    public void test6567() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        Locale locale0 = Locale.forLanguageTag("");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "preserve");
        ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.JXPathContext");
        dOMNodePointer0.getNamespaceURI("<<unknown namespace>>");
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) processingInstructionTest0);
        QName qName0 = new QName("org.apache.commons.jxpath.JXPathContext", (String) null);
        dOMNodePointer0.createAttribute(jXPathContext0, qName0);
    }

    @Test(timeout = 4000)
    public void test6668() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        String string0 = dOMNodePointer0.getNamespaceURI("xml");
    }

    @Test(timeout = 4000)
    public void test6669() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        String string0 = dOMNodePointer0.getNamespaceURI("xml");
    }

    @Test(timeout = 4000)
    public void test6770() throws Throwable {
        Locale locale0 = Locale.UK;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "\"boolean\"");
        String string0 = dOMNodePointer0.getNamespaceURI("");
    }

    @Test(timeout = 4000)
    public void test6871() throws Throwable {
        Locale locale0 = Locale.GERMAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
        String string0 = dOMNodePointer0.getNamespaceURI((String) null);
    }

    @Test(timeout = 4000)
    public void test6972() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        Locale locale0 = Locale.forLanguageTag("");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "preserve");
        dOMNodePointer0.getNamespaceResolver();
        NamespaceResolver namespaceResolver0 = dOMNodePointer0.getNamespaceResolver();
        namespaceResolver0.isSealed();
    }

    @Test(timeout = 4000)
    public void test7073() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("Unknown namespace prefix: ");
        NodeTypeTest nodeTypeTest0 = new NodeTypeTest(Integer.MIN_VALUE);
        boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeTypeTest0);
    }

    @Test(timeout = 4000)
    public void test7174() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        QName qName0 = dOMNodePointer0.getName();
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
        boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
        nodeNameTest0.toString();
    }

    @Test(timeout = 4000)
    public void test7175() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        QName qName0 = dOMNodePointer0.getName();
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "<<unknown namespace>>");
        boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
    }

    @Test(timeout = 4000)
    public void test7276() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        QName qName0 = dOMNodePointer0.getName();
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
        nodeNameTest0.toString();
    }

    @Test(timeout = 4000)
    public void test7277() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        QName qName0 = dOMNodePointer0.getName();
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
    }

    @Test(timeout = 4000)
    public void test7378() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("b7E");
        QName qName0 = new QName("http://www.w3.org/XML/1998/namespace", "W");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
    }

    @Test(timeout = 4000)
    public void test7479() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("Q");
        QName qName0 = new QName("Q", "Q");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Factory coud not create a child node for path: ");
        boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
    }

    @Test(timeout = 4000)
    public void test7580() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
        boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) processingInstructionTest0);
    }

    @Test(timeout = 4000)
    public void test7681() throws Throwable {
        boolean boolean0 = DOMNodePointer.testNode((Node) null, (NodeTest) null);
    }

    @Test(timeout = 4000)
    public void test7782() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
        QName qName0 = dOMNodePointer0.getName();
        NodePointer nodePointer0 = dOMNodePointer0.createAttribute(jXPathContext0, qName0);
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        dOMNodePointer0.childIterator(nodeNameTest0, false, nodePointer0);
        nodeNameTest0.toString();
    }

    @Test(timeout = 4000)
    public void test7783() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
        QName qName0 = dOMNodePointer0.getName();
        NodePointer nodePointer0 = dOMNodePointer0.createAttribute(jXPathContext0, qName0);
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        dOMNodePointer0.childIterator(nodeNameTest0, false, nodePointer0);
        qName0.toString();
    }

    @Test(timeout = 4000)
    public void test7884() throws Throwable {
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "72fe3ax;<v");
        QName qName0 = new QName("http://www.w3.org/2000/xmlns/", "");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "http://www.w3.org/2000/xmlns/");
        dOMNodePointer0.testNode((NodeTest) nodeNameTest0);
    }

    @Test(timeout = 4000)
    public void test7985() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("Q");
        Locale locale0 = Locale.JAPAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        boolean boolean0 = dOMNodePointer0.isActual();
    }

    @Test(timeout = 4000)
    public void test8186() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
        Locale locale0 = Locale.forLanguageTag("");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "preserve");
        int int0 = dOMNodePointer0.getLength();
    }

    @Test(timeout = 4000)
    public void test8287() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        NodePointer nodePointer0 = dOMNodePointer0.namespacePointer("v/Ql~4BM USBo+\rQi");
        nodePointer0.isAttribute();
    }

    @Test(timeout = 4000)
    public void test8388() throws Throwable {
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
        Locale locale0 = jXPathContext0.getLocale();
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
        QName qName0 = new QName("http://www.w3.org/2000/xmlns/");
        dOMNodePointer0.createChild(jXPathContext0, qName0, 47, (Object) jXPathContext0);
    }

    @Test(timeout = 4000)
    public void test8489() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, iIOMetadataNode0);
        String string0 = dOMNodePointer1.asPath();
    }

    @Test(timeout = 4000)
    public void test8590() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        boolean boolean0 = dOMNodePointer0.isCollection();
    }

    @Test(timeout = 4000)
    public void test8691() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
        QName qName0 = dOMNodePointer0.getName();
        NodePointer nodePointer0 = dOMNodePointer0.createAttribute(jXPathContext0, qName0);
        int int0 = dOMNodePointer0.compareChildNodePointers(nodePointer0, dOMNodePointer0);
    }

    @Test(timeout = 4000)
    public void test8692() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("B");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
        QName qName0 = dOMNodePointer0.getName();
        NodePointer nodePointer0 = dOMNodePointer0.createAttribute(jXPathContext0, qName0);
        int int0 = dOMNodePointer0.compareChildNodePointers(nodePointer0, dOMNodePointer0);
        qName0.toString();
    }

    @Test(timeout = 4000)
    public void test8793() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
        Locale locale0 = Locale.forLanguageTag("");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "preserve");
        boolean boolean0 = dOMNodePointer0.isLanguage("processing-instruction('org.apache.commons.jxpath.JXPathContext')");
    }
}
