/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 14 23:23:50 GMT 2023
 */
package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class PosixParser_ESTest extends PosixParser_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[29];
        stringArray0[0] = "-";
        // Undeclared exception!
        try {
            posixParser0.parse(options0, stringArray0, false);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[2];
        stringArray0[0] = "--/f=u<LJfp";
        // Undeclared exception!
        try {
            posixParser0.parse(options0, stringArray0, true);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test032() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "--";
        CommandLine commandLine0 = posixParser0.parse(options0, stringArray0, false);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-{eZ\" 3#&`";
        CommandLine commandLine0 = posixParser0.parse(options0, stringArray0, true);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = Locale.getISOLanguages();
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
        assertEquals(189, stringArray1.length);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[9];
        stringArray0[0] = "-j";
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
    public void test076() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        options0.addOption("WF", true, "WF");
        String[] stringArray0 = new String[8];
        stringArray0[0] = "-WF";
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
    public void test087() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = Locale.getISOLanguages();
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, false);
        assertEquals(188, stringArray1.length);
    }

    @Test(timeout = 4000)
    public void test118() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        options0.addOption("j", "j", false, "j");
        String[] stringArray0 = new String[9];
        stringArray0[0] = "-j";
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
    public void test129() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-j";
        CommandLine commandLine0 = posixParser0.parse(options0, stringArray0, true);
        assertNotNull(commandLine0);
    }
}
