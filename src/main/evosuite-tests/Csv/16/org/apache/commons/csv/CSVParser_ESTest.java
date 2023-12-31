/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 17:28:09 GMT 2023
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.StringReader;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.sql.ResultSetMetaData;
import java.util.Map;
import java.util.function.Consumer;
import javax.sql.rowset.RowSetMetaDataImpl;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CSVParser_ESTest extends CSVParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Charset charset0 = Charset.defaultCharset();
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD_CSV;
      CSVParser cSVParser0 = CSVParser.parse((InputStream) pipedInputStream0, charset0, cSVFormat0);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      StringReader stringReader0 = new StringReader("6Ih");
      CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
      Consumer<CSVRecord> consumer0 = (Consumer<CSVRecord>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      cSVParser0.forEach(consumer0);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Escape=</Escape=<0Escape=<");
      byte[] byteArray0 = new byte[8];
      byteArray0[6] = (byte)10;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      MockFile mockFile0 = new MockFile("Escape=<");
      File file0 = MockFile.createTempFile("Escape=<", "Escape=<", (File) mockFile0);
      Charset charset0 = Charset.defaultCharset();
      CSVParser cSVParser0 = CSVParser.parse(file0, charset0, cSVFormat0);
      cSVParser0.nextRecord();
      cSVParser0.nextRecord();
      assertEquals(2L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
      cSVParser0.iterator();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = CSVParser.parse("6Ih", cSVFormat0);
      cSVParser0.close();
      boolean boolean0 = cSVParser0.isClosed();
      assertEquals(0L, cSVParser0.getRecordNumber());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      StringReader stringReader0 = new StringReader("6Ih");
      CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
      Consumer<CSVRecord> consumer0 = (Consumer<CSVRecord>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      cSVParser0.forEach(consumer0);
      cSVParser0.getRecords();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVParser cSVParser0 = new CSVParser(pipedReader0, cSVFormat0, 0L, (-1L));
      long long0 = cSVParser0.getRecordNumber();
      assertEquals((-2L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      File file0 = MockFile.createTempFile("charset", "charset");
      Charset charset0 = Charset.defaultCharset();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/vv/c7q6vm8920vc7d5p_87011w40000gn/T/charset0charset");
      CSVFormat cSVFormat0 = CSVFormat.newFormat('P');
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "FORMAT");
      CSVParser cSVParser0 = CSVParser.parse(file0, charset0, cSVFormat1);
      cSVParser0.getFirstEndOfLine();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("P2494y_M+a~", "P2494y_M+a~");
      Path path0 = mockFile0.toPath();
      Charset charset0 = Charset.defaultCharset();
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      try { 
        CSVParser.parse(path0, charset0, cSVFormat0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      MockFile mockFile0 = new MockFile("inputStream");
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        CSVParser.parse(path0, (Charset) null, cSVFormat0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.Files", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        CSVParser.parse(path0, (Charset) null, (CSVFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter 'format' must not be null!
         //
         verifyException("org.apache.commons.csv.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      Charset charset0 = Charset.defaultCharset();
      try { 
        CSVParser.parse(path0, charset0, cSVFormat1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      // Undeclared exception!
      try { 
        CSVParser.parse(uRL0, (Charset) null, cSVFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter 'charset' must not be null!
         //
         verifyException("org.apache.commons.csv.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      URL uRL0 = MockURL.getHttpExample();
      try { 
        CSVParser.parse(uRL0, charset0, cSVFormat0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        CSVParser.parse("", (CSVFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter 'format' must not be null!
         //
         verifyException("org.apache.commons.csv.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      // Undeclared exception!
      try { 
        CSVParser.parse((Reader) null, cSVFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter 'reader' must not be null!
         //
         verifyException("org.apache.commons.csv.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      RowSetMetaDataImpl rowSetMetaDataImpl0 = new RowSetMetaDataImpl();
      CSVFormat cSVFormat1 = cSVFormat0.withHeader((ResultSetMetaData) rowSetMetaDataImpl0);
      try { 
        CSVParser.parse((Reader) pipedReader0, cSVFormat1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      // Undeclared exception!
      try { 
        CSVParser.parse((InputStream) pipedInputStream0, (Charset) null, cSVFormat0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // charset
         //
         verifyException("java.io.InputStreamReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      File file0 = MockFile.createTempFile("No more CSV records available", "No more CSV records available");
      // Undeclared exception!
      try { 
        CSVParser.parse(file0, (Charset) null, cSVFormat0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // charset
         //
         verifyException("java.io.InputStreamReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      File file0 = MockFile.createTempFile("charset", "charset");
      Charset charset0 = Charset.defaultCharset();
      FileSystemHandling.shouldAllThrowIOExceptions();
      CSVFormat cSVFormat0 = CSVFormat.newFormat('P');
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      try { 
        CSVParser.parse(file0, charset0, cSVFormat1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD;
      MockFile mockFile0 = new MockFile("", "");
      Charset charset0 = Charset.defaultCharset();
      try { 
        CSVParser.parse((File) mockFile0, charset0, cSVFormat0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVParser cSVParser0 = CSVParser.parse((Reader) pipedReader0, cSVFormat0);
      try { 
        cSVParser0.nextRecord();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader(1559);
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVParser cSVParser0 = new CSVParser(pipedReader0, cSVFormat0, 1559, 509L);
      try { 
        cSVParser0.getRecords();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVParser cSVParser0 = null;
      try {
        cSVParser0 = new CSVParser((Reader) null, cSVFormat0, 183L, (-6L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter 'reader' must not be null!
         //
         verifyException("org.apache.commons.csv.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVParser cSVParser0 = null;
      try {
        cSVParser0 = new CSVParser((Reader) null, cSVFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter 'reader' must not be null!
         //
         verifyException("org.apache.commons.csv.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("inputStream");
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVParser cSVParser0 = new CSVParser(stringReader0, cSVFormat0);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      String[] stringArray0 = new String[4];
      stringArray0[1] = "1";
      stringArray0[2] = "Unexpected Token type: ";
      stringArray0[3] = "";
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      CSVParser cSVParser0 = new CSVParser(pipedReader0, cSVFormat1, 0L, 0L);
      assertEquals((-1L), cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      File file0 = MockFile.createTempFile("charset", "charset");
      Charset charset0 = Charset.defaultCharset();
      CSVFormat cSVFormat0 = CSVFormat.newFormat('P');
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse(file0, charset0, cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
      CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
      CSVParser cSVParser0 = null;
      try {
        cSVParser0 = new CSVParser(pipedReader0, cSVFormat2, (-3500L), 0L);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      StringReader stringReader0 = new StringReader("6Ih");
      CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
      cSVParser0.getRecords();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD;
      StringReader stringReader0 = new StringReader("P5, ?Y[|*");
      CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
      cSVParser0.getHeaderMap();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      String[] stringArray0 = new String[4];
      stringArray0[1] = "1";
      stringArray0[2] = "Unexpected Token type: ";
      stringArray0[3] = " valuels=";
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      CSVParser cSVParser0 = new CSVParser(pipedReader0, cSVFormat1, 0L, 0L);
      Map<String, Integer> map0 = cSVParser0.getHeaderMap();
      assertNotNull(map0);
      assertEquals((-1L), cSVParser0.getRecordNumber());
      assertEquals(4, map0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Escape=</Escape=<0Escape=<");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      MockFile mockFile0 = new MockFile("Escape=<");
      File file0 = MockFile.createTempFile("Escape=<", "Escape=<", (File) mockFile0);
      Charset charset0 = Charset.defaultCharset();
      CSVParser cSVParser0 = CSVParser.parse(file0, charset0, cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVParser cSVParser0 = CSVParser.parse("thk,3Hy3DboF", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVFormat cSVFormat1 = cSVFormat0.withTrim();
      CSVParser cSVParser0 = CSVParser.parse("@_(Y\"+#u%[i<2A", cSVFormat1);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("\"K>=/L(ei:8HpA.;e", cSVFormat0);
      long long0 = cSVParser0.getRecordNumber();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = CSVParser.parse("6Ih", cSVFormat0);
      cSVParser0.isClosed();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        CSVParser.parse((InputStream) null, charset0, cSVFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter 'inputStream' must not be null!
         //
         verifyException("org.apache.commons.csv.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD;
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      Charset charset0 = Charset.defaultCharset();
      CSVParser cSVParser0 = CSVParser.parse(path0, charset0, cSVFormat0);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      Charset charset0 = Charset.defaultCharset();
      URL uRL0 = MockURL.getFtpExample();
      // Undeclared exception!
      try { 
        CSVParser.parse(uRL0, charset0, cSVFormat0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        CSVParser.parse((File) null, charset0, cSVFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter 'file' must not be null!
         //
         verifyException("org.apache.commons.csv.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      StringReader stringReader0 = new StringReader("6Ih");
      CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
      cSVParser0.getCurrentLineNumber();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      StringReader stringReader0 = new StringReader("6Ih");
      CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
      cSVParser0.getFirstEndOfLine();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      StringReader stringReader0 = new StringReader("6Ih");
      CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
      Consumer<CSVRecord> consumer0 = (Consumer<CSVRecord>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      cSVParser0.forEach(consumer0);
      long long0 = cSVParser0.getRecordNumber();
      assertEquals(1L, long0);
  }
}
