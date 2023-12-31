/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 22:13:41 GMT 2023
 */
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Attributes_ESTest extends Attributes_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("org.jsoup.parser.htmltreebuilder", "org.jsoup.parser.htmltreebuilder");
        String string0 = attributes0.html();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("org.jsoup.parser.htmltreebuilder", "org.jsoup.parser.htmltreebuilder");
        String string0 = attributes0.getIgnoreCase("org.jsoup.parser.htmltreebuilder");
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("LP", ";6:");
        attributes0.put("<pJ7;,4h;6", "org.jsoup.nodes.Attributes");
        attributes0.removeIgnoreCase("LP");
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.removeIgnoreCase((String) null);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.remove("");
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put((Attribute) null);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("", false);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("", "Vd26x-!(v:1Spc");
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("~", "~");
        CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "~");
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        attributes0.html((Appendable) charBuffer0, document_OutputSettings0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("JSNv)K f=", "JSNv)K f=");
        char[] charArray0 = new char[7];
        CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 1, 1);
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        attributes0.html((Appendable) charBuffer0, document_OutputSettings0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.getIgnoreCase((String) null);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.get("");
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.addAll((Attributes) null);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("extended", "");
        attributes0.put(attribute0);
        StringWriter stringWriter0 = new StringWriter(1);
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        attributes0.html((Appendable) stringWriter0, document_OutputSettings0);
        stringWriter0.toString();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = Attribute.createFromEncoded("c95j|260*~ B)Z", "c95j|260*~ B)Z");
        attributes0.put(attribute0);
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        attributes0.html((Appendable) null, document_OutputSettings0);
    }

    @Test(timeout = 4000)
    public void test1615() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.dataset();
        Iterator<Attribute> iterator0 = attributes0.iterator();
    }

    @Test(timeout = 4000)
    public void test1816() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = Attribute.createFromEncoded("My?K}U1Qxkb*%", "");
        attributes0.put(attribute0);
        int int0 = attributes0.size();
    }

    @Test(timeout = 4000)
    public void test1917() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.dataset();
        Attribute attribute0 = new Attribute("\"JVE@`", "");
        attributes0.put(attribute0);
        attribute0.getKey();
    }

    @Test(timeout = 4000)
    public void test2018() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("(7z< exM", true);
        Map<String, String> map0 = attributes0.dataset();
        map0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test2319() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.clone();
        attributes1.dataset();
        boolean boolean0 = attributes0.equals(attributes1);
        attributes1.equals((Object) attributes0);
    }

    @Test(timeout = 4000)
    public void test2320() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.clone();
        attributes1.dataset();
        boolean boolean0 = attributes0.equals(attributes1);
    }

    @Test(timeout = 4000)
    public void test2421() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.clone();
        attributes0.put("FSNv)KVf=", "FSNv)KVf=");
        boolean boolean0 = attributes0.equals(attributes1);
        attributes1.equals((Object) attributes0);
    }

    @Test(timeout = 4000)
    public void test2422() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.clone();
        attributes0.put("FSNv)KVf=", "FSNv)KVf=");
        boolean boolean0 = attributes0.equals(attributes1);
    }

    @Test(timeout = 4000)
    public void test2523() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("inert", "y|");
        Attributes attributes1 = attributes0.clone();
        boolean boolean0 = attributes1.equals(attributes0);
    }

    @Test(timeout = 4000)
    public void test2524() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("inert", "y|");
        Attributes attributes1 = attributes0.clone();
        boolean boolean0 = attributes1.equals(attributes0);
    }

    @Test(timeout = 4000)
    public void test2625() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.clone();
        boolean boolean0 = attributes1.equals(attributes0);
    }

    @Test(timeout = 4000)
    public void test2726() throws Throwable {
        Attributes attributes0 = new Attributes();
        boolean boolean0 = attributes0.equals(attributes0);
    }

    @Test(timeout = 4000)
    public void test2827() throws Throwable {
        Attributes attributes0 = new Attributes();
        boolean boolean0 = attributes0.equals("Mg%Sh%.LJOm@^");
    }

    @Test(timeout = 4000)
    public void test2928() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("inert", "y|");
        String string0 = attributes0.toString();
    }

    @Test(timeout = 4000)
    public void test3029() throws Throwable {
        Attributes attributes0 = new Attributes();
        List<Attribute> list0 = attributes0.asList();
        list0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test3130() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("W\"!ryb\"", "W\"!ryb\"");
        List<Attribute> list0 = attributes0.asList();
        list0.size();
    }

    @Test(timeout = 4000)
    public void test3231() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("inert", "y|");
        Iterator<Attribute> iterator0 = attributes0.iterator();
    }

    @Test(timeout = 4000)
    public void test3332() throws Throwable {
        Attributes attributes0 = new Attributes();
        Iterator<Attribute> iterator0 = attributes0.iterator();
    }

    @Test(timeout = 4000)
    public void test3433() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = new Attributes();
        attributes0.put("(7z< exM", true);
        attributes0.equals((Object) attributes1);
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = new Attributes();
        attributes0.put("(7z< exM", true);
        attributes1.addAll(attributes0);
        attributes0.equals((Object) attributes1);
    }

    @Test(timeout = 4000)
    public void test3635() throws Throwable {
        Attributes attributes0 = new Attributes();
        int int0 = attributes0.size();
    }

    @Test(timeout = 4000)
    public void test3836() throws Throwable {
        Attributes attributes0 = new Attributes();
        boolean boolean0 = attributes0.hasKeyIgnoreCase("FSNv)KVf=");
    }

    @Test(timeout = 4000)
    public void test3937() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("W\"!ryb\"", "W\"!ryb\"");
        boolean boolean0 = attributes0.hasKeyIgnoreCase(" ");
    }

    @Test(timeout = 4000)
    public void test4038() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("CommentStartDash", "CommentStartDash");
        boolean boolean0 = attributes0.hasKey("CommentStartDash");
    }

    @Test(timeout = 4000)
    public void test4139() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("W\"!ryb\"", "W\"!ryb\"");
        boolean boolean0 = attributes0.hasKey("J9/iSo/u(:j8s");
    }

    @Test(timeout = 4000)
    public void test4240() throws Throwable {
        Attributes attributes0 = new Attributes();
        boolean boolean0 = attributes0.hasKey("CommentStartDash");
    }

    @Test(timeout = 4000)
    public void test4641() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("entities-full.propert-es", true);
        String string0 = attributes0.getIgnoreCase("entities-full.propert-es");
    }

    @Test(timeout = 4000)
    public void test4742() throws Throwable {
        Attributes attributes0 = new Attributes();
        String string0 = attributes0.getIgnoreCase("FSNv)KVf=");
    }

    @Test(timeout = 4000)
    public void test4843() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("W\"!ryb\"", "W\"!ryb\"");
        String string0 = attributes0.getIgnoreCase(" ");
    }

    @Test(timeout = 4000)
    public void test4944() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("FSNv)KVf=", "FSNv)KVf=");
        String string0 = attributes0.get("FSNv)KVf=");
    }

    @Test(timeout = 4000)
    public void test5045() throws Throwable {
        Attributes attributes0 = new Attributes();
        String string0 = attributes0.get("entities-full.propert-es");
    }

    @Test(timeout = 4000)
    public void test5146() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("entities-full.properties", true);
        String string0 = attributes0.get(" ");
    }

    @Test(timeout = 4000)
    public void test5247() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("inert", "y|");
        boolean boolean0 = attributes0.hasKeyIgnoreCase("inert");
    }

    @Test(timeout = 4000)
    public void test5348() throws Throwable {
        Attributes attributes0 = new Attributes();
        String string0 = attributes0.toString();
    }

    @Test(timeout = 4000)
    public void test5449() throws Throwable {
        Attributes attributes0 = new Attributes();
        String string0 = attributes0.html();
    }
}
