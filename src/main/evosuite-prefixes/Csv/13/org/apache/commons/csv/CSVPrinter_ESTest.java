/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 02:22:19 GMT 2023
 */
package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;
import java.nio.CharBuffer;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLRecoverableException;
import java.util.ArrayList;
import javax.sql.rowset.RowSetMetaDataImpl;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.QuoteMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CSVPrinter_ESTest extends CSVPrinter_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        MockPrintStream mockPrintStream0 = new MockPrintStream("x_XctZ;Lm1%Yo");
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintStream0, cSVFormat0);
        Appendable appendable0 = cSVPrinter0.getOut();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.newFormat('f');
        Object[] objectArray0 = new Object[7];
        objectArray0[0] = (Object) cSVFormat0;
        CSVFormat cSVFormat1 = cSVFormat0.withHeaderComments(objectArray0);
        StringWriter stringWriter0 = new StringWriter(23);
        StringBuffer stringBuffer0 = stringWriter0.getBuffer();
        CSVPrinter cSVPrinter0 = cSVFormat1.print(stringBuffer0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(21);
        MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
        CSVFormat cSVFormat0 = CSVFormat.RFC4180;
        RowSetMetaDataImpl rowSetMetaDataImpl0 = new RowSetMetaDataImpl();
        CSVFormat cSVFormat1 = cSVFormat0.withHeader((ResultSetMetaData) rowSetMetaDataImpl0);
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintStream0, cSVFormat1);
        byteArrayOutputStream0.size();
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(21);
        MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
        CSVFormat cSVFormat0 = CSVFormat.RFC4180;
        RowSetMetaDataImpl rowSetMetaDataImpl0 = new RowSetMetaDataImpl();
        CSVFormat cSVFormat1 = cSVFormat0.withHeader((ResultSetMetaData) rowSetMetaDataImpl0);
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintStream0, cSVFormat1);
        byteArrayOutputStream0.toString();
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0);
        MockPrintStream mockPrintStream0 = new MockPrintStream(bufferedOutputStream0);
        CSVFormat cSVFormat0 = CSVFormat.newFormat('q');
        CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        RowSetMetaDataImpl rowSetMetaDataImpl0 = new RowSetMetaDataImpl();
        CSVFormat cSVFormat2 = cSVFormat1.withHeader((ResultSetMetaData) rowSetMetaDataImpl0);
        CSVPrinter cSVPrinter0 = cSVFormat2.print(mockPrintStream0);
    }

    @Test(timeout = 4000)
    public void test105() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("m-dDQ^z+5=W)v/r}4*");
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintStream0, cSVFormat0);
        Object[] objectArray0 = new Object[1];
        cSVPrinter0.printRecords(objectArray0);
    }

    @Test(timeout = 4000)
    public void test116() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVFormat cSVFormat1 = cSVFormat0.withEscape((Character) null);
        CSVPrinter cSVPrinter0 = cSVFormat1.print(mockPrintStream0);
        cSVPrinter0.print((Object) null);
        byteArrayOutputStream0.toString();
    }

    @Test(timeout = 4000)
    public void test117() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVFormat cSVFormat1 = cSVFormat0.withEscape((Character) null);
        CSVPrinter cSVPrinter0 = cSVFormat1.print(mockPrintStream0);
        cSVPrinter0.print((Object) null);
        byteArrayOutputStream0.size();
    }

    @Test(timeout = 4000)
    public void test128() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVFormat cSVFormat1 = cSVFormat0.withDelimiter('.');
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintStream0, cSVFormat1);
        cSVPrinter0.print(cSVFormat0);
        byteArrayOutputStream0.size();
    }

    @Test(timeout = 4000)
    public void test159() throws Throwable {
        MockFileWriter mockFileWriter0 = new MockFileWriter("sh [P#W6*\"H%0y-", true);
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        QuoteMode quoteMode0 = QuoteMode.NON_NUMERIC;
        CSVFormat cSVFormat1 = cSVFormat0.withQuoteMode(quoteMode0);
        CSVPrinter cSVPrinter0 = cSVFormat1.print(mockFileWriter0);
        long[] longArray0 = new long[6];
        cSVPrinter0.print(longArray0[5]);
    }

    @Test(timeout = 4000)
    public void test1610() throws Throwable {
        MockFileWriter mockFileWriter0 = new MockFileWriter("sh [P#W6*\"H%0y-", true);
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        QuoteMode quoteMode0 = QuoteMode.NON_NUMERIC;
        CSVFormat cSVFormat1 = cSVFormat0.withQuoteMode(quoteMode0);
        CSVPrinter cSVPrinter0 = cSVFormat1.print(mockFileWriter0);
        Object[] objectArray0 = new Object[6];
        cSVPrinter0.printRecords(objectArray0);
    }

    @Test(timeout = 4000)
    public void test1711() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        MockFileWriter mockFileWriter0 = new MockFileWriter(" [", false);
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockFileWriter0, cSVFormat0);
        Object object0 = new Object();
        cSVPrinter0.print(object0);
        cSVPrinter0.print(byteArrayOutputStream0);
        byteArrayOutputStream0.toString();
    }

    @Test(timeout = 4000)
    public void test1912() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(21);
        MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
        CSVFormat cSVFormat0 = CSVFormat.RFC4180;
        CSVFormat cSVFormat1 = cSVFormat0.withNullString("[(x05!tQqM,*;_)?m");
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintStream0, cSVFormat1);
        Object[] objectArray0 = new Object[8];
        cSVPrinter0.printRecords(objectArray0);
        byteArrayOutputStream0.size();
    }

    @Test(timeout = 4000)
    public void test1913() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(21);
        MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
        CSVFormat cSVFormat0 = CSVFormat.RFC4180;
        CSVFormat cSVFormat1 = cSVFormat0.withNullString("[(x05!tQqM,*;_)?m");
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintStream0, cSVFormat1);
        Object[] objectArray0 = new Object[8];
        cSVPrinter0.printRecords(objectArray0);
        byteArrayOutputStream0.toString();
    }

    @Test(timeout = 4000)
    public void test2414() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        CSVFormat cSVFormat1 = cSVFormat0.withRecordSeparator((String) null);
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintStream0, cSVFormat1);
        SQLRecoverableException sQLRecoverableException0 = new SQLRecoverableException();
        cSVPrinter0.printRecords((Iterable<?>) sQLRecoverableException0);
        byteArrayOutputStream0.size();
    }

    @Test(timeout = 4000)
    public void test2515() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintStream0, cSVFormat0);
        ArrayList<BufferedOutputStream> arrayList0 = new ArrayList<BufferedOutputStream>();
        arrayList0.add((BufferedOutputStream) null);
        cSVPrinter0.printRecords((Iterable<?>) arrayList0);
        byteArrayOutputStream0.size();
    }

    @Test(timeout = 4000)
    public void test2516() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintStream0, cSVFormat0);
        ArrayList<BufferedOutputStream> arrayList0 = new ArrayList<BufferedOutputStream>();
        arrayList0.add((BufferedOutputStream) null);
        cSVPrinter0.printRecords((Iterable<?>) arrayList0);
        byteArrayOutputStream0.toString();
    }

    @Test(timeout = 4000)
    public void test2617() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        CSVPrinter cSVPrinter0 = new CSVPrinter(mockPrintStream0, cSVFormat0);
        SQLRecoverableException sQLRecoverableException0 = new SQLRecoverableException();
        Object[] objectArray0 = new Object[4];
        objectArray0[2] = (Object) sQLRecoverableException0;
        cSVPrinter0.printRecords(objectArray0);
        byteArrayOutputStream0.size();
    }
}
