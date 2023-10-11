/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 03:44:50 GMT 2023
 */
package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.language.Soundex;
import org.junit.runner.RunWith;

public class SoundexTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Soundex soundex0 = new Soundex("org.apache.commons.codec.EncoderException");
        String string0 = soundex0.soundex("f.RdLls");
        soundex0.getMaxLength();
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        Soundex soundex0 = new Soundex("org.apache.commons.codec.EncoderException");
        String string0 = soundex0.soundex("f.RdLls");
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        Soundex soundex0 = new Soundex();
        soundex0.getMaxLength();
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        Soundex soundex0 = new Soundex();
        soundex0.setMaxLength(0);
        int int0 = soundex0.getMaxLength();
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        Soundex soundex0 = new Soundex();
        soundex0.getMaxLength();
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        Soundex soundex0 = new Soundex();
        soundex0.setMaxLength((-1));
        int int0 = soundex0.getMaxLength();
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        Soundex soundex0 = Soundex.US_ENGLISH;
        String string0 = soundex0.encode((String) null);
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        Soundex soundex0 = Soundex.US_ENGLISH;
        String string0 = soundex0.US_ENGLISH.encode("01230120022455012623010202");
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        Soundex soundex0 = new Soundex();
        int int0 = soundex0.difference("r!e=Mn", "r!e=Mn");
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        Soundex soundex0 = new Soundex();
        int int0 = soundex0.difference("r!e=Mn", "r!e=Mn");
        soundex0.getMaxLength();
    }

    @Test(timeout = 4000)
    public void test0610() throws Throwable {
        Soundex soundex0 = new Soundex("V.(\u0006}-BeBAV&OK%lO");
        soundex0.soundex("V.(\u0006}-BeBAV&OK%lO");
    }

    @Test(timeout = 4000)
    public void test0711() throws Throwable {
        Soundex soundex0 = new Soundex("+C.H");
        soundex0.encode("Ea)^AavF^U}j]OC;");
    }

    @Test(timeout = 4000)
    public void test0812() throws Throwable {
        char[] charArray0 = new char[10];
        Soundex soundex0 = new Soundex(charArray0);
        soundex0.difference("org.apache.cmmons.codec.EncoderException", "01230120022455012623010202");
    }

    @Test(timeout = 4000)
    public void test0913() throws Throwable {
        Soundex soundex0 = null;
        soundex0 = new Soundex((char[]) null);
    }

    @Test(timeout = 4000)
    public void test1014() throws Throwable {
        Soundex soundex0 = null;
        soundex0 = new Soundex((String) null);
    }

    @Test(timeout = 4000)
    public void test1115() throws Throwable {
        Soundex soundex0 = new Soundex();
        String string0 = soundex0.soundex("~p|xqH/k4t");
        soundex0.getMaxLength();
    }

    @Test(timeout = 4000)
    public void test1116() throws Throwable {
        Soundex soundex0 = new Soundex();
        String string0 = soundex0.soundex("~p|xqH/k4t");
    }

    @Test(timeout = 4000)
    public void test1217() throws Throwable {
        Soundex soundex0 = Soundex.US_ENGLISH;
        String string0 = soundex0.soundex(";");
    }

    @Test(timeout = 4000)
    public void test1318() throws Throwable {
        Soundex soundex0 = Soundex.US_ENGLISH;
        String string0 = soundex0.soundex("bpfmYW*-MZ,J}A8");
    }

    @Test(timeout = 4000)
    public void test1419() throws Throwable {
        Soundex soundex0 = new Soundex();
        soundex0.soundex((String) null);
        soundex0.getMaxLength();
    }

    @Test(timeout = 4000)
    public void test1520() throws Throwable {
        char[] charArray0 = new char[5];
        Soundex soundex0 = new Soundex(charArray0);
        soundex0.encode((Object) "k_RM6Sk6}q");
    }

    @Test(timeout = 4000)
    public void test1621() throws Throwable {
        Soundex soundex0 = new Soundex();
        int int0 = soundex0.difference("!zu~P~HBlRk", (String) null);
    }

    @Test(timeout = 4000)
    public void test1622() throws Throwable {
        Soundex soundex0 = new Soundex();
        int int0 = soundex0.difference("!zu~P~HBlRk", (String) null);
        soundex0.getMaxLength();
    }

    @Test(timeout = 4000)
    public void test1723() throws Throwable {
        Soundex soundex0 = new Soundex();
        Object object0 = soundex0.encode((Object) "zO5LPw,`hDKIC%d,mP+");
        soundex0.getMaxLength();
    }

    @Test(timeout = 4000)
    public void test1724() throws Throwable {
        Soundex soundex0 = new Soundex();
        Object object0 = soundex0.encode((Object) "zO5LPw,`hDKIC%d,mP+");
    }

    @Test(timeout = 4000)
    public void test1825() throws Throwable {
        Soundex soundex0 = Soundex.US_ENGLISH;
        Object object0 = new Object();
        soundex0.encode(object0);
    }

    @Test(timeout = 4000)
    public void test1926() throws Throwable {
        Soundex soundex0 = new Soundex("org.apache.commons.codec.EncoderException");
        String string0 = soundex0.encode("CH?75#hn");
        soundex0.getMaxLength();
    }

    @Test(timeout = 4000)
    public void test1927() throws Throwable {
        Soundex soundex0 = new Soundex("org.apache.commons.codec.EncoderException");
        String string0 = soundex0.encode("CH?75#hn");
    }

    @Test(timeout = 4000)
    public void test1928() throws Throwable {
        Soundex soundex0 = new Soundex("org.apache.commons.codec.EncoderException");
        String string0 = soundex0.encode("CH?75#hn");
    }

    @Test(timeout = 4000)
    public void test2029() throws Throwable {
        Soundex soundex0 = new Soundex();
        int int0 = soundex0.difference("01230120022455012623010202", "AZEW3ML7vCD)EX");
        soundex0.getMaxLength();
    }

    @Test(timeout = 4000)
    public void test2030() throws Throwable {
        Soundex soundex0 = new Soundex();
        int int0 = soundex0.difference("01230120022455012623010202", "AZEW3ML7vCD)EX");
    }

    @Test(timeout = 4000)
    public void test2131() throws Throwable {
        Soundex soundex0 = new Soundex();
        int int0 = soundex0.getMaxLength();
    }
}
