/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 08:25:17 GMT 2024
 */
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Attribute_ESTest extends Attribute_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Attribute attribute0 = new Attribute("N*U", "", (Attributes) null);
        String string0 = attribute0.toString();
        assertEquals("N*U=\"\"", string0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Attribute attribute0 = Attribute.createFromEncoded(")&MqPq+N_WD~0g)I7", ")&MqPq+N_WD~0g)I7");
        boolean boolean0 = attribute0.equals(attribute0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Attribute attribute0 = new Attribute("gc<cuv", "gc<cuv");
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put(attribute0);
        assertSame(attributes0, attributes1);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Attribute attribute0 = new Attribute("gc<Jcuv", "gc<Jcuv");
        boolean boolean0 = attribute0.isDataAttribute();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Attribute attribute0 = new Attribute("DNM~DdFKi", (String) null);
        Attribute attribute1 = attribute0.clone();
        boolean boolean0 = attribute1.equals(attribute0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("utofocus", "   ", attributes0);
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        boolean boolean0 = attribute0.shouldCollapseAttribute(document_OutputSettings0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("utofocus", "   ", attributes0);
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        boolean boolean0 = attribute0.shouldCollapseAttribute(document_OutputSettings0);
        assertEquals("   ", attribute0.getValue());
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        Attribute attribute0 = new Attribute(" HE$`~]", " HE$`~]");
        attribute0.setKey(" HE$`~]");
        assertEquals("HE$`~]", attribute0.getKey());
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("V8", "V8", attributes0);
        attribute0.setKey("V8");
        assertEquals("V8", attribute0.getValue());
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("V8", "V8");
        Attribute attribute0 = new Attribute("V8", "V8", attributes0);
        attribute0.setKey("V8");
        assertEquals("V8", attribute0.getValue());
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("V8", "V8", attributes0);
        String string0 = attribute0.setValue("V8");
        assertEquals("V8", attribute0.getValue());
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("V8", "V8", attributes0);
        String string0 = attribute0.setValue("V8");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("V8", "V8");
        Attribute attribute0 = new Attribute("V8", "V8", attributes0);
        String string0 = attribute0.setValue("V8");
        assertEquals("V8", string0);
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        Attribute attribute0 = new Attribute("88(AB5&KC'1t9,6s", (String) null);
        String string0 = attribute0.toString();
        assertEquals("88(AB5&KC'1t9,6s", string0);
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        boolean boolean0 = Attribute.isDataAttribute("data-");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        boolean boolean0 = Attribute.isDataAttribute("data-,XQH&");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        Attribute attribute0 = Attribute.createFromEncoded("'Ttts,qLPBVL{2QO#q", "'Ttts,qLPBVL{2QO#q");
        StringWriter stringWriter0 = new StringWriter();
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
        document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
        attribute0.html((Appendable) stringWriter0, document_OutputSettings0);
        assertEquals("'Ttts,qLPBVL{2QO#q=\"'Ttts,qLPBVL{2QO#q\"", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        Attribute attribute0 = new Attribute("autofocus", "autofocus");
        String string0 = attribute0.toString();
        assertEquals("autofocus", string0);
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        Attribute attribute0 = new Attribute("formnovalidate", "formnovalidate");
        boolean boolean0 = attribute0.isBooleanAttribute();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        Attribute attribute0 = new Attribute("DNM~DdFKi", (String) null);
        boolean boolean0 = attribute0.isBooleanAttribute();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        Attribute attribute0 = new Attribute("QD_Ue!x", "QD_Ue!x");
        boolean boolean0 = attribute0.isBooleanAttribute();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        Attribute attribute0 = new Attribute("N*U", "", (Attributes) null);
        boolean boolean0 = attribute0.equals("");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1922() throws Throwable {
        Attribute attribute0 = new Attribute("N*U", "", (Attributes) null);
        boolean boolean0 = attribute0.equals("");
        assertEquals("", attribute0.getValue());
    }

    @Test(timeout = 4000)
    public void test2023() throws Throwable {
        Attribute attribute0 = new Attribute(".'+zf=}! e", (String) null);
        boolean boolean0 = attribute0.equals((Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2124() throws Throwable {
        Attribute attribute0 = new Attribute("data-]GsfEd 4EpRbab", "data-]GsfEd 4EpRbab");
        Attribute attribute1 = new Attribute("zsLZ)WSeE8&Rv+{hy", "zsLZ)WSeE8&Rv+{hy");
        boolean boolean0 = attribute0.equals(attribute1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        Attribute attribute0 = new Attribute(")&MqPq+N_WD~0g)I7", ")&MqPq+N_WD~0g)I7");
        Attribute attribute1 = attribute0.clone();
        boolean boolean0 = attribute1.equals(attribute0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        Attribute attribute0 = new Attribute("ultip", (String) null);
        Attribute attribute1 = new Attribute("ultip", "ultip");
        boolean boolean0 = attribute0.equals(attribute1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2327() throws Throwable {
        Attribute attribute0 = new Attribute("ultip", (String) null);
        Attribute attribute1 = new Attribute("ultip", "ultip");
        boolean boolean0 = attribute0.equals(attribute1);
        assertTrue(attribute1.equals((Object) attribute0));
    }

    @Test(timeout = 4000)
    public void test2428() throws Throwable {
        Attribute attribute0 = Attribute.createFromEncoded("'Ttts,qLPBVL{2QO#q", "'Ttts,qLPBVL{2QO#q");
        attribute0.hashCode();
    }

    @Test(timeout = 4000)
    public void test2529() throws Throwable {
        Attribute attribute0 = new Attribute("textarea", (String) null);
        attribute0.hashCode();
    }
}
