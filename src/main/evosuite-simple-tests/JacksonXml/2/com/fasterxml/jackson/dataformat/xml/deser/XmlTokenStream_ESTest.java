/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 18:05:40 GMT 2023
 */
package com.fasterxml.jackson.dataformat.xml.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ctc.wstx.api.ReaderConfig;
import com.ctc.wstx.dom.WstxDOMWrappingReader;
import com.ctc.wstx.stax.WstxInputFactory;
import com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper;
import com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream;
import java.io.IOException;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class XmlTokenStream_ESTest extends XmlTokenStream_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        String string0 = xmlTokenStream0.getNamespaceURI();
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        String string0 = xmlTokenStream0.getNamespaceURI();
        assertEquals(1, xmlTokenStream0.getCurrentToken());
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        xmlTokenStream0.closeCompletely();
        assertEquals(1, xmlTokenStream0.getCurrentToken());
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        xmlTokenStream0.close();
        assertEquals(1, xmlTokenStream0.getCurrentToken());
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, "N;-FAu[DTG");
        String string0 = xmlTokenStream0.toString();
        assertEquals("(Token stream: state=1 attr#=0 nextAttr#=0 name= text=null repeat?=0 wrapper=[null] repeatElement=0 nextName=null)", string0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, "N;-FAu[DTG");
        xmlTokenStream0.getXmlReader();
        assertEquals(1, xmlTokenStream0.getCurrentToken());
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, wstxDOMWrappingReader0);
        xmlTokenStream0.getCurrentLocation();
        assertEquals(1, xmlTokenStream0.getCurrentToken());
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        String string0 = xmlTokenStream0.getLocalName();
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        String string0 = xmlTokenStream0.getLocalName();
        assertEquals(1, xmlTokenStream0.getCurrentToken());
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        String string0 = xmlTokenStream0.getText();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test0710() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        String string0 = xmlTokenStream0.getText();
        assertEquals(1, xmlTokenStream0.getCurrentToken());
    }

    @Test(timeout = 4000)
    public void test0811() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        int int0 = xmlTokenStream0.getCurrentToken();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test0912() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, "N;-FAu[DTG");
        xmlTokenStream0.getTokenLocation();
        assertEquals(1, xmlTokenStream0.getCurrentToken());
    }

    @Test(timeout = 4000)
    public void test1013() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        WstxInputFactory wstxInputFactory0 = new WstxInputFactory();
        XMLStreamReader xMLStreamReader0 = wstxInputFactory0.createXMLStreamReader((Source) dOMSource0);
        XmlTokenStream xmlTokenStream0 = null;
        try {
            xmlTokenStream0 = new XmlTokenStream(xMLStreamReader0, xMLStreamReader0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Invalid XMLStreamReader passed: should be pointing to START_ELEMENT (1), instead got 7
            //
            verifyException("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1114() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        xmlTokenStream0.repeatStartElement();
        int int0 = xmlTokenStream0.next();
        assertEquals(1, wstxDOMWrappingReader0.getEventType());
    }

    @Test(timeout = 4000)
    public void test1115() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        xmlTokenStream0.repeatStartElement();
        int int0 = xmlTokenStream0.next();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test1216() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        xmlTokenStream0.skipEndElement();
        try {
            xmlTokenStream0.skipEndElement();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Expected END_ELEMENT, got event of type 6
            //
            verifyException("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1317() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createJ2MEDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        xmlTokenStream0.skipEndElement();
        xmlTokenStream0.hasAttributes();
        assertEquals(2, wstxDOMWrappingReader0.getEventType());
    }

    @Test(timeout = 4000)
    public void test1318() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createJ2MEDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        xmlTokenStream0.skipEndElement();
        xmlTokenStream0.hasAttributes();
        assertEquals(1, wstxDOMWrappingReader0.getDepth());
    }

    @Test(timeout = 4000)
    public void test1419() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        boolean boolean0 = xmlTokenStream0.hasAttributes();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1520() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        xmlTokenStream0._currentState = 500;
        // Undeclared exception!
        try {
            xmlTokenStream0.repeatStartElement();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Current state not XML_START_ELEMENT (1) but 500
            //
            verifyException("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1621() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, "N;-FAu[DTG");
        xmlTokenStream0.repeatStartElement();
        xmlTokenStream0.repeatStartElement();
        assertEquals(3, XmlTokenStream.XML_ATTRIBUTE_NAME);
    }

    @Test(timeout = 4000)
    public void test1722() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, wstxDOMWrappingReader0);
        xmlTokenStream0.skipAttributes();
        assertNull(xmlTokenStream0.getText());
    }

    @Test(timeout = 4000)
    public void test1823() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        xmlTokenStream0.next();
        // Undeclared exception!
        try {
            xmlTokenStream0.skipAttributes();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Current state not XML_START_ELEMENT or XML_ATTRIBUTE_NAME (1) but 2
            //
            verifyException("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test1924() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        xmlTokenStream0.convertToString();
        assertTrue(wstxDOMWrappingReader0.isStartElement());
    }

    @Test(timeout = 4000)
    public void test1925() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        xmlTokenStream0.convertToString();
        assertEquals(0, wstxDOMWrappingReader0.getDepth());
    }

    @Test(timeout = 4000)
    public void test2026() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        iIOMetadataNode0.setAttributeNS("Current state not XML_START_ELEMENT or XML_ATTRIBUTE_NAME (1) but ", "Current state not XML_START_ELEMENT or XML_ATTRIBUTE_NAME (1) but ", "Current state not XML_START_ELEMENT or XML_ATTRIBUTE_NAME (1) but ");
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        xmlTokenStream0.next();
        xmlTokenStream0.next();
        int int0 = xmlTokenStream0.next();
        assertFalse(xmlTokenStream0.hasAttributes());
    }

    @Test(timeout = 4000)
    public void test2027() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        iIOMetadataNode0.setAttributeNS("Current state not XML_START_ELEMENT or XML_ATTRIBUTE_NAME (1) but ", "Current state not XML_START_ELEMENT or XML_ATTRIBUTE_NAME (1) but ", "Current state not XML_START_ELEMENT or XML_ATTRIBUTE_NAME (1) but ");
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        xmlTokenStream0.next();
        xmlTokenStream0.next();
        int int0 = xmlTokenStream0.next();
        assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test2128() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createJ2MEDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        xmlTokenStream0._currentState = 5;
        int int0 = xmlTokenStream0.next();
        assertEquals(2, xmlTokenStream0.getCurrentToken());
    }

    @Test(timeout = 4000)
    public void test2129() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createJ2MEDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        xmlTokenStream0._currentState = 5;
        int int0 = xmlTokenStream0.next();
        assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test2230() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, iIOMetadataNode0);
        xmlTokenStream0.next();
        xmlTokenStream0.next();
        int int0 = xmlTokenStream0.next();
        assertEquals(6, xmlTokenStream0.getCurrentToken());
    }

    @Test(timeout = 4000)
    public void test2231() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, iIOMetadataNode0);
        xmlTokenStream0.next();
        xmlTokenStream0.next();
        int int0 = xmlTokenStream0.next();
        assertEquals(6, int0);
    }

    @Test(timeout = 4000)
    public void test2332() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        xmlTokenStream0._currentState = 500;
        xmlTokenStream0.skipEndElement();
        assertEquals(1, wstxDOMWrappingReader0.getDepth());
    }

    @Test(timeout = 4000)
    public void test2333() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        xmlTokenStream0._currentState = 500;
        xmlTokenStream0.skipEndElement();
        assertTrue(wstxDOMWrappingReader0.isEndElement());
    }

    @Test(timeout = 4000)
    public void test2434() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        iIOMetadataNode0.appendChild(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, wstxDOMWrappingReader0);
        int int0 = xmlTokenStream0.next();
        assertEquals(1, wstxDOMWrappingReader0.getDepth());
    }

    @Test(timeout = 4000)
    public void test2435() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        iIOMetadataNode0.appendChild(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, wstxDOMWrappingReader0);
        int int0 = xmlTokenStream0.next();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test2536() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        XmlTokenStream xmlTokenStream1 = new XmlTokenStream(wstxDOMWrappingReader0, wstxDOMWrappingReader0);
        xmlTokenStream0.next();
        xmlTokenStream1.next();
        // Undeclared exception!
        try {
            xmlTokenStream1.next();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Expected to find a tag, instead reached end of input
            //
            verifyException("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test2637() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, readerConfig0);
        // Undeclared exception!
        try {
            xmlTokenStream0._handleRepeatElement();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Unrecognized type to repeat: 0
            //
            verifyException("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test2738() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, wstxDOMWrappingReader0);
        ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, ":e]t", ":e]t");
        xmlTokenStream0._currentWrapper = elementWrapper0;
        xmlTokenStream0.next();
        int int0 = xmlTokenStream0._handleRepeatElement();
        assertEquals(1, wstxDOMWrappingReader0.getDepth());
    }

    @Test(timeout = 4000)
    public void test2739() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, wstxDOMWrappingReader0);
        ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, ":e]t", ":e]t");
        xmlTokenStream0._currentWrapper = elementWrapper0;
        xmlTokenStream0.next();
        int int0 = xmlTokenStream0._handleRepeatElement();
        assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test2840() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, wstxDOMWrappingReader0);
        ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, ":e]t", ":e]t");
        ElementWrapper elementWrapper1 = elementWrapper0.intermediateWrapper();
        xmlTokenStream0._currentWrapper = elementWrapper1;
        xmlTokenStream0.next();
        assertEquals(1, wstxDOMWrappingReader0.getDepth());
    }

    @Test(timeout = 4000)
    public void test2841() throws Throwable {
        IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
        DOMSource dOMSource0 = new DOMSource(iIOMetadataNode0);
        ReaderConfig readerConfig0 = ReaderConfig.createFullDefaults();
        WstxDOMWrappingReader wstxDOMWrappingReader0 = WstxDOMWrappingReader.createFrom(dOMSource0, readerConfig0);
        wstxDOMWrappingReader0.next();
        XmlTokenStream xmlTokenStream0 = new XmlTokenStream(wstxDOMWrappingReader0, wstxDOMWrappingReader0);
        ElementWrapper elementWrapper0 = ElementWrapper.matchingWrapper((ElementWrapper) null, ":e]t", ":e]t");
        ElementWrapper elementWrapper1 = elementWrapper0.intermediateWrapper();
        xmlTokenStream0._currentWrapper = elementWrapper1;
        xmlTokenStream0.next();
        assertFalse(wstxDOMWrappingReader0.isStartElement());
    }
}
