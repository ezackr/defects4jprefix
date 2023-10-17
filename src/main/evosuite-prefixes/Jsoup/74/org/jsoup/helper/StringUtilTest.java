/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 23:09:30 GMT 2023
 */
package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import org.jsoup.helper.StringUtil;
import org.junit.runner.RunWith;

public class StringUtilTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        URL uRL0 = MockURL.getHttpExample();
        URL uRL1 = StringUtil.resolve(uRL0, "java.lang.String@0000000001BBBBB BBB          ");
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        String[] stringArray0 = new String[2];
        stringArray0[0] = "?java.lang.String@0000000001CY-8_CY-8_";
        boolean boolean0 = StringUtil.inSorted("?java.lang.String@0000000001CY-8_CY-8_", stringArray0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        boolean boolean0 = StringUtil.isActuallyWhitespace(3677);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        boolean boolean0 = StringUtil.isWhitespace((-2173));
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        String string0 = StringUtil.padding(21);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        String string0 = StringUtil.normaliseWhitespace("");
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        String[] stringArray0 = new String[0];
        String string0 = StringUtil.join(stringArray0, "Xh:}zqM!gLSS");
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        Integer integer0 = new Integer((-2855));
        linkedList0.addFirst(integer0);
        String string0 = StringUtil.join((Collection) linkedList0, "Rz ]NV8}^0vO&41");
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
        URL uRL0 = MockURL.URL("", "", 0, "s", uRLStreamHandler0);
        StringUtil.resolve(uRL0, "");
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        String[] stringArray0 = new String[7];
        URL uRL0 = MockURL.getHttpExample();
        StringUtil.resolve(uRL0, stringArray0[3]);
    }

    @Test(timeout = 4000)
    public void test1110() throws Throwable {
        StringUtil.normaliseWhitespace((String) null);
    }

    @Test(timeout = 4000)
    public void test1211() throws Throwable {
        StringBuilder stringBuilder0 = StringUtil.stringBuilder();
        LinkedList<StringBuilder> linkedList0 = new LinkedList<StringBuilder>();
        Iterator<StringBuilder> iterator0 = linkedList0.iterator();
        linkedList0.add(stringBuilder0);
        StringUtil.join(iterator0, "2");
    }

    @Test(timeout = 4000)
    public void test1312() throws Throwable {
        StringUtil.join((Iterator) null, "");
    }

    @Test(timeout = 4000)
    public void test1413() throws Throwable {
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        linkedList0.add((Object) null);
        StringUtil.join((Collection) linkedList0, "");
    }

    @Test(timeout = 4000)
    public void test1514() throws Throwable {
        StringUtil.inSorted("", (String[]) null);
    }

    @Test(timeout = 4000)
    public void test1615() throws Throwable {
        StringUtil.appendNormalisedWhitespace((StringBuilder) null, (String) null, true);
    }

    @Test(timeout = 4000)
    public void test1716() throws Throwable {
        String string0 = StringUtil.padding(1800);
        StringBuilder stringBuilder0 = StringUtil.stringBuilder();
        StringUtil.appendNormalisedWhitespace(stringBuilder0, string0, false);
        stringBuilder0.toString();
    }

    @Test(timeout = 4000)
    public void test1817() throws Throwable {
        boolean boolean0 = StringUtil.isActuallyWhitespace(32);
    }

    @Test(timeout = 4000)
    public void test1918() throws Throwable {
        boolean boolean0 = StringUtil.isWhitespace(32);
    }

    @Test(timeout = 4000)
    public void test2019() throws Throwable {
        boolean boolean0 = StringUtil.isWhitespace(1800);
    }

    @Test(timeout = 4000)
    public void test2120() throws Throwable {
        StringBuilder stringBuilder0 = StringUtil.stringBuilder();
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        linkedList0.add((Object) stringBuilder0);
        Object object0 = new Object();
        linkedList0.add(object0);
        Iterator<Object> iterator0 = linkedList0.descendingIterator();
        String string0 = StringUtil.join(iterator0, "_-)a)H%?xJ'");
    }

    @Test(timeout = 4000)
    public void test2221() throws Throwable {
        String string0 = "C)Yj0Yb6S\\Az]KXZ?W";
        StringUtil.normaliseWhitespace("C)Yj0Yb6SAz]KXZ?W");
        Iterator<String> iterator0 = (Iterator<String>) mock(Iterator.class, new ViolatedAssumptionAnswer());
        doReturn(true, false).when(iterator0).hasNext();
        doReturn("C)Yj0Yb6SAz]KXZ?W").when(iterator0).next();
        StringUtil.join(iterator0, "C)Yj0Yb6SAz]KXZ?W");
        String string1 = "";
        StringUtil.isNumeric(string1);
        int int0 = 0;
        StringUtil.padding(int0);
        String string2 = "          ";
        StringUtil.isBlank(string2);
        String string3 = "";
        String string4 = "                ";
        int int1 = 0;
        String string5 = "       ";
        MockURL.URL(string3, string4, int1, string5);
    }

    @Test(timeout = 4000)
    public void test2322() throws Throwable {
        Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
        doReturn(false).when(iterator0).hasNext();
        String string0 = StringUtil.join(iterator0, "B");
    }

    @Test(timeout = 4000)
    public void test2423() throws Throwable {
        URL uRL0 = MockURL.getFileExample();
        URL uRL1 = StringUtil.resolve(uRL0, "?");
        uRL1.getDefaultPort();
    }

    @Test(timeout = 4000)
    public void test2524() throws Throwable {
        String[] stringArray0 = new String[3];
        stringArray0[1] = "";
        boolean boolean0 = StringUtil.inSorted("", stringArray0);
    }

    @Test(timeout = 4000)
    public void test2625() throws Throwable {
        String[] stringArray0 = new String[3];
        stringArray0[1] = "";
        stringArray0[2] = "";
        boolean boolean0 = StringUtil.inSorted("G`", stringArray0);
    }

    @Test(timeout = 4000)
    public void test2726() throws Throwable {
        String[] stringArray0 = new String[4];
        stringArray0[0] = "7rDC]G>BIEe";
        stringArray0[1] = "";
        boolean boolean0 = StringUtil.in("", stringArray0);
    }

    @Test(timeout = 4000)
    public void test2827() throws Throwable {
        String string0 = StringUtil.normaliseWhitespace("E");
        String[] stringArray0 = new String[7];
        stringArray0[0] = string0;
        StringUtil.in("Yc7{1LL[", stringArray0);
    }

    @Test(timeout = 4000)
    public void test2928() throws Throwable {
        String[] stringArray0 = new String[0];
        boolean boolean0 = StringUtil.in("", stringArray0);
    }

    @Test(timeout = 4000)
    public void test3029() throws Throwable {
        StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "");
        StringUtil.appendNormalisedWhitespace(stringBuilder0, "              * ", true);
        stringBuilder0.toString();
    }

    @Test(timeout = 4000)
    public void test3130() throws Throwable {
        boolean boolean0 = StringUtil.isActuallyWhitespace(160);
    }

    @Test(timeout = 4000)
    public void test3231() throws Throwable {
        boolean boolean0 = StringUtil.isActuallyWhitespace(13);
    }

    @Test(timeout = 4000)
    public void test3332() throws Throwable {
        boolean boolean0 = StringUtil.isActuallyWhitespace(12);
    }

    @Test(timeout = 4000)
    public void test3433() throws Throwable {
        boolean boolean0 = StringUtil.isActuallyWhitespace(10);
    }

    @Test(timeout = 4000)
    public void test3534() throws Throwable {
        boolean boolean0 = StringUtil.isActuallyWhitespace(9);
    }

    @Test(timeout = 4000)
    public void test3635() throws Throwable {
        boolean boolean0 = StringUtil.isActuallyWhitespace(8);
    }

    @Test(timeout = 4000)
    public void test3736() throws Throwable {
        boolean boolean0 = StringUtil.isWhitespace(13);
    }

    @Test(timeout = 4000)
    public void test3837() throws Throwable {
        boolean boolean0 = StringUtil.isWhitespace(12);
    }

    @Test(timeout = 4000)
    public void test3938() throws Throwable {
        boolean boolean0 = StringUtil.isWhitespace(10);
    }

    @Test(timeout = 4000)
    public void test4039() throws Throwable {
        boolean boolean0 = StringUtil.isWhitespace(9);
    }

    @Test(timeout = 4000)
    public void test4140() throws Throwable {
        boolean boolean0 = StringUtil.isNumeric("2");
    }

    @Test(timeout = 4000)
    public void test4241() throws Throwable {
        boolean boolean0 = StringUtil.isNumeric("           ");
    }

    @Test(timeout = 4000)
    public void test4342() throws Throwable {
        boolean boolean0 = StringUtil.isNumeric((String) null);
    }

    @Test(timeout = 4000)
    public void test4443() throws Throwable {
        boolean boolean0 = StringUtil.isBlank("java.lang.String@0000000001$");
    }

    @Test(timeout = 4000)
    public void test4544() throws Throwable {
        boolean boolean0 = StringUtil.isBlank("");
    }

    @Test(timeout = 4000)
    public void test4645() throws Throwable {
        boolean boolean0 = StringUtil.isBlank((String) null);
    }

    @Test(timeout = 4000)
    public void test4746() throws Throwable {
        StringUtil.padding((-578));
    }

    @Test(timeout = 4000)
    public void test4847() throws Throwable {
        String[] stringArray0 = new String[1];
        stringArray0[0] = "";
        String string0 = StringUtil.join(stringArray0, "");
    }

    @Test(timeout = 4000)
    public void test4948() throws Throwable {
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        String string0 = StringUtil.join((Collection) linkedList0, "tQl3}");
    }

    @Test(timeout = 4000)
    public void test5049() throws Throwable {
        String string0 = StringUtil.resolve("", " ");
    }

    @Test(timeout = 4000)
    public void test5250() throws Throwable {
        String[] stringArray0 = new String[7];
        StringUtil.join(stringArray0, "B");
    }
}
