/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 17:00:57 GMT 2023
 */
package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.StringReader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVLexer;
import org.apache.commons.csv.ExtendedBufferedReader;
import org.apache.commons.csv.Quote;
import org.apache.commons.csv.Token;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Lexer_ESTest extends Lexer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        StringReader stringReader0 = new StringReader("h}6Jpv");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isStartOfLine((-989));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        StringReader stringReader0 = new StringReader("-pxp?M{rZSY@Y");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        Token token0 = new Token();
        cSVLexer0.nextToken(token0);
        boolean boolean0 = cSVLexer0.readEndOfLine(13);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        Token token0 = new Token();
        StringReader stringReader0 = new StringReader("vRs'x#y/G(s~bqbCe ");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        Token token1 = cSVLexer0.nextToken(token0);
        assertSame(token0, token1);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        StringReader stringReader0 = new StringReader("EOF whilst processing escape sequence");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.readEndOfLine(79);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Character character0 = Character.valueOf('|');
        Quote quote0 = Quote.NONE;
        String[] stringArray0 = new String[6];
        CSVFormat cSVFormat0 = new CSVFormat('|', character0, quote0, character0, character0, true, false, "", "The escape character cannot be a line break", stringArray0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, (ExtendedBufferedReader) null);
        boolean boolean0 = cSVLexer0.isWhitespace(13);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Character character0 = Character.valueOf('9');
        Quote quote0 = Quote.NON_NUMERIC;
        String[] stringArray0 = new String[5];
        CSVFormat cSVFormat0 = new CSVFormat(':', character0, quote0, character0, character0, true, true, " EmptyLines:ignored", "$", stringArray0);
        StringReader stringReader0 = new StringReader(" EmptyLines:ignored");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isStartOfLine(9);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader("gt2cO/DBu");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isQuoteChar(102);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader("");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isEscape(65534);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, (ExtendedBufferedReader) null);
        boolean boolean0 = cSVLexer0.isEscape(326);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        StringReader stringReader0 = new StringReader("");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isEndOfFile((-1));
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader("gt2cO/DBu");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isEndOfFile(0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader("gt2cO/DBu");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isDelimiter(9);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        StringReader stringReader0 = new StringReader("org.apache.commons.csv.CSVPrinter$1");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isDelimiter(103);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        StringReader stringReader0 = new StringReader("#f,wJZF4Zt,38p");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isCommentStart(4);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        StringReader stringReader0 = new StringReader("\n");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        long long0 = cSVLexer0.getLineNumber();
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader("gt2cO/DBu");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        extendedBufferedReader0.readLine();
        long long0 = cSVLexer0.getLineNumber();
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        StringReader stringReader0 = new StringReader("@LNr`+O6Q$");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        // Undeclared exception!
        try {
            cSVLexer0.trimTrailingSpaces((StringBuilder) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.csv.Lexer", e);
        }
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, (ExtendedBufferedReader) null);
        // Undeclared exception!
        try {
            cSVLexer0.readEscape();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.csv.Lexer", e);
        }
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        StringReader stringReader0 = new StringReader("-pxp?M{rZSY@Y");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        extendedBufferedReader0.close();
        try {
            cSVLexer0.readEndOfLine(13);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Stream closed
            //
            verifyException("java.io.BufferedReader", e);
        }
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader("");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isCommentStart(65534);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Character character0 = Character.valueOf(':');
        Quote quote0 = Quote.NON_NUMERIC;
        String[] stringArray0 = new String[5];
        CSVFormat cSVFormat0 = new CSVFormat(':', character0, quote0, character0, character0, true, true, " EmptyLines:ignored", " EmptyLines:ignored", stringArray0);
        StringReader stringReader0 = new StringReader(" EmptyLines:ignored");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isQuoteChar(':');
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        StringReader stringReader0 = new StringReader("org.apache.commons.csv.Lexer");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isStartOfLine(13);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        Character character0 = Character.valueOf(':');
        Quote quote0 = Quote.NON_NUMERIC;
        String[] stringArray0 = new String[5];
        CSVFormat cSVFormat0 = new CSVFormat(':', character0, quote0, character0, character0, true, true, " EmptyLines:ignored", " EmptyLines:ignored", stringArray0);
        StringReader stringReader0 = new StringReader(" EmptyLines:ignored");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isStartOfLine(10);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader("gt2cO/DBu");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isWhitespace(9);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        StringReader stringReader0 = new StringReader("\n");
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.readEndOfLine(13);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        StringReader stringReader0 = new StringReader("org.apache.commons.csv.Lexer");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.readEndOfLine(13);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        StringReader stringReader0 = new StringReader("\n");
        StringBuilder stringBuilder0 = new StringBuilder("\n");
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        cSVLexer0.trimTrailingSpaces(stringBuilder0);
        assertEquals("", stringBuilder0.toString());
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        StringReader stringReader0 = new StringReader("gt2cO/DBu");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        stringReader0.read();
        int int0 = cSVLexer0.readEscape();
        assertEquals(9, int0);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        Character character0 = Character.valueOf('a');
        Quote quote0 = Quote.MINIMAL;
        String[] stringArray0 = new String[5];
        CSVFormat cSVFormat0 = new CSVFormat('V', character0, quote0, (Character) '\u0000', character0, true, true, "org.apache.commons.csv.Leler", "org.apache.commons.csv.Leler", stringArray0);
        StringReader stringReader0 = new StringReader("Delimiter=<,> QuoteChar=<\">");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        Token token0 = new Token();
        Token token1 = cSVLexer0.nextToken(token0);
        assertSame(token0, token1);
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        Character character0 = Character.valueOf(':');
        Quote quote0 = Quote.NON_NUMERIC;
        String[] stringArray0 = new String[5];
        CSVFormat cSVFormat0 = new CSVFormat(':', character0, quote0, character0, character0, true, true, " EmptyLines:ignored", " EmptyLines:ignored", stringArray0);
        StringReader stringReader0 = new StringReader(" EmptyLines:ignored");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        Token token0 = new Token();
        Token token1 = cSVLexer0.nextToken(token0);
        cSVLexer0.nextToken(token1);
        cSVLexer0.nextToken(token1);
        int int0 = cSVLexer0.readEscape();
        assertEquals(10, int0);
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        StringReader stringReader0 = new StringReader("b&:`h!");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        int int0 = cSVLexer0.readEscape();
        assertEquals(8, int0);
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        StringReader stringReader0 = new StringReader("\n");
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        int int0 = cSVLexer0.readEscape();
        assertEquals(10, int0);
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        StringReader stringReader0 = new StringReader("@f'wJZhwZt,3vp");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        int int0 = cSVLexer0.readEscape();
        assertEquals(64, int0);
    }

    @Test(timeout = 4000)
    public void test3233() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        StringReader stringReader0 = new StringReader("@f'wJZhwZt,3vp");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        int int0 = cSVLexer0.readEscape();
        int int1 = cSVLexer0.readEscape();
        assertEquals(12, int1);
    }

    @Test(timeout = 4000)
    public void test3334() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        StringReader stringReader0 = new StringReader("");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        try {
            cSVLexer0.readEscape();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // EOF whilst processing escape sequence
            //
            verifyException("org.apache.commons.csv.Lexer", e);
        }
    }

    @Test(timeout = 4000)
    public void test3435() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, (ExtendedBufferedReader) null);
        // Undeclared exception!
        try {
            cSVLexer0.getLineNumber();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.csv.Lexer", e);
        }
    }
}
