/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 00:04:17 GMT 2023
 */
package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import javax.imageio.metadata.IIOMetadataNode;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.util.TypeConverter;
import org.apache.commons.jxpath.util.TypeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.w3c.dom.Node;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class DOMNodePointer_ESTest extends DOMNodePointer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test020() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("X4l{p.%u<");
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName("xml:lang");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, iIOMetadataNode0);
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(nodePointer0, iIOMetadataNode0);
        dOMNodePointer0.asPath();
    }

    @Test(timeout = 4000)
    public void test081() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        QName qName0 = new QName("<<unknown namespace>>");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "QNZ");
        DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
    }

    @Test(timeout = 4000)
    public void test092() throws Throwable {
        Locale locale0 = Locale.TRADITIONAL_CHINESE;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "Index is less than 1: ");
        QName qName0 = new QName("<<unknown namespace>>", "(");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
        dOMNodePointer0.testNode((NodeTest) nodeNameTest0);
    }

    @Test(timeout = 4000)
    public void test103() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        Locale locale0 = Locale.GERMAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
        doReturn(iIOMetadataNode0).when(typeConverter0).convert(any(), any(java.lang.Class.class));
        TypeUtils.setTypeConverter(typeConverter0);
        dOMNodePointer0.setValue("");
    }

    @Test(timeout = 4000)
    public void test114() throws Throwable {
        Locale locale0 = new Locale("D", "Cannot remove root DOM node");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
        dOMNodePointer0.remove();
    }

    @Test(timeout = 4000)
    public void test125() throws Throwable {
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((NodePointer) null, (Node) null);
        dOMNodePointer0.namespaceIterator();
    }

    @Test(timeout = 4000)
    public void test136() throws Throwable {
        Locale locale0 = Locale.JAPAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "");
        dOMNodePointer0.isLeaf();
    }

    @Test(timeout = 4000)
    public void test157() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null, "9f/cwF/v#m05<k5");
        dOMNodePointer0.isLanguage("http://www.w3.org/2000/xmlns/");
    }

    @Test(timeout = 4000)
    public void test168() throws Throwable {
        Locale locale0 = Locale.ITALY;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "q@+@<E");
        dOMNodePointer0.getValue();
    }

    @Test(timeout = 4000)
    public void test179() throws Throwable {
        DOMNodePointer.getPrefix((Node) null);
    }

    @Test(timeout = 4000)
    public void test1810() throws Throwable {
        DOMNodePointer.getNamespaceURI((Node) null);
    }

    @Test(timeout = 4000)
    public void test1911() throws Throwable {
        Locale locale0 = Locale.ITALY;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
        dOMNodePointer0.getNamespaceURI();
    }

    @Test(timeout = 4000)
    public void test2012() throws Throwable {
        Locale locale0 = Locale.ROOT;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "");
        dOMNodePointer0.getName();
    }

    @Test(timeout = 4000)
    public void test2113() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        Locale locale0 = new Locale("R}&RQ^\"rV", "R}&RQ^\"rV");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "R}&RQ^\"rV");
        QName qName0 = new QName("g#1bj,E1){VKi=[~{)k");
        dOMNodePointer0.createChild(jXPathContext0, qName0, 0, (Object) iIOMetadataNode0);
    }

    @Test(timeout = 4000)
    public void test2214() throws Throwable {
        Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, (Locale) null);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale_FilteringMode0);
        QName qName0 = new QName("Urx[ T4o`*nLCrUpH8{", "");
        dOMNodePointer0.createChild(jXPathContext0, qName0, 0);
    }

    @Test(timeout = 4000)
    public void test2415() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
        QName qName0 = new QName("", "");
        Locale locale0 = Locale.KOREAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
        dOMNodePointer0.createAttribute(jXPathContext0, qName0);
    }

    @Test(timeout = 4000)
    public void test2516() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("~]wH TcF1D.gv{DQk;");
        Locale locale0 = Locale.TRADITIONAL_CHINESE;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        QName qName0 = new QName("http://www.w3.org/XML/1998/namespace");
        VariablePointer variablePointer0 = new VariablePointer(qName0);
        dOMNodePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
    }

    @Test(timeout = 4000)
    public void test2617() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("2){");
        Locale locale0 = Locale.ITALY;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "QNo30};@3Y~");
        dOMNodePointer0.compareChildNodePointers((NodePointer) null, (NodePointer) null);
    }

    @Test(timeout = 4000)
    public void test2718() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest");
        Locale locale0 = Locale.UK;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest");
        Variables variables0 = jXPathContext0.getVariables();
        QName qName0 = dOMNodePointer0.getName();
        VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
        dOMNodePointer0.compareChildNodePointers(variablePointer0, variablePointer0);
    }

    @Test(timeout = 4000)
    public void test2819() throws Throwable {
        Locale locale0 = Locale.ROOT;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "org.apache.commons.jxpath.ri.compiler.NodeNameTest@0000000006");
        QName qName0 = new QName(" ");
        NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, locale0, locale0);
        dOMNodePointer0.compareChildNodePointers(nodePointer0, nodePointer0);
    }

    @Test(timeout = 4000)
    public void test2920() throws Throwable {
        QName qName0 = new QName("Unknown namespace prefix: ", "Unknown namespace prefix: ");
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("Unknown namespace prefix: ");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "JX],\"h[H|3Hk<G^");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "http://www.w3.org/XML/1998/namespace");
        VariablePointer variablePointer0 = new VariablePointer(qName0);
        dOMNodePointer0.childIterator(nodeNameTest0, true, variablePointer0);
    }

    @Test(timeout = 4000)
    public void test3021() throws Throwable {
        Locale locale0 = Locale.GERMANY;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
        NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null, "<<unknown namespace>>");
        ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("http://www.w3.org/XML/1998/namespace");
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) processingInstructionTest0);
        Variables variables0 = jXPathContext0.getVariables();
        VariablePointer variablePointer0 = new VariablePointer(variables0, (QName) null);
        dOMNodePointer0.childIterator(nodeNameTest0, true, variablePointer0);
    }

    @Test(timeout = 4000)
    public void test3122() throws Throwable {
        Locale locale0 = Locale.CHINESE;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
        NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1747);
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName("<<unknown namespace>>");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        dOMNodePointer0.childIterator(nodeTypeTest0, true, variablePointer0);
    }

    @Test(timeout = 4000)
    public void test3223() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
        QName qName0 = new QName("yHhTa{WAqL,uL[");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "*");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
        NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, dOMNodePointer0, (Locale) null);
        dOMNodePointer0.childIterator(nodeNameTest0, false, nodePointer0);
    }

    @Test(timeout = 4000)
    public void test3324() throws Throwable {
        Locale locale0 = Locale.ENGLISH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "");
        QName qName0 = new QName("V'DgO6![}VK]5#a-w:");
        dOMNodePointer0.attributeIterator(qName0);
    }

    @Test(timeout = 4000)
    public void test3425() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMNodePointer.getLocalName(iIOMetadataNode0);
    }

    @Test(timeout = 4000)
    public void test4026() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        Locale locale0 = Locale.forLanguageTag("pp^Vc<WdedVE/eE5");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
        QName qName0 = new QName("http://www.w3.org/2000/xmlns/", "http://www.w3.org/2000/xmlns/");
        dOMNodePointer0.createChild(jXPathContext0, qName0, 594);
    }

    @Test(timeout = 4000)
    public void test4827() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("id('");
        Locale locale0 = Locale.TAIWAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
        dOMNodePointer0.getPointerByID(jXPathContext0, "Chinese (Taiwan)");
    }

    @Test(timeout = 4000)
    public void test5028() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlns");
        Locale locale0 = Locale.TAIWAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "xmlns");
        QName qName0 = dOMNodePointer0.getName();
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
        dOMNodePointer0.createAttribute(jXPathContext0, qName0);
        String string0 = dOMNodePointer0.getNamespaceURI();
    }

    @Test(timeout = 4000)
    public void test5129() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("http://www.w3.org/XML/1998/namespace");
        String string0 = DOMNodePointer.getNamespaceURI((Node) iIOMetadataNode0);
    }

    @Test(timeout = 4000)
    public void test5230() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest");
        Locale locale0 = Locale.FRANCE;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        QName qName0 = new QName((String) null, "");
        dOMNodePointer0.createAttribute((JXPathContext) null, qName0);
        NodeIterator nodeIterator0 = dOMNodePointer0.namespaceIterator();
        nodeIterator0.getPosition();
    }

    @Test(timeout = 4000)
    public void test5331() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest");
        Locale locale0 = Locale.FRANCE;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        QName qName0 = new QName((String) null, "http://www.w3.org/XML/1998/namespace");
        dOMNodePointer0.createAttribute((JXPathContext) null, qName0);
        NodeIterator nodeIterator0 = dOMNodePointer0.namespaceIterator();
        nodeIterator0.getPosition();
    }

    @Test(timeout = 4000)
    public void test5432() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest");
        Node node0 = iIOMetadataNode0.cloneNode(true);
        Locale locale0 = Locale.FRANCE;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(node0, locale0);
        DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, iIOMetadataNode0);
        boolean boolean0 = dOMNodePointer0.equals(dOMNodePointer1);
    }

    @Test(timeout = 4000)
    public void test5533() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
        Locale locale0 = Locale.ENGLISH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        VariablePointer variablePointer0 = new VariablePointer((QName) null);
        DOMNodePointer dOMNodePointer1 = new DOMNodePointer(variablePointer0, iIOMetadataNode0);
        boolean boolean0 = dOMNodePointer1.equals(dOMNodePointer0);
    }

    @Test(timeout = 4000)
    public void test5634() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        Locale locale0 = Locale.GERMAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        boolean boolean0 = dOMNodePointer0.equals(iIOMetadataNode0);
    }

    @Test(timeout = 4000)
    public void test5735() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
        Locale locale0 = Locale.ENGLISH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        dOMNodePointer0.remove();
    }

    @Test(timeout = 4000)
    public void test5836() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        Node node0 = iIOMetadataNode0.appendChild(iIOMetadataNode0);
        Locale locale0 = Locale.GERMAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(node0, locale0);
        dOMNodePointer0.remove();
        dOMNodePointer0.isRoot();
    }

    @Test(timeout = 4000)
    public void test5937() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest");
        Locale locale0 = Locale.FRANCE;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        QName qName0 = new QName((String) null, "<<unknown namespace>>");
        dOMNodePointer0.createAttribute((JXPathContext) null, qName0);
        NodePointer nodePointer0 = dOMNodePointer0.createAttribute((JXPathContext) null, qName0);
        nodePointer0.isNode();
    }

    @Test(timeout = 4000)
    public void test6038() throws Throwable {
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, (Locale) null, "9f/cwF/v#m05<k5");
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "xmlns:");
        QName qName0 = new QName("");
        dOMNodePointer0.createAttribute(jXPathContext0, qName0);
    }

    @Test(timeout = 4000)
    public void test6139() throws Throwable {
        Locale locale0 = Locale.KOREA;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0, "org.apache.commons.jxpath.JXPathAbstractFactoryException");
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
        QName qName0 = new QName("iGcmWwiIP+(Zt`S6");
        dOMNodePointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
    }

    @Test(timeout = 4000)
    public void test6240() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest");
        Locale locale0 = Locale.JAPANESE;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        QName qName0 = new QName((String) null, "");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
        dOMNodePointer0.setValue(nodeNameTest0);
    }

    @Test(timeout = 4000)
    public void test6341() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest");
        Locale locale0 = Locale.FRANCE;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        dOMNodePointer0.setValue((Object) null);
        dOMNodePointer0.getLength();
    }

    @Test(timeout = 4000)
    public void test6442() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
        VariablePointer variablePointer0 = new VariablePointer((QName) null);
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(variablePointer0, iIOMetadataNode0);
        dOMNodePointer0.setValue(iIOMetadataNode0);
        dOMNodePointer0.isCollection();
    }

    @Test(timeout = 4000)
    public void test6543() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
        Locale locale0 = Locale.ENGLISH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        dOMNodePointer0.setValue("");
        dOMNodePointer0.getIndex();
    }

    @Test(timeout = 4000)
    public void test6644() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        Locale locale0 = Locale.UK;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, ">(uA%^`1rT=G2;O");
        boolean boolean0 = dOMNodePointer0.isLanguage("");
    }

    @Test(timeout = 4000)
    public void test6745() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        Locale locale0 = Locale.ENGLISH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
        DOMNodePointer dOMNodePointer1 = new DOMNodePointer(dOMNodePointer0, iIOMetadataNode0);
        boolean boolean0 = dOMNodePointer1.isLeaf();
    }

    @Test(timeout = 4000)
    public void test6846() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        Locale locale0 = Locale.UK;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "\"sum\"");
        NodePointer nodePointer0 = dOMNodePointer0.namespacePointer("");
        dOMNodePointer0.getDefaultNamespaceURI();
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "http://www.w3.org/2000/xmlns/");
        jXPathContext0.getRelativeContext(nodePointer0);
    }

    @Test(timeout = 4000)
    public void test6947() throws Throwable {
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, (Locale) null, "|mt`T_*^V`Ar@<b");
        NodePointer nodePointer0 = dOMNodePointer0.namespacePointer("|mt`T_*^V`Ar@<b");
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
        NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
        dOMNodePointer0.childIterator(nodeNameTest0, true, nodePointer0);
        jXPathContext0.getRelativeContext(nodePointer0);
    }

    @Test(timeout = 4000)
    public void test7048() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("mok6+f~v}qt");
        Locale locale0 = Locale.CANADA_FRENCH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "xml");
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "mok6+f~v}qt");
        QName qName0 = new QName("q?W{{_X=LUrWs#eW`xr", (String) null);
        dOMNodePointer0.getNamespaceURI("<BaseChar>");
        dOMNodePointer0.createAttribute(jXPathContext0, qName0);
    }

    @Test(timeout = 4000)
    public void test7149() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        QName qName0 = new QName("xml:lang");
        Locale locale0 = Locale.PRC;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        NodeIterator nodeIterator0 = dOMNodePointer0.attributeIterator(qName0);
        nodeIterator0.getPosition();
    }

    @Test(timeout = 4000)
    public void test7250() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
        Locale locale0 = Locale.ENGLISH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        String string0 = dOMNodePointer0.getNamespaceURI((String) null);
    }

    @Test(timeout = 4000)
    public void test7351() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
        QName qName0 = dOMNodePointer0.getName();
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
        boolean boolean0 = dOMNodePointer0.testNode((NodeTest) nodeNameTest0);
        nodeNameTest0.toString();
    }

    @Test(timeout = 4000)
    public void test7352() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, (Locale) null);
        QName qName0 = dOMNodePointer0.getName();
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
        boolean boolean0 = dOMNodePointer0.testNode((NodeTest) nodeNameTest0);
    }

    @Test(timeout = 4000)
    public void test7453() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("mok6+f~v}qt");
        ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
        boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) processingInstructionTest0);
    }

    @Test(timeout = 4000)
    public void test7554() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
        QName qName0 = new QName("");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "*");
        boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
    }

    @Test(timeout = 4000)
    public void test7655() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
        QName qName0 = new QName("yHhTa{WAqL,uL[");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "*");
        boolean boolean0 = DOMNodePointer.testNode((Node) iIOMetadataNode0, (NodeTest) nodeNameTest0);
    }

    @Test(timeout = 4000)
    public void test7756() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlns");
        Locale locale0 = Locale.TAIWAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "xmlns");
        QName qName0 = dOMNodePointer0.getName();
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
        dOMNodePointer0.createAttribute(jXPathContext0, qName0);
        String string0 = dOMNodePointer0.getDefaultNamespaceURI();
    }

    @Test(timeout = 4000)
    public void test7857() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        Locale locale0 = Locale.UK;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, ">(uA%^`1rT=G2;O");
        NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1485));
        boolean boolean0 = dOMNodePointer0.testNode((NodeTest) nodeTypeTest0);
    }

    @Test(timeout = 4000)
    public void test7958() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("<<unknown namespace>>");
        Locale locale0 = new Locale("<<unknown namespace>>", ",-HymY7xiqJagA79?:g", "W[+9rx}gk");
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        boolean boolean0 = dOMNodePointer0.isActual();
    }

    @Test(timeout = 4000)
    public void test8159() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("mok6+f~v}qt");
        Locale locale0 = Locale.ITALY;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "xml");
        int int0 = dOMNodePointer0.getLength();
    }

    @Test(timeout = 4000)
    public void test8260() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest");
        Locale locale0 = Locale.FRANCE;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        QName qName0 = new QName((String) null, "");
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) iIOMetadataNode0);
        dOMNodePointer0.createChild(jXPathContext0, qName0, 1040, (Object) dOMNodePointer0);
    }

    @Test(timeout = 4000)
    public void test8361() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xmlns");
        Locale locale0 = Locale.TAIWAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0, "xmlns");
        String string0 = dOMNodePointer0.getNamespaceURI();
    }

    @Test(timeout = 4000)
    public void test8462() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("id('");
        Locale locale0 = Locale.TAIWAN;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer(iIOMetadataNode0, locale0);
        boolean boolean0 = dOMNodePointer0.isCollection();
    }

    @Test(timeout = 4000)
    public void test8563() throws Throwable {
        Locale locale0 = Locale.ENGLISH;
        DOMNodePointer dOMNodePointer0 = new DOMNodePointer((Node) null, locale0);
        int int0 = dOMNodePointer0.compareChildNodePointers(dOMNodePointer0, dOMNodePointer0);
    }
}
