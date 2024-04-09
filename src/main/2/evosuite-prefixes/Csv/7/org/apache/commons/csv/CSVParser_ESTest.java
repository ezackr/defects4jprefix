/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 14:59:58 GMT 2024
 */
package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CSVParser_ESTest extends CSVParser_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVParser cSVParser0 = CSVParser.parse("L!YA,4tkf+*IFue&", cSVFormat0);
        Consumer<CSVRecord> consumer0 = (Consumer<CSVRecord>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        cSVParser0.forEach(consumer0);
        cSVParser0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        URL uRL0 = MockURL.getHttpExample();
        Charset charset0 = Charset.defaultCharset();
        CSVParser.parse(uRL0, charset0, cSVFormat0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVParser cSVParser0 = CSVParser.parse("format", cSVFormat0);
        List<CSVRecord> list0 = cSVParser0.getRecords();
        list0.size();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVParser.parse((File) null, cSVFormat0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVParser cSVParser0 = CSVParser.parse("QB!.s j(,V(U", cSVFormat0);
        long long0 = cSVParser0.getCurrentLineNumber();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVParser cSVParser0 = CSVParser.parse("The header contains duplicate names: ", cSVFormat0);
        long long0 = cSVParser0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVFormat cSVFormat1 = cSVFormat0.withNullString(".[=uc=;rz");
        CSVParser cSVParser0 = CSVParser.parse(".[=uc=;rz", cSVFormat1);
        CSVRecord cSVRecord0 = cSVParser0.nextRecord();
        cSVRecord0.toString();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVFormat cSVFormat1 = cSVFormat0.withNullString("7l'%*b+*xq,b@l");
        CSVParser cSVParser0 = CSVParser.parse("7l'%*b+*xq,b@l", cSVFormat1);
        CSVRecord cSVRecord0 = cSVParser0.nextRecord();
        cSVRecord0.toString();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVParser cSVParser0 = CSVParser.parse("k6Y}qgs:", cSVFormat0);
        cSVParser0.close();
        Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        cSVParser0.forEach(consumer0);
        cSVParser0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        String[] stringArray0 = new String[0];
        CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
        CSVParser cSVParser0 = CSVParser.parse("", cSVFormat1);
        Map<String, Integer> map0 = cSVParser0.getHeaderMap();
        map0.size();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVParser cSVParser0 = CSVParser.parse("r)#5om=&dI{<G|YM1}", cSVFormat0);
        Map<String, Integer> map0 = cSVParser0.getHeaderMap();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        String[] stringArray0 = new String[1];
        CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
        StringReader stringReader0 = new StringReader("No more CSV records available");
        CSVParser cSVParser0 = new CSVParser(stringReader0, cSVFormat1);
        cSVParser0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        String[] stringArray0 = new String[0];
        CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
        CSVParser cSVParser0 = CSVParser.parse("(line ", cSVFormat1);
        cSVParser0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord(true);
        String[] stringArray0 = new String[1];
        CSVFormat cSVFormat2 = cSVFormat1.withHeader(stringArray0);
        StringReader stringReader0 = new StringReader("No more CSV records available");
        CSVParser cSVParser0 = new CSVParser(stringReader0, cSVFormat2);
        cSVParser0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVParser cSVParser0 = CSVParser.parse("\r8o", cSVFormat0);
        CSVRecord cSVRecord0 = cSVParser0.nextRecord();
        cSVRecord0.toString();
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('u');
        CSVParser cSVParser0 = CSVParser.parse("u+\"[", cSVFormat1);
        CSVRecord cSVRecord0 = cSVParser0.nextRecord();
    }
}
