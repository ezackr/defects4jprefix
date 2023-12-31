/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 17:06:26 GMT 2023
 */
package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
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
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class CSVParser_ESTest extends CSVParser_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        StringReader stringReader0 = new StringReader("bO");
        stringReader0.close();
        CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
        Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        cSVParser0.forEach(consumer0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        Charset charset0 = Charset.defaultCharset();
        EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
        NetworkHandling.createRemoteTextFile(evoSuiteURL0, "bzosynjay]c\"<cjji");
        CSVFormat cSVFormat0 = CSVFormat.newFormat('%');
        CSVParser cSVParser0 = CSVParser.parse(uRL0, charset0, cSVFormat0);
        cSVParser0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        StringReader stringReader0 = new StringReader("");
        CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
        CSVRecord cSVRecord0 = cSVParser0.nextRecord();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        String[] stringArray0 = new String[0];
        CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
        CSVParser cSVParser0 = CSVParser.parse("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", cSVFormat1);
        cSVParser0.nextRecord();
        cSVParser0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        StringReader stringReader0 = new StringReader("6l'ZbrAb(756");
        CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
        Iterator<CSVRecord> iterator0 = cSVParser0.iterator();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVParser cSVParser0 = CSVParser.parse(";97;ZK9g9W%|~dI.B", cSVFormat0);
        cSVParser0.close();
        boolean boolean0 = cSVParser0.isClosed();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.RFC4180;
        CSVParser cSVParser0 = CSVParser.parse("7?5Gy( ^zNH,zj\"c", cSVFormat0);
        LinkedList<CSVRecord> linkedList0 = new LinkedList<CSVRecord>();
        LinkedList<CSVRecord> linkedList1 = cSVParser0.getRecords(linkedList0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.RFC4180;
        CSVParser cSVParser0 = CSVParser.parse("org.apache.commons.csv.CSVParser", cSVFormat0);
        cSVParser0.nextRecord();
        long long0 = cSVParser0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        String[] stringArray0 = new String[0];
        CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
        Character character0 = new Character('z');
        CSVFormat cSVFormat2 = cSVFormat1.withEscape(character0);
        CSVParser cSVParser0 = CSVParser.parse("", cSVFormat2);
        Map<String, Integer> map0 = cSVParser0.getHeaderMap();
        map0.size();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        Character character0 = Character.valueOf('8');
        CSVFormat cSVFormat1 = cSVFormat0.withCommentStart(character0);
        CSVFormat cSVFormat2 = cSVFormat1.withQuoteChar((Character) null);
        StringReader stringReader0 = new StringReader("8K:uH!LAFS\"L~maJ");
        CSVParser cSVParser0 = new CSVParser(stringReader0, cSVFormat2);
        cSVParser0.getRecords();
        long long0 = cSVParser0.getCurrentLineNumber();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Charset charset0 = Charset.defaultCharset();
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        CSVParser.parse((URL) null, charset0, cSVFormat0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.newFormat('2');
        URL uRL0 = MockURL.getHttpExample();
        Charset charset0 = Charset.defaultCharset();
        CSVParser.parse(uRL0, charset0, cSVFormat0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Character character0 = Character.valueOf('f');
        Quote quote0 = Quote.MINIMAL;
        String[] stringArray0 = new String[4];
        CSVFormat cSVFormat0 = new CSVFormat('d', character0, quote0, character0, character0, false, true, "C;Sb^XM}1e(abVox2Zo", (String) null, stringArray0, false);
        CSVParser.parse("C;Sb^XM}1e(abVox2Zo", cSVFormat0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        CSVParser.parse("Q$OInPz[|:#B#1.dwn", (CSVFormat) null);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        char[] charArray0 = new char[7];
        charArray0[0] = ')';
        Quote quote0 = Quote.ALL;
        String[] stringArray0 = new String[1];
        CSVFormat cSVFormat0 = new CSVFormat('#', (Character) charArray0[1], quote0, (Character) charArray0[0], (Character) charArray0[1], true, true, "(line ", "il", stringArray0, true);
        CSVFormat cSVFormat1 = cSVFormat0.withQuoteChar('g');
        CSVParser.parse("g`~", cSVFormat1);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        File file0 = MockFile.createTempFile("+'9,vz!Fg?*B'", "50na=");
        CSVFormat cSVFormat0 = CSVFormat.newFormat('T');
        CSVFormat cSVFormat1 = cSVFormat0.withEscape('T');
        CSVParser.parse(file0, cSVFormat1);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVParser.parse((File) null, cSVFormat0);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        File file0 = MockFile.createTempFile(") invalid char between encapsulated token and delimiter", ") invalid char between encapsulated token and delimiter");
        CSVFormat cSVFormat0 = CSVFormat.RFC4180;
        String[] stringArray0 = new String[0];
        CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
        FileSystemHandling.shouldAllThrowIOExceptions();
        CSVParser.parse(file0, cSVFormat1);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        MockFile mockFile0 = new MockFile("");
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        CSVParser.parse((File) mockFile0, cSVFormat0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVParser cSVParser0 = CSVParser.parse(";97;ZK9g9W%|~dI.B", cSVFormat0);
        cSVParser0.close();
        cSVParser0.nextRecord();
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader("5_`>{");
        CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
        cSVParser0.close();
        cSVParser0.getRecords();
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        MockFile mockFile0 = new MockFile("Parameter '", "MINIMAL");
        File file0 = MockFile.createTempFile(" ?g", " ?g", (File) mockFile0);
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        CSVParser cSVParser0 = CSVParser.parse(file0, cSVFormat0);
        FileSystemHandling.shouldAllThrowIOExceptions();
        cSVParser0.close();
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        StringReader stringReader0 = new StringReader("NONE");
        Character character0 = new Character('F');
        Quote quote0 = Quote.ALL;
        String[] stringArray0 = new String[5];
        CSVFormat cSVFormat0 = new CSVFormat('F', character0, quote0, character0, character0, true, true, "", "0M_E/RG9tfSu&DE.l9", stringArray0, false);
        CSVParser cSVParser0 = null;
        cSVParser0 = new CSVParser(stringReader0, cSVFormat0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        StringReader stringReader0 = new StringReader("");
        CSVParser cSVParser0 = null;
        cSVParser0 = new CSVParser(stringReader0, (CSVFormat) null);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        StringReader stringReader0 = new StringReader("bO");
        Character character0 = Character.valueOf('8');
        Quote quote0 = Quote.ALL;
        stringReader0.close();
        String[] stringArray0 = new String[1];
        CSVFormat cSVFormat0 = new CSVFormat('#', character0, quote0, (Character) '\u0000', character0, true, true, "(line ", "il", stringArray0, true);
        CSVParser cSVParser0 = null;
        cSVParser0 = new CSVParser(stringReader0, cSVFormat0);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVParser cSVParser0 = CSVParser.parse("CbX0>ls{(uW\"U(3Kh", cSVFormat0);
        cSVParser0.getRecords((LinkedList<CSVRecord>) null);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
        Collection<CSVRecord> collection0 = cSVParser0.getRecords((Collection<CSVRecord>) null);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        StringReader stringReader0 = new StringReader("bO");
        CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
        boolean boolean0 = cSVParser0.isClosed();
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        StringReader stringReader0 = new StringReader("bO");
        CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
        Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        cSVParser0.close();
        cSVParser0.forEach(consumer0);
        cSVParser0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        String[] stringArray0 = new String[1];
        CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
        CSVParser cSVParser0 = CSVParser.parse(";97;ZK9g9W%|~dI.B", cSVFormat1);
        cSVParser0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        String[] stringArray0 = new String[0];
        CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
        CSVParser cSVParser0 = CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat1);
        cSVParser0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.RFC4180;
        CSVParser cSVParser0 = CSVParser.parse("c79\nYt$6%kn.", cSVFormat0);
        Map<String, Integer> map0 = cSVParser0.getHeaderMap();
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        StringReader stringReader0 = new StringReader("bO");
        CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
        cSVParser0.close();
        cSVParser0.getRecords((LinkedList<CSVRecord>) null);
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        StringReader stringReader0 = new StringReader("bO");
        Character character0 = Character.valueOf('*');
        Quote quote0 = Quote.ALL;
        String[] stringArray0 = new String[1];
        CSVFormat cSVFormat0 = new CSVFormat('$', character0, quote0, (Character) '\u0000', character0, true, true, "bO", "Bl", stringArray0, true);
        CSVParser cSVParser0 = new CSVParser(stringReader0, cSVFormat0);
        Map<String, Integer> map0 = cSVParser0.getHeaderMap();
        map0.size();
    }

    @Test(timeout = 4000)
    public void test3334() throws Throwable {
        StringReader stringReader0 = new StringReader("bO");
        Character character0 = Character.valueOf('*');
        Quote quote0 = Quote.ALL;
        String[] stringArray0 = new String[1];
        CSVFormat cSVFormat0 = new CSVFormat('$', character0, quote0, (Character) '\u0000', character0, true, true, "bO", "Bl", stringArray0, true);
        CSVParser cSVParser0 = new CSVParser(stringReader0, cSVFormat0);
        Map<String, Integer> map0 = cSVParser0.getHeaderMap();
    }

    @Test(timeout = 4000)
    public void test3335() throws Throwable {
        StringReader stringReader0 = new StringReader("bO");
        Character character0 = Character.valueOf('*');
        Quote quote0 = Quote.ALL;
        String[] stringArray0 = new String[1];
        CSVFormat cSVFormat0 = new CSVFormat('$', character0, quote0, (Character) '\u0000', character0, true, true, "bO", "Bl", stringArray0, true);
        CSVParser cSVParser0 = new CSVParser(stringReader0, cSVFormat0);
        Map<String, Integer> map0 = cSVParser0.getHeaderMap();
        cSVParser0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test3436() throws Throwable {
        Character character0 = new Character('d');
        Quote quote0 = Quote.NONE;
        CSVFormat cSVFormat0 = new CSVFormat('s', character0, quote0, (Character) null, character0, true, true, "R3XhkI<Ri}R{/A1Kq", "R3XhkI<Ri}R{/A1Kq", (String[]) null, true);
        CSVParser cSVParser0 = CSVParser.parse("R3XhkI<Ri}R{/A1Kq", cSVFormat0);
        cSVParser0.getRecords();
        cSVParser0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test3537() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.RFC4180;
        CSVParser cSVParser0 = CSVParser.parse("c79\nYt$6%kn.", cSVFormat0);
        long long0 = cSVParser0.getRecordNumber();
    }

    @Test(timeout = 4000)
    public void test3638() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader("charset");
        CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
        long long0 = cSVParser0.getCurrentLineNumber();
    }

    @Test(timeout = 4000)
    public void test3739() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.RFC4180;
        File file0 = MockFile.createTempFile("c79\nYt$6%kn.", "c79\nYt$6%kn.");
        URL uRL0 = file0.toURL();
        Charset charset0 = Charset.defaultCharset();
        CSVParser.parse(uRL0, charset0, cSVFormat0);
    }

    @Test(timeout = 4000)
    public void test3840() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        StringReader stringReader0 = new StringReader("bO");
        CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
        Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
        cSVParser0.forEach(consumer0);
        cSVParser0.getRecordNumber();
    }
}
