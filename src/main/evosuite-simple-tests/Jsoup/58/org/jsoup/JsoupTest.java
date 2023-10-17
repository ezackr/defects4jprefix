/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 22:15:07 GMT 2023
 */
package org.jsoup;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLStreamHandler;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Enumeration;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Whitelist;
import org.junit.runner.RunWith;

public class JsoupTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Parser parser0 = Parser.xmlParser();
        Document document0 = Jsoup.parse("", "", parser0);
        assertFalse(document0.isBlock());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        byte[] byteArray0 = new byte[3];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        Parser parser0 = Parser.htmlParser();
        Document document0 = Jsoup.parse((InputStream) byteArrayInputStream0, (String) null, "org.jsoup.safety.Whitelist$Protocol", parser0);
        assertEquals("#root", document0.tagName());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        File file0 = MockFile.createTempFile("kBD)ja10p;", "fzcm~2`q ^lEDP:#", (File) null);
        Document document0 = Jsoup.parse(file0, (String) null);
        assertFalse(document0.isBlock());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Whitelist whitelist0 = new Whitelist();
        String string0 = Jsoup.clean("", whitelist0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Whitelist whitelist0 = Whitelist.basicWithImages();
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        String string0 = Jsoup.clean("", "", whitelist0, document_OutputSettings0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Whitelist whitelist0 = Whitelist.none();
        String string0 = Jsoup.clean("", "liJ'o%$>WujP", whitelist0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        // Undeclared exception!
        try {
            Jsoup.parseBodyFragment((String) null, "");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // String input must not be null
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        // Undeclared exception!
        try {
            Jsoup.parseBodyFragment((String) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // String input must not be null
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        try {
            Jsoup.parse(uRL0, 0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // HTTP error fetching URL
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
        URL uRL1 = MockURL.URL(uRL0, "9Xg43p9YL{[NQM", uRLStreamHandler0);
        // Undeclared exception!
        try {
            Jsoup.parse(uRL1, 2211);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        // Undeclared exception!
        try {
            Jsoup.parse((URL) null, 0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // URL must not be null
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        // Undeclared exception!
        try {
            Jsoup.parse("*", "*", (Parser) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Parser parser0 = Parser.htmlParser();
        // Undeclared exception!
        try {
            Jsoup.parse((String) null, "%1M", parser0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // String input must not be null
        }
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        // Undeclared exception!
        try {
            Jsoup.parse("", (String) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // BaseURI must not be null
        }
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        // Undeclared exception!
        try {
            Jsoup.parse((String) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // String input must not be null
        }
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        byte[] byteArray0 = new byte[9];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
        DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
        Parser parser0 = Parser.htmlParser();
        // Undeclared exception!
        try {
            Jsoup.parse((InputStream) dataInputStream0, "object", "<#[OOjOz", parser0);
            fail("Expecting exception: UnsupportedCharsetException");
        } catch (UnsupportedCharsetException e) {
            //
            // object
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        byte[] byteArray0 = new byte[1];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0, (byte) 60);
        Parser parser0 = Parser.htmlParser();
        // Undeclared exception!
        try {
            Jsoup.parse((InputStream) bufferedInputStream0, "6#a2:S}/xzy", "\";v|8)]e]*v2X", parser0);
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            // 6#a2:S}/xzy
        }
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Parser parser0 = Parser.htmlParser();
        // Undeclared exception!
        try {
            Jsoup.parse((InputStream) null, "cA16d=Fg5ry", "cA16d=Fg5ry", parser0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        Parser parser0 = Parser.htmlParser();
        try {
            Jsoup.parse((InputStream) pipedInputStream0, "FVKr<;C$I7D<\"wbw&", "DBu~|Rs=Hwp)o=F@tr", parser0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Pipe not connected
        }
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        byte[] byteArray0 = new byte[9];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 14, 233);
        PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
        // Undeclared exception!
        try {
            Jsoup.parse((InputStream) pushbackInputStream0, "z", "vagq'Rp");
            fail("Expecting exception: UnsupportedCharsetException");
        } catch (UnsupportedCharsetException e) {
            //
            // z
        }
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        // Undeclared exception!
        try {
            Jsoup.parse((InputStream) null, "_ktI9=zg", "_ktI9=zg");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        // Undeclared exception!
        try {
            Jsoup.parse((InputStream) sequenceInputStream0, "", ")Y`s:");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML
        }
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        byte[] byteArray0 = new byte[5];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), (byte) 32);
        // Undeclared exception!
        try {
            Jsoup.parse((InputStream) byteArrayInputStream0, "4/2c(3#k&&nCC+?>E", "");
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        PipedInputStream pipedInputStream0 = new PipedInputStream(48);
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, 3124);
        try {
            Jsoup.parse((InputStream) bufferedInputStream0, "Cahr1Cm/{Vt[FG", "Cahr1Cm/{Vt[FG");
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Pipe not connected
        }
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        MockFile mockFile0 = new MockFile("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities");
        File file0 = MockFile.createTempFile("org.jsoup.nodes.Entities", "CWU", (File) mockFile0);
        // Undeclared exception!
        try {
            Jsoup.parse(file0, "org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities");
            fail("Expecting exception: UnsupportedCharsetException");
        } catch (UnsupportedCharsetException e) {
            //
            // org.jsoup.nodes.Entities
        }
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        // Undeclared exception!
        try {
            Jsoup.parse((File) null, "bY9!MMj+93d?}aW`", "bY9!MMj+93d?}aW`");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        MockFile mockFile0 = new MockFile("");
        File file0 = MockFile.createTempFile("sq3{", "dXoV'?", (File) mockFile0);
        // Undeclared exception!
        try {
            Jsoup.parse(file0, "", "P");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML
        }
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        MockFile mockFile0 = new MockFile("");
        try {
            Jsoup.parse((File) mockFile0, "", "");
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        MockFile mockFile0 = new MockFile("90?$?`.+m]aLt!(9v", "90?$?`.+m]aLt!(9v");
        try {
            Jsoup.parse((File) mockFile0, "90?$?`.+m]aLt!(9v", "90?$?`.+m]aLt!(9v");
            fail("Expecting exception: FileNotFoundException");
        } catch (FileNotFoundException e) {
            //
            // File does not exist, and RandomAccessFile is not open in write mode
        }
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        File file0 = MockFile.createTempFile("code", "code");
        // Undeclared exception!
        try {
            Jsoup.parse(file0, "code");
            fail("Expecting exception: UnsupportedCharsetException");
        } catch (UnsupportedCharsetException e) {
            //
            // code
        }
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        File file0 = MockFile.createTempFile("gMi-n,VrJ$e@BZ];s2", "k&k#");
        // Undeclared exception!
        try {
            Jsoup.parse(file0, "k&k#");
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            // k&k#
        }
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        // Undeclared exception!
        try {
            Jsoup.parse((File) null, "");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        File file0 = MockFile.createTempFile("CUdWjy8=xhB", "");
        // Undeclared exception!
        try {
            Jsoup.parse(file0, "");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML
        }
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        MockFile mockFile0 = new MockFile("pf1?dV6", "entities-xhtml.properties");
        try {
            Jsoup.parse((File) mockFile0, "pf1?dV6");
            fail("Expecting exception: FileNotFoundException");
        } catch (FileNotFoundException e) {
            //
            // File does not exist, and RandomAccessFile is not open in write mode
        }
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        // Undeclared exception!
        try {
            Jsoup.isValid("org.jsoup.Jsoup", (Whitelist) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        // Undeclared exception!
        try {
            Jsoup.clean("", (Whitelist) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test3636() throws Throwable {
        Whitelist whitelist0 = Whitelist.simpleText();
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.charset((Charset) null);
        // Undeclared exception!
        try {
            Jsoup.clean("del", "CP[C?$# G#AT WV", whitelist0, document_OutputSettings1);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test3737() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        // Undeclared exception!
        try {
            Jsoup.clean("", "", (Whitelist) null, document_OutputSettings0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test3838() throws Throwable {
        Whitelist whitelist0 = Whitelist.basicWithImages();
        // Undeclared exception!
        try {
            Jsoup.clean("", (String) null, whitelist0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Object must not be null
        }
    }

    @Test(timeout = 4000)
    public void test3939() throws Throwable {
        Whitelist whitelist0 = Whitelist.none();
        String string0 = Jsoup.clean("u}E3,4vQN,%", "lOuDBz&e lv:\"W", whitelist0);
        assertEquals("u}E3,4vQN,%", string0);
    }

    @Test(timeout = 4000)
    public void test4040() throws Throwable {
        Document document0 = Jsoup.parseBodyFragment("", "Axn(5sbLt,JWd'}");
        assertEquals("Axn(5sbLt,JWd'}", document0.location());
    }

    @Test(timeout = 4000)
    public void test4141() throws Throwable {
        EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("<yA");
        FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream("<yA");
        // Undeclared exception!
        try {
            Jsoup.parse((InputStream) mockFileInputStream0, "<yA", (String) null);
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            // <yA
        }
    }

    @Test(timeout = 4000)
    public void test4242() throws Throwable {
        // Undeclared exception!
        try {
            Jsoup.connect((String) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Must supply a valid URL
        }
    }

    @Test(timeout = 4000)
    public void test4343() throws Throwable {
        Parser parser0 = Parser.htmlParser();
        Document document0 = Jsoup.parse("", "", parser0);
        assertEquals("#document", document0.nodeName());
    }

    @Test(timeout = 4000)
    public void test4444() throws Throwable {
        URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
        URL uRL0 = MockURL.URL("K&ro", "device", 0, "Nq@+@<E{eZ\" A#&`0'", uRLStreamHandler0);
        try {
            Jsoup.parse(uRL0, 76);
            fail("Expecting exception: MalformedURLException");
        } catch (MalformedURLException e) {
            //
            // Only http & https protocols supported
        }
    }

    @Test(timeout = 4000)
    public void test4545() throws Throwable {
        MockFile mockFile0 = new MockFile("");
        try {
            Jsoup.parse((File) mockFile0, "");
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test4646() throws Throwable {
        Whitelist whitelist0 = new Whitelist();
        boolean boolean0 = Jsoup.isValid("l<9s,:", whitelist0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test4747() throws Throwable {
        File file0 = MockFile.createTempFile("T]bUjnNE,o[*.xh3", "!8?_uN:{9");
        // Undeclared exception!
        try {
            Jsoup.parse(file0, "'DgO6![}VK]5#a-w:_", "'DgO6![}VK]5#a-w:_");
            fail("Expecting exception: IllegalCharsetNameException");
        } catch (IllegalCharsetNameException e) {
            //
            // 'DgO6![}VK]5#a-w:_
        }
    }

    @Test(timeout = 4000)
    public void test4848() throws Throwable {
        Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(enumeration0).hasMoreElements();
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
        Parser parser0 = Parser.xmlParser();
        // Undeclared exception!
        try {
            Jsoup.parse((InputStream) bufferedInputStream0, "", "", parser0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML
        }
    }

    @Test(timeout = 4000)
    public void test4949() throws Throwable {
        Whitelist whitelist0 = Whitelist.simpleText();
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        String string0 = Jsoup.clean("del", "CP[C?$# G#AT WV", whitelist0, document_OutputSettings0);
        assertEquals("del", string0);
    }

    @Test(timeout = 4000)
    public void test5050() throws Throwable {
        Document document0 = Jsoup.parse("6^2aU(8*wN9L|W@");
        assertFalse(document0.updateMetaCharsetElement());
    }

    @Test(timeout = 4000)
    public void test5151() throws Throwable {
        Whitelist whitelist0 = Whitelist.simpleText();
        String string0 = Jsoup.clean("HD.,HZm?C$GDU3I", whitelist0);
        assertEquals("HD.,HZm?C$GDU3I", string0);
    }

    @Test(timeout = 4000)
    public void test5252() throws Throwable {
        Document document0 = Jsoup.parse("<yA", "");
        assertEquals("", document0.location());
    }
}
