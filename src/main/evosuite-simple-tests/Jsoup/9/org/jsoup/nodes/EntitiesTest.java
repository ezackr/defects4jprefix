/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 20:34:25 GMT 2023
 */
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.junit.runner.RunWith;

public class EntitiesTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        String string0 = Entities.unescape("\"*8*s&#b8&PCUv");
        assertEquals("\"*8*s&#b8&PCUv", string0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        String string0 = Entities.unescape("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Document document0 = new Document("");
        Document.OutputSettings document_OutputSettings0 = document0.new OutputSettings();
        String string0 = Entities.escape("", document_OutputSettings0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Charset charset0 = Charset.defaultCharset();
        CharsetEncoder charsetEncoder0 = charset0.newEncoder();
        Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.base;
        String string0 = Entities.escape("VJH87i u?7SyC3", charsetEncoder0, entities_EscapeMode0);
        assertEquals("VJH87i u?7SyC3", string0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
        String string0 = Entities.escape("", (CharsetEncoder) null, entities_EscapeMode0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        // Undeclared exception!
        try {
            Entities.unescape((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        // Undeclared exception!
        try {
            Entities.escape("vdu)C", (Document.OutputSettings) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
        // Undeclared exception!
        try {
            Entities.escape((String) null, (CharsetEncoder) null, entities_EscapeMode0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
        Map<Character, String> map0 = entities_EscapeMode0.getMap();
        assertEquals(5, map0.size());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        String string0 = Entities.unescape("*]*&#2K'&paJ^Ut");
        assertEquals("*]*\u0002K'&paJ^Ut", string0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        String string0 = Entities.unescape("/`j=ZW-WY&gt;o1vM");
        assertEquals("/`j=ZW-WY>o1vM", string0);
    }

    @Test(timeout = 4000)
    public void test1211() throws Throwable {
        Document document0 = new Document("/`j=ZW-WY>o1vM");
        Document.OutputSettings document_OutputSettings0 = document0.new OutputSettings();
        String string0 = Entities.escape("/`j=ZW-WY>o1vM", document_OutputSettings0);
        assertEquals("/`j=ZW-WY&gt;o1vM", string0);
    }
}
