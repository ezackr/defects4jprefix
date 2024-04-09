/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 08:25:34 GMT 2024
 */
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Comment_ESTest extends Comment_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Comment comment0 = new Comment("R/g(d'YquK");
        comment0.asXmlDeclaration();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Comment comment0 = new Comment("g?OC4o G^;09_", "g?OC4o G^;09_");
        // Undeclared exception!
        try {
            comment0.asXmlDeclaration();
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
            //
            verifyException("java.util.ArrayList", e);
        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Comment comment0 = new Comment("<.23g}'754qX%", "<.23g}'754qX%");
        String string0 = comment0.toString();
        assertEquals("\n<!--<.23g}'754qX%-->", string0);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        Comment comment0 = new Comment("<.23g}'754qX%", "<.23g}'754qX%");
        String string0 = comment0.toString();
        assertEquals("#comment", comment0.nodeName());
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        Comment comment0 = new Comment("<.23g}'754qX%", "<.23g}'754qX%");
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.prettyPrint(false);
        // Undeclared exception!
        try {
            comment0.outerHtmlHead((Appendable) null, 0, document_OutputSettings1);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.nodes.Comment", e);
        }
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        Comment comment0 = new Comment("");
        boolean boolean0 = comment0.isXmlDeclaration();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        Comment comment0 = new Comment("");
        boolean boolean0 = comment0.isXmlDeclaration();
        assertEquals("#comment", comment0.nodeName());
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        Comment comment0 = new Comment("!yi>}g+Qr6!-.,skGc", "B|K@9Tr<*>vaB$q,");
        boolean boolean0 = comment0.isXmlDeclaration();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test58() throws Throwable {
        Comment comment0 = new Comment("!yi>}g+Qr6!-.,skGc", "B|K@9Tr<*>vaB$q,");
        boolean boolean0 = comment0.isXmlDeclaration();
        assertEquals("#comment", comment0.nodeName());
    }

    @Test(timeout = 4000)
    public void test69() throws Throwable {
        Comment comment0 = new Comment("^@xkxA.:esC_P~P");
        boolean boolean0 = comment0.isXmlDeclaration();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test610() throws Throwable {
        Comment comment0 = new Comment("^@xkxA.:esC_P~P");
        boolean boolean0 = comment0.isXmlDeclaration();
        assertEquals("#comment", comment0.nodeName());
    }
}
