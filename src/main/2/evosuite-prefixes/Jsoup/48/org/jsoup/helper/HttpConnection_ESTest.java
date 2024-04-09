/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 05:08:33 GMT 2024
 */
package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownServiceException;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class HttpConnection_ESTest extends HttpConnection_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("\"jTc", "\"jTc");
        httpConnection_KeyVal0.key();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
        HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
        httpConnection_Response0.processResponseHeaders(hashMap0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
        httpConnection_Response0.parse();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        URL uRL0 = MockURL.getFtpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.post();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("TEQq&0Nwk8P#h", "TEQq&0Nwk8P#h");
        httpConnection_KeyVal0.toString();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        HttpConnection.connect("L^zUf+'(e^o}(+sXF");
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
        httpConnection_Response0.bodyAsBytes();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
        httpConnection_Response0.header("wb", "wb");
        httpConnection_Response0.header("wb", "wb");
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        PipedInputStream pipedInputStream0 = new PipedInputStream();
        connection0.data("Content-Encoding", "Content-Encoding", (InputStream) pipedInputStream0);
        connection0.post();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
        httpConnection_Response0.contentType();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
        httpConnection_Response0.removeCookie("Data key must not be empty");
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        Connection connection1 = connection0.data("Content-Encoding", "Content-Encoding");
        connection1.execute();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
        httpConnection_Response0.statusMessage();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
        httpConnection_Response0.charset();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
        HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        hashMap0.put("28LNcBk", linkedList0);
        httpConnection_Response0.processResponseHeaders(hashMap0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
        HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
        hashMap0.put((String) null, (List<String>) null);
        httpConnection_Response0.processResponseHeaders(hashMap0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.cookie("Content-Encoding", "Content-Encoding");
        connection0.post();
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        byte[] byteArray0 = new byte[2];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) 32, (byte) 32);
        PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte) 32);
        DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
        HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("vXW\"]F7:F0Z'", "vXW\"]F7:F0Z'", (InputStream) dataInputStream0);
        httpConnection_KeyVal0.inputStream();
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
        httpConnection_Response0.statusCode();
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
        HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.offer("28LNcBk");
        hashMap0.put("28LNcBk", linkedList0);
        httpConnection_Response0.processResponseHeaders(hashMap0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.post();
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        Connection connection1 = connection0.data("Content-Encoding", "Content-Encoding");
        connection1.post();
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.response((Connection.Response) null);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        URL uRL0 = MockURL.getFtpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        LinkedList<Connection.KeyVal> linkedList0 = new LinkedList<Connection.KeyVal>();
        connection0.data((Collection<Connection.KeyVal>) linkedList0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        URL uRL0 = MockURL.getFtpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.ignoreContentType(true);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.validateTLSCertificates(true);
        connection0.post();
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        LinkedList<Connection.KeyVal> linkedList0 = new LinkedList<Connection.KeyVal>();
        HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("Content-Encoding", "Content-Encoding");
        linkedList0.add((Connection.KeyVal) httpConnection_KeyVal0);
        connection0.data((Collection<Connection.KeyVal>) linkedList0);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        Connection.Method connection_Method0 = Connection.Method.PUT;
        connection0.method(connection_Method0);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.maxBodySize((-979));
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.maxBodySize(20);
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        String[] stringArray0 = new String[0];
        connection0.data(stringArray0);
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        String[] stringArray0 = new String[4];
        connection0.data(stringArray0);
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        String[] stringArray0 = new String[1];
        connection0.data(stringArray0);
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        HashMap<String, String> hashMap0 = new HashMap<String, String>();
        connection0.data((Map<String, String>) hashMap0);
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
        hashMap0.put("set-cookie", linkedList0);
        httpConnection_Response0.processResponseHeaders(hashMap0);
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.referrer("Content-Encoding");
    }

    @Test(timeout = 4000)
    public void test3636() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.header("Content-Encoding", "Content-Encoding");
    }

    @Test(timeout = 4000)
    public void test3737() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.followRedirects(false);
    }

    @Test(timeout = 4000)
    public void test3838() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.postDataCharset("Content-Encoding");
    }

    @Test(timeout = 4000)
    public void test3939() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.ignoreHttpErrors(true);
        connection0.execute();
    }

    @Test(timeout = 4000)
    public void test4040() throws Throwable {
        HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("");
        HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
        hashMap0.put("set-cookie", linkedList0);
        httpConnection_Response0.processResponseHeaders(hashMap0);
    }

    @Test(timeout = 4000)
    public void test4141() throws Throwable {
        HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
        linkedList0.add("set-cookie");
        hashMap0.put("set-cookie", linkedList0);
        httpConnection_Response0.processResponseHeaders(hashMap0);
    }

    @Test(timeout = 4000)
    public void test4242() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.get();
    }

    @Test(timeout = 4000)
    public void test4343() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.execute();
    }

    @Test(timeout = 4000)
    public void test4444() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.timeout(2);
    }

    @Test(timeout = 4000)
    public void test4545() throws Throwable {
        URL uRL0 = MockURL.getFtpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        HashMap<String, String> hashMap0 = new HashMap<String, String>();
        connection0.cookies(hashMap0);
    }

    @Test(timeout = 4000)
    public void test4646() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.parser((Parser) null);
    }

    @Test(timeout = 4000)
    public void test4747() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.timeout((-1847798392));
        connection0.post();
    }

    @Test(timeout = 4000)
    public void test4848() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.userAgent("Content-Encoding");
    }

    @Test(timeout = 4000)
    public void test4949() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        Connection.Request connection_Request0 = connection0.request();
        connection_Request0.validateTLSCertificates();
    }

    @Test(timeout = 4000)
    public void test5050() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.response();
    }

    @Test(timeout = 4000)
    public void test5151() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
        NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Content-Encoding");
        connection0.execute();
    }

    @Test(timeout = 4000)
    public void test5252() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        HashMap<String, String> hashMap0 = new HashMap<String, String>();
        hashMap0.put("Content-Encoding", "charset");
        connection0.data((Map<String, String>) hashMap0);
    }

    @Test(timeout = 4000)
    public void test5353() throws Throwable {
        HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
        HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        byte[] byteArray0 = new byte[0];
        linkedList0.offer((String) null);
        hashMap0.put("set-cookie", linkedList0);
        hashMap0.put((String) null, linkedList0);
        httpConnection_Response0.processResponseHeaders(hashMap0);
    }

    @Test(timeout = 4000)
    public void test5454() throws Throwable {
        URL uRL0 = MockURL.getFtpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.postDataCharset("UTF-8");
    }

    @Test(timeout = 4000)
    public void test5555() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        HashMap<String, String> hashMap0 = new HashMap<String, String>();
        hashMap0.put("Content-Encoding", "Content-Encoding");
        connection0.cookies(hashMap0);
    }

    @Test(timeout = 4000)
    public void test5656() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
        NetworkHandling.createRemoteTextFile(evoSuiteURL0, "e1");
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.get();
    }

    @Test(timeout = 4000)
    public void test5757() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
        NetworkHandling.createRemoteTextFile(evoSuiteURL0, ":eq(");
        Connection connection0 = HttpConnection.connect(uRL0);
        Connection.Response connection_Response0 = connection0.execute();
        connection_Response0.body();
    }

    @Test(timeout = 4000)
    public void test5858() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        Connection connection1 = connection0.cookie("Content-Encoding", "Content-Encoding");
        connection1.cookie("Cookie map must not be null", "Cookie map must not be null");
        connection1.execute();
        int int0 = (-1041);
    }

    @Test(timeout = 4000)
    public void test5959() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        connection0.request((Connection.Request) null);
    }

    @Test(timeout = 4000)
    public void test6060() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        Connection.Request connection_Request0 = connection0.request();
        connection_Request0.followRedirects();
    }

    @Test(timeout = 4000)
    public void test6161() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        Connection connection1 = connection0.data("Content-Encoding", "Content-Encoding");
        connection1.data("Content-Encoding", "Content-Encoding");
        connection0.execute();
    }

    @Test(timeout = 4000)
    public void test6262() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
        NetworkHandling.createRemoteTextFile(evoSuiteURL0, "e1");
        Connection connection0 = HttpConnection.connect(uRL0);
        Connection.Response connection_Response0 = connection0.execute();
        connection_Response0.parse();
        connection_Response0.body();
    }

    @Test(timeout = 4000)
    public void test6363() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        Connection connection0 = HttpConnection.connect(uRL0);
        Connection.Request connection_Request0 = connection0.request();
        connection_Request0.ignoreContentType();
    }
}
