/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:46:58 GMT 2023
 */
package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.junit.runner.RunWith;

public class NumericEntityUnescaperTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
        StringWriter stringWriter0 = new StringWriter(0);
        char[] charArray0 = new char[2];
        charArray0[0] = '&';
        charArray0[1] = '#';
        stringWriter0.write(charArray0);
        stringWriter0.write(445);
        StringBuffer stringBuffer0 = stringWriter0.getBuffer();
        numericEntityUnescaper0.translate((CharSequence) stringBuffer0, 0, (Writer) stringWriter0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
        StringWriter stringWriter0 = new StringWriter();
        StringWriter stringWriter1 = stringWriter0.append('&');
        StringBuffer stringBuffer0 = stringWriter1.getBuffer();
        stringWriter1.append(';');
        String string0 = numericEntityUnescaper0.translate((CharSequence) stringBuffer0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
        StringWriter stringWriter0 = new StringWriter();
        numericEntityUnescaper0.translate((CharSequence) null, (-179), (Writer) stringWriter0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
        char[] charArray0 = new char[9];
        CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
        StringWriter stringWriter0 = new StringWriter(59);
        numericEntityUnescaper0.translate((CharSequence) charBuffer0, 59, (Writer) stringWriter0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
        StringWriter stringWriter0 = new StringWriter(0);
        char[] charArray0 = new char[2];
        charArray0[0] = '&';
        charArray0[1] = '#';
        stringWriter0.write(charArray0);
        StringBuffer stringBuffer0 = stringWriter0.getBuffer();
        stringWriter0.append('X');
        numericEntityUnescaper0.translate((CharSequence) stringBuffer0, 0, (Writer) stringWriter0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
        StringWriter stringWriter0 = new StringWriter();
        int int0 = numericEntityUnescaper0.translate((CharSequence) "3B", 0, (Writer) stringWriter0);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
        StringWriter stringWriter0 = new StringWriter();
        CharBuffer charBuffer0 = CharBuffer.allocate(35);
        numericEntityUnescaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
        char[] charArray0 = new char[2];
        charArray0[0] = '&';
        charArray0[1] = '#';
        stringWriter0.write(charArray0);
        StringBuffer stringBuffer0 = stringWriter0.getBuffer();
        StringWriter stringWriter1 = stringWriter0.append('x');
        stringWriter1.write("<`eJKt;a|no1-Pzcz9");
        int int0 = numericEntityUnescaper0.translate((CharSequence) stringBuffer0, 35, (Writer) stringWriter0);
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
        StringWriter stringWriter0 = new StringWriter();
        char[] charArray0 = new char[9];
        charArray0[0] = '&';
        charArray0[1] = '#';
        charArray0[3] = ';';
        stringWriter0.write(charArray0);
        StringBuffer stringBuffer0 = stringWriter0.getBuffer();
        int int0 = numericEntityUnescaper0.translate((CharSequence) stringBuffer0, 0, (Writer) stringWriter0);
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
        StringWriter stringWriter0 = new StringWriter();
        CharBuffer charBuffer0 = CharBuffer.allocate(35);
        numericEntityUnescaper0.translate((CharSequence) charBuffer0, (Writer) stringWriter0);
        char[] charArray0 = new char[2];
        charArray0[0] = '&';
        stringWriter0.write(charArray0);
        StringBuffer stringBuffer0 = stringWriter0.getBuffer();
        int int0 = numericEntityUnescaper0.translate((CharSequence) stringBuffer0, 35, (Writer) stringWriter0);
    }
}
