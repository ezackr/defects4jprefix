/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 01:51:47 GMT 2024
 */
package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.charset.UnsupportedCharsetException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.jsoup.helper.DataUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class DataUtil_ESTest extends DataUtil_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        byte[] byteArray0 = new byte[0];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) 0, 427);
        Parser parser0 = Parser.xmlParser();
        DataUtil.load((InputStream) byteArrayInputStream0, (String) null, (String) null, parser0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        File file0 = MockFile.createTempFile("UTF-8", (String) null);
        Document document0 = DataUtil.load(file0, (String) null, "UTF-8");
        document0.baseUri();
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        DataUtil.load((File) null, (String) null, (String) null);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        File file0 = MockFile.createTempFile("NotLessEqual", "NotLessEqual");
        DataUtil.load(file0, "NotLessEqual", "NotLessEqual");
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        File file0 = MockFile.createTempFile("UTF-8", "UTF-8");
        Document document0 = DataUtil.load(file0, "UTF-8", "UTF-8");
        document0.baseUri();
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        DataUtil.load((InputStream) byteArrayInputStream0, "charset", "charset");
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        String string0 = DataUtil.getCharsetFromContentType("UTF-8");
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        String string0 = DataUtil.getCharsetFromContentType((String) null);
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        String string0 = DataUtil.getCharsetFromContentType("?i)charset=s*\"?([^s;\"]*)");
    }
}
