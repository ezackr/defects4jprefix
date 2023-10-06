/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 06 03:24:36 GMT 2023
 */
package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringReader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVLexer;
import org.apache.commons.csv.ExtendedBufferedReader;
import org.apache.commons.csv.Quote;
import org.apache.commons.csv.Token;
import org.junit.runner.RunWith;

public class LexerTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        StringReader stringReader0 = new StringReader("h}6Jpv");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isStartOfLine((-989));
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
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        StringReader stringReader0 = new StringReader("EOF whilst processing escape sequence");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.readEndOfLine(79);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Character character0 = Character.valueOf('|');
        Quote quote0 = Quote.NONE;
        String[] stringArray0 = new String[6];
        CSVFormat cSVFormat0 = new CSVFormat('|', character0, quote0, character0, character0, true, false, "", "The escape character cannot be a line break", stringArray0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, (ExtendedBufferedReader) null);
        boolean boolean0 = cSVLexer0.isWhitespace(13);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Character character0 = Character.valueOf('9');
        Quote quote0 = Quote.NON_NUMERIC;
        String[] stringArray0 = new String[5];
        CSVFormat cSVFormat0 = new CSVFormat(':', character0, quote0, character0, character0, true, true, " EmptyLines:ignored", "$", stringArray0);
        StringReader stringReader0 = new StringReader(" EmptyLines:ignored");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isStartOfLine(9);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader("gt2cO/DBu");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isQuoteChar(102);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader("");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isEscape(65534);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, (ExtendedBufferedReader) null);
        boolean boolean0 = cSVLexer0.isEscape(326);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        StringReader stringReader0 = new StringReader("");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isEndOfFile((-1));
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader("gt2cO/DBu");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isEndOfFile(0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader("gt2cO/DBu");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isDelimiter(9);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        StringReader stringReader0 = new StringReader("org.apache.commons.csv.CSVPrinter$1");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isDelimiter(103);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        StringReader stringReader0 = new StringReader("#f,wJZF4Zt,38p");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isCommentStart(4);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        StringReader stringReader0 = new StringReader("\n");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        long long0 = cSVLexer0.getLineNumber();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader("gt2cO/DBu");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        extendedBufferedReader0.readLine();
        long long0 = cSVLexer0.getLineNumber();
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        StringReader stringReader0 = new StringReader("@LNr`+O6Q$");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        cSVLexer0.trimTrailingSpaces((StringBuilder) null);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, (ExtendedBufferedReader) null);
        cSVLexer0.readEscape();
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        StringReader stringReader0 = new StringReader("-pxp?M{rZSY@Y");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        extendedBufferedReader0.close();
        cSVLexer0.readEndOfLine(13);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader("");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isCommentStart(65534);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Character character0 = Character.valueOf(':');
        Quote quote0 = Quote.NON_NUMERIC;
        String[] stringArray0 = new String[7];
        CSVFormat cSVFormat0 = new CSVFormat(':', character0, quote0, character0, character0, true, true, " EmptyLines:ignored", "$", stringArray0);
        StringReader stringReader0 = new StringReader(" EmptyLines:ignored");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isQuoteChar(':');
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Character character0 = new Character('\u0000');
        Quote quote0 = Quote.ALL;
        Character character1 = Character.valueOf('h');
        String[] stringArray0 = new String[1];
        CSVFormat cSVFormat0 = new CSVFormat('\u0000', character0, quote0, (Character) '\u0000', character1, false, false, "org.apache.commons.csv.Lexer", "org.apache.commons.csv.Lexer", stringArray0);
        StringReader stringReader0 = new StringReader("Delimiter=<,> QuoteChar=<\">");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        Token token0 = new Token();
        Token token1 = cSVLexer0.nextToken(token0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        StringReader stringReader0 = new StringReader("org.apache.commons.csv.CSVPrinter$1");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isStartOfLine(13);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader(") inQaJ2d parse seeuece");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isStartOfLine(10);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader("gt2cO/DBu");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.isWhitespace(9);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.RFC4180;
        StringReader stringReader0 = new StringReader("\r\n");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        Token token0 = new Token();
        Token token1 = cSVLexer0.nextToken(token0);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        StringReader stringReader0 = new StringReader("org.apache.commons.csv.CSVPrinter$1");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        boolean boolean0 = cSVLexer0.readEndOfLine(13);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        Token token0 = new Token();
        StringReader stringReader0 = new StringReader("vs'x#y/GZs~bqbCe ");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        Token token1 = cSVLexer0.nextToken(token0);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader(") inQaJ2d parse seeuece");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        StringBuilder stringBuilder0 = new StringBuilder();
        cSVLexer0.trimTrailingSpaces(stringBuilder0);
        stringBuilder0.toString();
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.TDF;
        StringReader stringReader0 = new StringReader("gt2cO/DBu");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        stringReader0.read();
        int int0 = cSVLexer0.readEscape();
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        StringReader stringReader0 = new StringReader("org.apache.commons.csv.CSVPrinter$1");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        int int0 = cSVLexer0.readEscape();
    }

    @Test(timeout = 4000)
    public void test2930() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        StringReader stringReader0 = new StringReader("org.apache.commons.csv.CSVPrinter$1");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        int int0 = cSVLexer0.readEscape();
        int int1 = cSVLexer0.readEscape();
    }

    @Test(timeout = 4000)
    public void test3031() throws Throwable {
        Character character0 = Character.valueOf(':');
        Quote quote0 = Quote.NON_NUMERIC;
        String[] stringArray0 = new String[7];
        CSVFormat cSVFormat0 = new CSVFormat(':', character0, quote0, character0, character0, true, true, " EmptyLines:ignored", "$", stringArray0);
        StringReader stringReader0 = new StringReader(" EmptyLines:ignored");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        Token token0 = new Token();
        Token token1 = cSVLexer0.nextToken(token0);
        cSVLexer0.nextToken(token1);
        cSVLexer0.nextToken(token1);
        int int0 = cSVLexer0.readEscape();
    }

    @Test(timeout = 4000)
    public void test3132() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        StringReader stringReader0 = new StringReader("@f'wJZhwZt3vp");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        int int0 = cSVLexer0.readEscape();
    }

    @Test(timeout = 4000)
    public void test3133() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.EXCEL;
        StringReader stringReader0 = new StringReader("@f'wJZhwZt3vp");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        int int0 = cSVLexer0.readEscape();
        int int1 = cSVLexer0.readEscape();
    }

    @Test(timeout = 4000)
    public void test3234() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        StringReader stringReader0 = new StringReader("b&:`h*!");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        int int0 = cSVLexer0.readEscape();
    }

    @Test(timeout = 4000)
    public void test3335() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.RFC4180;
        StringReader stringReader0 = new StringReader("\r\n");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        int int0 = cSVLexer0.readEscape();
    }

    @Test(timeout = 4000)
    public void test3436() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        StringReader stringReader0 = new StringReader("\n");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        int int0 = cSVLexer0.readEscape();
    }

    @Test(timeout = 4000)
    public void test3537() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.MYSQL;
        StringReader stringReader0 = new StringReader("");
        ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, extendedBufferedReader0);
        cSVLexer0.readEscape();
    }

    @Test(timeout = 4000)
    public void test3638() throws Throwable {
        CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
        CSVLexer cSVLexer0 = new CSVLexer(cSVFormat0, (ExtendedBufferedReader) null);
        cSVLexer0.getLineNumber();
    }
}
