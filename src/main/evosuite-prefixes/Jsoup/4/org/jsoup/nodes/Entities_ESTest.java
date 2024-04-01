/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 20:24:50 GMT 2023
 */
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Entities_ESTest extends Entities_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        String string0 = Entities.unescape("");
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Document document0 = new Document("jT[b");
        Document.OutputSettings document_OutputSettings0 = document0.new OutputSettings();
        String string0 = Entities.escape("", document_OutputSettings0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Charset charset0 = Charset.defaultCharset();
        CharsetEncoder charsetEncoder0 = charset0.newEncoder();
        Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.base;
        String string0 = Entities.escape("Ubi*BVLuS\"c%", charsetEncoder0, entities_EscapeMode0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Charset charset0 = Charset.defaultCharset();
        CharsetEncoder charsetEncoder0 = charset0.newEncoder();
        Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.extended;
        String string0 = Entities.escape("", charsetEncoder0, entities_EscapeMode0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Entities.unescape((String) null);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Entities.unescape("&bsol;&lcub;e");
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Entities.escape((String) null, (Document.OutputSettings) null);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.extended;
        Entities.escape("au(C{mK <vz", (CharsetEncoder) null, entities_EscapeMode0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        String string0 = Entities.unescape("&F");
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        String string0 = Entities.unescape("im ]C&#EOe");
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        String string0 = Entities.unescape("au(C{mK &lt;vz");
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Document document0 = new Document("");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.extended;
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.escapeMode(entities_EscapeMode0);
        String string0 = Entities.escape("sfr", document_OutputSettings1);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Entities entities0 = new Entities();
    }
}
