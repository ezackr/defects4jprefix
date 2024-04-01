/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 14 22:41:54 GMT 2023
 */
package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.Properties;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class PosixParser_ESTest extends PosixParser_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[0];
        posixParser0.parse(options0, stringArray0);
        options0.addOption("", true, "");
        posixParser0.burstToken("I~@nlmjL-vJZ", true);
        posixParser0.burstToken("I~@nlmjL-vJZ", true);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Options options0 = new Options();
        PosixParser posixParser0 = new PosixParser();
        String[] stringArray0 = new String[8];
        stringArray0[0] = "-";
        // Undeclared exception!
        try {
            posixParser0.parse(options0, stringArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "--9ztaVFbB=";
        try {
            posixParser0.parse(options0, stringArray0, (Properties) null);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Unrecognized option: --9ztaVFbB
            //
            verifyException("org.apache.commons.cli.Parser", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = Locale.getISOCountries();
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
        String[] stringArray2 = posixParser0.flatten(options0, stringArray1, true);
        assertEquals(252, stringArray2.length);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Options options0 = new Options();
        PosixParser posixParser0 = new PosixParser();
        String[] stringArray0 = new String[3];
        stringArray0[0] = "-)gOJR9";
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
        assertEquals(14, stringArray1.length);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[4];
        stringArray0[0] = "*','dA";
        stringArray0[1] = "-W@L-Nr";
        stringArray0[2] = "-W@L-Nr";
        stringArray0[3] = "*','dA";
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, false);
        String[] stringArray2 = posixParser0.flatten(options0, stringArray1, false);
        assertEquals(14, stringArray1.length);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[4];
        stringArray0[0] = "*','dA";
        stringArray0[1] = "-W@L-Nr";
        stringArray0[2] = "-W@L-Nr";
        stringArray0[3] = "*','dA";
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, false);
        String[] stringArray2 = posixParser0.flatten(options0, stringArray1, false);
        assertEquals(4, stringArray2.length);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[7];
        stringArray0[0] = "yes";
        stringArray0[1] = "CMWM0Ovi+";
        stringArray0[2] = "yB+[.?~{?;B-PW_";
        stringArray0[3] = "CMWM0Ovi+";
        stringArray0[4] = "-AD";
        Options options1 = options0.addOption("AD", "", true, "yes");
        // Undeclared exception!
        try {
            posixParser0.flatten(options1, stringArray0, false);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        posixParser0.parse(options0, (String[]) null);
        options0.addOption("", "", false, "");
        posixParser0.burstToken("E~@&ls2F-vJL", true);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        Options options1 = options0.addOption("W", "W", true, "W");
        String[] stringArray0 = new String[4];
        stringArray0[0] = "*','dA";
        stringArray0[1] = "-W@L-Nr";
        stringArray0[2] = "-W@L-Nr";
        stringArray0[3] = "*','dA";
        String[] stringArray1 = posixParser0.flatten(options1, stringArray0, false);
        String[] stringArray2 = posixParser0.flatten(options0, stringArray1, false);
        assertEquals(6, stringArray1.length);
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        Options options1 = options0.addOption("W", "W", true, "W");
        String[] stringArray0 = new String[4];
        stringArray0[0] = "*','dA";
        stringArray0[1] = "-W@L-Nr";
        stringArray0[2] = "-W@L-Nr";
        stringArray0[3] = "*','dA";
        String[] stringArray1 = posixParser0.flatten(options1, stringArray0, false);
        String[] stringArray2 = posixParser0.flatten(options0, stringArray1, false);
        assertEquals(6, stringArray2.length);
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        Options options0 = new Options();
        PosixParser posixParser0 = new PosixParser();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-J";
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
        assertEquals(0, stringArray1.length);
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[0];
        posixParser0.parse(options0, stringArray0);
        options0.addOption("", true, "");
        posixParser0.burstToken("hrjA5Rr9s-", true);
    }
}
