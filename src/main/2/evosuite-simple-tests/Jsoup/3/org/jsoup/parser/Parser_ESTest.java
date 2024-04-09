/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 01:05:55 GMT 2024
 */
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Parser_ESTest extends Parser_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Document document0 = Parser.parseBodyFragment("*<title", "*<title");
        assertEquals("*<title", document0.baseUri());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Document document0 = Parser.parseBodyFragment("<?", "<?");
        assertEquals("#root", document0.tagName());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Document document0 = Parser.parseBodyFragment("<![CDATA[", "<![CDATA[");
        assertEquals("<![CDATA[", document0.baseUri());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Document document0 = Parser.parse("<BasE</x^MR", "<BasE</x^MR");
        assertEquals("#root", document0.tagName());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Document document0 = Parser.parse("<!--", "<!--");
        assertEquals("#document", document0.nodeName());
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Document document0 = Parser.parse("<!", "<!");
        assertEquals("#document", document0.nodeName());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Document document0 = Parser.parse("<!---", "<!---");
        assertEquals("#document", document0.nodeName());
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Document document0 = Parser.parse("</", "</");
        assertEquals("#document", document0.nodeName());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Document document0 = Parser.parse("<b<TD[rs[xK.E-0R<", "<b<TD[rs[xK.E-0R<");
        assertEquals("#root", document0.tagName());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Document document0 = Parser.parseBodyFragment("Ig$C?e<0/>0$^v4", "Ig$C?e<0/>0$^v4");
        assertEquals("#root", document0.tagName());
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Document document0 = Parser.parse("DNM<02fgTc-y=C<j</j", "DNM<02fgTc-y=C<j</j");
        assertEquals("#document", document0.nodeName());
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Document document0 = Parser.parse("q<K4Li-='M<j", "q<K4Li-='M<j");
        assertEquals("#document", document0.nodeName());
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Document document0 = Parser.parseBodyFragment("DN<cfTc:=\"C#</R7#", "DN<cfTc:=\"C#</R7#");
        assertFalse(document0.isBlock());
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Document document0 = Parser.parse("]]<dduH?=A YPqO<", "]]<dduH?=A YPqO<");
        assertEquals("#document", document0.nodeName());
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        // Undeclared exception!
        try {
            Parser.parse("J!g-5_.uA8b<13&=D", "J!g-5_.uA8b<13&=D");
            fail("Expecting exception: NoSuchElementException");
        } catch (NoSuchElementException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.LinkedList", e);
        }
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Document document0 = Parser.parseBodyFragment("<1</j", "<1</j");
        assertFalse(document0.isBlock());
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Document document0 = Parser.parse("<1</j", "<1</j");
        assertEquals("<1</j", document0.baseUri());
    }
}
