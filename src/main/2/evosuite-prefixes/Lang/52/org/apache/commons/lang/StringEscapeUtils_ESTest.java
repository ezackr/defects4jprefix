/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 15:11:55 GMT 2024
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
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class StringEscapeUtils_ESTest extends StringEscapeUtils_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringEscapeUtils.escapeJava((Writer) stringWriter0, (String) null);
        stringWriter0.toString();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        String string0 = StringEscapeUtils.escapeJavaScript(" \t\r\n\b");
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        StringEscapeUtils.unescapeJavaScript((Writer) null, "1OH(w:[2zrBD30?(UT");
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        String string0 = StringEscapeUtils.escapeJava("\n");
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, "The Writer must not be null");
        stringWriter0.toString();
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        String string0 = StringEscapeUtils.escapeJava((String) null);
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        StringEscapeUtils.escapeJava((Writer) null, "YQp;IDCa&*");
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        String string0 = StringEscapeUtils.escapeJava("CEO5:.M))+U>\"A59]wN");
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        String string0 = StringEscapeUtils.escapeJava("'xm]a=tNq+t");
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        String string0 = "\\u000";
        String string1 = StringEscapeUtils.escapeJava(string0);
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        String string0 = StringEscapeUtils.escapeJavaScript("''");
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        String string0 = StringEscapeUtils.unescapeJava((String) null);
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringEscapeUtils.unescapeJava((Writer) stringWriter0, (String) null);
        stringWriter0.toString();
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        String string0 = "\\u00W0";
        StringEscapeUtils.unescapeJava(string0);
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        String string0 = StringEscapeUtils.unescapeJavaScript("L\\csRA");
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        String string0 = StringEscapeUtils.unescapeJavaScript("s\nRd");
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        String string0 = StringEscapeUtils.unescapeJava("po)fJ.}S5b<8lWzT!");
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        String string0 = StringEscapeUtils.escapeHtml("The WritAr must not be null");
    }

    @Test(timeout = 4000)
    public void test1922() throws Throwable {
        String string0 = StringEscapeUtils.escapeHtml((String) null);
    }

    @Test(timeout = 4000)
    public void test2023() throws Throwable {
        StringEscapeUtils.escapeHtml((Writer) null, (String) null);
    }

    @Test(timeout = 4000)
    public void test2124() throws Throwable {
        StringWriter stringWriter0 = new StringWriter(84);
        StringEscapeUtils.escapeHtml((Writer) stringWriter0, (String) null);
        stringWriter0.toString();
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        String string0 = StringEscapeUtils.unescapeHtml("The Writer must not be null");
    }

    @Test(timeout = 4000)
    public void test2327() throws Throwable {
        String string0 = StringEscapeUtils.unescapeHtml((String) null);
    }

    @Test(timeout = 4000)
    public void test2428() throws Throwable {
        StringEscapeUtils.unescapeHtml((Writer) null, "1OH(w:[2zrBD30?(UT");
    }

    @Test(timeout = 4000)
    public void test2529() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringEscapeUtils.unescapeHtml((Writer) stringWriter0, (String) null);
        stringWriter0.toString();
    }

    @Test(timeout = 4000)
    public void test2630() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringEscapeUtils.escapeXml((Writer) stringWriter0, "UO56(X");
        stringWriter0.toString();
    }

    @Test(timeout = 4000)
    public void test2731() throws Throwable {
        StringEscapeUtils.escapeXml((Writer) null, "");
    }

    @Test(timeout = 4000)
    public void test2832() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringEscapeUtils.escapeXml((Writer) stringWriter0, (String) null);
        stringWriter0.toString();
    }

    @Test(timeout = 4000)
    public void test2933() throws Throwable {
        String string0 = StringEscapeUtils.escapeXml("O;h9!Ubi*");
    }

    @Test(timeout = 4000)
    public void test3034() throws Throwable {
        String string0 = StringEscapeUtils.escapeXml((String) null);
    }

    @Test(timeout = 4000)
    public void test3135() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringEscapeUtils.unescapeXml((Writer) stringWriter0, "GU:1,6ux/`uvzI`");
        stringWriter0.toString();
    }

    @Test(timeout = 4000)
    public void test3236() throws Throwable {
        StringEscapeUtils.unescapeXml((Writer) null, "GU:1,6ux/`uvzI`");
    }

    @Test(timeout = 4000)
    public void test3337() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringEscapeUtils.unescapeXml((Writer) stringWriter0, (String) null);
        stringWriter0.toString();
    }

    @Test(timeout = 4000)
    public void test3438() throws Throwable {
        String string0 = StringEscapeUtils.unescapeXml("");
    }

    @Test(timeout = 4000)
    public void test3539() throws Throwable {
        String string0 = StringEscapeUtils.unescapeXml((String) null);
    }

    @Test(timeout = 4000)
    public void test3640() throws Throwable {
        String string0 = StringEscapeUtils.escapeSql("710");
    }

    @Test(timeout = 4000)
    public void test3741() throws Throwable {
        String string0 = StringEscapeUtils.escapeSql((String) null);
    }
}
