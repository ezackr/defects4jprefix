/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 21:55:01 GMT 2023
 */
package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jsoup.helper.DataUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class DataUtil_ESTest extends DataUtil_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        MockFile mockFile0 = new MockFile("A:=");
        File file0 = MockFile.createTempFile("--------------------------------", "--------------------------------", (File) mockFile0);
        ByteBuffer byteBuffer0 = DataUtil.readFileToByteBuffer(file0);
        assertFalse(byteBuffer0.hasRemaining());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
        Parser parser0 = Parser.xmlParser();
        Document document0 = DataUtil.parseByteData(byteBuffer0, (String) null, "v*y(", parser0);
        assertEquals(0, document0.childNodeSize());
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
        Parser parser0 = Parser.xmlParser();
        Document document0 = DataUtil.parseByteData(byteBuffer0, (String) null, "v*y(", parser0);
        assertEquals("v*y(", document0.baseUri());
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("}]Jv;K9z");
        FileSystemHandling.appendStringToFile(evoSuiteFile0, "u<AGuDMJ");
        MockFile mockFile0 = new MockFile((String) null, "}]Jv;K9z");
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(mockFile0);
        DataUtil.readToByteBuffer(mockFileInputStream0);
        Parser parser0 = Parser.xmlParser();
        DataUtil.load((InputStream) mockFileInputStream0, (String) null, "keygen", parser0);
        assertEquals((-3), mockFileInputStream0.available());
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        // Undeclared exception!
        try {
            DataUtil.readToByteBuffer((InputStream) null, 65279);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.helper.DataUtil", e);
        }
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream(67);
        try {
            DataUtil.readToByteBuffer(pipedInputStream0, 0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Pipe not connected
            //
            verifyException("java.io.PipedInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        // Undeclared exception!
        try {
            DataUtil.readToByteBuffer((InputStream) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.helper.DataUtil", e);
        }
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream(64);
        try {
            DataUtil.readToByteBuffer(pipedInputStream0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Pipe not connected
            //
            verifyException("java.io.PipedInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        // Undeclared exception!
        try {
            DataUtil.readFileToByteBuffer((File) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
        }
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        MockFile mockFile0 = new MockFile((File) null, "");
        try {
            DataUtil.readFileToByteBuffer(mockFile0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
        }
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        MockFile mockFile0 = new MockFile("--------------------------------", "--------------------------------");
        try {
            DataUtil.readFileToByteBuffer(mockFile0);
            fail("Expecting exception: FileNotFoundException");
        } catch (FileNotFoundException e) {
            //
            // File does not exist, and RandomAccessFile is not open in write mode
            //
            verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
        }
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        Parser parser0 = Parser.htmlParser();
        // Undeclared exception!
        try {
            DataUtil.parseByteData((ByteBuffer) null, "U\"(.s>>e#=*>", "U\"(.s>>e#=*>", parser0);
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            // U\"(.s>>e#=*>
            //
            verifyException("java.nio.charset.Charset", e);
        }
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        // Undeclared exception!
        try {
            DataUtil.parseByteData((ByteBuffer) null, (String) null, ";", (Parser) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.nio.charset.CharsetDecoder", e);
        }
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        Parser parser0 = Parser.htmlParser();
        // Undeclared exception!
        try {
            DataUtil.parseByteData((ByteBuffer) null, "", "", parser0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) 66, (byte) 66);
        Parser parser0 = Parser.xmlParser();
        // Undeclared exception!
        try {
            DataUtil.load((InputStream) byteArrayInputStream0, "ps", "", parser0);
            fail("Expecting exception: UnsupportedCharsetException");
        } catch (UnsupportedCharsetException e) {
            //
            // ps
            //
            verifyException("java.nio.charset.Charset", e);
        }
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        Enumeration<ObjectInputStream> enumeration0 = (Enumeration<ObjectInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        Parser parser0 = Parser.xmlParser();
        // Undeclared exception!
        try {
            DataUtil.load((InputStream) sequenceInputStream0, "HA$xqe}&@", "+93d?}", parser0);
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            // HA$xqe}&@
            //
            verifyException("java.nio.charset.Charset", e);
        }
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        FileDescriptor fileDescriptor0 = new FileDescriptor();
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
        Parser parser0 = Parser.xmlParser();
        try {
            DataUtil.load((InputStream) mockFileInputStream0, "", "?6k", parser0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
        }
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        byte[] byteArray0 = new byte[3];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1327, (byte) 0);
        // Undeclared exception!
        try {
            DataUtil.load((InputStream) byteArrayInputStream0, "O|uk", "track");
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            // O|uk
            //
            verifyException("java.nio.charset.Charset", e);
        }
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        // Undeclared exception!
        try {
            DataUtil.load((InputStream) null, ",ewW_Cekp\u0001;<T", ",ewW_Cekp\u0001;<T");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.helper.DataUtil", e);
        }
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        byte[] byteArray0 = new byte[8];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        // Undeclared exception!
        try {
            DataUtil.load((InputStream) byteArrayInputStream0, "", "--------------------------------");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        try {
            DataUtil.load((InputStream) pipedInputStream0, "{H$gLRs'Ti^7lA'`1", "{H$gLRs'Ti^7lA'`1");
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Pipe not connected
            //
            verifyException("java.io.PipedInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        File file0 = MockFile.createTempFile("9al^:|}8b", "link", (File) null);
        // Undeclared exception!
        try {
            DataUtil.load(file0, "link", "");
            fail("Expecting exception: UnsupportedCharsetException");
        } catch (UnsupportedCharsetException e) {
            //
            // link
            //
            verifyException("java.nio.charset.Charset", e);
        }
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        String string0 = "O\\uHYC<!SsdX>DIw+";
        File file0 = MockFile.createTempFile(string0, "");
        // Undeclared exception!
        try {
            DataUtil.load(file0, string0, "");
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            // O\\uHYC<!SsdX>DIw+
            //
            verifyException("java.nio.charset.Charset", e);
        }
    }

    @Test(timeout = 4000)
    public void test2223() throws Throwable {
        File file0 = MockFile.createTempFile("xbw", "xbw");
        // Undeclared exception!
        try {
            DataUtil.load(file0, "", "");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test2324() throws Throwable {
        URI uRI0 = MockURI.aFileURI;
        MockFile mockFile0 = new MockFile(uRI0);
        try {
            DataUtil.load((File) mockFile0, (String) null, ".|?W8Nmlf.>\"5Zl");
            fail("Expecting exception: FileNotFoundException");
        } catch (FileNotFoundException e) {
            //
            // File does not exist, and RandomAccessFile is not open in write mode
            //
            verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
        }
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        // Undeclared exception!
        try {
            DataUtil.crossStreams((InputStream) null, (OutputStream) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.helper.DataUtil", e);
        }
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        byte[] byteArray0 = new byte[7];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-188), 32);
        MockFile mockFile0 = new MockFile("T59|}~l+$*9vp");
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
        // Undeclared exception!
        try {
            DataUtil.crossStreams(byteArrayInputStream0, mockFileOutputStream0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.io.ByteArrayInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
        PushbackInputStream pushbackInputStream0 = new PushbackInputStream(dataInputStream0);
        try {
            DataUtil.crossStreams(pushbackInputStream0, (OutputStream) null);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Pipe not connected
            //
            verifyException("java.io.PipedInputStream", e);
        }
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        String string0 = DataUtil.mimeBoundary();
        assertEquals("--------------------------------", string0);
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        String string0 = DataUtil.getCharsetFromContentType("charset=");
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test2930() throws Throwable {
        String string0 = DataUtil.getCharsetFromContentType((String) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test3031() throws Throwable {
        String string0 = DataUtil.getCharsetFromContentType("}]Jv;K9z");
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test3132() throws Throwable {
        // Undeclared exception!
        try {
            DataUtil.load((File) null, "", "org.jsoup.helper.DataUtil");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
        }
    }

    @Test(timeout = 4000)
    public void test3233() throws Throwable {
        EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("}]Jv;K9z");
        FileSystemHandling.appendStringToFile(evoSuiteFile0, "u<AGuDMJ");
        MockFile mockFile0 = new MockFile((String) null, "}]Jv;K9z");
        Document document0 = DataUtil.load((File) mockFile0, (String) null, "keygen");
        assertEquals("keygen", document0.baseUri());
    }

    @Test(timeout = 4000)
    public void test3334() throws Throwable {
        byte[] byteArray0 = new byte[4];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
        ByteBuffer byteBuffer0 = DataUtil.readToByteBuffer(sequenceInputStream0, (byte) 1);
        assertEquals(0, byteArrayInputStream0.available());
    }

    @Test(timeout = 4000)
    public void test3335() throws Throwable {
        byte[] byteArray0 = new byte[4];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
        ByteBuffer byteBuffer0 = DataUtil.readToByteBuffer(sequenceInputStream0, (byte) 1);
        assertTrue(byteBuffer0.hasRemaining());
    }

    @Test(timeout = 4000)
    public void test3436() throws Throwable {
        byte[] byteArray0 = new byte[4];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
        ByteBuffer byteBuffer0 = DataUtil.readToByteBuffer(sequenceInputStream0, (byte) 34);
        Parser parser0 = Parser.xmlParser();
        // Undeclared exception!
        try {
            DataUtil.parseByteData(byteBuffer0, "K3b", "K3b", parser0);
            fail("Expecting exception: UnsupportedCharsetException");
        } catch (UnsupportedCharsetException e) {
            //
            // K3b
            //
            verifyException("java.nio.charset.Charset", e);
        }
    }

    @Test(timeout = 4000)
    public void test3537() throws Throwable {
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
        // Undeclared exception!
        try {
            DataUtil.readToByteBuffer(pipedInputStream0, (-3022));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // maxSize must be 0 (unlimited) or larger
            //
            verifyException("org.jsoup.helper.Validate", e);
        }
    }

    @Test(timeout = 4000)
    public void test3638() throws Throwable {
        byte[] byteArray0 = new byte[8];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Parser parser0 = Parser.htmlParser();
        Document document0 = DataUtil.load((InputStream) byteArrayInputStream0, "UTF-8", "UTF-8", parser0);
        assertEquals(1, document0.childNodeSize());
    }

    @Test(timeout = 4000)
    public void test3739() throws Throwable {
        byte[] byteArray0 = new byte[8];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Document document0 = DataUtil.load((InputStream) byteArrayInputStream0, (String) null, "ll");
        assertEquals("ll", document0.baseUri());
    }

    @Test(timeout = 4000)
    public void test3840() throws Throwable {
        byte[] byteArray0 = new byte[8];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        DataUtil.crossStreams(byteArrayInputStream0, byteArrayOutputStream0);
        assertEquals(8, byteArrayOutputStream0.size());
    }

    @Test(timeout = 4000)
    public void test3841() throws Throwable {
        byte[] byteArray0 = new byte[8];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        DataUtil.crossStreams(byteArrayInputStream0, byteArrayOutputStream0);
        Document document0 = DataUtil.load((InputStream) byteArrayInputStream0, (String) null, "ll");
        assertEquals("ll", document0.location());
    }

    @Test(timeout = 4000)
    public void test3942() throws Throwable {
        // Undeclared exception!
        try {
            DataUtil.load((InputStream) null, "", "", (Parser) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.jsoup.helper.DataUtil", e);
        }
    }

    @Test(timeout = 4000)
    public void test4043() throws Throwable {
        MockFile mockFile0 = new MockFile("", "");
        try {
            DataUtil.load((File) mockFile0, "", "@3RgtH}IKUE3Bd");
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
        }
    }

    @Test(timeout = 4000)
    public void test4144() throws Throwable {
        ByteBuffer byteBuffer0 = DataUtil.emptyByteBuffer();
        Parser parser0 = Parser.htmlParser();
        Document document0 = DataUtil.parseByteData(byteBuffer0, (String) null, "", parser0);
        assertEquals("", document0.location());
    }

    @Test(timeout = 4000)
    public void test4145() throws Throwable {
        ByteBuffer byteBuffer0 = DataUtil.emptyByteBuffer();
        Parser parser0 = Parser.htmlParser();
        Document document0 = DataUtil.parseByteData(byteBuffer0, (String) null, "", parser0);
        assertEquals("java.nio.HeapByteBuffer[pos=0 lim=0 cap=0]", byteBuffer0.toString());
    }

    @Test(timeout = 4000)
    public void test4246() throws Throwable {
        Enumeration<ObjectInputStream> enumeration0 = (Enumeration<ObjectInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        // Undeclared exception!
        try {
            DataUtil.load((InputStream) sequenceInputStream0, "content", "--------------------------------");
            fail("Expecting exception: UnsupportedCharsetException");
        } catch (UnsupportedCharsetException e) {
            //
            // content
            //
            verifyException("java.nio.charset.Charset", e);
        }
    }
}
