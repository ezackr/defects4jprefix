/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 03:57:21 GMT 2023
 */
package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang.StringEscapeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class StringEscapeUtils_ESTest extends StringEscapeUtils_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringEscapeUtils.escapeJava((Writer) stringWriter0, "=@|T\"e P");
        assertEquals("=@|T\\\"e P", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        String string0 = StringEscapeUtils.escapeJava(".-I{75.|SH5's[");
        assertEquals(".-I{75.|SH5's[", string0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        String string0 = StringEscapeUtils.unescapeJavaScript("wd?%");
        assertEquals("wd?%", string0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, "M $dE{_NnI!E");
        assertEquals("M $dE{_NnI!E", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "x<,");
        assertEquals("x<,", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, "[{_-7ewOCzUtA\\T0");
        assertEquals("[{_-7ewOCzUtAT0", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        String string0 = "\\u000";
        String string1 = StringEscapeUtils.unescapeXml(string0);
        assertEquals("\\u000", string1);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        String string0 = StringEscapeUtils.unescapeJavaScript("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        String string0 = StringEscapeUtils.unescapeJava("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        String string0 = StringEscapeUtils.unescapeHtml("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        String string0 = StringEscapeUtils.escapeXml("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        String string0 = "\\u0";
        String string1 = StringEscapeUtils.escapeSql(string0);
        assertEquals("\\u0", string1);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        String string0 = StringEscapeUtils.escapeJavaScript("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        String string0 = StringEscapeUtils.escapeJava("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        String string0 = StringEscapeUtils.escapeHtml("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        String string0 = "Q+3q\\u==+CQ{";
        // Undeclared exception!
        try {
            StringEscapeUtils.unescapeJavaScript(string0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // Unable to parse unicode value: ==+C
            //
            verifyException("org.apache.commons.lang.StringEscapeUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        String string0 = "Q+3q\\u==+CQ{";
        StringWriter stringWriter0 = new StringWriter(0);
        // Undeclared exception!
        try {
            StringEscapeUtils.unescapeJavaScript((Writer) stringWriter0, string0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // Unable to parse unicode value: ==+C
            //
            verifyException("org.apache.commons.lang.StringEscapeUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        // Undeclared exception!
        try {
            StringEscapeUtils.unescapeJavaScript((Writer) null, "*FCz*8fg$85vkSW56N(");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The Writer must not be null
            //
            verifyException("org.apache.commons.lang.StringEscapeUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        // Undeclared exception!
        try {
            StringEscapeUtils.escapeJavaScript((Writer) null, "8206");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The Writer must not be null
            //
            verifyException("org.apache.commons.lang.StringEscapeUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringEscapeUtils.unescapeHtml((Writer) stringWriter0, "\\u0");
        assertEquals("\\u0", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        StringEscapeUtils.escapeHtml((Writer) stringWriter0, "PV0T?BM%|b>Edq'bC");
        assertEquals("PV0T?BM%|b&gt;Edq'bC", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(16);
        String string0 = "j\\uoH=lX@";
        // Undeclared exception!
        try {
            StringEscapeUtils.unescapeJava((Writer) stringWriter0, string0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // Unable to parse unicode value: oH=l
            //
            verifyException("org.apache.commons.lang.StringEscapeUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        String string0 = StringEscapeUtils.unescapeJava((String) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        String string0 = "\\u0";
        String string1 = StringEscapeUtils.escapeJavaScript(string0);
        assertEquals("\\\\u0", string1);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        String string0 = StringEscapeUtils.escapeSql((String) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        String string0 = StringEscapeUtils.escapeSql("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        String string0 = StringEscapeUtils.unescapeXml((String) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        String string0 = StringEscapeUtils.unescapeXml("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        StringEscapeUtils.unescapeXml((Writer) stringWriter0, "925");
        assertEquals("925", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        // Undeclared exception!
        try {
            StringEscapeUtils.unescapeXml((Writer) null, "pEQwj");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The Writer must not be null.
            //
            verifyException("org.apache.commons.lang.StringEscapeUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
        assertEquals("", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        String string0 = StringEscapeUtils.escapeXml((String) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        String string0 = StringEscapeUtils.escapeXml("Mw:U@A~]A\"+'T=k<DH");
        assertEquals("Mw:U@A~]A&quot;+&apos;T=k&lt;DH", string0);
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringEscapeUtils.escapeXml((Writer) stringWriter0, "rang");
        assertEquals("rang", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        // Undeclared exception!
        try {
            StringEscapeUtils.escapeXml((Writer) null, "org.apache.commons.lang.StringEscapeUtils");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The Writer must not be null.
            //
            verifyException("org.apache.commons.lang.StringEscapeUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
        assertEquals("", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test3636() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
        assertEquals("", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test3737() throws Throwable {
        // Undeclared exception!
        try {
            StringEscapeUtils.unescapeHtml((Writer) null, "sigma");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The Writer must not be null.
            //
            verifyException("org.apache.commons.lang.StringEscapeUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test3838() throws Throwable {
        String string0 = StringEscapeUtils.unescapeHtml((String) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test3939() throws Throwable {
        String string0 = StringEscapeUtils.unescapeHtml("m?a4");
        assertEquals("m?a4", string0);
    }

    @Test(timeout = 4000)
    public void test3940() throws Throwable {
        String string0 = StringEscapeUtils.unescapeHtml("m?a4");
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test4041() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
        assertEquals("", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test4142() throws Throwable {
        // Undeclared exception!
        try {
            StringEscapeUtils.escapeHtml((Writer) null, "");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The Writer must not be null.
            //
            verifyException("org.apache.commons.lang.StringEscapeUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test4243() throws Throwable {
        String string0 = StringEscapeUtils.escapeHtml((String) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test4344() throws Throwable {
        String string0 = StringEscapeUtils.escapeHtml("!eMgGmVz");
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test4345() throws Throwable {
        String string0 = StringEscapeUtils.escapeHtml("!eMgGmVz");
        assertEquals("!eMgGmVz", string0);
    }

    @Test(timeout = 4000)
    public void test4446() throws Throwable {
        String string0 = StringEscapeUtils.unescapeJava("5'{GEwz?V]A[/hbiDW");
        assertEquals("5'{GEwz?V]A[/hbiDW", string0);
    }

    @Test(timeout = 4000)
    public void test4547() throws Throwable {
        String string0 = StringEscapeUtils.unescapeJava("Mw:U@A~]A\\\"+'T=k<DH");
        assertEquals("Mw:U@A~]A\"+'T=k<DH", string0);
    }

    @Test(timeout = 4000)
    public void test4648() throws Throwable {
        String string0 = "Q+3q\\u==+CQ{";
        // Undeclared exception!
        try {
            StringEscapeUtils.unescapeJava(string0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // Unable to parse unicode value: ==+C
            //
            verifyException("org.apache.commons.lang.StringEscapeUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test4749() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
        assertEquals("", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test4850() throws Throwable {
        // Undeclared exception!
        try {
            StringEscapeUtils.unescapeJava((Writer) null, (String) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The Writer must not be null
            //
            verifyException("org.apache.commons.lang.StringEscapeUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test4951() throws Throwable {
        String string0 = StringEscapeUtils.escapeJava("S\ra");
        assertEquals("S\\ra", string0);
    }

    @Test(timeout = 4000)
    public void test5052() throws Throwable {
        // Undeclared exception!
        try {
            StringEscapeUtils.escapeJava((Writer) null, "");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The Writer must not be null
            //
            verifyException("org.apache.commons.lang.StringEscapeUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test5153() throws Throwable {
        String string0 = StringEscapeUtils.escapeJavaScript("Axn(5sbLt,J'}");
        assertEquals("Axn(5sbLt,J\\'}", string0);
    }

    @Test(timeout = 4000)
    public void test5254() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(0);
        StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, (String) null);
        assertEquals("", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test5355() throws Throwable {
        String string0 = StringEscapeUtils.escapeJava((String) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test5456() throws Throwable {
        StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
    }

    @Test(timeout = 4000)
    public void test5557() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringEscapeUtils.escapeJava((Writer) stringWriter0, "CYl\u0006d");
        assertEquals("CYl\\u0006d", stringWriter0.toString());
    }

    @Test(timeout = 4000)
    public void test5658() throws Throwable {
        String string0 = StringEscapeUtils.escapeJavaScript((String) null);
        String string1 = StringEscapeUtils.unescapeJavaScript(string0);
        assertNull(string1);
    }
}
