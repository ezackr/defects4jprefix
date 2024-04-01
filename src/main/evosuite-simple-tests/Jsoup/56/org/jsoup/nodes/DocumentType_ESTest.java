/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 22:07:10 GMT 2023
 */
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class DocumentType_ESTest extends DocumentType_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        DocumentType documentType0 = new DocumentType("e8?up$s./(0_%:bHdN|", "", "e8?up$s./(0_%:bHdN|", "e8?up$s./(0_%:bHdN|");
        StringBuilder stringBuilder0 = new StringBuilder(0);
        documentType0.outerHtmlTail(stringBuilder0, 1808, (Document.OutputSettings) null);
        assertEquals("e8?up$s./(0_%:bHdN|", documentType0.baseUri());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        DocumentType documentType0 = new DocumentType("*x]w,%gE4Y$_EE", ":SDJ", "*x]w,%gE4Y$_EE", "AttributeValue_doubleQuoted");
        CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "PUBLIC", 1, 1);
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        // Undeclared exception!
        try {
            documentType0.outerHtmlHead(charBuffer0, (-1617), document_OutputSettings0);
            fail("Expecting exception: ReadOnlyBufferException");
        } catch (ReadOnlyBufferException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.nio.CharBuffer", e);
        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        DocumentType documentType0 = new DocumentType("M9@)Y_%RC6pN_I3:)", "", "", "M9@)Y_%RC6pN_I3:)");
        Document.OutputSettings document_OutputSettings0 = documentType0.getOutputSettings();
        CharBuffer charBuffer0 = CharBuffer.allocate(0);
        // Undeclared exception!
        try {
            documentType0.outerHtmlHead(charBuffer0, 0, document_OutputSettings0);
            fail("Expecting exception: BufferOverflowException");
        } catch (BufferOverflowException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.nio.CharBuffer", e);
        }
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        DocumentType documentType0 = new DocumentType("name", "name", "s", "LRs'Ti^7lA'`1*vz+");
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        // Undeclared exception!
        try {
            documentType0.outerHtmlHead((Appendable) null, 0, document_OutputSettings0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.nodes.DocumentType", e);
        }
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        DocumentType documentType0 = null;
        try {
            documentType0 = new DocumentType((String) null, (String) null, "org.jsoup.select.Evaluator$AttributeWithValueContaining", "org.jsoup.select.Evaluator$AttributeWithValueContaining");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        DocumentType documentType0 = new DocumentType("e8?up$s./(0_%:bHdN|", "", "e8?up$s./(0_%:bHdN|", "e8?up$s./(0_%:bHdN|");
        String string0 = documentType0.nodeName();
        assertEquals("#doctype", string0);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        DocumentType documentType0 = new DocumentType("X1$&o9Q]63Jhm>`E,Z5", "", "X1$&o9Q]63Jhm>`E,Z5", "X1$&o9Q]63Jhm>`E,Z5");
        String string0 = documentType0.outerHtml();
        assertEquals("<!DOCTYPE X1$&o9Q]63Jhm>`E,Z5 \"X1$&o9Q]63Jhm>`E,Z5\">", string0);
    }

    @Test(timeout = 4000)
    public void test67() throws Throwable {
        DocumentType documentType0 = new DocumentType("X1$&o9Q]63Jhm>`E,Z5", "", "X1$&o9Q]63Jhm>`E,Z5", "X1$&o9Q]63Jhm>`E,Z5");
        String string0 = documentType0.outerHtml();
        assertEquals("#doctype", documentType0.nodeName());
    }

    @Test(timeout = 4000)
    public void test78() throws Throwable {
        DocumentType documentType0 = new DocumentType("FVfX22", "FVfX22", "FVfX22", "FVfX22");
        String string0 = documentType0.toString();
        assertEquals("#doctype", documentType0.nodeName());
    }

    @Test(timeout = 4000)
    public void test79() throws Throwable {
        DocumentType documentType0 = new DocumentType("FVfX22", "FVfX22", "FVfX22", "FVfX22");
        String string0 = documentType0.toString();
        assertEquals("<!DOCTYPE FVfX22 PUBLIC \"FVfX22\" \"FVfX22\">", string0);
    }

    @Test(timeout = 4000)
    public void test810() throws Throwable {
        DocumentType documentType0 = new DocumentType("", "", "", "");
        StringWriter stringWriter0 = new StringWriter();
        Document.OutputSettings document_OutputSettings0 = documentType0.getOutputSettings();
        Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
        documentType0.outerHtmlHead(stringWriter0, (-2156), document_OutputSettings1);
        assertEquals("<!DOCTYPE>", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test911() throws Throwable {
        DocumentType documentType0 = new DocumentType(" PUBLIC \"", " PUBLIC \"", "Zur`0X0?1G`1b ^\"", " PUBLIC \"");
        PipedWriter pipedWriter0 = new PipedWriter();
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        try {
            documentType0.outerHtmlHead(pipedWriter0, 225, document_OutputSettings0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Pipe not connected
            //
            verifyException("java.io.PipedWriter", e);
        }
    }
}
