/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 17:03:58 GMT 2023
 */
package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PipedInputStream;
import java.io.PipedWriter;
import java.io.SequenceInputStream;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.Charset;
import java.sql.BatchUpdateException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLNonTransientConnectionException;
import java.sql.SQLTransactionRollbackException;
import java.util.ArrayList;
import java.util.HashSet;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.Quote;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class CSVPrinter_ESTest extends CSVPrinter_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        CharArrayWriter charArrayWriter0 = new CharArrayWriter(1174);
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVFormat cSVFormat1 = cSVFormat0.withDelimiter('i');
        CSVPrinter cSVPrinter0 = new CSVPrinter(charArrayWriter0, cSVFormat1);
        Object[] objectArray0 = new Object[9];
        objectArray0[2] = (Object) charArrayWriter0;
        cSVPrinter0.printRecord(objectArray0);
        charArrayWriter0.size();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.newFormat(']');
        Object[] objectArray0 = new Object[7];
        objectArray0[4] = (Object) cSVFormat0;
        String string0 = cSVFormat0.format(objectArray0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("NONE", true);
        MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintStream0, cSVFormat0);
        cSVPrinter0.printRecords((Object[]) null);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        File file0 = MockFile.createTempFile("url", "org.apache.commons.csv.CSVPrinter$1");
        MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintStream0, cSVFormat0);
        ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
        doReturn((ResultSetMetaData) null).when(resultSet0).getMetaData();
        cSVPrinter0.printRecords(resultSet0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringBuffer stringBuffer0 = stringWriter0.getBuffer();
        CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        CSVPrinter cSVPrinter0 = new CSVPrinter(charBuffer0, cSVFormat0);
        cSVPrinter0.printRecords((Iterable<?>) null);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        CharBuffer charBuffer0 = CharBuffer.allocate(0);
        CSVFormat cSVFormat0 = CSVFormat.RFC4180;
        CSVPrinter cSVPrinter0 = new CSVPrinter(charBuffer0, cSVFormat0);
        Object[] objectArray0 = new Object[1];
        cSVPrinter0.printRecord(objectArray0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        CharArrayWriter charArrayWriter0 = new CharArrayWriter();
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter(charArrayWriter0);
        CSVFormat cSVFormat0 = CSVFormat.newFormat('\'');
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintWriter0, cSVFormat0);
        cSVPrinter0.printRecord((Object[]) null);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        PipedWriter pipedWriter0 = new PipedWriter();
        CSVFormat cSVFormat0 = CSVFormat.newFormat('J');
        CSVPrinter cSVPrinter0 = new CSVPrinter(pipedWriter0, cSVFormat0);
        Object[] objectArray0 = new Object[0];
        cSVPrinter0.printRecord(objectArray0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("out");
        OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(mockFileOutputStream0);
        CSVFormat cSVFormat0 = CSVFormat.RFC4180;
        CSVPrinter cSVPrinter0 = new CSVPrinter(outputStreamWriter0, cSVFormat0);
        cSVPrinter0.printRecord((Iterable<?>) null);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Charset charset0 = Charset.defaultCharset();
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(1161);
        CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
        CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        Character character0 = Character.valueOf('&');
        CSVFormat cSVFormat1 = cSVFormat0.withCommentStart(character0);
        CSVPrinter cSVPrinter0 = new CSVPrinter(charBuffer1, cSVFormat1);
        cSVPrinter0.printComment("S:p0sP_!");
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        char[] charArray0 = new char[6];
        CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('P');
        CSVPrinter cSVPrinter0 = new CSVPrinter(charBuffer0, cSVFormat1);
        cSVPrinter0.printComment("FYGb0TDj");
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        char[] charArray0 = new char[4];
        CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVPrinter cSVPrinter0 = new CSVPrinter(charBuffer0, cSVFormat0);
        Float float0 = new Float((-594.9592F));
        cSVPrinter0.print(float0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        MockFileWriter mockFileWriter0 = new MockFileWriter("k`.3en(twdW3W", false);
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockFileWriter0, cSVFormat0);
        cSVPrinter0.close();
        Double double0 = new Double(0.0);
        cSVPrinter0.print(double0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        MockFileWriter mockFileWriter0 = new MockFileWriter("Tv/A*$", true);
        Character character0 = new Character('/');
        Quote quote0 = Quote.NONE;
        String[] stringArray0 = new String[5];
        CSVFormat cSVFormat0 = new CSVFormat('/', character0, quote0, character0, character0, false, true, "", "", stringArray0, true);
        CSVPrinter cSVPrinter0 = null;
        cSVPrinter0 = new CSVPrinter(mockFileWriter0, cSVFormat0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        CharArrayWriter charArrayWriter0 = new CharArrayWriter();
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVPrinter cSVPrinter0 = new CSVPrinter(charArrayWriter0, cSVFormat0);
        HashSet<SequenceInputStream> hashSet0 = new HashSet<SequenceInputStream>();
        ArrayList<SequenceInputStream> arrayList0 = new ArrayList<SequenceInputStream>(hashSet0);
        PipedInputStream pipedInputStream0 = new PipedInputStream(110);
        SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
        arrayList0.add(sequenceInputStream0);
        cSVPrinter0.printRecord((Iterable<?>) arrayList0);
        charArrayWriter0.size();
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        MockFile mockFile0 = new MockFile("qdQa-EU:/yl", "qdQa-EU:/yl");
        MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintStream0, cSVFormat0);
        cSVPrinter0.print((Object) null);
        mockFile0.length();
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        File file0 = MockFile.createTempFile("The comment start and the escape character cannot be the same ('", "The comment start and the escape character cannot be the same ('");
        MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintStream0, cSVFormat0);
        cSVPrinter0.println();
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("G=SE(HGw-");
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintStream0, cSVFormat0);
        ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
        doReturn(16).when(resultSetMetaData0).getColumnCount();
        ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
        doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
        doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(resultSet0).getString(anyInt());
        doReturn(true, false).when(resultSet0).next();
        cSVPrinter0.printRecords(resultSet0);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        MockFileWriter mockFileWriter0 = new MockFileWriter("[{", false);
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockFileWriter0, cSVFormat0);
        SQLTransactionRollbackException sQLTransactionRollbackException0 = new SQLTransactionRollbackException("");
        Object[] objectArray0 = new Object[9];
        objectArray0[5] = (Object) sQLTransactionRollbackException0;
        cSVPrinter0.printRecords(objectArray0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        MockFile mockFile0 = new MockFile("QuoteChar=<");
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('w');
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintWriter0, cSVFormat1);
        cSVPrinter0.print(mockFile0);
        cSVPrinter0.printComment("QuoteChar=<");
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        File file0 = MockFile.createTempFile("The comment start and the escape character cannot be the same ('", "The comment start and the escape character cannot be the same ('");
        MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintStream0, cSVFormat0);
        cSVPrinter0.printComment("The quoteChar cannot be a line break");
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        File file0 = MockFile.createTempFile("The comment start and the escape character cannot be the same ('", "The comment start and the escape character cannot be the same ('");
        MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVFormat cSVFormat1 = cSVFormat0.withDelimiter('r');
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintStream0, cSVFormat1);
        Object[] objectArray0 = new Object[3];
        objectArray0[1] = (Object) file0;
        cSVPrinter0.printRecord(objectArray0);
        file0.length();
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
        Charset charset0 = Charset.defaultCharset();
        OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(byteArrayOutputStream0, charset0);
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVFormat cSVFormat1 = cSVFormat0.withQuoteChar('o');
        CSVPrinter cSVPrinter0 = new CSVPrinter(outputStreamWriter0, cSVFormat1);
        cSVPrinter0.print(outputStreamWriter0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        MockFile mockFile0 = new MockFile("QuoteChar=<");
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        Quote quote0 = Quote.ALL;
        CSVFormat cSVFormat1 = cSVFormat0.withQuotePolicy(quote0);
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintWriter0, cSVFormat1);
        cSVPrinter0.print(mockFile0);
        mockFile0.getTotalSpace();
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        MockFile mockFile0 = new MockFile("QuoteChar=<");
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        Quote quote0 = Quote.NON_NUMERIC;
        CSVFormat cSVFormat1 = cSVFormat0.withQuotePolicy(quote0);
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintWriter0, cSVFormat1);
        cSVPrinter0.print(mockFile0);
        mockFile0.isHidden();
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        CharArrayWriter charArrayWriter0 = new CharArrayWriter(29);
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVFormat cSVFormat1 = cSVFormat0.withEscape('i');
        CSVPrinter cSVPrinter0 = new CSVPrinter(charArrayWriter0, cSVFormat1);
        Object[] objectArray0 = new Object[9];
        objectArray0[0] = (Object) cSVPrinter0;
        cSVPrinter0.printRecord(objectArray0);
        charArrayWriter0.size();
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        MockFileWriter mockFileWriter0 = new MockFileWriter("[{", false);
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockFileWriter0, cSVFormat0);
        HashSet<BatchUpdateException> hashSet0 = new HashSet<BatchUpdateException>(0);
        SQLTransactionRollbackException sQLTransactionRollbackException0 = new SQLTransactionRollbackException("");
        SQLNonTransientConnectionException sQLNonTransientConnectionException0 = new SQLNonTransientConnectionException((String) null, "(a^(>Ccp|'CVN/Q468", sQLTransactionRollbackException0);
        BatchUpdateException batchUpdateException0 = new BatchUpdateException(sQLNonTransientConnectionException0);
        hashSet0.add(batchUpdateException0);
        cSVPrinter0.printRecords((Iterable<?>) hashSet0);
        hashSet0.contains(batchUpdateException0);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        MockFile mockFile0 = new MockFile("QuoteChar=<");
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintWriter0, cSVFormat0);
        cSVPrinter0.flush();
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        char[] charArray0 = new char[7];
        CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 0);
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        CSVPrinter cSVPrinter0 = new CSVPrinter(charBuffer0, cSVFormat0);
        cSVPrinter0.flush();
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringBuffer stringBuffer0 = stringWriter0.getBuffer();
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        CSVPrinter cSVPrinter0 = new CSVPrinter(stringBuffer0, cSVFormat0);
        cSVPrinter0.close();
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        StringWriter stringWriter0 = new StringWriter();
        StringBuffer stringBuffer0 = stringWriter0.getBuffer();
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        CSVPrinter cSVPrinter0 = new CSVPrinter(stringBuffer0, cSVFormat0);
        Appendable appendable0 = cSVPrinter0.getOut();
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVPrinter cSVPrinter0 = null;
        cSVPrinter0 = new CSVPrinter((Appendable) null, cSVFormat0);
    }
}
