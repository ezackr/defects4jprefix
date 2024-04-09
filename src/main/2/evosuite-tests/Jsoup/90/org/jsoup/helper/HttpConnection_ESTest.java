/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 09:04:33 GMT 2024
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.net.UnknownServiceException;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HttpConnection_ESTest extends HttpConnection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      Connection connection0 = httpConnection0.followRedirects(true);
      assertSame(connection0, httpConnection0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "]bA2s<VJf'\"K#Px0^g");
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request0.url = uRL0;
      HttpConnection.Response httpConnection_Response0 = HttpConnection.Response.execute(httpConnection_Request0);
      httpConnection_Response0.parse();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      Connection connection0 = httpConnection0.sslSocketFactory((SSLSocketFactory) null);
      assertSame(httpConnection0, connection0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      boolean boolean0 = httpConnection_Request0.ignoreContentType();
      assertEquals(1048576, httpConnection_Request0.maxBodySize());
      assertTrue(httpConnection_Request0.followRedirects());
      assertFalse(httpConnection_Request0.ignoreHttpErrors());
      assertEquals(30000, httpConnection_Request0.timeout());
      assertFalse(boolean0);
      assertEquals("UTF-8", httpConnection_Request0.postDataCharset());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      Connection connection0 = httpConnection0.parser((Parser) null);
      assertSame(httpConnection0, connection0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      Connection connection0 = httpConnection0.ignoreContentType(true);
      assertSame(httpConnection0, connection0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      Proxy proxy0 = Proxy.NO_PROXY;
      Connection connection0 = httpConnection0.proxy(proxy0);
      assertSame(connection0, httpConnection0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      boolean boolean0 = httpConnection_Request0.followRedirects();
      assertEquals(1048576, httpConnection_Request0.maxBodySize());
      assertEquals("UTF-8", httpConnection_Request0.postDataCharset());
      assertFalse(httpConnection_Request0.ignoreContentType());
      assertEquals(30000, httpConnection_Request0.timeout());
      assertTrue(boolean0);
      assertFalse(httpConnection_Request0.ignoreHttpErrors());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      // Undeclared exception!
      try { 
        httpConnection_Response0.removeCookie("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cookie name must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      Connection.Response connection_Response0 = httpConnection0.response();
      Connection connection0 = httpConnection0.response(connection_Response0);
      assertSame(connection0, httpConnection0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      Connection connection0 = httpConnection0.cookie("Content-Encoding", "application/x-www-form-urlencoded");
      assertSame(httpConnection0, connection0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      // Undeclared exception!
      try { 
        httpConnection0.get();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // URL must be specified to connect
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      Connection connection0 = httpConnection0.maxBodySize(2854);
      assertSame(connection0, httpConnection0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Connection connection0 = HttpConnection.connect(uRL0);
      assertNotNull(connection0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      Connection connection0 = httpConnection0.proxy("3iti0:!", 762);
      assertSame(connection0, httpConnection0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      Connection connection0 = httpConnection0.userAgent("multipart/form-data");
      assertSame(httpConnection0, connection0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpConnection.connect("multipart/form-data");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: multipart/form-data
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      Connection connection0 = httpConnection0.ignoreHttpErrors(true);
      assertSame(httpConnection0, connection0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      Connection connection0 = httpConnection0.requestBody("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
      assertSame(httpConnection0, connection0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      // Undeclared exception!
      try { 
        httpConnection0.postDataCharset("Content-Encoding");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // Content-Encoding
         //
         verifyException("org.jsoup.helper.HttpConnection$Request", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      // Undeclared exception!
      try { 
        httpConnection0.post();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // URL must be specified to connect
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      // Undeclared exception!
      try { 
        httpConnection0.timeout((-1788));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Timeout milliseconds must be 0 (infinite) or greater
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      Connection connection0 = httpConnection0.data("application/x-www-form-urlencoded", "multipart/form-data");
      assertSame(connection0, httpConnection0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      Connection.Method connection_Method0 = Connection.Method.POST;
      Connection connection0 = httpConnection0.method(connection_Method0);
      assertSame(httpConnection0, connection0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      Connection.Request connection_Request0 = httpConnection0.request();
      httpConnection0.request(connection_Request0);
      assertFalse(connection_Request0.ignoreContentType());
      assertEquals("UTF-8", connection_Request0.postDataCharset());
      assertEquals(30000, connection_Request0.timeout());
      assertFalse(connection_Request0.ignoreHttpErrors());
      assertEquals(1048576, connection_Request0.maxBodySize());
      assertTrue(connection_Request0.followRedirects());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      URL uRL1 = HttpConnection.encodeUrl(uRL0);
      assertNotSame(uRL1, uRL0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      Connection connection0 = httpConnection0.header("iq,;]MA\"}p5Oz\"S*", (String) null);
      assertSame(connection0, httpConnection0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      Connection connection0 = httpConnection0.data("u.{QDV6g qUl2d", "3itq0:!", (InputStream) null, "3itq0:!");
      assertSame(httpConnection0, connection0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "]bA2s<VJf'\"K#Px0^g");
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request0.url = uRL0;
      HttpConnection.Response httpConnection_Response0 = HttpConnection.Response.execute(httpConnection_Request0);
      HttpConnection.Response httpConnection_Response1 = httpConnection_Response0.charset("Content-Encoding");
      // Undeclared exception!
      try { 
        httpConnection_Response1.body();
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // Content-Encoding
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      // Undeclared exception!
      try { 
        httpConnection_Response0.bufferUp();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before getting response body
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      // Undeclared exception!
      try { 
        httpConnection_Response0.bodyStream();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before getting response body
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = httpConnection_Response0.statusMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      // Undeclared exception!
      try { 
        httpConnection_Response0.bodyAsBytes();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before getting response body
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = httpConnection_Response0.charset();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      int int0 = httpConnection_Response0.statusCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("kv%^C@fty^", "Content-Encoding", (InputStream) sequenceInputStream0);
      InputStream inputStream0 = httpConnection_KeyVal0.inputStream();
      assertSame(sequenceInputStream0, inputStream0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("Content-Type", "Content-Encoding");
      httpConnection_KeyVal0.contentType();
      assertEquals("Content-Encoding", httpConnection_KeyVal0.value());
      assertEquals("Content-Type", httpConnection_KeyVal0.key());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("CyVw$>G*(ELs", "CyVw$>G*(ELs");
      String string0 = httpConnection_KeyVal0.toString();
      assertEquals("CyVw$>G*(ELs=CyVw$>G*(ELs", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HttpConnection httpConnection0 = new HttpConnection();
      httpConnection_Response0.cookie("Content-Encoding", "application/x-www-form-urlencoded");
      Map<String, String> map0 = httpConnection_Response0.cookies;
      Connection connection0 = httpConnection0.data(map0);
      assertSame(httpConnection0, connection0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        httpConnection0.data(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must supply an even number of key value pairs
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      String[] stringArray0 = new String[0];
      Connection connection0 = httpConnection0.data(stringArray0);
      assertSame(httpConnection0, connection0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        httpConnection0.data(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Data key must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      LinkedHashSet<Connection.KeyVal> linkedHashSet0 = new LinkedHashSet<Connection.KeyVal>();
      Connection connection0 = httpConnection0.data((Collection<Connection.KeyVal>) linkedHashSet0);
      assertSame(connection0, httpConnection0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      LinkedHashSet<Connection.KeyVal> linkedHashSet0 = new LinkedHashSet<Connection.KeyVal>();
      linkedHashSet0.add((Connection.KeyVal) null);
      // Undeclared exception!
      try { 
        httpConnection0.data((Collection<Connection.KeyVal>) linkedHashSet0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Key val must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      PipedInputStream pipedInputStream0 = new PipedInputStream(28);
      httpConnection0.data("l#mC^?~.o:u", "l#mC^?~.o:u", (InputStream) pipedInputStream0);
      Connection.KeyVal connection_KeyVal0 = httpConnection0.data("3!");
      assertNull(connection_KeyVal0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      HttpConnection httpConnection0 = new HttpConnection();
      httpConnection0.data("Y{", "Y{", (InputStream) sequenceInputStream0);
      Connection.KeyVal connection_KeyVal0 = httpConnection0.data("Y{");
      assertNotNull(connection_KeyVal0);
      assertEquals("Y{", connection_KeyVal0.value());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("zkk\"\"v!j.#09xhx<w", "Content-Encoding");
      Connection connection0 = httpConnection0.headers(hashMap0);
      assertSame(connection0, httpConnection0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("Content-Type", "multipart/form-data");
      Connection connection0 = httpConnection0.cookies(hashMap0);
      assertSame(httpConnection0, connection0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.offerFirst("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
      linkedList0.add((String) null);
      hashMap0.put("set-cookie", linkedList0);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      assertNull(httpConnection_Response0.charset());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request0.url = uRL0;
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      httpConnection_Response0.cookie("Content-Encoding", "Content-Type");
      try { 
        HttpConnection.Response.execute(httpConnection_Request0, httpConnection_Response0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // HTTP error fetching URL
         //
         verifyException("org.jsoup.helper.HttpConnection$Response", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      httpConnection_Request0.timeout(3);
      assertEquals(3, httpConnection_Request0.timeout());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      // Undeclared exception!
      try { 
        httpConnection0.maxBodySize((-1601));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxSize must be 0 (unlimited) or larger
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      HttpConnection httpConnection0 = new HttpConnection();
      Connection connection0 = httpConnection0.postDataCharset("ISO-8859-1");
      assertSame(connection0, httpConnection0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      URL uRL0 = MockURL.getFileExample();
      httpConnection_Request0.url = uRL0;
      try { 
        HttpConnection.Response.execute(httpConnection_Request0);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // Only http & https protocols supported
         //
         verifyException("org.jsoup.helper.HttpConnection$Response", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("({,0", "({,0");
      httpConnection_Request0.data((Connection.KeyVal) httpConnection_KeyVal0);
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request0.url = uRL0;
      Connection.Method connection_Method0 = Connection.Method.PATCH;
      httpConnection_Request0.method(connection_Method0);
      try { 
        HttpConnection.Response.execute(httpConnection_Request0);
        fail("Expecting exception: ProtocolException");
      
      } catch(ProtocolException e) {
         //
         // Invalid HTTP method: PATCH
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request0.url = uRL0;
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("Xj*URN3", "Xj*URN3", (InputStream) pushbackInputStream0);
      httpConnection_Request0.data((Connection.KeyVal) httpConnection_KeyVal0);
      Connection.Method connection_Method0 = Connection.Method.PATCH;
      httpConnection_Request0.method(connection_Method0);
      Connection.Request connection_Request0 = httpConnection_Request0.requestBody("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      // Undeclared exception!
      try { 
        HttpConnection.Response.execute(connection_Request0, httpConnection_Response0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // InputStream data not supported in URL query string.
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request0.url = uRL0;
      Connection.Method connection_Method0 = Connection.Method.PUT;
      HttpConnection.Request httpConnection_Request1 = (HttpConnection.Request)httpConnection_Request0.method(connection_Method0);
      try { 
        HttpConnection.Response.execute(httpConnection_Request1);
        fail("Expecting exception: UnknownServiceException");
      
      } catch(UnknownServiceException e) {
         //
         // protocol doesn't support output
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request0.url = uRL0;
      Connection.Request connection_Request0 = httpConnection_Request0.ignoreHttpErrors(true);
      try { 
        HttpConnection.Response.execute(connection_Request0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "]bM)A2s<f\"s KPx0g");
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      Connection.Method connection_Method0 = Connection.Method.HEAD;
      httpConnection_Request0.method = connection_Method0;
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request0.url = uRL0;
      HttpConnection.Response.execute(httpConnection_Request0);
      assertEquals(1048576, httpConnection_Request0.maxBodySize());
      assertEquals("UTF-8", httpConnection_Request0.postDataCharset());
      assertFalse(httpConnection_Request0.ignoreContentType());
      assertTrue(httpConnection_Request0.followRedirects());
      assertEquals(30000, httpConnection_Request0.timeout());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "]bA2s<VJf'\"K#Px0^g");
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request0.url = uRL0;
      HttpConnection.Response httpConnection_Response0 = HttpConnection.Response.execute(httpConnection_Request0);
      httpConnection_Response0.body();
      httpConnection_Response0.parse();
      assertEquals(1048576, httpConnection_Request0.maxBodySize());
      assertEquals("UTF-8", httpConnection_Request0.postDataCharset());
      assertEquals(30000, httpConnection_Request0.timeout());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "]bA2s<VJf'\"K#Px0^g");
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request0.url = uRL0;
      HttpConnection.Response httpConnection_Response0 = HttpConnection.Response.execute(httpConnection_Request0);
      httpConnection_Response0.body();
      httpConnection_Response0.body();
      assertEquals(30000, httpConnection_Request0.timeout());
      assertFalse(httpConnection_Request0.ignoreHttpErrors());
      assertEquals(1048576, httpConnection_Request0.maxBodySize());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request0.url = uRL0;
      HttpConnection.Request httpConnection_Request1 = httpConnection_Request0.proxy("Content-Encoding", 109);
      try { 
        HttpConnection.Response.execute(httpConnection_Request1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // java.lang.UnsupportedOperationException: Method not implemented.
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      hashMap0.put((String) null, linkedList0);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      assertNull(httpConnection_Response0.contentType());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      hashMap0.put("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", linkedList0);
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      httpConnection_Response0.processResponseHeaders(hashMap0);
      assertNull(httpConnection_Response0.contentType());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("");
      hashMap0.put("set-cookie", linkedList0);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      assertFalse(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request0.url = uRL0;
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("Xj*URN3", "Xj*URN3", (InputStream) pushbackInputStream0);
      httpConnection_Request0.data((Connection.KeyVal) httpConnection_KeyVal0);
      Connection.Method connection_Method0 = Connection.Method.PUT;
      httpConnection_Request0.method(connection_Method0);
      try { 
        HttpConnection.Response.execute(httpConnection_Request0, (HttpConnection.Response) null);
        fail("Expecting exception: UnknownServiceException");
      
      } catch(UnknownServiceException e) {
         //
         // protocol doesn't support output
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request0.url = uRL0;
      HttpConnection.Request httpConnection_Request1 = (HttpConnection.Request)httpConnection_Request0.cookie("Content-Type", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
      httpConnection_Request1.cookie("[D>_", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
      try { 
        HttpConnection.Response.execute(httpConnection_Request1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // HTTP error fetching URL
         //
         verifyException("org.jsoup.helper.HttpConnection$Response", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request0.url = uRL0;
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("application/x-www-form-urlencoded", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
      HttpConnection.Request httpConnection_Request1 = httpConnection_Request0.data((Connection.KeyVal) httpConnection_KeyVal0);
      httpConnection_Request1.data((Connection.KeyVal) httpConnection_KeyVal0);
      try { 
        HttpConnection.Response.execute(httpConnection_Request0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // HTTP error fetching URL
         //
         verifyException("org.jsoup.helper.HttpConnection$Response", e);
      }
  }
}
