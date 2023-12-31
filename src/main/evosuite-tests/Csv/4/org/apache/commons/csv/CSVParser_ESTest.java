/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 17:02:14 GMT 2023
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.Quote;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CSVParser_ESTest extends CSVParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("E0=S!i@iL");
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      stringReader0.close();
      CSVParser cSVParser0 = new CSVParser(stringReader0, cSVFormat0);
      Consumer<CSVRecord> consumer0 = (Consumer<CSVRecord>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        cSVParser0.forEach(consumer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.IOException: Stream closed
         //
         verifyException("org.apache.commons.csv.CSVParser$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
      CSVRecord cSVRecord0 = cSVParser0.nextRecord();
      assertNull(cSVRecord0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      String[] stringArray0 = new String[2];
      stringArray0[0] = "p@q=v?idwm|ufx";
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      CSVParser cSVParser0 = CSVParser.parse("p@q=v?idwm|ufx", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
      
      CSVRecord cSVRecord0 = cSVParser0.nextRecord();
      assertFalse(cSVRecord0.isConsistent());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
      cSVParser0.close();
      boolean boolean0 = cSVParser0.isClosed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
      List<CSVRecord> list0 = cSVParser0.getRecords();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      StringReader stringReader0 = new StringReader("`r`JjOw");
      CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
      cSVParser0.getRecords();
      long long0 = cSVParser0.getRecordNumber();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Character character0 = Character.valueOf('4');
      Quote quote0 = Quote.MINIMAL;
      Character character1 = new Character('C');
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat0 = new CSVFormat('l', character0, quote0, character1, character0, false, false, "string", "", stringArray0, false);
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
      Map<String, Integer> map0 = cSVParser0.getHeaderMap();
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.newFormat('j');
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines(true);
      CSVParser cSVParser0 = CSVParser.parse("A:q )Rl|!", cSVFormat2);
      Map<String, Integer> map0 = cSVParser0.getHeaderMap();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Character character0 = Character.valueOf('4');
      Quote quote0 = Quote.MINIMAL;
      Character character1 = new Character('C');
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat0 = new CSVFormat('l', character0, quote0, character1, character0, false, false, "", "", stringArray0, false);
      CSVParser cSVParser0 = CSVParser.parse("CSVParser has been closed", cSVFormat0);
      long long0 = cSVParser0.getCurrentLineNumber();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      URL uRL0 = MockURL.getFileExample();
      Charset charset0 = Charset.defaultCharset();
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
  public void test10()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      URL uRL0 = MockURL.getFtpExample();
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
  public void test11()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Charset charset0 = Charset.defaultCharset();
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
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
  public void test12()  throws Throwable  {
      Character character0 = new Character('W');
      Quote quote0 = Quote.MINIMAL;
      String[] stringArray0 = new String[6];
      CSVFormat cSVFormat0 = new CSVFormat(']', character0, quote0, character0, character0, false, false, "Escape=<", "reader", stringArray0, false);
      // Undeclared exception!
      try { 
        CSVParser.parse("No more CSV records available", cSVFormat0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The comment start character and the quoteChar cannot be the same ('W')
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      Character character0 = Character.valueOf('\'');
      Quote quote0 = Quote.MINIMAL;
      Character character1 = new Character('C');
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat0 = new CSVFormat('l', character0, quote0, character1, character0, false, false, "", "", stringArray0, false);
      try { 
        CSVParser.parse("'LRS;)z", cSVFormat0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // (startline 1) EOF reached before encapsulated token finished
         //
         verifyException("org.apache.commons.csv.Lexer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      File file0 = MockFile.createTempFile("qivQG~Ob6", "");
      Character character0 = Character.valueOf('3');
      Quote quote0 = Quote.ALL;
      String[] stringArray0 = new String[4];
      CSVFormat cSVFormat0 = new CSVFormat('k', character0, quote0, character0, character0, true, true, "qivQG~Ob6", "", stringArray0, false);
      // Undeclared exception!
      try { 
        CSVParser.parse(file0, cSVFormat0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The comment start character and the quoteChar cannot be the same ('3')
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      // Undeclared exception!
      try { 
        CSVParser.parse((File) null, cSVFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter 'file' must not be null!
         //
         verifyException("org.apache.commons.csv.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = new CSVParser(stringReader0, cSVFormat0);
      cSVParser0.close();
      try { 
        cSVParser0.nextRecord();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Character character0 = Character.valueOf('4');
      Quote quote0 = Quote.MINIMAL;
      Character character1 = new Character('C');
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat0 = new CSVFormat('z', character0, quote0, character1, character0, false, false, "string", "", stringArray0, false);
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
      cSVParser0.close();
      try { 
        cSVParser0.getRecords();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("g8MZtXg1E)E1@qzx{/t@{gJT,0?|");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      MockFile mockFile0 = new MockFile("g8MZtXg1E)E1@qzx{");
      File file0 = MockFile.createTempFile("t@{gJT,", "?|", (File) mockFile0);
      CSVParser cSVParser0 = CSVParser.parse(file0, cSVFormat0);
      try { 
        cSVParser0.close();
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
      StringReader stringReader0 = new StringReader("rfo^0AJV+Bf0iZ5MVW");
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      Character character0 = new Character('o');
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart(character0);
      CSVFormat cSVFormat2 = cSVFormat1.withQuoteChar('o');
      CSVParser cSVParser0 = null;
      try {
        cSVParser0 = new CSVParser(stringReader0, cSVFormat2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The comment start character and the quoteChar cannot be the same ('o')
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      String[] stringArray0 = new String[8];
      stringArray0[0] = "V ykN~%xg'G";
      stringArray0[1] = "org.apache.commons.csv.csvrecord";
      stringArray0[2] = "string";
      stringArray0[3] = "@ms]N[hd";
      stringArray0[4] = "[qYO";
      stringArray0[5] = "IN;%,-Nk/E*ed=&`F ";
      stringArray0[7] = "=";
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord(true);
      CSVFormat cSVFormat3 = cSVFormat2.withIgnoreSurroundingSpaces(true);
      StringReader stringReader0 = new StringReader("\r\n");
      CSVParser cSVParser0 = cSVFormat3.parse(stringReader0);
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = CSVParser.parse("t@{gJT,", cSVFormat0);
      List<CSVRecord> list0 = cSVParser0.getRecords();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVParser cSVParser0 = CSVParser.parse("nthi", cSVFormat0);
      cSVParser0.close();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      cSVParser0.forEach(consumer0);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Character character0 = Character.valueOf(',');
      Quote quote0 = Quote.MINIMAL;
      Character character1 = new Character('C');
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat0 = new CSVFormat('l', character0, quote0, character1, character0, false, false, "", "", stringArray0, false);
      StringReader stringReader0 = new StringReader("l");
      CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVFormat cSVFormat1 = cSVFormat0.withNullString("string");
      CSVParser cSVParser0 = CSVParser.parse("nthi", cSVFormat1);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "(line ");
      URL uRL0 = MockURL.getHttpExample();
      Charset charset0 = Charset.defaultCharset();
      CSVParser cSVParser0 = CSVParser.parse(uRL0, charset0, cSVFormat0);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVParser cSVParser0 = CSVParser.parse("E0=S!pi@iL", cSVFormat0);
      Consumer<CSVRecord> consumer0 = (Consumer<CSVRecord>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      cSVParser0.forEach(consumer0);
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVParser cSVParser0 = CSVParser.parse("nthi", cSVFormat0);
      // Undeclared exception!
      try { 
        cSVParser0.getHeaderMap();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVParser cSVParser0 = CSVParser.parse("nthi", cSVFormat0);
      long long0 = cSVParser0.getRecordNumber();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Character character0 = Character.valueOf('4');
      Quote quote0 = Quote.MINIMAL;
      Character character1 = new Character('C');
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat0 = new CSVFormat('z', character0, quote0, character1, character0, false, false, "string", "", stringArray0, false);
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
      cSVParser0.getCurrentLineNumber();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      MockFile mockFile0 = new MockFile("E0=S!pi@iL");
      try { 
        CSVParser.parse((File) mockFile0, cSVFormat0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
      boolean boolean0 = cSVParser0.isClosed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
      Iterator<CSVRecord> iterator0 = cSVParser0.iterator();
      assertNotNull(iterator0);
  }
}
