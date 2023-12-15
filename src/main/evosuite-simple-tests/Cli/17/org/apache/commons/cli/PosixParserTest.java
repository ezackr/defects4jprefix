/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 14 23:21:12 GMT 2023
 */
package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Locale;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.junit.runner.RunWith;

public class PosixParserTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-";
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
        assertEquals(1, stringArray1.length);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = Locale.getISOCountries();
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
        String[] stringArray2 = posixParser0.flatten(options0, stringArray1, true);
        assertEquals(252, stringArray2.length);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = Locale.getISOCountries();
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
        String[] stringArray2 = posixParser0.flatten(options0, stringArray1, true);
        assertEquals(251, stringArray1.length);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[10];
        stringArray0[0] = "--Q[]4:=F";
        // Undeclared exception!
        try {
            posixParser0.flatten(options0, stringArray0, true);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[7];
        stringArray0[0] = "-{eZ\" A#&`";
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
        assertEquals(24, stringArray1.length);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-j";
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, false);
        assertEquals(0, stringArray1.length);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = Locale.getISOCountries();
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, false);
        assertEquals(250, stringArray1.length);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        Option option0 = new Option("A", "", false, "-A");
        options0.addOption(option0);
        String[] stringArray0 = new String[4];
        stringArray0[0] = "-A";
        // Undeclared exception!
        try {
            posixParser0.flatten(options0, stringArray0, false);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-j";
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
        assertEquals(0, stringArray1.length);
    }
}
