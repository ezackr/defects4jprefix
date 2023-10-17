/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 00:27:12 GMT 2023
 */
package org.apache.commons.jxpath.ri;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.junit.runner.RunWith;

public class NamespaceResolverTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        QName qName0 = new QName("+THH#@na:M", "");
        VariablePointer variablePointer0 = new VariablePointer(qName0);
        namespaceResolver0.setNamespaceContextPointer(variablePointer0);
        String string0 = namespaceResolver0.getNamespaceURI("<<unknown namespace>>");
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        namespaceResolver0.seal();
        boolean boolean0 = namespaceResolver0.isSealed();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        QName qName0 = new QName((String) null, "j;");
        VariablePointer variablePointer0 = new VariablePointer(qName0);
        namespaceResolver0.registerNamespace("", "SdpXe2");
        namespaceResolver0.setNamespaceContextPointer(variablePointer0);
        String string0 = namespaceResolver0.getPrefix("SdpXe2");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        QName qName0 = new QName((String) null, "j;");
        VariablePointer variablePointer0 = new VariablePointer(qName0);
        namespaceResolver0.registerNamespace("", "SdpXe2");
        namespaceResolver0.setNamespaceContextPointer(variablePointer0);
        String string0 = namespaceResolver0.getPrefix("SdpXe2");
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        namespaceResolver0.registerNamespace("<<unknown namespace>>", "<<unknown namespace>>");
        String string0 = namespaceResolver0.getNamespaceURI("<<unknown namespace>>");
        assertEquals("<<unknown namespace>>", string0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        namespaceResolver0.namespaceMap = null;
        // Undeclared exception!
        try {
            namespaceResolver0.registerNamespace("xml:space", "xml:space");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
        namespaceResolver0.reverseMap = hashMap0;
        Integer integer0 = new Integer(2427);
        hashMap0.put("", integer0);
        // Undeclared exception!
        try {
            namespaceResolver0.getPrefix("");
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // java.lang.Integer cannot be cast to java.lang.String
        }
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        namespaceResolver0.namespaceMap = null;
        // Undeclared exception!
        try {
            namespaceResolver0.getNamespaceURI("");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        HashMap<String, NamespaceResolver> hashMap0 = new HashMap<String, NamespaceResolver>();
        hashMap0.put("o", namespaceResolver0);
        namespaceResolver0.namespaceMap = hashMap0;
        // Undeclared exception!
        try {
            namespaceResolver0.getNamespaceURI("o");
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // org.apache.commons.jxpath.ri.NamespaceResolver cannot be cast to java.lang.String
        }
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
        namespaceResolver1.seal();
        assertTrue(namespaceResolver1.isSealed());
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
        QName qName0 = new QName(">");
        VariablePointer variablePointer0 = new VariablePointer(qName0);
        namespaceResolver1.setNamespaceContextPointer(variablePointer0);
        // Undeclared exception!
        try {
            namespaceResolver1.getPrefix("<<unknown namespace>>");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        QName qName0 = new QName((String) null, (String) null);
        VariablePointer variablePointer0 = new VariablePointer(qName0);
        namespaceResolver0.registerNamespace("<<unknown namespace>>", "<<unknown namespace>>");
        namespaceResolver0.setNamespaceContextPointer(variablePointer0);
        String string0 = namespaceResolver0.getPrefix("<<unknown namespace>>");
        assertEquals("<<unknown namespace>>", string0);
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        QName qName0 = new QName((String) null, (String) null);
        VariablePointer variablePointer0 = new VariablePointer(qName0);
        namespaceResolver0.setNamespaceContextPointer(variablePointer0);
        namespaceResolver0.getPrefix("<<unknown namespace>>");
        String string0 = namespaceResolver0.getPrefix("<<unknown namespace>>");
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
        String string0 = namespaceResolver1.getNamespaceURI("K,':[");
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        NamespaceResolver namespaceResolver1 = new NamespaceResolver(namespaceResolver0);
        Pointer pointer0 = namespaceResolver1.getNamespaceContextPointer();
        assertNull(pointer0);
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver((NamespaceResolver) null);
        Pointer pointer0 = namespaceResolver0.getNamespaceContextPointer();
        assertNull(pointer0);
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        QName qName0 = new QName(">");
        VariablePointer variablePointer0 = new VariablePointer(qName0);
        namespaceResolver0.setNamespaceContextPointer(variablePointer0);
        VariablePointer variablePointer1 = (VariablePointer) namespaceResolver0.getNamespaceContextPointer();
        assertFalse(variablePointer1.isNode());
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        namespaceResolver0.seal();
        // Undeclared exception!
        try {
            namespaceResolver0.registerNamespace((String) null, (String) null);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Cannot register namespaces on a sealed NamespaceResolver
        }
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver((NamespaceResolver) null);
        namespaceResolver0.registerNamespace("", "");
        String string0 = namespaceResolver0.getNamespaceURI("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        boolean boolean0 = namespaceResolver0.isSealed();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver();
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName("", "");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        namespaceResolver0.setNamespaceContextPointer(variablePointer0);
        // Undeclared exception!
        try {
            namespaceResolver0.getPrefix("");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // No such variable: ':'
        }
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver((NamespaceResolver) null);
        NamespaceResolver namespaceResolver1 = (NamespaceResolver) namespaceResolver0.clone();
        assertNotSame(namespaceResolver1, namespaceResolver0);
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver((NamespaceResolver) null);
        NamespaceResolver namespaceResolver1 = (NamespaceResolver) namespaceResolver0.clone();
        assertFalse(namespaceResolver1.isSealed());
    }

    @Test(timeout = 4000)
    public void test2023() throws Throwable {
        NamespaceResolver namespaceResolver0 = new NamespaceResolver((NamespaceResolver) null);
        NamespaceResolver namespaceResolver1 = (NamespaceResolver) namespaceResolver0.clone();
        assertNotNull(namespaceResolver1);
    }
}
